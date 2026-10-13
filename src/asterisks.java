public class asterisks {
    static void main() {


        for(int x = 0; x <= 5; x++) {
            System.out.printf("%n");

            for (int a = 0; a <= 5; a++) {
                System.out.print("*");
            }

        }

        IO.println();

        for(int x = 0; x <= 5; x++) {
            System.out.printf("%n");

            for (int a = 0; a <= x; a++) {
                System.out.print("*");
            }

        }

        IO.println();

        for(int x = 0; x <= 5; x++) {
            System.out.printf("%n");

            for (int a = 5; a >= x; a--) {
                System.out.print("*");
            }

        }





    }
}
