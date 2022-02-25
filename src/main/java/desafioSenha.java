import java.util.Random;

public class desafioSenha {
    public static void main(String[] args) {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()-+0123456789abcdefghijklmnopqrstuvwyz0123456789";
        String randomString = "";

        Random rand = new Random();

        int length = rand.nextInt(6);

        char[] text = new char[length];


        for (int i = 0; i < length; i++) {

            text[i] = caracteres.charAt(rand.nextInt(caracteres.length()));
        }

        for (int i = 0; i < text.length; i++) {
            randomString += text[i];
        }

        System.out.println(randomString);


        int n = randomString.length();
        System.out.println(n);

        int res = 6-n;
        //System.out.println(res);
        System.out.println("Para tornar a senha mais segura é necessário acrescentar mais " + res + " caracteres");


    }
}


    

