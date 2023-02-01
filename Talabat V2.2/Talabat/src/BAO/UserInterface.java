package BAO;

import DTO.*;
import java.io.IOException;

public interface UserInterface {
    public void choseRestaurant(int index) throws IOException;
    public void printALlRestaurants();
    public void makeOrder(order o, int index);
    public void ListALlOrders();
    public void Register(String name, String email, String password, String location, String phoneNumber);
    public boolean LogIn(String Email , String password);
    public void LogOut();

}
