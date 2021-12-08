/*import java.util.Scanner;
class Three_D
{
    int length;
    int Height;
    int width;
    public void takeInp() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of length : ");
        length = sc.nextInt();
        System.out.println("Enter the value of width : ");
        Height = sc.nextInt();
        System.out.println("Enter the value of height : ");
        width = sc.nextInt();
    }
    public double Surface_Area() {
        return length+Height+width;
    }
    public double volume(){
        return length*Height*width;
    }
}
class Box extends Three_D
{
    @Override
    public double Surface_Area() {
        return
                (2*(super.length*super.Height)+2*(super.Height*super.width)+2*(super.length*
                        super.width));
    }
}
class Cone extends Three_D
{
    @Override
    public double Surface_Area()
    {
        double Cone_Slant_Height = Math.sqrt(Math.pow(length,2)+Math.pow(Height,2));
        double Cone_Surface_Area = Math.PI * length * (Cone_Slant_Height + Height);
        return  Cone_Surface_Area;
    }
}
class Cube extends Three_D
{
    @Override
    public double Surface_Area() {
        return 6*length*length;
    }
    @Override
    public double volume() {
        return length*length*length;
    }
}
class Cylinder extends Three_D
{
    private double pie = 3.1459;
    @Override
    public void takeInp() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius : ");
        length = sc.nextInt();
        System.out.println("Enter the length : ");
        Height = sc.nextInt();
    }
    @Override
    public double Surface_Area() {
        return 6*length*length;
    }
    @Override
    public double volume() {
        return pie*length*length*Height;
    }
}
public class Three_Dimentional_Objects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Three_D obj3d = new Three_D();
        int option;
        while (true) {
            System.out.println("1.Box\n2.Cube\n3.Cone\n4.Cylinder\n5.Exit\n\tOption : ");
            option = sc.nextInt();
            switch (option) {
                case 1: {
                    Box box_obj = new Box();
                    obj3d.takeInp();
                    System.out.println("1.Box Surface Area\n2.Box Volume\n\t Option : ");
                    int sub_option = sc.nextInt();
                    switch (sub_option) {
                        case 1: {
                            System.out.println("The Box surface area is : "+box_obj.Surface_Area());
                            break;
                        }
                        case 2: {
                            System.out.println("The Box Volume is : " + box_obj.volume());
                            break;
                        }
                    }
                    break;
                }
                case 2: {
                    Cube cube_obj = new Cube();
                    System.out.println("1.Cube Surface area\n2.Cube Volume\n\t Option : ");
                    int sub_option = sc.nextInt();
                    switch (sub_option) {
                        case 1: {
                            System.out.println("The cube surface area is : " + cube_obj.Surface_Area());
                            break;
                        }
                        case 2: {
                            cube_obj.volume();
                            break;
                        }
                    }
                    break;
                }
                case 3: {
                    Cone cone_obj = new Cone();
                    System.out.println("1.Cone Surface area\n2.Cone Volume\n\t Option : ");
                    int sub_option = sc.nextInt();
                    switch (sub_option) {
                        case 1: {
                            cone_obj.Surface_Area();
                            break;
                        }
                        case 2: {
                            cone_obj.volume();
                            break;
                        }
                    }
                    break;
                }
                case 4: {
                    Cylinder Cylinder_obj = new Cylinder();
                    System.out.println("1.Cylinder Surface area\n2.Cylinder Volume\n\t Option : ");
                    int sub_option = sc.nextInt();
                    switch (sub_option) {
                        case 1: {
                            Cylinder_obj.Surface_Area();
                            break;
                        }
                        case 2: {
                            Cylinder_obj.volume();
                            break;
                        }
                    }
                    break;
                }
                case 5: {
                    break;
                }
            }
        }
    }
}
*/