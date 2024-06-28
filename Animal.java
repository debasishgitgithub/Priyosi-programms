 class Animal {
     String name;
     Animal(String new_name){
         name=new_name;
     }
     public static void main(String args[]){
        Animal obj=new Animal("Tigress"); 
        obj.show_animal_name();
     }
     public void show_animal_name(){
         System.out.println(name);
     }
 }
 
 