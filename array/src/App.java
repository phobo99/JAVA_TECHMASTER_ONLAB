import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        //nếu n<=0 thì cho phép nhập lại từ đầu và hiện ra tbao
        while (n <= 0) {
            System.out.println("n phai lon hon 0 ! nhap lai n :");
            n = scan.nextInt();
        }
        //khai báo mảng 1 chiều và nhập phần tử cho nó
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("nhap phan tu thu " + (i + 1) + " : ");
            arr[i] = scan.nextInt();
        }
        //hiển thị ra màn hình mảng đã nhập
        System.out.print("mang da nhap : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        //gán giá trị max và min
        int max = arr[0];
        int min = arr[0];
        //vòng lặp tính max và min
        for (int i = 0; i < n; i++) {
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];
        }
        //in kết quả ra màn hình
        System.out.println("\nPhan tu lon nhat cua mang : " + max);
        System.out.println("Phan tu nho nhat cua mang : " + min);
        System.out.println("Mang sap xep nguoc lai : ");
        //sắp xếp mảng theo kiểu ngược lại
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        //vòng lặp sắp xếp theo thứ tự từ bé tới lớn. 
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < i; j++) {
                //so sánh xem tại vtri i có lớn hơn j hay không. nếu lớn hơn thì hoán đổi vị trí
                if (arr[i] > arr[j]) {
                    int x = arr[i];
                    arr[i] = arr[j];
                    arr[j] = x;
                }
            }
        }
        //in ra màn hình
        System.out.println("\nmang theo chieu tang dan : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        scan.close();

    }

}
