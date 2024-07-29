import java.util.Scanner;
public class ArrayCopying {
    public static void main(String args[]){
        String p[]={"Pri","Anki"};
        String b[]=new String[p.length];
        System.arraycopy(p,0,b,0,p.length);
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
    }
}