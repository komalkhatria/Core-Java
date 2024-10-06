/*Problem Statement –
A chocolate factory is packing chocolates into the packets. The
chocolate packets here represent an array of N number of integer values. The task is to find
the empty packets(0) of chocolate and push it to the end of the conveyor belt(array).*/

import java.util.Scanner;
public class Problem1 {
    static void openPackets(int packets[]){
        for(int i=0; i<packets.length; i++){
            System.out.print(packets[i] + " ");
        }
        System.out.println();
    }
    static void swap(int packet[], int position, int end){
        int temp= packet[position];
        packet[position]= packet[end];
        packet[end]= temp;
    }
    static void findEmptyPackets(int packets[]){
        int left=0, right= packets.length-1;
        while(left<right){
            if(packets[left]!=0){
                left++;
            }
            else if(packets[right]==0){
                right--;
            }
            else if(packets[left]==0 && packets[right]!=0){
                swap(packets, left, right);
                left++;
                right--;
            }
        }
        System.out.println("Processing...");
        openPackets(packets);
        System.out.println("Empty chocolate packets pushed to the end of the conveyer belt!");
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter no. of packets: ");
        int no_of_packets= sc.nextInt();
        int packets[]= new int[no_of_packets];
        System.out.print("Enter no. of chocolates in all " + no_of_packets + " packets: ");
        for(int i=0; i<no_of_packets; i++){
            packets[i]=sc.nextInt();
        }
        findEmptyPackets(packets);
    }
}
