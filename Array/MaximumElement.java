public class MaximumElement {
    static void findMaximum(int a[]){
        int max=a[0];
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i]>max){
                    max=a[i];
                }
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int a[]={2, 5, 3, 7, 1, 18, 12, 3, 6, 7, 14, 8};
        findMaximum(a);
    }
}
