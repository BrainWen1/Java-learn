import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int i = rand.nextInt(100) + 1;

        int num = 0;
        while (true) {
            Scanner input = new Scanner(System.in);
            num =  input.nextInt();
            if (num == i) {
                System.out.println("Yes");
                break;
            } else {
                if (num > i) {
                    System.out.println(num + " is larger");
                } else {
                    System.out.println(num + " is smaller");
                }
            }
        }
    }
}
