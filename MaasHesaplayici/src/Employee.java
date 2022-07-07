public class Employee {

    String name;
    double salary,newSalary,bonus,taxSalary,raiseSalary;
    int workHours,hireYear,today = 2021 ;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.bonus = bonus;
        this.taxSalary = taxSalary;
        this.raiseSalary = raiseSalary;
        this.newSalary = newSalary;

    }

    public void tax(){
        double tax = 0.03;
        if(this.salary > 1000){
            this.taxSalary = this.salary * tax;
            System.out.println("Salary with tax : " + this.taxSalary);
        }
        else{
            System.out.println("Salary is tax no inclouded" + this.salary);
        }
    }

    public void bonus(){
        if(this.workHours > 40){
            int extraHours = this.workHours - 40 ;

            this.bonus = extraHours * 30;

            System.out.println("Bonus : " + this.bonus);

        }
    }

    public void raiseSalary(){

        /*
        raiseSalary() : Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır. Şuan ki yılı 2021 olarak alın.
        Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.
        Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.
        Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.
         */

        int remaining = this.today - this.hireYear;

        if(remaining <= 9){
            this.raiseSalary = this.salary * 0.05;

            System.out.println("Raised salary :" + this.raiseSalary);
        } else if (remaining > 10 && remaining <20 ) {
            this.raiseSalary = this.salary * 0.10;
            System.out.println("Raised salary :" + this.raiseSalary);
        }else {
            this.raiseSalary = this.salary * 0.15;
            System.out.println("Raised salary :" + this.raiseSalary);
        }

    }

    public void employeeInformation(){
        System.out.println("name : " + this.name);
        System.out.println("hire year : "+this.hireYear);
        System.out.println("salary :"+this.salary);
        System.out.println("work hours :"+this.workHours);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", workHours=" + workHours +
                ", hireYear=" + hireYear +
                '}';
    }

    public void totalNewSalary(){
        tax();
        bonus();
        raiseSalary();
        this.newSalary = this.taxSalary + this.bonus +this.raiseSalary;
        System.out.println("new salary with tax and bonus :" + this.newSalary);
        System.out.println("Total new salary :" + (this.newSalary + this.salary));
    }
}
