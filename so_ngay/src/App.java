import java.util.Scanner;

public class App {
    private static final int NOVEMBER = 11;
    private static final int SEPTEMBER = 9;
    private static final int AUGUST = 8;
    private static final int DECEMBER = 12;
    private static final int OCTOBER = 10;
    private static final int JULY = 7;
    private static final int JUN = 6;
    private static final int MAY = 5;
    private static final int APRIL = 4;
    private static final int FEBRUARY = 2;
    private static final int MARCH = 3;
    private static final int JANUARY = 1;
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int month;
        System.out.println("Nhập váo tháng: ");

        month = input.nextInt();

        switch (month){

            case JANUARY: case MARCH: case MAY: case JULY: case AUGUST: case OCTOBER: case DECEMBER:
                System.out.println("tháng này có 31 ngày");
                break;
            case FEBRUARY:
                System.out.println("tháng này có 28 hoặc 29 ngày");
                break;
            case APRIL: case JUN: case SEPTEMBER: case NOVEMBER:
                System.out.println("tháng này có 30 ngày");
                break;
            default:
                System.out.println("Không có tháng này");
        }
    }
}
