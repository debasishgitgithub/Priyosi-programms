class Kakashi{
    public static void main(String args[]){
        for (int i=1;i<=20;i++){
            if(i<=14)continue;
            if(i==17)continue;
            if(i==19)break;
            System.out.println(i);
        }
    }
}