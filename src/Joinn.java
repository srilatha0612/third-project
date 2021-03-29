public class Joinn extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("seeta thread");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {

            }
        }
    }

    static class ThreadJoinDemo {
        public static void main(String[] args) throws InterruptedException {
            Joinn j = new Joinn();
            j.start();
            //j.join();
            for (int i = 0; i < 5; i++) {
                System.out.println("rama thread");
            }
        }
    }
}

