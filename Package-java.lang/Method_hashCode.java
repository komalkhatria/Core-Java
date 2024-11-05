//For every object, JVM generates a unique number which is a hashcode.
public class Method_hashCode {
    int a;
    Method_hashCode(int a){
        this.a= a;
    }
    public int hashCode(){
        return a;
    }
    public static void main(String[] args) {
        Method_hashCode a= new Method_hashCode(71);
        System.out.println(a.hashCode());
    }
}
