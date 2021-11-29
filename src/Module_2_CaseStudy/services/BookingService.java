package services;

public interface BookingService extends Service{
    @Override
    void displayList();

    @Override
    void addNew();

    void createNewContracts();
    void displayListContracts();
    void editContracts();
}
