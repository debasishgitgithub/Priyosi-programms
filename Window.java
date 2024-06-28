public class Window{
    public static void main(String args[]){
        Window wi1=new Window();
        wi1.open();
        wi1.show_colour("Green");
    }
    public void open(){
      System.out.println("Window is opened"); 
    }
    public void show_colour(String colour){
        System.out.println("colour is:"+colour);
    }
}