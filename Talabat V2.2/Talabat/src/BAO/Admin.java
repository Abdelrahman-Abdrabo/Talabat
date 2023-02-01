package BAO;

import DAO.AllRestaurantsFactory;
import DAO.AllResturants;
import DTO.restaurant;

public class Admin implements AdminInterface{
    private final String Email ="AADEM@gmail.com";
    private final String password ="AADEM987654";
    private boolean Admin =false;

    private AllResturants factory =new AllRestaurantsFactory().GetRestaurantReference();

    @Override
    public boolean athenticate(String Email, String password) {
        if(Email.equals(this.Email)&&password.equals(this.password)){
            Admin=true;
        }
        return Admin;
    }

    @Override
    public void addResturant(restaurant r) {
        if ((Admin)) {
            factory.AddResturant(r);
        } else {
            System.out.println("You Are not the admin");
        }
    }

    @Override
    public boolean removeResturant(String HOTLINE) {
        if ((Admin)) {
            return factory.removeResturant(HOTLINE);
        } else {
            System.out.println("You Are not the admin");
            return false;
        }
    }

    @Override
    public void printALlRestaurants() {
        if(Admin){
            factory.printALl();
        }else {
            System.out.println("your are not Admin");
        }
    }
    public  void LogOut(){
        Admin=false;
    }

}
