import java.util.Random;
import java.util.Scanner;

public class MethodsPractice {
    static Scanner sc = new Scanner(System.in); // create a global scanner class object

    // parameters ❌ return type ❌:
    public static void nameDisplay() {
        System.out.print("What is your name?: ");

        String userName = sc.nextLine();
        System.out.println("Hello, " + userName + " welcome to my app");
    }

    // parameters ❌ return type ✅:
    public static void matrixAddition() {
        System.out.print("\n--------------For matrix addition-----------------\nEnter the size of matrix A: ");
        String sizeA = sc.nextLine();
        String[] matASize = sizeA.split("x");
        int rowA = Integer.parseInt(matASize[0]), colA = Integer.parseInt(matASize[1]);

        System.out.print("Enter the size of matrix B: ");
        String sizeB = sc.nextLine();
        String[] matBSize = sizeB.split("x");
        int rowB = Integer.parseInt(matBSize[0]), colB = Integer.parseInt(matBSize[1]);

        if (rowA == rowB && colA == colB) {
            int[][] A = new int[rowA][colA], B = new int[rowB][colB];
            int i, j;

            System.out.println("Enter the value of matrix A:");
            for (i = 0; i < rowA; i++)
                for (j = 0; j < colA; j++)
                    A[i][j] = sc.nextInt();

            System.out.println("Enter the value of matrix B:");
            for (i = 0; i < rowB; i++)
                for (j = 0; j < colB; j++)
                    B[i][j] = sc.nextInt();

            System.out.println("\nSum of Matrix A & B:");
            for (i = 0; i < rowB; i++) {
                for (j = 0; j < colB; j++)
                    System.out.print(A[i][j] + B[i][j] + " ");
                System.out.println();
            }
        } else System.out.println("Size of Matrix A and B do not match");
    }

    // parameters ✅ return type ❌:
    public static void randomNumberGenerator(int range) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(range);
        System.out.println("Your random number is: " + randomNumber);
    }

    // parameters ✅ return type ✅:
    public static String eligibilityChecker(int age) {
        return (age < 18) ? "Not eligible to vote" : "Eligible to vote";
    }

    public static void main(String[] args) {
        nameDisplay(); // method 1

        matrixAddition(); // method 2

        System.out.print("---------------------------------------------------------\nYou want to generate a random between 0 and ");
        int range = sc.nextInt();
        randomNumberGenerator(range); // method 3

        System.out.print("-----------------------------------------\nEnter your age: ");
        int age = sc.nextInt();
        System.out.println(eligibilityChecker(age)); // method 4
    }
}
