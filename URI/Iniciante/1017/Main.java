import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int time = in.nextInt();
        int speed = in.nextInt();

        System.out.printf("%.3f%n", (double) time * speed / 12);

    }

}
