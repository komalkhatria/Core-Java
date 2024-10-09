public class MethodsOfException {

    //PRINT REFERENCE VARIABLE OF EXCEPTION CLASS
    void show1(){
        try{
            System.out.println(3/0);
        }
        catch(ArithmeticException ex){
            System.out.println(ex);     //PRINTS EXCEPTION NAME AND DESCRIPTION
        }
    }

    //printStackTrace METHOD
    void show2(){
        try{
            System.out.println(3/0);
        }
        catch(ArithmeticException ex){
            ex.printStackTrace();     //PRINTS EXCEPTION NAME, DESCRIPTION AND LOCATION(STACK)
        }
    }

    //toString METHOD (METHOD OF OBJECT CLASS, RETURN TYPE IS STRING)
    void show3(){
        try{
            System.out.println(3/0);
        }
        catch(ArithmeticException ex){
            System.out.println(ex.toString());     //PRINTS EXCEPTION NAME AND DESCRIPTION
        }
    }

    //getMessage METHOD (RETURN TYPE IS STRING)
    void show4(){
        try{
            System.out.println(3/0);
        }
        catch(ArithmeticException ex){
            System.out.println(ex.getMessage());     //PRINTS EXCEPTION DESCRIPTION
        }
    }
    public static void main(String[] args) {
        MethodsOfException m= new MethodsOfException();
        m.show1();
        m.show2();
        m.show3();
        m.show4();
    }
}
