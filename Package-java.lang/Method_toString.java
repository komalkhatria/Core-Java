//The toString() provides a String representation of an object and is used to convert an object to a String.
public class Method_toString {
    int a;
    Method_toString(int a){
        this.a= a;
    }
    public String toString(){
        return a+ " ";
    }
    public static void main(String[] args) {
        Method_toString a= new Method_toString(71);
        System.out.println(a.toString());
    }
}
