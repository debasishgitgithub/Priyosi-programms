class Student {
    String name;int roll;
    Student(){// dynamic allocation,constructor
      name="Priyosi";roll=9; 
    }   
    public static void main(String args[]){
      Student obj=new Student();
      obj.show_student_details();
      
    }
    public void show_student_details () {
       System.out.println("The student_details is"+name); 
       System.out.println("The student_details is"+roll); 
    }
}