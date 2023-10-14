class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    // constructor
    public PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked){
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // method
    @Override
    public double calculateSalary(){
        return hourlyRate*hoursWorked;
    }

    
}
