public class Main{
    public static void main(String[] args) {
        PayrollSystem ogmentifyPayroll = new PayrollSystem();
        FullTimeEmployee emp1 = new FullTimeEmployee("Dhanraj", 101, 67500.33);
        FullTimeEmployee emp2 = new FullTimeEmployee("Hitesh", 102, 67500.33);

        PartTimeEmployee emp3 = new PartTimeEmployee("Kunal", 108, 300, 4);
        PartTimeEmployee emp4 = new PartTimeEmployee("Jitendra", 109, 300, 2);

        ogmentifyPayroll.addEmployee(emp1);
        ogmentifyPayroll.addEmployee(emp2);
        ogmentifyPayroll.addEmployee(emp3);
        ogmentifyPayroll.addEmployee(emp4);

        ogmentifyPayroll.displayEmployeeList();
        ogmentifyPayroll.removeEmployee(108);
        System.out.println("after removing employee: ");
        ogmentifyPayroll.displayEmployeeList();
    }
}