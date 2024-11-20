import java.util.*;
public class LinkedList2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter size for linkedlist: ");
        int size= sc.nextInt();

        LinkedList<Byte> l1= new LinkedList<>();       //creating Byte linkedlist

        System.out.print("Add elements for Byte linkedlist: ");
        for(int i=0; i<size; i++){
            l1.add(sc.nextByte());
        }
        System.out.println(l1);


        LinkedList<Short> l2= new LinkedList<>();       //creating Short linkedlist

        System.out.print("Add elements for Short linkedlist: ");
        for(int i=0; i<size; i++){
            l2.add(sc.nextShort());
        }
        System.out.println(l2);


        LinkedList<Integer> l3= new LinkedList<>();       //creating Integer linkedlist

        System.out.print("Add elements for Integer linkedlist: ");
        for(int i=0; i<size; i++){
            l3.add(sc.nextInt());
        }
        System.out.println(l3);


        LinkedList<Long> l4= new LinkedList<>();       //creating Long linkedlist

        System.out.print("Add elements for Long linkedlist: ");
        for(int i=0; i<size; i++){
            l4.add(sc.nextLong());
        }
        System.out.println(l4);


        LinkedList<Float> l5= new LinkedList<>();       //creating Float linkedlist

        System.out.print("Add elements for Float linkedlist: ");
        for(int i=0; i<size; i++){
            l5.add(sc.nextFloat());
        }
        System.out.println(l5);


        LinkedList<Double> l6= new LinkedList<>();       //creating Double linkedlist

        System.out.print("Add elements for Double linkedlist: ");
        for(int i=0; i<size; i++){
            l6.add(sc.nextDouble());
        }
        System.out.println(l6);


        LinkedList<Boolean> l7= new LinkedList<>();       //creating Boolean linkedlist

        System.out.print("Add elements for Boolean linkedlist: ");
        for(int i=0; i<size; i++){
            l7.add(sc.nextBoolean());
        }
        System.out.println(l7);


        LinkedList<Character> l8= new LinkedList<>();       //creating Character linkedlist

        System.out.print("Add elements for Character linkedlist: ");
        for(int i=0; i<size; i++){
            l8.add(sc.next().charAt(0));
        }
        System.out.println(l8);


        LinkedList<String> l= new LinkedList<>();       //creating String linkedlist

        System.out.print("Add elements for String linkedlist: ");
        for(int i=0; i<size; i++){
            l.add(sc.next());
        }
        System.out.println(l);
    }
}
