class Storage {
    public static int num = -1;
}
class Counter implements Runnable
{ public void run() { for(int i = 0; i < 6; i++) {
    Storage.num = i;
    System.out.println(Thread.currentThread().getName());
}
}
}
class Printer implements Runnable
{ public void run() { for(int i = 0; i < 6; i++) { if(Storage.num
        == -1)   System.out.println("Empty."); else {
    System.out.println("The stored number is : "+Storage.num);
}
}
}
}
public class class_storage { public static void main(String[] args) {
    Counter ct = new Counter();
    Thread cth = new Thread(ct); Printer pt = new Printer(); Thread pth = new Thread(pt); cth.setName("Counted and stored.");
    cth.start(); pth.start();
}
}
