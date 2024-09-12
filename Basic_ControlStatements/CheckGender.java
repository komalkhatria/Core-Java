import java.util.Scanner;
public class CheckGender {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        char gender;
        System.out.print("Enter your gender(M/F/o): ");
        gender= sc.next().charAt(0);

        if(gender=='M' || gender=='m'){
            System.out.println("Male");
        }
        else if(gender=='F' || gender=='f'){
            System.out.println("Female");
        }
        else if(gender=='O' || gender=='o'){
            System.out.println("Others");
        }
        else{
            System.out.println("Enter a valid argument");
        }

    }
}
