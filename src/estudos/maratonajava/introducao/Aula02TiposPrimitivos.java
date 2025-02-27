package estudos.maratonajava.introducao;

/**
 * Tipos Primitivos: int, float, double, long, byte, short, boolean, char
 */

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        int age = (int) 10000000000L;
        long bigNumber = 100000000L;
        float salary = 1853F;
        double bonus = 50000;
        char genre = 'M';
        byte ageInByte = 20;
        short ageInShort = 20;
        boolean ageInBoolean = true;
        boolean ageInBoolean2 = false;
        char genreInChar = 65;
        String genreInString = "Masculino";

        System.out.println("Meu primo tem " + age + " anos");
        System.out.println("Meu primo tem " + bigNumber + " anos");
        System.out.println(genreInChar);
        System.out.println(genreInString);
    }
}
