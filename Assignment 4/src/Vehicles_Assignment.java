class Vehicle
{
    public int Registration;
    public int speed;
    public String color;
    public String Owner_Name;
    public Vehicle(int Registration, int speed, String color, String Owner_Name)
    {
        this.Registration = Registration;
        this.speed = speed;
        this.color = color;
        this.Owner_Name = Owner_Name;
    }
}
class Bus extends Vehicle
{
    int Route_Number;
    public Bus(int Registration, int speed, String color, String Owner_Name, int Route_Number)
    {
        super(Registration, speed, color, Owner_Name);
        this.Route_Number = Route_Number;
    }
    public String ShowData()
    {
        return "Bus\t[Route_Number : " + Route_Number + " || Registration : " + Registration + " || speed : " + speed +
                " || color : " + color + " || Owner_Name : " + Owner_Name + "]\n";
    }
}
class Car extends Vehicle
{
    String manufacturerName ;
    public Car(int Registration, int speed, String color, String Owner_Name, String manufacturerName )
    {
        super(Registration, speed, color, Owner_Name);
        this.manufacturerName = manufacturerName ;
    }
    public String ShowData()
    {
        return "Car\t[manufacturerName : " + manufacturerName + " || Registration : " +Registration + " || speed : " +
                speed +
                " || color : " + color + " || Owner_Name : " + Owner_Name + "]";
    }
}
public class Vehicles_Assignment
{
    public static void main(String args[])
    {
        Bus obj= new Bus(8420,120,"Black","Biswa",210);
        System.out.println(obj.ShowData());
        Car obj1= new Car(8420,350,"Black","Biswa","AUDI");
        System.out.println(obj1.ShowData());
    }
}