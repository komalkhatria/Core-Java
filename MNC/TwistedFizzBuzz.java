/*Write a program that prints the numbers from 1 to n.

        For multiples of 3, print "Fizz" instead of the number.
        For multiples of 5, print "Buzz" instead of the number.
        For multiples of both 3 and 5, print "FizzBuzz".
        If the number is prime, print "Prime" instead of the number, regardless of the above rules.*/


import java.util.*;
public class TwistedFizzBuzz {
    static void fizzBuzz(int n){
        for(int i=1; i<=n; i++){
            boolean isPrime= true;
            if(i==1){
                isPrime= false;
            }
            else{
                for(int j=2; j<i; j++){
                    if(i%j==0){
                        isPrime= false;
                        break;
                    }
                }
            }

            if(isPrime==true){
                System.out.println("Prime");
            }
            else if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            }
            else if(i%3==0){
                System.out.println("Fizz");
            }
            else if(i%5==0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n= sc.nextInt();

        fizzBuzz(n);
    }
}
