import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;
import java.lang.Math;

class Box
{
    Scanner sc = new Scanner(System.in);
    double Box_surface_area,Box_Height,Box_Width,Box_Length,Box_Volume;
    public void surface_area_Box()
    {
        System.out.println("Enter length of the box : ");
        Box_Length = sc.nextInt();
        System.out.println("Enter width of the box : ");
        Box_Width = sc.nextInt();
        Box_surface_area = Box_Length*Box_Width;
        System.out.println("The surface area of the box is : " + Box_surface_area );
        //return Box_surface_area;
    }
    
    public void volume_Box()
    {
        System.out.println("Enter length of the box : ");
        Box_Length = sc.nextInt();
        System.out.println("Enter width of the box : ");
        Box_Width = sc.nextInt();
        System.out.println("Enter the height of the box : ");
        Box_Height = sc.nextInt();
        Box_Volume = Box_Length * Box_Width * Box_Height ;
        System.out.println("The volume of the box is : " + Box_Volume);
        //return Box_Volume;
    }
    


}

class Cube
{
    Scanner sc = new Scanner(System.in);
    double Cube_surface_area,Cube_Side_length,Cube_Volume;
    public void surface_area_Cube()
    {
        System.out.print("Enter length of a side of the cube : ");
        Cube_Side_length = sc.nextInt();
        Cube_surface_area = 6*(Cube_Side_length * Cube_Side_length);
        System.out.print("The surface are of the cube is : "+ Cube_surface_area);
        //return Cube_area;
    }
    public void Volume_Cube()
    {
        System.out.print("Enter length of a side of the cube : ");
        Cube_Side_length = sc.nextInt();
        Cube_Volume = Cube_Side_length*Cube_Side_length*Cube_Side_length;
        System.out.print("The volume os the Cube is : "+ Cube_Volume);

    }

}

class cone
{
    Scanner sc = new Scanner(System.in);
    double Cone_Slant_Height,Cone_Height,Cone_Radius,Cone_Surface_Area,Cone_volume;
    public void Surface_Area_Cone()
    {
        System.out.print("Enter the radius of the cone : ");
        Cone_Radius = sc.nextInt();
        System.out.print("Enter cone Height : ");
        Cone_Height = sc.nextInt();
        Cone_Slant_Height = Math.sqrt(Math.pow(Cone_Radius,2)+Math.pow(Cone_Height,2));
        Cone_Surface_Area = Math.PI * Cone_Radius * (Cone_Slant_Height + Cone_Radius);
        System.out.print("The surface area of the cone is : " + Cone_Surface_Area);
    }
    public void Volume_Cone()
    {
        System.out.print("Enter the radius of the cone : ");
        Cone_Radius = sc.nextInt();
        System.out.print("Enter cone Height : ");
        Cone_Height = sc.nextInt();
        Cone_volume = 1/3*(Math.PI*(Math.pow(Cone_Radius,2)*Cone_Height));
        System.out.println("The volume of the Cone is : "+ Cone_volume);
    }

}
class Cylinder
{
    Scanner sc = new Scanner(System.in);
    double Cylinder_Height, Cylinder_Radius;
    double Cylinder_Surface_Area,Cylinder_Volume;
    public void Surface_Area_Cylinder()
    {
        System.out.println("Enter the height of the Cylinder : ");
        Cylinder_Height = sc.nextDouble();
        System.out.println("Enter the Radius of the Cylinder : ");
        Cylinder_Radius = sc.nextDouble();
        Cylinder_Surface_Area = 2 * Math.PI * Cylinder_Radius * (Cylinder_Radius + Cylinder_Height);
        System.out.println("The surface area of the given Cylinder is : "+ Cylinder_Surface_Area);
    }
    public void Volume_Cylinder()
    {
        System.out.println("Enter the height of the Cylinder : ");
        Cylinder_Height = sc.nextDouble();
        System.out.println("Enter the Radius of the Cylinder : ");
        Cylinder_Radius = sc.nextDouble();
        Cylinder_Volume = Math.PI*(Math.pow(Cylinder_Radius,2)*Cylinder_Height);

    }

}

public class Three_D_Objects
{
    public static void main(String[] args)
    {

    }
}
