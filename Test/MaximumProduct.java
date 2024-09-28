import java.util.Scanner;
public class MaximumProduct {
    static void maximumProduct(int a[]){
        int max_product=0;
        for(int i=0; i<a.length; i++){
            int product=0;
            for(int j=i+1; j<a.length; j++){
                product=a[i]*a[j];
                if(product>max_product){
                    max_product=product;
                }
            }
        }
        System.out.print("Maximum product= " + max_product);
    }

}
