import java.util.Scanner;
class Vehicle1
{
    int wheels;
    double speed;
}
class Car1 extends Vehicle1
{
    int pass;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the car's details:\n\tNo. of wheels : ");
        wheels=sc.nextInt();
        System.out.print("\tSpeed of Car(Km/hr) : ");
        speed=sc.nextDouble();
        System.out.print("\tNumber of passengers : ");
        pass=sc.nextInt();
    }
    void display()
    {
        System.out.println("No. of wheels : "+wheels+"\nSpeed:"+speed+"km/hr\nNo. of passengers:"+pass);
    }
}
class Truck extends Vehicle1
{
    double limit;
    void input()
    {

        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter the Truck's details :\n\tNo. of wheels:");
        wheels=sc.nextInt();
        System.out.print("\tSpeed of Truck(Km/hr):");
        speed=sc.nextDouble();
        System.out.print("\tLoad limit:");
        limit=sc.nextDouble();
    }
    void display()
    {
        System.out.println("No. of wheels:"+wheels+"\nSpeed:"+speed+"km/hr\nLoad limit:"+limit);
    }
}
public class Vehicles_Question11
{
    public static void main(String ts7[])
    {
        Car1 ob1= new Car1();
        Truck ob2=new Truck();
        ob1.input();
        ob2.input();
        if(ob1.speed>ob2.speed)
        {
            System.out.println("\nCar is faster");

        }
        else
            System.out.println("\nTruck is faster");
        System.out.println("\n\t\tThe car's details are : \n");
        ob1.display();
        System.out.println("\n\t\tThe Truck's details are : \n");
        ob2.display();
    }
}