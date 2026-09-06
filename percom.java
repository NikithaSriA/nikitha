import java.util.Scanner;

class percom {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Enter r: ");
        int r = sc.nextInt();

        int factN = 1, factR = 1, factNR = 1;

        for(int i = 1; i <= n; i++)
            factN = factN * i;

        for(int i = 1; i <= r; i++)
            factR = factR * i;

        for(int i = 1; i <= n-r; i++)
            factNR = factNR * i;

        int nPr = factN / factNR;
        int nCr = factN / (factR * factNR);

        System.out.println("Permutation is " + nPr);
        System.out.println("Combination is " + nCr);
    }
}
