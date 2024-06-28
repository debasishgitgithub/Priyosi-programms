class School {
     String name;String school;
    public static void main(String args[]){
        School obj=new School("SJCS","tuli");
        obj.show_School_name();
    }
    School(String new_name,String new_school){
        name=new_name;
        school=new_school;
    }
    public void show_School_name(){
        System.out.println(school);
    }
    public void show_School_school(){
        System.out.println(name);
        
    }
}