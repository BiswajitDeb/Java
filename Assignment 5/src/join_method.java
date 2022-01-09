import java.io.*;
import java.util.*;

public class join_method extends Thread{
    public void run(){
        for(int i=1;i<=4;i++){
            try{
                Thread.sleep(500);
            }catch(Exception e){System.out.println(e);}
            System.out.println(i);
        }
    }
    public static void main(String args[]){
        join_method object_thread1=new join_method ();
        join_method object_thread2=new join_method ();
        join_method object_thread3=new join_method ();
        object_thread1.start();
        try{
            object_thread1.join();
        }
        catch(Exception e){
            System.out.println(e);
        }

        object_thread2.start();
        object_thread3.start();
    }
}