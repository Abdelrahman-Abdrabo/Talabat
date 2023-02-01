package BAO;
import DAO.*;
import DTO.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class User implements UserInterface{
    private AllRestaurantsFactory factory =new AllRestaurantsFactory();
    private AllUsersFactory usersFactory =new AllUsersFactory();
    private boolean LOGGEDIN =false;
    private String name , email , password , location ,phoneNumber ;
    private List<order> AllMyOrders =new LinkedList<>();
    public void printALlRestaurants(){
        factory.GetRestaurantReference().printALl();
    }

    public void choseRestaurant(int index) throws IOException {
        if(LOGGEDIN){
            System.out.println(factory.GetRestaurantReference().ChoseByIndex(index));
            File f =factory.GetRestaurantReference().ChoseByIndex(index).getMenu();
            Desktop d = Desktop.getDesktop();
            d.open(f);
        }else {
            System.out.println("You are not Logged in");
        }
    }
    Scanner scanner= new Scanner(System.in);
    private void pay(order o){
        System.out.println("1-Pay with visa");
        System.out.println("2-Pay with vodafone");
        System.out.println("3-Pay cash");
        int S = scanner.nextInt();
        switch (S){
            case 1:
                System.out.println("Enter credit card Number");
                String CCN =scanner.next();
                if(CCN.length()!=16){
                    System.out.println("Invalid Number");
                    o.setPaied(false);
                }else {
                    o.setPaied(true);
                }
                break;
            case 2:
                System.out.println("Enter your Vodafone Number");
                String Num =scanner.next();
                if(Num.length()!=11 && Num.startsWith(String.valueOf(010))){
                    System.out.println("Invalid Number");
                    o.setPaied(false);
                }else {
                    o.setPaied(true);
                }
                break;
            case 3:
                System.out.println("OK");
                o.setPaied(false);
                break;
            default:
                System.out.println("Invalid choose");
                o.setPaied(false);
                break;
        }

    }
    public void makeOrder(order o,int index){
        if(LOGGEDIN){
            float totalPrice =0 ;
            for( reqItem ri : o.getReustedItems()){
                if(factory.GetRestaurantReference().ChoseByIndex(index).FoundInMenu(ri.getI())){
                totalPrice+=(ri.getQun()*ri.getI().getPrice());
            }else{
                    System.out.println("item or more not found in the menu");
                    return;
                }}
            System.out.println("total price is --> " + totalPrice);
            pay(o);
            AllMyOrders.add(o);
            factory.GetRestaurantReference().ChoseByIndex(index).getOrders().add(o);
        }else{
            System.out.println("You are not Logged in ");
        }

    }
     // list all orders
    public void ListALlOrders(){
        if(LOGGEDIN){
            if(!AllMyOrders.isEmpty()){for(order o : AllMyOrders){
                System.out.println(o);
            }}else{
                System.out.println("Empty!!");
            }
        }else{
            System.out.println("You are not Logged in");
        }
    }

    @Override
    public void Register(String name, String email, String password, String location, String phoneNumber) {
        AllUsers all =usersFactory.GetUsersReference();
        for(User u : all.getAllUsers()){
            if(email.equals(u.getEmail())){
                System.out.println("Tha same email is already registered before");
                return;
            }}
        try{
            setName(name);
            setEmail(email);
            setPassword(password);
            setLocation(location);
            setPhoneNumber(phoneNumber);
            all.getAllUsers().add(this);
        }catch (Exception e){
            System.out.println("Data not valid");
        }
    }

    @Override
    public boolean LogIn(String Email, String password) {
        if(LOGGEDIN){
            System.out.println("You already logged in ");
            return LOGGEDIN;
        }
        for(User u : usersFactory.GetUsersReference().getAllUsers()){
            if(Email.equals(u.getEmail()) && password.equals(u.getPassword())){
                LOGGEDIN =true;
                System.out.println("welcome " + u.getName());
                return LOGGEDIN;
            }
        }
        System.out.println("Wrong Email or Password !");
        return LOGGEDIN;
    }

    @Override
    public void LogOut() {
        LOGGEDIN=false;
        System.out.println(this.getName() + " BYE ):");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if(name.trim().equals(""))
            throw new IllegalStateException("Empty name");
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.matches("^(.+)@(.+)$"))
            this.email = email;
        else throw new IllegalStateException("invalid email");
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password.trim().equals(""))
            throw new IllegalStateException("Empty Password");
        this.password = password;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        if(location.trim().equals(""))
            throw new IllegalStateException("Empty location");
        this.location = location;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        try {
            if (!(phoneNumber.length()==11) ||
                    !(phoneNumber.startsWith("010")||phoneNumber.startsWith("011")||
                            phoneNumber.startsWith("012")))
                throw new IllegalStateException("invalid number");
            int x= Integer.valueOf(phoneNumber);
            this.phoneNumber = phoneNumber;
        }catch (Exception e){throw new IllegalStateException("invalid number");}
    }

    public List<order> getAllMyOrders() {
        return AllMyOrders;
    }

    public void setAllMyOrders(List<order> allMyOrders) {
        AllMyOrders = allMyOrders;
    }

}
