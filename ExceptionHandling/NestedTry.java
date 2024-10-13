public class NestedTry {
    public static void main(String[] args) {

        try{
            try{
                System.out.println(9/0);
            }
            catch(NullPointerException ex){     //THIS CATCH BLOCK ISN'T HANDLING THE EXCEPTION THAT OCCURRED IN INNER TRY BLOCK, SO NOW THE EXCEPTION WILL OCCUR IN THE OUTER TRY BLOCK
                System.out.println(ex);
            }
        }
        catch(Exception ex){        //NOW THE OUTER CATCH IS HANDLING THE EXCEPTION OCCURRED
            System.out.println(ex);
        }


        try{
            try{
                String name= null;
                System.out.println(name.length());
            }
            catch(NullPointerException ex){     //THE INNER CATCH BLOCK IS HANDLING THE INNER TRY EXCEPTION
                System.out.println(ex);
            }
            System.out.println(9/0);
        }
        catch(Exception ex){        //THE OUTER CATCH IS HANDLING THE EXCEPTIONS IN OUTER TRY
            System.out.println(ex);
        }


        try{
            try{
                int a[]= new int[5];
                System.out.println(a[6]);
            }
            catch(Exception ex){        //THE INNER CATCH IS HANDLING THE EXCEPTION
                System.out.println(ex);
            }
            System.out.println(5/0);
        }
        catch(ArrayIndexOutOfBoundsException ex){       //THE OUTER CATCH HERE IS NOT ABLE TO HANDLE THE EXCEPTION OCCURRED
            System.out.println(ex);
        }
    }
}
