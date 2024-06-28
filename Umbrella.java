public class Umbrella{
    public int a;//instance variable
    public static void main(String[] args){
       Umbrella um1=new Umbrella();// um1=identity ,local variable
       um1.open();
       Umbrella um2=new Umbrella();
       um2.open();
    }
    public void open(){
        System.out.println("Umbrella is open");
    }
    
}