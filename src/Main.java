import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//
//        byte variavelByte = 127;
//        //short -32768 a 32767
//        //char 0 a 65535
//        //int -2b a 2billions
//        //long -9 t a 9trillions
//
//        int variavelInt = 2147483;
//
//        System.out.println(variavelInt);


        Cachorro cachorro1 = new Cachorro("Marley", "Branco", 25, 5.5, 10, "nada");
        Gato gato1 = new Gato("Felix", "Preto", 4.5);
        Passaro passaro1 = new Passaro("PiuPiu", "Amarelo", 0.5);

        cachorro1.soar();
        gato1.soar();
        passaro1.soar();



//        cachorro1.latir();
//        System.out.println("O cachorro pegou uma " + cachorro1.pegar());
//        System.out.println("O cachorro esta " + cachorro1.interagir("carinho"));
//        System.out.println("O cachorro esta " + cachorro1.interagir("vai dormir!"));
//        System.out.println("O cachorro esta " + cachorro1.interagir("pisar na patinha"));

//        System.out.println(cachorro1.toString());
//        System.out.println(gato1.toString());
//        System.out.println(passaro1.toString());

//        System.out.println(cachorro2.toString());

    }
}