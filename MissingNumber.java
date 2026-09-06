import java.util.Scanner;

class MissingNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int sum = 0;

        System.out.println("Enter " + (n - 1) + " numbers:");

        for(int i = 0; i < n - 1; i++) {
            sum = sum + sc.nextInt();
        }

        int total = n * (n + 1) / 2;

        int missing = total - sum;

        System.out.println("Missing number = " + missing);
    }
}
