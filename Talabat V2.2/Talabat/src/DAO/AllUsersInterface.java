package DAO;

import BAO.User;
import DTO.restaurant;

import java.util.List;

public interface AllUsersInterface {
    public void printALl();
    public List<User> getAllUsers();
    public User GetByEmail(String Email);
    public void AddUser(User r);
}
