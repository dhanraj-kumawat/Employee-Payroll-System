abstract class Employee {
    private String name;
    private int id;

    //constructor
    public Employee(String name, int id){
        this.name = name;
        this.id = id;
    }
// getter or setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // methods
    abstract double calculateSalary();

    @Override
    public String toString() {
        return "Employee [name=" + name + ", id=" + id + ", salary=" + calculateSalary()+"]";
    }
    
    

}