package Animais;

public class Cachorro extends Animal{

    //ATRIBUTOS DE CLASSE
    /* public / protected / defaut / private */
    static int numeroDeCachorros;

    private int tamanhoDoRabo;

    //CONSTRUTORES PADRAO
//    public Cachorro(){}

    //CONSTRUTORES ADCIONADOS
    public Cachorro(String nome, String cor, int altura, double peso, int tamanhoDoRabo, String estadoDeEspirito) {
        super(nome, cor, peso);
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.tamanhoDoRabo = tamanhoDoRabo;
        this.estadoDeEspirito = estadoDeEspirito;

        numeroDeCachorros  ++;


    }

    //METODOS


    public static int getNumeroDeCachorros() {
        return numeroDeCachorros;
    }

    public static void setNumeroDeCachorros(int numeroDeCachorros) {
        Cachorro.numeroDeCachorros = numeroDeCachorros;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getTamanhoDoRabo() {
        return tamanhoDoRabo;
    }

    public void setTamanhoDoRabo(int tamanhoDoRabo) {
        this.tamanhoDoRabo = tamanhoDoRabo;
    }

    public String getEstadoDeEspirito() {
        return estadoDeEspirito;
    }

    public String pegar(){
        return "Bolinha";
    }

    public String interagir(String acao){

        //NO CASO DE MUITOS IF ELSE USE SWITCH COMO abaixo
//        if (acao.equals("carinho")){
//            this.estadoDeEspirito = "feliz";
//        }else if (acao.equals("Vai Dormir!")){
//            this.estadoDeEspirito = "bravo";
//        }else {
//            this.estadoDeEspirito = "neutro";
//        }
//        return estadoDeEspirito;


       switch (acao){
           case "carinho" : this.estadoDeEspirito = "feliz"; break;
           case "vai dormir!" : this.estadoDeEspirito = "bravo"; break;
           case "pisar na patinha" : this.estadoDeEspirito = "triste"; break;
           default: this.estadoDeEspirito = "Neutro"; break;
       }

       return estadoDeEspirito;
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override
    public void soar() {
        System.out.println("AuAu");
    }
}
