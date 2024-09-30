import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("---JAVA CALCULATOR---");
        boolean flag= true;
        while(flag){
            System.out.print("Start/Exit: ");
            String calculator= sc.next();
            if(calculator.equals("start") || calculator.equals("Start")){
                System.out.print("Calculate: ");
                double n1= sc.nextInt();
                char op= sc.next().charAt(0);
                double n2= sc.nextInt();
                double result;

                if(op=='+' || op=='-' || op=='*' || op=='/'){
                    if(op=='+'){
                        result= n1 + n2;
                    }
                    else if(op=='-'){
                        result= n1-n2;
                    }
                    else if(op=='*'){
                        result=n1*n2;
                    }
                    else{
                        result= n1/n2;
                    }
                    System.out.println(result);
                }
                else{
                    System.out.println("Invalid operation");
                }
            }
            else if(calculator.equals("exit")){
                flag= false;
            }
        }

    }
}
