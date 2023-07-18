import java.util.Scanner;

public class Row_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row and column size:");
        int n=sc.nextInt();
        int  m=sc.nextInt();
        int sum = 0;
        int [][] a= new int[n][m];
        System.out.println("enter array element");
        if (n > 0 && m > 0) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            for (int j = 0; j < n; j++) {
                sum = 0;
                for (int i = 0; i < m; i++) {
                    sum += a[j][i];
                }
                System.out.print(sum + " ");
            }
        }


        else
            System.out.println("enter a valid array size");
    }
}
