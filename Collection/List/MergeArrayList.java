import java.util.ArrayList;
public class MergeArrayList {
    public static void main(String[] args){
        ArrayList<Integer> al= new ArrayList<>();
        al.add(22);
        al.add(67);
        al.add(36);
        System.out.println(al);

        //MERGE METHOD 1
        ArrayList<Integer> al2= new ArrayList<>(al);
        al2.add(80);
        al2.add(50);
        System.out.println(al2);
        System.out.println(al);


        //MERGE METHOD 2 --> addAll()
        al.addAll(al2);
        System.out.println(al);

        al2.addAll(al);
        System.out.println(al2);
    }
}
