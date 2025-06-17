

import java.util.Random;
import java.util.Scanner;

class Generator {
    int round = 1;
    int i;
    int score = 0;

    public void Customer() {

        Scanner sc = new Scanner(System.in);

        System.out.println("You have 5 attempts in one round ! ");

        while (round <= 3) {
            System.out.println("The round " + round + " started !");
            // int i=1;
            for (i = 1; i <= 5; i++) {
                try {
                    Random rand = new Random();// The random number will be generated form here
                    int randomNum = rand.nextInt(20);
                    // System.out.println ("This is the generated number :"+randomNum);

                    System.out.println("Enter the  number or your guess in range of 20 :");
                    int a = sc.nextInt();

                    // randNum is the user guess
                    if (randomNum == a && a <= 20) {
                        System.out.println("You won !! your guess is correct : " + " The number was " + randomNum);
                        this.Thanking();
                        score += 10;
                        System.out.println("Your finale score is : " + score);
                        return;
                    } else if (randomNum >= a && a <= 20) {
                        System.out.println(
                                "Your guess was  low :" + "Your guess was :" + a + " And the number was :" + randomNum);
                        score -= 2;
                        System.out.println("Your score is : " + score);
                    } else if (randomNum <= a && a <= 20) {
                        System.out.println(
                                "Your guess was high :" + "Your guess was :" + a + " And the number was :" + randomNum);
                        score -= 2;
                        System.out.println("Your score is : " + score);
                    } else {
                        System.out.println("you have enterd the number out of range !!");
                        return;
                    }
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    System.out.println("Somenting wentwrong!!");
                }

            }
            System.out.println("The round  " + round + " finished");// it will indicate the number of rounds
            try{
            if (i == 6) {
                System.out.println("You want to paly again ?");
                // if you want to play again press 0 else press 1 to quit game
                int s2 = sc.nextInt();

                if (s2 == 0) {
                    round++;
                    if (round >= 4) {
                        // System.out.println("Thanks for play !!");
                        this.Thanking();
                        System.out.println("Your finale score is : " + score);
                    } else {
                        continue;
                    }
                } else if (s2 == 1) {
                    // System.out.println("Thanks for play !!");
                    this.Thanking();
                    System.out.println("Your finale score is : " + score);
                    break;
                }
                else{
                    System.out.println("Choose Coreect .. !!");
                    break;
                }
                sc.close();
            }

        }
        catch(Exception e){
            System.out.println("");
        }
    }

    }

    private void Thanking() {
        System.out.println("Thanks to play !!");
    }

}

public class NumberGame {
    public static void main(String[] args) {
        Generator G1 = new Generator();
        G1.Customer();

    }
}
