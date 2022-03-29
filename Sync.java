
public class Sync {
    public static void main(String args[]) {
        File1Thread f1 = new File1Thread();
        File2Thread f2 = new File2Thread();

        f1.start();
        f2.start();
    }
}

class Printer{
    synchronized void print(String name) {
        System.out.println("Printing "+name);
    }
}

class File1Thread extends Thread {
    Printer printer;

    File1Thread(){
        printer = new Printer();
    }
    public void run(){
        for(int i=0;i<10;i++) {
            printer.print("Doc 1:"+i);
        }
    }
}

class File2Thread extends Thread {
    Printer printer;

    File2Thread() {
        printer = new Printer();
    }
    public void run(){
        for(int i=0;i<10;i++) {
            printer.print("Doc 2:"+i);
        }
    }

}