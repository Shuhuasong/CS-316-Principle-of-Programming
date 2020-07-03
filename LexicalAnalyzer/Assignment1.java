import java.io.*;

public class Assignment1 {

    public static void main(String args[]) throws IOException {

       Token nextToken = new Token();
       LexicalAnalyzer lexAnalyzer = new LexicalAnalyzer();

       lexAnalyzer.setToken(nextToken);

       File fileName = new File("/Users/shuhuasong/Desktop/316Project/src/input.txt");
       if(fileName.exists()){
           FileReader fileReader = new FileReader(fileName);
           BufferedReader bufReader = new BufferedReader(fileReader);

           while( nextToken.getTokenCode() != -1) {
               nextToken = lexAnalyzer.getToken(bufReader);
               if(nextToken.getTokenCode()!=-1){
                   System.out.println("Next token is: "+nextToken.getTokenCode() + " Next lexeme is "+ nextToken.getLexeme());

               }else{
                   nextToken.setLexeme("EOF");
                   System.out.println("Next token is: "+nextToken.getTokenCode() + " Next lexeme  is " + nextToken.getLexeme());
               }
           }
       }else{
           System.out.println("Input file is not exist ");
       }
    }
}
