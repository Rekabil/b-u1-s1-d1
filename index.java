import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        esercizio1();
        es2();
    }


    static void esercizio1() {

        moltiplica(2, 5);
        concatena(51, "hello world");

    }


    static void moltiplica(int n1, int n2) {
        System.out.println("the result is: " + n1 * n2);
    }

    static void concatena(int n, String text) {
        System.out.println("Concatenato " + text + n);
    }

    static void es2() {
        Scanner input = new Scanner(System.in);
        System.out.println("Insert string 1");
        String text1 = input.nextLine();
        System.out.println("Insert string 2");
        String text2 = input.nextLine();
        System.out.println("Insert string 3");
        String text3 = input.nextLine();
        System.out.println("Risultato es2: " + text1 + text2 + text3);
    }


}