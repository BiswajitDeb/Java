import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;
import java.lang.Math;

class Box
{
    Scanner sc = new Scanner(System.in);
    double Box_surface_area,Box_Height,Box_Width,Box_Length,Box_Volume;
    public void surface_area_Box()
    {
        System.out.print("Enter length of the box : ");
        Box_Length = sc.nextDouble();
        System.out.print("Enter width of the box : ");
        Box_Width = sc.nextDouble();
        Box_surface_area = Box_Length*Box_Width;
        System.out.print("The surface area of the box is : " + Box_surface_area );
    }
    
    public void volume_Box()
    {
        System.out.print("Enter length of the box : ");
        Box_Length = sc.nextDouble();
        System.out.print("Enter width of the box : ");
        Box_Width = sc.nextDouble();
        System.out.print("Enter the height of the box : ");
        Box_Height = sc.nextDouble();
        Box_Volume = Box_Length * Box_Width * Box_Height ;
        System.out.print("The volume of the box is : " + Box_Volume);
    }
}

class Cube
{
    Scanner sc = new Scanner(System.in);
    double Cube_surface_area,Cube_Side_length,Cube_Volume;
    public void surface_area_Cube()
    {
        System.out.print("Enter length of a side of the cube : ");
        Cube_Side_length = sc.nextDouble();
        Cube_surface_area = 6*(Cube_Side_length * Cube_Side_length);
        System.out.print("The surface are of the cube is : "+ Cube_surface_area);
    }
    public void Volume_Cube()
    {
        System.out.print("Enter length of a side of the cube : ");
        Cube_Side_length = sc.nextDouble();
        Cube_Volume = Cube_Side_length*Cube_Side_length*Cube_Side_length;
        System.out.print("The volume os the Cube is : "+ Cube_Volume);
    }
}

class Cone
{
    Scanner sc = new Scanner(System.in);
    double Cone_Slant_Height,Cone_Height,Cone_Radius,Cone_Surface_Area,Cone_volume;
    public void Surface_Area_Cone()
    {
        System.out.print("Enter the radius of the cone : ");
        Cone_Radius = sc.nextDouble();
        System.out.print("Enter cone Height : ");
        Cone_Height = sc.nextDouble();
        Cone_Slant_Height = Math.sqrt(Math.pow(Cone_Radius,2)+Math.pow(Cone_Height,2));
        Cone_Surface_Area = Math.PI * Cone_Radius * (Cone_Slant_Height + Cone_Radius);
        System.out.print("The surface area of the cone is : " + Cone_Surface_Area);
    }
    public void Volume_Cone()
    {
        System.out.print("Enter the radius of the cone : ");
        Cone_Radius = sc.nextDouble();
        System.out.print("Enter cone Height : ");
        Cone_Height = sc.nextDouble();
        Cone_volume = 1/3*(Math.PI*(Math.pow(Cone_Radius,2)*Cone_Height));
        System.out.print("The volume of the Cone is : "+ Cone_volume);
    }
}
class Cylinder
{
    Scanner sc = new Scanner(System.in);
    double Cylinder_Height, Cylinder_Radius;
    double Cylinder_Surface_Area,Cylinder_Volume;
    public void Surface_Area_Cylinder()
    {
        System.out.print("Enter the height of the Cylinder : ");
        Cylinder_Height = sc.nextDouble();
        System.out.print("Enter the Radius of the Cylinder : ");
        Cylinder_Radius = sc.nextDouble();
        Cylinder_Surface_Area = 2 * Math.PI * Cylinder_Radius * (Cylinder_Radius + Cylinder_Height);
        System.out.print("The surface area of the given Cylinder is : " + Cylinder_Surface_Area);
    }
    public void Volume_Cylinder()
    {
        System.out.print("Enter the height of the Cylinder : ");
        Cylinder_Height = sc.nextDouble();
        System.out.print("Enter the Radius of the Cylinder : ");
        Cylinder_Radius = sc.nextDouble();
        Cylinder_Volume = Math.PI*(Math.pow(Cylinder_Radius,2)*Cylinder_Height);
        System.out.print("The volume of the Cylinder : " + Cylinder_Volume);
    }
}

public class Three_D_Objects
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int option;
        while (true)
        {
            System.out.println("1.Box\n2.Cube\n3.Cone\n4.Cylinder\n5.Exit\n\tOption : ");
            option = sc.nextInt();
            switch (option)
            {
                case 1:
                {
                    Box box_obj = new Box();
                    System.out.println("1.Box Surface Area\n2.Box Volume\n\t Option : ");
                    int sub_option = sc.nextInt();
                    switch(sub_option)
                    {
                        case 1: {box_obj.surface_area_Box();break;}
                        case 2: {box_obj.volume_Box();break;}
                    }
                    break;
                }
                case 2:
                {
                    Cube cube_obj = new Cube();
                    System.out.println("1.Cube Surface area\n2.Cube Volume\n\t Option : ");
                    int sub_option = sc.nextInt();
                    switch (sub_option)
                    {
                        case 1: {cube_obj.surface_area_Cube();break;}
                        case 2: {cube_obj.Volume_Cube();break;}
                    }
                    break;
                }
                case 3:
                {
                    Cone cone_obj = new Cone();
                    System.out.println("1.Cone Surface area\n2.Cone Volume\n\t Option : ");
                    int sub_option = sc.nextInt();
                    switch (sub_option)
                    {
                        case 1: {cone_obj.Surface_Area_Cone();break;}
                        case 2: {cone_obj.Volume_Cone();break;}
                    }
                    break;
                }
                case 4:
                {
                    Cylinder Cylinder_obj = new Cylinder();
                    System.out.println("1.Cylinder Surface area\n2.Cylinder Volume\n\t Option : ");
                    int sub_option = sc.nextInt();
                    switch (sub_option)
                    {
                        case 1: {Cylinder_obj.Surface_Area_Cylinder();break;}
                        case 2: {Cylinder_obj.Volume_Cylinder();break;}
                    }
                    break;
                }
            }
        }
    }
}
