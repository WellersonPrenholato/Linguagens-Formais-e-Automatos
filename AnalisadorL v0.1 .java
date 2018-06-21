    public void q0(){


        if( proxCaractereIs(SEPARADOR))
        {
            this.tokenReconhecido = Token.SEPARADOR;
            q0();
        }

        else if( this.proxCaractere == EOF )
        {
            this.tokenReconhecido = Token.EOF;
            leProxCaractere();
            fim();
        }

        else if(this.proxCaractere == '(' )
        {
            leProxCaractere();
            q1();
        }

        else if( this.proxCaractere == ')' )
        {
            leProxCaractere();
            q2();
        }

        else if(this.proxCaractere == 'w'){
            leProxCaractere();
            q20();
        }

        else if(this.proxCaractere == 'i'){
            leProxCaractere();
            q29();
        }   

        else if(this.proxCaractere == 'f'){
            leProxCaractere();
            q26();
        }

        else if(this.proxCaractere == ':'){
            leProxCaractere();
            q35();
        }

        else if(this.proxCaractere == '%'){
            leProxCaractere();
            q13();
        }

        else if(this.proxCaractere == ' '){
            leProxCaractere();
            q3();
        }

        else if(this.proxCaractere == '.'){
            leProxCaractere();
            q19();
        }

        else if(this.proxCaractere == '='){
            leProxCaractere();
            q16();
        }

        else if(this.proxCaractere == '-'){
            leProxCaractere();
            q15();
        }

        else if(this.proxCaractere == '+'){
            leProxCaractere();
            q15();
        }
        else if(this.proxCaractere == '*'){
            leProxCaractere();
            q14();
        }

        else if(this.proxCaractere == '|'){
            leProxCaractere();
            q11();
        }

        else if(this.proxCaractere == '/'){
            leProxCaractere();
            q12();
        }

        else if(this.proxCaractere == '&'){
            leProxCaractere();
            q8();
        }

        else if(this.proxCaractere == '!'){
            leProxCaractere();
            q7();
        }

        else if(this.proxCaractere == '<'){
            leProxCaractere();
            q6();
        }

        else if(this.proxCaractere == '>'){
            leProxCaractere();
            q4();
        }
        else if(this.proxCaractere == NEWLINE){
            leProxCaractere();
            q10();
        }
        else if(this.proxCaractere == DIGITO){
            leProxCaractere();
            q17();
        }
        else if(this.proxCaractereIs(LETRA) && !this.proxCaractereIs(DIGITO)  && this.proxCaractere != 'w' && this.proxCaractere != 'i' && this.proxCaractere != 'f' && this.proxCaractere != 'n'){
            leProxCaractere();
            q25();
        }
        else if(this.proxCaractere == 'n'){
            leProxCaractere();
            q32();
        }else {
            System.out.println("Entrada Ivalida");
            throw(new ErroLexico(this.proxCaractere,ALFABETO, this.linha));
        }

//FIM Q0





    public void q1(){
        this.tokenReconhecido = Token.AP;

    }

    public void q2(){
        this.tokenReconhecido = Token.FP;
    }

    public void q3(){
        this.tokenReconhecido = Token.ESPACO;

    }

    public void q4(){
        this.tokenReconhecido = Token.OPARTBIN;
        leProxCaractere();
        if(this.proxCaractere == '='){
            leProxCaractere();
            q5();
        }
    }

    public void q5(){
        this.tokenReconhecido = Token.OPARTBIN;
    }

    public void q6(){
        this.tokenReconhecido = Token.OPARTBIN;
        if(this.proxCaractere == '='){
            leProxCaractere();
            q5();
        }
    }

    public void q7(){
        this.tokenReconhecido = Token.OPLOGUN;
        if(this.proxCaractere == '='){
            leProxCaractere();
            q5();
        }
    }

    public void q8(){
        this.tokenReconhecido = Token.OPLOGUN;
        if(this.proxCaractere == '&'){
            leProxCaractere();
            q9();
        }
    }

    public void q9(){
        this.tokenReconhecido = Token.OPARTBIN;
    }

    public void q10(){
        this.tokenReconhecido = Token.NEWLINE;
    }

    public void q11(){
        if(this.proxCaractere == '/'){
            leProxCaractere();
            q13();
        }else{
            System.out.println("Entrada não reconhecida");
            throw(new ErroLexico(this.proxCaractere,"'",this.linha));
        }        
    }
    
    public void q12(){
        this.tokenReconhecido = Token.OPARITBIN;
        if(this.proxCaractere == '/'){
            leProxCaractere();
            q13();
        }
    }
    public void q13(){
        this.tokenReconhecido = Token.OPARITBIN;
    }
    public void q14(){
        his.tokenReconhecido = Token.OPARITBIN;
        if(this.proxCaractere == '*'){
            leProxCaractere();
            q13();
        }
    }
    public void q15(){
        his.tokenReconhecido = Token.OPUNBIN;
    }
    public void q16(){
        his.tokenReconhecido = Token.ATRIBUICAO;
        if(this.proxCaractere == '='){
            leProxCaractere();
            q5();
        }
    }
    public void q17(){
        his.tokenReconhecido = Token.NUM;
        if(this.proxCaractere == '.'){
            leProxCaractere();
            q18();
        }
    }
    public void q18(){
        his.tokenReconhecido = Token.NUM;
        if(this.proxCaractere == '.'){
            leProxCaractere();
            q18();
        }
    }
    public void q19(){
        his.tokenReconhecido = Token.OPARITBIN;
        if(this.proxCaractere == proxCaractereIs(NUM)){
            leProxCaractere();
            q18();
        }else{
            System.out.println("Entrada não reconhecida");
            throw(new ErroLexico(this.proxCaractere,"'",this.linha));
        } 
    }
    public void q20(){
        his.tokenReconhecido = Token.VARIAVEL;
        if(this.proxCaractere == proxCaractereIs('h')){
            leProxCaractere();
            q21();
        }else if(proxCaractereIs(LETRA) && this.proxCaractere != 'h'){
            leProxCaractere();
            q25();
        }
    }
    public void q21(){
        his.tokenReconhecido = Token.VARIAVEL;
        if(this.proxCaractere == proxCaractereIs('i')){
            leProxCaractere();
            q22();
        }else if(proxCaractereIs(LETRA) && this.proxCaractere != 'i'){
            leProxCaractere();
            q25();
        }
    }

    public void q22(){
        his.tokenReconhecido = Token.VARIAVEL;
        if(this.proxCaractere == proxCaractereIs('l')){
            leProxCaractere();
            q23();
        }else if(proxCaractereIs(LETRA) && this.proxCaractere != 'l'){
            leProxCaractere();
            q25();
        }
    }

    public void q23(){
        his.tokenReconhecido = Token.VARIAVEL;
        if(this.proxCaractere == proxCaractereIs('e')){
            leProxCaractere();
            q24();
        }else if(proxCaractereIs(LETRA) && this.proxCaractere != 'e'){
            leProxCaractere();
            q25();
        }
    }
    public void q24(){
        his.tokenReconhecido = Token.WHILE;
        if(proxCaractereIs(LETRA)){
            leProxCaractere();
            q25();
        }
    }
    public void q25(){
        his.tokenReconhecido = Token.VARIAVEL;
        if(this.proxCaractereIs(LETRA) || this.proxCaractereIs(DIGITO) ){
            leProxCaractere();
            q25();
        }
    }
    public void q26(){
        his.tokenReconhecido = Token.VARIAVEL;
        if(this.proxCaractere == proxCaractereIs('o')){
            leProxCaractere();
            q27();
        }else if(proxCaractereIs(LETRA) && this.proxCaractere != 'o'){
            leProxCaractere();
            q25();
        }
    }
    public void q27(){
        his.tokenReconhecido = Token.VARIAVEL;
        if(this.proxCaractere == proxCaractereIs('r')){
            leProxCaractere();
            q27();
        }else if(proxCaractereIs(LETRA) && this.proxCaractere != 'r'){
            leProxCaractere();
            q25();
        }
    }
    public void q28(){
        his.tokenReconhecido = Token.FOR;
        if(proxCaractereIs(LETRA)){
            leProxCaractere();
            q25();
        }
    }
    public void q29(){
        his.tokenReconhecido = Token.OPARITBIN;
        if(this.proxCaractere == proxCaractereIs('f')){
            leProxCaractere();
            q30();
        }else if(this.proxCaractere == proxCaractereIs('s')){
            leProxCaractere();
            q31();
        }else if(proxCaractereIs(LETRA) && this.proxCaractere != 'f' && this.proxCaractere != 's'){
            leProxCaractere();
            q25();
        }
    }
    public void q30(){
        his.tokenReconhecido = Token.IF;
        if(proxCaractereIs(LETRA)){
            leProxCaractere();
            q25();
        }
    }

    public void q31(){
        his.tokenReconhecido = Token.OPRELBIN;
        if(proxCaractereIs(LETRA)){
            leProxCaractere();
            q25();
        }
    }
    public void q32(){
        his.tokenReconhecido = Token.VARIAVEL;
        if(this.proxCaractere == proxCaractereIs('o')){
            leProxCaractere();
            q33();
        }else if(proxCaractereIs(LETRA) && this.proxCaractere != 'o'){
            leProxCaractere();
            q25();
        }
    }
    public void q33(){
        his.tokenReconhecido = Token.VARIAVEL;
        if(this.proxCaractere == proxCaractereIs('o')){
            leProxCaractere();
            q34();
        }else if(proxCaractereIs(LETRA) && this.proxCaractere != 't'){
            leProxCaractere();
            q25();
        }
    }
    public void q34(){
        his.tokenReconhecido = Token.OPLOGUN;
        else if(proxCaractereIs(LETRA)){
            leProxCaractere();
            q25();
        }
    } 

    public void fim()
    {
        this.tokenReconhecido = Token.EOF;
    }
    public int getLinha() {
        return linha;
    }   