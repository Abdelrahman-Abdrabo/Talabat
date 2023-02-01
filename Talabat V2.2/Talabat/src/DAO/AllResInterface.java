package DAO;

import DTO.*;
import java.util.List;

public interface AllResInterface {
    public void printALl();
    public List<restaurant> getAllRes();
    public restaurant ChoseByIndex(int index);
    public void AddResturant(restaurant r);
    public boolean removeResturant(String HOTLINE);

}
