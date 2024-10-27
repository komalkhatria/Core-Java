import java.util.Scanner;
public class TheatreTicket {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the no. of tickets: ");
        int ticketCount= sc.nextInt();

        double k=75, q=150;
        double cost= 0;
        double totalCost= 0;
        double discount=0;
        double couponDiscount= 0;

        if(ticketCount>=5 && ticketCount<=40){
            System.out.print("Do you want refreshment: ");
            char refreshment= sc.next().charAt(0);
            System.out.print("Do you have coupon code: ");
            char coupon= sc.next().charAt(0);
            System.out.print("Enter the circle: ");
            char circle= sc.next().charAt(0);
            if(circle=='k'){
                cost= k*ticketCount;
                if(ticketCount>20){
                    cost -=cost*0.10;
                }
                if(coupon=='y'){
                    couponDiscount= cost*0.02;
                }
                totalCost= cost-couponDiscount;
                if(refreshment=='y'){
                    totalCost+= ticketCount*50;
                }
                System.out.println("Ticket cost= " + totalCost);
            }
            if(circle=='q'){
                cost= k*ticketCount;
                if(ticketCount>20){
                    cost -=cost*0.10;
                }
                if(coupon=='y'){
                    couponDiscount= cost*0.02;
                }
                totalCost= cost-couponDiscount;
                if(refreshment=='y'){
                    totalCost+= ticketCount*50;
                }
                System.out.println("Ticket cost= " + totalCost);
            }
            else{
                System.out.println("Invalid Input");
            }
        }
        else{
            System.out.println("Minimum of 5 and Maximum of 40 tickets");
        }
    }
}
