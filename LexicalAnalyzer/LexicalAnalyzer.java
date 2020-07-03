import java.io.BufferedReader;
import java.io.IOException;

import static java.lang.Character.isAlphabetic;
import static java.lang.Character.isDigit;


public class LexicalAnalyzer {

    private static final int LETTER = 0;
    private static final int DIGIT = 1;
    private static final int UNKNOWN = 99;

    private static final int INT_LIT = 10;
    private static final int IDENT = 11;
    private static final int ASSIGN_OP = 20;
    private static final int ADD_OP = 21;
    private static final int SUB_OP = 22;
    private static final int MULT_OP = 23;
    private static final int DIV_OP = 24;
    private static final int LEFT_PAREN = 25;
    private static final int RIGHT_PAREN = 26;
    private static final int EOF = -1;

   private int charClass;
   private String lexeme;
   private char nextChar;
   private int lexLen;

   private int nextToken;
   private Token token;

   public LexicalAnalyzer() {}

   public LexicalAnalyzer(int charClass, String lexeme, char nextChar, int lexLen, int nextToken, Token token){
       this.charClass = charClass;
       this.lexeme = lexeme;
       this.nextChar = nextChar;
       this.lexLen = lexLen;
       this.token = token;
       this.nextToken = nextToken;
   }

   public void setToken(Token token){
       this.token = token;
   }
   public void setNextChar(char nextChar){
       this.nextChar = nextChar;
   }

   public void setCharClass(int charClass) { this.charClass = charClass; }
   private void addChar(){
       if(lexLen <= 98){
           lexeme += nextChar;
           lexLen++;
       }else{
           System.out.println("Error-lexeme is too long");
       }
   }

   private void getChar(BufferedReader bufReader) throws IOException {

      nextChar = (char) bufReader.read();
       if( nextChar != EOF){

           if(isAlphabetic(nextChar)){
              charClass = LETTER;
           }
           else{
               if(isDigit((int)nextChar)){
                   charClass = DIGIT;
               }else{
                   charClass = UNKNOWN;
               }
           }
       }else{
           charClass = EOF;
       }
   }

  private void getNonBlank(BufferedReader bufReader) throws IOException {
       while(Character.isSpaceChar(nextChar)){
         getChar( bufReader);
       }
   }


    public Token getToken(BufferedReader bufReader) throws IOException {
       lexLen = 0;
       lexeme = "";
       getNonBlank(bufReader);
       switch(charClass){
           case LETTER:
                       addChar();
                       getChar(bufReader);
                       while(charClass==LETTER || charClass==DIGIT){
                       addChar();
                       getChar(bufReader);
                       }
                       nextToken = IDENT;
                       break;
           case DIGIT:
                       addChar();
                       getChar(bufReader);
                       while(charClass==DIGIT){
                           addChar();
                           getChar(bufReader);
                       }
                       nextToken = INT_LIT;
                       break;
           case UNKNOWN: loopUp(nextChar);
                         getChar(bufReader);
                         break;
           case EOF:
                           lexeme = "EOF";
                           nextToken = EOF;

               break;
           default:
               throw new IllegalStateException("Unexpected value: " + charClass);
       }

           token.setTokenCode(nextToken);
           token.setLexeme(lexeme);

       return token;
   }

    private void loopUp(char nextChar) {
      switch (nextChar){
          case '(' : addChar();
                     nextToken = LEFT_PAREN;
                     break;
          case ')' : addChar();
                     nextToken = RIGHT_PAREN;
                     break;
          case '+' : addChar();
                     nextToken = ADD_OP;
                     break;
          case '-' : addChar();
                     nextToken = SUB_OP;
                     break;
          case '*' : addChar();
                     nextToken = MULT_OP;
                     break;
          case '/' : addChar();
                     nextToken = DIV_OP;
                     break;
          case '=' : addChar();
                     nextToken = ASSIGN_OP;
                     break;
          default:   addChar();
                     nextToken = EOF;
                     break;
      }
    }


}
