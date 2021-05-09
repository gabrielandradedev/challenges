import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int maior = maiorAB(a, b);
        maior = maiorAB(maior, c);

        System.out.println(maior + " eh o maior");

        in.close();

    }

    public static int maiorAB(int a, int b) {
        return (a + b + Math.abs(a - b)) / 2;
    }

}
