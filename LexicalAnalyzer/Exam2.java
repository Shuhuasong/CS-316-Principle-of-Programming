
public class Exam2 {

/*
    void identlist() {
        nextToken = la.getToken();
        while(nextToken==IDENT) {
            nextToken = la.getToken();
            if(nextToken==COMMA)
                nextToken = la.getToken();
        }
    }

    void seqofstmt() {
        nextToken = la.getToken();
        while(nextToken==NULLSYM || nextToken== IDENT|| nextToken==IFSYM || nextToken==WHILESYM || nextToken==GETSYM ||
                nextToken==PUTSYM || nextToken==NEWLINE) {
            statement();
        }
    }


    void statement() {
        nextToken = la.getToken();
        if(nextToken==NULLSYM){
            print("NULL statement");
        }

        if(nextToken==IDENT){
            nextToken = la.getToken();
            if(nextToken==COLON){
                nextToken = la.getToken();
                if(nextToken==EQL){
                    expression();
                }else{
                    error("Missing Equal Symbol");
                }
            }else{
                error("Missing Colon Symbol");
            }
        }else{
            error("Missing IDENT");
        }

        if(nextToken==IFSYM){
            ifStatement();
        }

        if(nextToken==WHILESYM){
            whileStatement();
        }

        if(nextToken==GETSYM || nextToken==PUTSYM){
            nextToken = la.getToken();
            if(nextToken==LPAREN){
                identlist();
                nextToken = la.getToken();
                if(nextToken==RPAREN){
                    nextToken = la.getToken();
                    if(nextToken==SEMICOLON){
                        print("Correct Statement")
                    }else{
                        error("Missing Semicolon")
                    }
                }else{
                    error("Missing Right Parenthese");
                }
            }else{
                error("Missing Left Parenthese");
            }

        }
        if(nextToken==NEWLINE){
            print("NewLine");
        }else{
            error("Missing NewLine Symbol");
        }

    }


    void ifStatement() {
        nextToken = la.getToken();
        if(nextToken == IFSYM){
            nextToken = la.getToken();
                condition();
                nextToken = la.getToken();
                    if(nextToken==THENSYM) {
                        seqofstmt();
                        nextToken = la.getToken();
                        if (nextToken == ENDSYM) {
                            nextToken = la.getToken();
                            if (nextToken == IFSYM) {
                                nextToken = la.getToken();
                                if (nextToken == SEMICOLOM)
                                    print("The if statement Program syntactically correct");
                                else
                                    error("Missing Semicolon ");
                            } else
                                error("Missing If Symbol");
                        }else if (nextToken == ELSESYM) {
                            seqofstmt();
                            if (nextToken == ENDSYM) {
                                nextToken = la.getToken();
                                if (nextToken == IFSYM) {
                                    nextToken = la.getToken();
                                    if (nextToken == SEMICOLOM)
                                        print("The if else statement Program syntactically correct");
                                    else
                                        error("Missing Semicolon ");
                                } else
                                    error("Missing If Symbol");
                            } else
                                error("Missing End Symbol");

                        }else
                            error("Missing Else Symbol");
                    }else
                        error("Missing Then Symbol");
        }else
            error("Missing IF Symbol");
    }


    void whileStatement(){
        nextToken = la.getToken();
        if(nextToken==WHILESYM){
            condition();
            nextToken = la.getToken();
            if(nextToken==LOOPSYM) {
                seqofstmt();
                nextToken = la.getToken();
                if(nextToken==ENDSYM) {
                    nextToken = la.getToken();
                    if(nextToken==LOOPSYM){
                        nextToken = la.getToken();
                        if(nextToken==SEMICOLON){
                            print("The Statement Syntacitcally Corrent");
                        }else
                            error("Missing Semicolon Symbol");
                    }else
                        error("Missing Loop Symbol");
                }else
                    error("Missing End Symbol");
            }else
                error("Missing Loop Symbol");
        }else
            error("Missing While Symbol");
    }



    void condition() {
        expression();
    }


    void expression() {
        simpexpr();
        nextToken = la.getToken();
        if(nextToken==EQL || nextToken==NEQ || nextToken==LSS || nextToken==LEQ || nextToken==GTR || nextToken==GEQ) {
            simpexpr();
        }else
            error("NextToken is null");
    }

    void simpexpr() {
        term();
        nextToken = la.getToken();
        if(nexToken==PLUS || nextToken==MINUS) {
            term();
        }else {
            error("NextToken is null");
        }
    }

    void term() {
        primary();
        nextToken = la.getToken();
        if(nextToken==TIMES || nextToken==SLASH || nextToken==REMSYM) {
            primary();
        }else
            error("NextToken is null");
    }

    void primary() {
        nextToken = la.getToken();
        if (nextToken == IDENT || nextToken == NUMLIT || nextToken == TRUESYM || nextToken == FALSESYM) {
          print("This is the terminal symbol")
        } else {
            if (nextToken == LPAREN) {
                nextToken = la.getToken();
                expression();
                nextToken = la.getToken();
                if (nextToken == RPAREN) {
                    nextToken = la.getToken();
                } else
                    error("Missing Right Parenthese");
            } else
                error("Missing Right Parenthese");
        }
        print("End of function");
    }



 */

}



