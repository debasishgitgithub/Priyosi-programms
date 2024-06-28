class Flower { //instance variable
    int height=9; String colour="Red";
    public static void main(String args[]){
      Flower obj=new Flower();
      obj.self_pollination();
    }
    public void self_pollination () {
       System.out.println("this flower is self_pollination");
       System.out.println("this flower height is="+height);
       System.out.println("this flower colour is="+colour);
    }
}