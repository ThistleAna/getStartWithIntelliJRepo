import java.util.Scanner; // import the Scanner class to read user input
public class Main {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in); // create a scanner object
        // ask user to input three numbers
        System.out.println ("Input three numbers. Use enter to key in each number.");
        int num1 = myObj.nextInt();
        int num2 = myObj.nextInt();
        int num3 = myObj.nextInt();

        System.out.println ("Your numbers are ");
        System.out.println (num1 + ", " + num2 + ", " + num3);

        // calling minNumbers method and print the smallest number
        int minNum = minNumbers(num1, num2, num3);
        System.out.println("Smallest: " + minNum);

        // calling maxNumbers method and print the biggest number
        int maxNum = maxNumbers (num1, num2, num3);
        System.out.println ("Biggest: " +maxNum);

    }

    public static int minNumbers(int a, int b, int c){
        int min = a;

        if (min > b){
            min = b;
        }

        if (min > c){
            min = c;
        }
        return min;
    }
    public static int maxNumbers(int a, int b, int c) {
        int max = a;

        if (max < b){
            max = b;
        }

        if (max < c){
            max = c;
        }
        return max;
    }

}