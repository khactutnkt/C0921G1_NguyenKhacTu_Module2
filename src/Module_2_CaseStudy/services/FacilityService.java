package services;

public interface FacilityService extends Service{
    @Override
    void displayList();

    @Override
    void addNew();

    void displayListMaintenance();
    void editFacility();
    void deleteFacility();
}
