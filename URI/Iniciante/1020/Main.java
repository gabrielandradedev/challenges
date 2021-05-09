import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int years = n / 365;
        n -= years * 365;
        int months = n / 30;
        n -= months * 30;

        System.out.println(years + " ano(s)");
        System.out.println(months + " mes(es)");
        System.out.println(n + " dia(s)");

    }

}
