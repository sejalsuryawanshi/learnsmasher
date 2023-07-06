import java.util.Scanner;
public class Guessnumber {
    public static void guessnumber() {
        Scanner sc = new Scanner(System.in);
        int number = 1 +(int)(100*Math.random());
        int k = 5;
        int i,guess;
        System.out.println("Guess the number between 1 to 100 within 5 trials");
        for(i=0; i<k; i++) {
            guess = sc.nextInt();
        
        if(guess == number) {
            System.out.println("CONGRATULATIONS!! you guess the number");
            break;
        }
        else if(guess>number && i != k-1) {
            System.out.println("Your guess is greater than the number");
        }
        else if(guess<number && i != k-1) {
            System.out.println("Your guess is less than the number");
        }
    }
        if(i==k) {
            System.out.println("You exhausted the trials");
            System.out.println("The number was : "+number);
        }
    }
    public static void main(String args[]) {
        guessnumber();
    }
}
