public class ThreadExample extends Thread {
    @Override
    public void run() {
        super.run();
        int count = 10;
        for (int i = count; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("Het gio");
    }

    public static void main(String[] args) {
        ThreadExample threadExample1 = new ThreadExample();
        ThreadExample threadExample2 = new ThreadExample();
        ThreadExample threadExample3 = new ThreadExample();

        threadExample1.start();
        try {                                        // de cho no chay xong thread1 moi chay 2 va 3 cung luc
            threadExample1.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        threadExample2.start();
        threadExample3.start();

    }
}

