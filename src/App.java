public class App {
    public static void main(String[] args) {
        Thread thread = new MyThread();
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 10; i++) {
                        System.out.println("Two: " + i);
                        Thread.sleep(500);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.setPriority(10);
        thread2.setPriority(1);
        thread.start();
        thread2.start();
    }
}
