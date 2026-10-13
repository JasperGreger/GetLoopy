import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class Dieroller {
    static void main() {
        Scanner in = new Scanner(System.in);
        Random Generator = new Random();

        int die1 = Generator.nextInt(6)+1;
        int die2 = Generator.nextInt(6)+1;
        int die3 = Generator.nextInt(6)+1;
        int sum = die1 + die2 + die3;
        Boolean done = false;
        String finished = "";


        do {
            System.out.printf("Roll\t\tDie1\t\tDie2\t\tDie3\t\tSum");
            System.out.printf("%n" + "----------------------------------------------------");

            for (int x = 1; x <= 2; x++){
                System.out.printf("%n" + x + "\t\t\t" + die1 + "\t\t\t" + die2 + "\t\t\t" + die3 + "\t\t\t" + sum);

                die1 = Generator.nextInt(6)+1;
                die2 = Generator.nextInt(6)+1;
                die3 = Generator.nextInt(6)+1;

                sum = die1 + die2 + die3;

            }

            IO.println();
            IO.print("Are you finished? Enter [Y/N]: ");
            finished = in.nextLine();

            if (finished.equalsIgnoreCase("Y")) {
                done = true;
            }

        }while(!done);








    }
}
