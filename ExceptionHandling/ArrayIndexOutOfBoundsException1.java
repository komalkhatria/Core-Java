public class ArrayIndexOutOfBoundsException1 {
    public static void main(String[] args) {
        //try BLOCK CONTAINS THE CODE WHERE EXCEPTION MAY OCCUR
        try{
            int a[]= new int[5];        //ACCESSING INDEX OUT OF THE ARRAY LENGTH GIVES ArrayIndexOutOfBoundsException
            a[5]= 10;
            System.out.println(a[5]);
        }

        //catch BLOCK IS USED TO HANDLE THE EXCEPTION, EXECUTES ONLY IF EXCEPTION OCCURS
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            System.out.println("Exception handled");
        }
    }
}
