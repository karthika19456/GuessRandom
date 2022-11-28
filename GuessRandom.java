import java.util.Scanner;

public class GuessRandom
{
    public static void main(String[] args)
    {
        int guess, num, diff;
        double x;
        Scanner in = new Scanner(System.in);
        x = Math.random();
        num = (int) (10 * x) + 1;
        System.out.println("I'm thinking of a number from 1 to 10. Your guess?");
        guess = in.nextInt();
        diff = Math.abs(num - guess);
        System.out.printf("It was %d. You were off by %d.\n", num, diff);
    }
}
