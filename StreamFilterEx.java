import java.util.ArrayList;
import java.util.List;

public class StreamFilterEx {

    public static void main(String a[]) {

        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1,"Nataraja G", "Accounts", 8000));
        empList.add(new Employee(2,"Nagesh Y", "Admin", 15000));
        empList.add(new Employee(3,"Vasu V", "Security", 2500));
        empList.add(new Employee(4,"Amar", "Entertinment", 12500));

        // find employees whose salaries are above 10000
        empList.stream().filter(emp->emp.getSalary() > 10000).forEach(System.out::println);
        //or
        empList.stream().filter(emp->emp.getSalary() > 10000).forEach(e->System.out.println(e));

        //return employees id whose salaries are above 10000 and his name start from A
        empList.stream().filter(emp->emp.getName().startsWith("A") && emp.getSalary()>10000).forEach(emp->System.out.println(emp.getId()));
    }
}

class Employee {
    private int id;
    private String name;
    private String account;
    private Integer salary;

    public Employee(int id, String name, String account, Integer salary) {
        super();
        this.id = id;
        this.name = name;
        this.account = account;
        this.salary = salary;
    }

    @Override
    public String toString() {

        return "name: "+ this.name +" | account: "+ this.account +" | salary: "+this.salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}