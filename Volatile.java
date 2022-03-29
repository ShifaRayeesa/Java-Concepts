public class Volatile {
    private static volatile int counter = 0;

    public static void main(String[] args) {
        new ReadThread().start();
        new WriteThread().start();
    }


    static class ReadThread extends Thread {
        @Override
        public void run() {
            while (counter < 4) {

            }
            System.out.println("I am here "+counter);
        }
    }

    static class WriteThread extends Thread {
        @Override
        public void run() {
            while (counter < 10) {
                counter++;
                System.out.println(counter);
            }
        }
    }
}