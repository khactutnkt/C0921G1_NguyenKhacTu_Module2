package services;

public interface CustomerService extends Service{
    @Override
    void displayList();

    @Override
    void addNew();

    void editCustomer();
}
