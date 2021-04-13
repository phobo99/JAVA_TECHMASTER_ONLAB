import java.util.Scanner;

public class mangdachieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int tong = 0;
        int arr[][] = new int[n][m];
        // nhập vào mảng đa chiều
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scanner.nextInt();

            }
        }
        // Tổng các phân tử nằm trên đường chéo chính
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == j) {
                    tong = tong + arr[i][j];
                }
            }

        }
        // in ra màn hình
        for (int i = 0; i < n; i++) {
            System.out.println("");
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + "\t");
            }
        }

        System.out.println("\nTổng các phần tử nằm trên đường chéo chính là :" + tong);

        // Số lớn nhất và số bế nhất trên đường chéo chính
        int min = arr[0][0];
        int max = arr[0][0];
        for (int i = 0; i < n; i++) {
            for (int j =0; j<n; j++){
                if (i == j) {
                    if (arr[i][j]>max)
                        max = arr[i][j];
                    if (arr[i][j]>min)
                        min = arr[i][j];
                }
        }
    }
        System.out.println("\nsố lớn nhất của các phần tử nằm trên đường chéo chính là :" + max);
        System.out.println("\nsố lớn nhất của các phần tử nằm trên đường chéo chính là :" + min);
        scanner.close();
    }
}
