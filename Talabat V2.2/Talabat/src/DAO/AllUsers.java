package DAO;
import BAO.*;
import DTO.*;

import java.util.LinkedList;
import java.util.List;

public class AllUsers implements AllUsersInterface {
    private List<User> AllUsers =new LinkedList<>();
    private static final AllUsers all =new AllUsers();
    private AllUsers(){}
    public static AllUsers GETALLUSERS(){
        return all ;
    }
    @Override
    public void printALl() {
        for(User u : AllUsers){
            System.out.println(u);
        }
    }
    @Override
    public List<User> getAllUsers() {
        return AllUsers;
    }
    @Override
    public User GetByEmail(String Email) {
        for (User U : AllUsers) {
            if (Email.equals(U.getEmail())) {
                return U;
            }
    }return null;
    }
    @Override
    public void AddUser(User r) {
        for(User u : AllUsers){
            if(r.getEmail().equals(u.getEmail())){
                AllUsers.set(AllUsers.indexOf(u),r);
                return;
            }
        }
        AllUsers.add(r);
    }
    public boolean IsHere(User u){
        for(User user : AllUsers){
            if(user.getEmail().equals(u.getEmail())){
                return true;
            }
        }
        return false;
    }

}
