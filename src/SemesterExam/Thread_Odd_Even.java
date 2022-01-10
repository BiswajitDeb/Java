package SemesterExam;

import java.util.Scanner;

public class Thread_Odd_Even {

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the last term of the sequence : ");
        int max = sc.nextInt();
        Printer print = new Printer();
        Thread t1 = new Thread(new TaskEvenOdd(print, max, false));
        Thread t2 = new Thread(new TaskEvenOdd(print, max, true));
        t1.start();
        t2.start();
    }

}

class TaskEvenOdd implements Runnable {

    private int max;
    private Printer print;
    private boolean IsEven;

    TaskEvenOdd(Printer print, int max, boolean IsEven) {
        this.print = print;
        this.max = max;
        this.IsEven = IsEven;
    }

    @Override
    public void run() {
        int number = IsEven == true ? 2 : 1;
        while (number <= max) {

            if (IsEven) {
                print.Display_Even(number);
            } else {
                print.Display_Odd(number);
            }
            number += 2;
        }

    }

}

class Printer {

    boolean IsOdd = false;

    synchronized void Display_Even(int number) {

        while (IsOdd == false) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Even:" + number);
        IsOdd = false;
        notifyAll();
    }

    synchronized void Display_Odd(int number) {
        while (IsOdd == true) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Odd:" + number);
        IsOdd = true;
        notifyAll();
    }

}