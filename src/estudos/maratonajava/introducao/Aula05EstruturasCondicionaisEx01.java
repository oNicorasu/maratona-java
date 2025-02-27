package estudos.maratonajava.introducao;

public class Aula05EstruturasCondicionaisEx01 {
    public static void main(String[] args) {

        float anualSalary = 70000F;
        if (anualSalary <= 34712 && anualSalary >= 0) {
            System.out.printf("This year you will pay a tax that cost € %f", anualSalary * 0.097);
        } else if (anualSalary >= 34713 && anualSalary <= 68507) {
            System.out.printf("This year you will pay a tax that cost € %f", anualSalary * 0.3735);
        } else {
            System.out.printf("This year you will pay a tax that cost € %f", anualSalary * 0.495);
        }
    }
}
