import java.util.Scanner;

class MaximumSubArraySum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter elements:");

        for(int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int current = a[0];
        int maximum = a[0];

        for(int i = 1; i < n; i++) {

            if(current + a[i] > a[i])
                current = current + a[i];
            else
                current = a[i];

            if(current > maximum)
                maximum = current;
        }

        System.out.println("Maximum subarray sum = " + maximum);
    }
}
