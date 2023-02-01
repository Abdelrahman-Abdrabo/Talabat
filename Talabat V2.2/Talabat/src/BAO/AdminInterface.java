package BAO;

import DTO.restaurant;

public interface AdminInterface {
    public  void LogOut();
    public boolean athenticate(String Email , String password);
    public void addResturant(restaurant r);
    public boolean removeResturant(String HOTLINE);
    public void printALlRestaurants();
}
