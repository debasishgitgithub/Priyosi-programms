import java.util.Scanner;
public class ArrayCopying3 {
    public static void main(String args[]){
        String p[]={"Pri","Anki"};
        String b[]=new String[p.length+2];
        b[0]="Tomato";
        b[1]="Coke";
        System.arraycopy(p,0,b,2,p.length);
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
    }
}