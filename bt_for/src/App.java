public class App {
    public static void main(String[] args) throws Exception {
        int tong=0;
        for (int i=0; i<=10;i++){
            if (i%2==0){
                tong += i;
                System.out.println(i);
            }   
        }
        System.out.println(tong);
    }
}
