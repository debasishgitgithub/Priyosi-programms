import java.util.Scanner;
public class ArrayCopying2 {
    public static void main(String args[]){
        String p[]={"Pri","Anki"};
        String b[]=new String[p.length+1];
        b[0]="Tomato";
        b[1]="Coke";
        System.arraycopy(p,0,b,2,1);
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
    }
}