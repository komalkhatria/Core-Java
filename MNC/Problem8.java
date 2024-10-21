/* We want to estimate the cost of painting a property.
   Interior wall painting cost is Rs.18 per sq.ft. and exterior wall painting cost is Rs.12 per sq.ft.
        Take input as
        1. Number of Interior walls
        2. Number of Exterior walls
        3. Surface Area of each Interior Wall in units of square feet
        4. Surface Area of each Exterior Wall in units of square feet
        If a user enters zero as the number of walls then skip Surface area values as User may
        don’t want to paint that wall.
        Calculate and display the total cost of painting the property
*/


import java.util.Scanner;

public class Problem8 {
    static void calculateCost(float iw[], float ew[]){
        float total_cost= 0;
        float iw_area=0, ew_area=0;
        for(int i=0; i<iw.length; i++){
            iw_area+=iw[i];         //CALCULATE TOTAL INTERIOR WALL AREA
        }
        for(int i=0; i<ew.length; i++){
            ew_area+=ew[i];         //CALCULATE TOTAL EXTERIOR WALL AREA
        }

        //Interior wall painting cost is Rs.18 per sq.ft. and exterior wall painting cost is Rs.12 per sq.ft.
        total_cost = ((iw_area*18) + (ew_area*12));
        System.out.println("Total estimated cost: " + total_cost + " INR");
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter no. of interior walls: ");
        int iw= sc.nextInt();
        System.out.print("Enter no. of exterior walls: ");
        int ew= sc.nextInt();

        if(iw==0 && ew==0){
                System.out.println("No wall to paint!");
        }
        else{
            System.out.println("Surface Area of each Interior Wall in units of square feet ");
            float interior_wall_area[]= new float[iw];
            for(int i=0; i<iw; i++){
                interior_wall_area[i]= sc.nextFloat();
            }

            System.out.println("Surface Area of each Exterior Wall in units of square feet ");
            float exterior_wall_area[]= new float[ew];
            for(int i=0; i<ew; i++){
                exterior_wall_area[i]= sc.nextFloat();
            }

            calculateCost(interior_wall_area, exterior_wall_area);
        }
    }
}
