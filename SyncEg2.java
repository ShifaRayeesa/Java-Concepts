public class SyncEg2 {

    public static void main(String[] args) throws InterruptedException
    {
        Counter2 counter=new Counter2();
        Thread t1=new Thread() {
            @Override
            public void run() {
                synchronized (counter) {
                    for (int i = 0; i < 5000; i++) {
                        counter.increment();

                    }
                }
            }
        };
        System.out.println(counter.getCount());
        Thread t2=new Thread() {
            @Override
            public void run() {
                synchronized (counter) {
                    for (int i = 0; i < 5000; i++)
                        counter.decrement();

                }
            }
        };
        t1.start();
        t2.start();
        t2.join();
        t2.join();
        System.out.println(counter.getCount());
    }
}
class Counter2{
    private int count=0;
    public void increment()
    {
        count++;
    }
    public void decrement()
    {
        count--;
    }
    public int getCount()
    {
        return count;
    }
}