import java.util.Scanner;

class Wake {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name;
        int age_no;
        double net_income;
        System.out.println("Enter name");
        name = sc.nextLine();
        System.out.println("Enter age no");
        age_no = sc.nextInt();
        System.out.println("Enter net income");
        net_income = sc.nextDouble();

        double personal_cost, family_cost, other_cost;
        personal_cost = net_income * (60 / 100.0);
        family_cost = net_income * (20 / 100.0);
        other_cost = net_income * (20 / 100.0);
        System.out.println(" name is=" + name);
        System.out.println(" age is=" + age_no);
        System.out.println(" net nincome=" + net_income);
        System.out.println("personal cost is=" + personal_cost);
        System.out.println("family cost is=" + family_cost);
        System.out.println(" other cost is=" + other_cost);
    }
}