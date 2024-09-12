import java.util.Scanner;
public class AreaVolumeCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String cal, shape;
        int tbase, theight, tarea, side, sarea, length, breadth, rarea, height, rec_vol;
        int cone_r, cone_height, cube_vol;
        float cone_vol;
        System.out.print("Input area/volume: ");
        cal= sc.next();
        if(cal.equals("area")){
            System.out.print("Choose triangle/ square/ rectangle: ");
            shape= sc.next();
            if(shape.equals("triangle")){
                System.out.print("Enter base: ");
                tbase= sc.nextInt();
                System.out.print("Enter height: ");
                theight= sc.nextInt();
                tarea= (tbase * theight)/2;
                System.out.println("Area of triangle is " + tarea);
            }
            else if(shape.equals("square")){
                System.out.print("Enter side: ");
                side= sc.nextInt();
                sarea= side* side;
                System.out.println("Area of square is " + sarea);
            }
            else if(shape.equals("rectangle")){
                System.out.print("Enter length: ");
                length= sc.nextInt();
                System.out.print("Enter breadth: ");
                breadth= sc.nextInt();
                rarea= length * breadth;
                System.out.println("Area of rectangle is: " + rarea);
            }
            else{
                System.out.println("Input mismatch");
            }
        }
        else if(cal.equals("volume")){
            System.out.print("Choose cone/ cube/ cuboid: ");
            shape= sc.next();
            if(shape.equals("cone")){
                System.out.print("Enter radius: ");
                cone_r= sc.nextInt();
                System.out.print("Enter height: ");
                cone_height= sc.nextInt();
                cone_vol= (3.14f * cone_r * cone_r * cone_height)/3;
                System.out.println("Volume of cone is " + cone_vol);
            }
            else if(shape.equals("cube")){
                System.out.println("Enter side: ");
                side= sc.nextInt();
                cube_vol= side * side * side;
                System.out.println("Volume of cube is " + cube_vol);
            }
            else if(shape.equals("cuboid")){
                System.out.print("Enter length: ");
                length= sc.nextInt();
                System.out.print("Enter breadth: ");
                breadth= sc.nextInt();
                System.out.print("Enter height: ");
                height= sc.nextInt();
                rec_vol= length * breadth * height;
                System.out.println("Volume of cuboid is " + rec_vol);
            }
            else{
                System.out.println("Input mismatch");
            }
        }
        else{
            System.out.println("input mismatch");
        }

    }
}
