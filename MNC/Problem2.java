/*Given an integer array Arr of size N the task is to find the count of elements whose value is
greater than all of its prior elements.*/

import java.util.Scanner;
public class Problem2 {
    //METHOD TO FIND THE COUNT OF ELEMENTS WHOSE VALUE IS GREATER THAN THEIR PRIOR ELEMENTS
    static void scanArray(int arr[]){
        int count=0;
        for(int i=0; i<arr.length; i++){
            boolean flag=true;      //ASSUMING THE CURRENT ELEMENT IS GREATER THAN PRIOR ELEMENTS
            for(int j=0; j<i; j++){
                if(arr[i]<arr[j]){
                    flag=false;
                    break;
                }
            }
            if(flag==true){     //COUNT THE ELEMENT ONLY IF IT IS GREATER THAN ALL PRIOR ELEMENTS
                count++;
            }
        }
        System.out.println("No. of elements whose value is greater all their prior elements: " + count);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int size= sc.nextInt();
        int arr[]= new int[size];
        System.out.print("Enter " + size + " numbers: ");
        for(int i=0; i<size; i++){
            arr[i]= sc.nextInt();
        }
        scanArray(arr);
    }
}
