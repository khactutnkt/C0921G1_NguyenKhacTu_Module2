package services;

public interface EmployeeService extends Service{
    @Override
    void displayList();

    @Override
    void addNew();

    void editEmployee();
}
