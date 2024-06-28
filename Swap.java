class Swap {
    public static void main(String args[]){
        int p=15;
        int q=20;
        System.out.println("Before swap");
        System.out.println("p="+p);
        System.out.println("q="+q);
        int temp=p;
        p=q;
        q=temp;
        System.out.println("After swap");
        System.out.println("p="+p);
        System.out.println("q="+q);
    }
}