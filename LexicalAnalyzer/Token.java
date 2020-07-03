

public class Token {

    private int tokenCode;
    private String lexemeString;
    private static final int UNKNOWN = 99;
    public Token(){
        tokenCode = UNKNOWN;
        lexemeString = "";
    }
    public Token(int tokenCode, String lexemeString){
        this.tokenCode = tokenCode;
        this.lexemeString = lexemeString;
    }
    public void setTokenCode(int tokenCode){
        this.tokenCode = tokenCode;
    }
    public int getTokenCode(){ return tokenCode; }

    public void setLexeme(String lexemeString){
        this.lexemeString = lexemeString;
    }

    public String getLexeme(){ return lexemeString; }

}
