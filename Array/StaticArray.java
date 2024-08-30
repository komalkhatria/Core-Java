public class StaticArray {
    public static void main(String args[]){
        //CREATING AND PRINTING STATIC ARRAY

        //PRIMITIVE DATATYPES
        byte b[]= {3,2,4,1,6};
        for(int i=0; i<b.length; i++){
            System.out.print(b[i] + " ");
        }
        System.out.println();

        short s[]= {12, 32, 15, 27, 29};
        for(int i=0; i<s.length; i++){
            System.out.print(s[i] + " ");
        }
        System.out.println();

        int i1[]= {37, 45, 51, 33, 40};
        for(int i=0; i<i1.length; i++){
            System.out.print(i1[i] + " ");
        }
        System.out.println();

        long l[]= {89, 78, 91, 64, 83};
        for(int i=0; i<l.length; i++){
            System.out.print(l[i] + " ");
        }
        System.out.println();

        float f[]= {1.2f, 5.6f, 3.1f, 4.6f, 8.9f};
        for(int i=0; i<f.length; i++){
            System.out.print(f[i] + " ");
        }
        System.out.println();

        double d[]= {21.3, 45.2, 54.6, 70.5, 29.3};
        for(int i=0; i<d.length; i++){
            System.out.print(d[i] + " ");
        }
        System.out.println();

        char ch[]= {'a', 40, '&', 'Q', '#'};
        for(int i=0; i<ch.length; i++){
            System.out.print(ch[i] + " ");
        }
        System.out.println();

        boolean bool[]= {true, false, false, true, false};
        for(int i=0; i<bool.length; i++){
            System.out.print(bool[i] + " ");
        }
        System.out.println();

        System.out.println();

        //WRAPPER CLASSES
        String str[] = {"Java", "C", "Python", "C++"};
        for(int i=0; i<str.length; i++){
            System.out.print(str[i] + " ");
        }
        System.out.println();

        Byte by[] = {3,2,4,1,6};
        for(byte by1: by){
            System.out.print(by1 + " ");
        }
        System.out.println();

        Short sh[]= {12, 32, 15, 27, 29};
        for(int i=0; i<sh.length; i++){
            System.out.print(sh[i] + " ");
        }
        System.out.println();

        Integer in[]= {37, 45, 51, 33, 40};
        for(int in1: in){
            System.out.print(in1 + " ");
        }
        System.out.println();

        Long lo[]= {89L, 78L, 91L, 64L, 83L};
        for(int i=0; i<lo.length; i++){
            System.out.print(lo[i] + " ");
        }
        System.out.println();

        Float fl[]= {1.2f, 5.6f, 3.1f, 4.6f, 8.9f};
        for(float fl1: fl){
            System.out.print(fl1 + " ");
        }
        System.out.println();

        Double db[]= {21.3, 45.2, 54.6, 70.5, 29.3};
        for(int i=0; i<db.length; i++){
            System.out.print(db[i] + " ");
        }
        System.out.println();

        Character cha[]= {'a', 40, '&', 'Q', '#'};
        for(char cha1: cha){
            System.out.print(cha1 + " ");
        }
        System.out.println();

        Boolean bl[]= {true, false, false, true, false};
        for(int i=0; i<bl.length; i++){
            System.out.print(bl[i] + " ");
        }
        System.out.println();

        System.out.println();

        //STORING HETEROGENEOUS DATA
        var a= new Object[]{
                45, "Hello", '$', 8.5f
        };
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();

        Object o[] = { 8.6f, "Java", 90 , 'c'};
        for(int i=0; i<o.length; i++){
            System.out.print(o[i] + " ");
        }
        System.out.println();
    }
}
