package Animais;

public class Passaro extends Animal{

    //ATRIBUTOS DE CLASSE
    static int numoeroDePassaros;


    public Passaro(String nome, String cor, double peso) {
        super(nome, cor, peso);
    }

    @Override
    public void soar() {
        System.out.println("Bentivi");
    }
}

