public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee("erbil",1500,45,2005);
        System.out.println(employee.toString());
        employee.totalNewSalary();
    }
}
