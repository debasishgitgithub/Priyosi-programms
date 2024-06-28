class Teacher {
    String name; int number;
    public static void main(String args[]){
        Teacher obj=new Teacher("Priyam",70017);
        obj.show_Teacher_name();
        obj.show_Teacher_number();
        Teacher obj1=new Teacher("Priyosi",70027);
        obj1.show_Teacher_name();
        obj1.show_Teacher_number();
        Teacher obj2=new Teacher("Priya",70037);
        obj2.show_Teacher_name();
        obj2.show_Teacher_number();
    }
    Teacher(String new_name,int new_number){
       name=new_name;
       number=new_number;
       
    }
    public void show_Teacher_name(){
        System.out.println(name);
    }
    public void show_Teacher_number(){
        System.out.println(number);
    }
}