public class App {
    public static void main(String[] args) throws Exception {
        try {
            int a = 0;
            int b = 5;
            int c = b / a;
        }catch (Exception e){
            e.printStackTrace();
            e.getMessage();
            e.toString();
        } finally {
            System.out.println("Khoi lenh nay luon duoc thuc hien");
        }
    }
}
