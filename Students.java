class Students {
    String name;int roll;  
    public static void main(String args[]){
      Students obj=new Students();
      obj.show_students_details();
      obj.display_activity("playing cricket","playing football");//parameter
    }
    public void show_students_details () {
       System.out.println("The students_details is"+name); 
       System.out.println("The students_details is"+roll); 
    }
    public void display_activity(String activity,String activity1){// argument
      System.out.println(activity);  
      System.out.println(activity1);
    }
}