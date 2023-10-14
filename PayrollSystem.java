import java.util.ArrayList;

class PayrollSystem {
    private ArrayList<Employee> employeeList;

    public PayrollSystem() {
        employeeList = new ArrayList<Employee>();
    }


    //methods
    // add employee to list
    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }
    
    // remove employee from list with id
    public void removeEmployee(int id){
        Employee empToremove = null;
        for (Employee employee : employeeList) {
            if(employee.getId() == id){
                empToremove = employee;
                break;
            }
        }

        if(empToremove != null)
        employeeList.remove(empToremove);
    }

    //display all employeelist

    public void displayEmployeeList(){
        for (Employee employee : employeeList) {
            System.out.println(employee+" ");
        }
    }
}
