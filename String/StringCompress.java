import java.util.*;
public class StringCompress {
    static void compress(char c[]) {
        boolean visited[] = new boolean[c.length];

        for (int i = 0; i < c.length; i++) {
            if (visited[i] == false) {
                for (int j = i + 1; j < c.length; j++) {
                    if (c[i] == c[j]) {
                        visited[j] = true;
                        continue;
                    } else {
                        System.out.print(c[i]);
                        break;
                    }
                }
            }
        }
        System.out.print(c[c.length-1]);
    }

    static void compressString(String s){
        StringBuffer sb= new StringBuffer(s.valueOf(s.charAt(0)));


        int count = 1;
        for(int i=1; i < s.length(); i++){
            if(s.charAt(i) == s.charAt(i-1)){
                count++;
            }
            else{
                if(count>1){
                    sb.append(count);
                    count =1;
                }
                sb.append(s.charAt(i));
            }

        }
        if(count>1){
            sb.append(count);
        }
        System.out.println(sb);
    }


    public static void main(String[] args) {
        String s= "aaabbccccddaeee";
        char ch[]= s.toCharArray();
        compress(ch);
        System.out.println();
        compressString(s);
    }
}
