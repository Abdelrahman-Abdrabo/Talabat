import BAO.*;
import DAO.*;
import DTO.*;
import java.io.File;
import java.time.LocalTime;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /////////////////////////////////////////////////////just Entering some data/////////////////////////////////////////////////////
        //restaurants
            AllRestaurantsFactory factory = new AllRestaurantsFactory();
            AllUsersFactory usersFactory = new AllUsersFactory();
            AdminInterface A = new Admin();
            A.athenticate("AADEM@gmail.com", "AADEM987654");
            // 1
            A.addResturant(new restaurant("AL-Menshawy", "Fayoum", "19865", "Koshary", LocalTime.of(10, 0, 0), LocalTime.of(20, 0, 0), new File("d:\\1.png")));
            List<item> Menshawy = new LinkedList<>();
            Menshawy.add(new item("Kids Box", 1, 6));
            Menshawy.add(new item("Meidam Box", 2, 8));
            Menshawy.add(new item("Super Box", 3, 10));
            Menshawy.add(new item("Special Box", 4, 12));
            Menshawy.add(new item("Wesaia Box", 5, 15));
            Menshawy.add(new item("Akeel Box", 6, 20));
            Menshawy.add(new item("El-Menshawy Box", 7, 25));
            Menshawy.add(new item("Big El-Menshawy", 8, 28));
            Menshawy.add(new item("Large Big El-Menshawy", 9, 30));
            Menshawy.add(new item("Big El-Menshawy", 10, 25));
            Menshawy.add(new item("El-Menshawy", 11, 20));
            Menshawy.add(new item("super", 12, 15));
            Menshawy.add(new item("special", 13, 10));
            Menshawy.add(new item("Kmala", 14, 7));
            Menshawy.add(new item("Koshary Kebda XL", 15, 35));
            Menshawy.add(new item("Koshary Kebda L", 16, 25));
            Menshawy.add(new item("Koshary Kebda M", 17, 20));
            Menshawy.add(new item("Koshary Kebda S", 18, 15));
            Menshawy.add(new item("sandwich Aada", 19, 3));
            Menshawy.add(new item("sandwich Big El-Menshawy", 20, 4));
            factory.GetRestaurantReference().ChoseByIndex(1).setItems(Menshawy);
            // 2
            A.addResturant(new restaurant("El-Bakry", "Bani-Seuf", "12345", "Koshary", LocalTime.of(0, 0, 0), LocalTime.of(23, 59, 59), new File("d:\\BAKRY.jpg")));
            List<item> Bakry = new LinkedList<>();
            Bakry.add(new item("Small Box", 1, 5));
            Bakry.add(new item("Meidam Box", 2, 7));
            Bakry.add(new item("Large Box", 3, 10));
            Bakry.add(new item("XLarge Box", 4, 15));
            Bakry.add(new item("Bakry Box", 5, 20));
            Bakry.add(new item("Large Bakry Box", 6, 25));
            Bakry.add(new item("onion", 7, 5));
            Bakry.add(new item("lentiles", 8, 5));
            Bakry.add(new item("salsa", 9, 4));
            Bakry.add(new item("homous", 10, 5));
            Bakry.add(new item("vinger", 11, 3));
            Bakry.add(new item("chilies", 12, 3));
            Bakry.add(new item("Toast", 13, 5));
            Bakry.add(new item("sausage", 14, 20));
            Bakry.add(new item("chicken", 15, 16));
            Bakry.add(new item("camel meat", 16, 12));
            Bakry.add(new item("Kebda", 17, 12));
            Bakry.add(new item("mix", 18, 10));
            Bakry.add(new item("chease", 19, 25));

            factory.GetRestaurantReference().ChoseByIndex(2).setItems(Bakry);
            // 3
            A.addResturant(new restaurant("Sultan El-Sham", "Fayoum", "010200", "Surain Food", LocalTime.of(0, 0, 0), LocalTime.of(23, 59, 59), new File("d:\\Sultan.jpg")));
            List<item> Sultan = new LinkedList<>();
            Sultan.add(new item("Pizza Sultan L", 1, 110));
            Sultan.add(new item("Pizza Four Seasons L", 2, 75));
            Sultan.add(new item("mix cheese L", 3, 80));
            Sultan.add(new item("margarita", 4, 70));
            Sultan.add(new item("salami", 5, 80));
            Sultan.add(new item("sausage L", 6, 80));
            Sultan.add(new item("milano", 7, 80));
            Sultan.add(new item("western chicken", 8, 80));
            Sultan.add(new item("Pizza Sultan L", 9, 80));
            Sultan.add(new item("Pizza Four Seasons L", 10, 80));
            Sultan.add(new item("Milano L", 11, 75));
            Sultan.add(new item("Fried Chicken", 12, 80));
            Sultan.add(new item("Pizza Sultan L", 13, 80));
            Sultan.add(new item("Pizza Four Seasons L", 14, 80));
            Sultan.add(new item("Milano L", 15, 80));
            Sultan.add(new item("Fried Chicken", 16, 60));
            Sultan.add(new item("Pizza Sultan L", 17, 80));
            Sultan.add(new item("Pizza Four Seasons L", 18, 80));
            Sultan.add(new item("Milano L", 19, 80));
            Sultan.add(new item("Fried Chicken", 20, 40));
            Sultan.add(new item("Pizza Sultan L", 21, 42));
            Sultan.add(new item("Pizza Four Seasons L", 22, 42));
            Sultan.add(new item("Milano L", 23, 42));
            Sultan.add(new item("Fried Chicken", 24, 39));

            factory.GetRestaurantReference().ChoseByIndex(3).setItems(Sultan);
            // 4
            A.addResturant(new restaurant("Combo", "Fayoum", "17167", "Fried Chicken", LocalTime.of(9, 0, 0), LocalTime.of(22, 0, 0), new File("d:\\combo.jpg")));
            List<item> Combo = new LinkedList<>();
            Combo.add(new item("Crunchy S", 1, 55));
            Combo.add(new item("Crunchy L", 2, 65));
            Combo.add(new item("Smiles S", 3, 65));
            Combo.add(new item("Smiles  L", 4, 75));
            Combo.add(new item("Royal Blue", 5, 75));
            Combo.add(new item("Grand Chicken", 6, 80));
            Combo.add(new item("Mega", 7, 60));
            Combo.add(new item("Super star", 8, 55));
            factory.GetRestaurantReference().ChoseByIndex(4).setItems(Combo);
            // 5
            A.addResturant(new restaurant("Wrap", "Fayoum", "112233", "Fried Chicken", LocalTime.of(9, 0, 0), LocalTime.of(20, 0, 0), new File("d:\\Wrap.jpg")));
            List<item> Wrap = new LinkedList<>();
            Wrap.add(new item("Godzilla Wrap", 1, 49.99));
            Wrap.add(new item("Dinos Wrap", 2, 54.99));
            Wrap.add(new item("Zinger Zest", 3, 59.99));
            Wrap.add(new item("Frank Zinger", 4, 59.99));
            factory.GetRestaurantReference().ChoseByIndex(5).setItems(Wrap);
            // 6
            A.addResturant(new restaurant("EL basha", "Fayoum", "2526", "Krip", LocalTime.of(19, 0, 0), LocalTime.of(23, 0, 0), new File("d:\\Bash.jpeg")));
            List<item> bash = new LinkedList<>();
            bash.add(new item("Krip Fresh", 1, 37));
            bash.add(new item("Krip MIX", 2, 47));
            bash.add(new item("Krip mozzarella", 3, 33));
            bash.add(new item("Krip romy", 4, 33));
            factory.GetRestaurantReference().ChoseByIndex(6).setItems(bash);
            A.LogOut();
            //Some users
            //note that we can register new users while the app is running
            UserInterface u1 = new User();
            u1.Register("abdo", "abdo@gmail.com", "A123B", "Fayoum", "01015163001");
            UserInterface u2 = new User();
            u2.Register("Mohammed", "MO@gmail.com", "M123o", "Fayoum", "01017163001");
            UserInterface u3 = new User();
            u3.Register("Abdrabo", "Abdrabo@gmail.com", "Abdrabo1234", "Fayoum", "01027293001");
            // That's all info we need till now
        ///////////////////////////////////////////////////////////////////Let's get start//////////////////////////////////////////////////////////////////

        Scanner scanner =new Scanner(System.in);
        int input;
            System.out.println("####################################################################################################################");
            System.out.println("##########################################>>>>> T A L A B A T <<<<<#################################################");
            System.out.println("####################################################################################################################");
        do{
            System.out.println("--------------------------------------------------------------------------------------------------------------------");
            System.out.println("Hi");
            System.out.println("Who are You ?");
            System.out.println("1- Admin");
            System.out.println("2- User");
            System.out.println("0- Exit");
            input =scanner.nextInt();
            switch (input){
                //case 1 ADMIN
                case 1 ->{
                    System.out.println("--------------------------------------------------------------------------------------------------------------");
                    System.out.println("Enter Email");
                    String Email=scanner.next();
                    System.out.println("Enter Password");
                    String Pass =scanner.next();
                    if(A.athenticate(Email,Pass)){
                        System.out.println("Hi AADEM");
                        int in ;
                        do{
                        System.out.println("--------------------------------------------------------------------------------------------------------------");
                        System.out.println("What do you want to do ?");
                        System.out.println("1-Add OR Edit Restaurant");
                        System.out.println("2-Remove Restaurant");
                        System.out.println("3-Show all restaurants ");
                        System.out.println("0-Exit");
                         in =scanner.nextInt();
                        switch (in){
                            case 1-> {
                                System.out.println("Enter Name");
                                String Name=scanner.next();
                                System.out.println("Enter Location");
                                String Location=scanner.next();
                                System.out.println("Enter HOTLINE");
                                String HOTLINE=scanner.next();
                                System.out.println("Enter TYPE");
                                String TYPE=scanner.next();
                                System.out.println("Enter Path to menu image EX(d:\\image.png)");
                                String PathToMenu=scanner.next();
                                System.out.println("Enter Opening Time  (Hour in 24 format)");
                                int ON = scanner.nextInt();
                                System.out.println("Enter Closing Time  (Hour in 24 format)");
                                int OFF = scanner.nextInt();
                                A.addResturant(new restaurant(Name, Location, HOTLINE, TYPE, LocalTime.of(ON, 0, 0), LocalTime.of(OFF, 0, 0), new File(PathToMenu)));
                            }
                            case 2->{
                                System.out.println("Enter HOTLINE of the restaurant to remove");
                                String HOTLINE=scanner.next();
                                A.removeResturant(HOTLINE);
                                System.out.println("Removed Successfully");
                            }
                            case 3 -> A.printALlRestaurants();
                            default -> {}
                        }
                        }while(in!=0);

                    }else{
                        System.out.println("ERROR --> EMAIL or PASSWORD IN INCORRECT");
                    }
                }
                //case 2 User
                case 2 -> {
                    int Choice;
                    do{
                        UserInterface u =new User();
                        System.out.println("--------------------------------------------------------------------------------------------------------------------");
                        System.out.println("What do you want To do?");
                        System.out.println("1-Show All restaurants");
                        System.out.println("2-Register");
                        System.out.println("3-Log in");
                        System.out.println("0-Exit");
                        Choice =scanner.nextInt();
                        switch (Choice){
                            case 1-> u.printALlRestaurants();
                            case 2 ->{
                                System.out.println("To cancel enter   -1  ");
                                System.out.println("Enter Name");
                                String NAME =scanner.next();
                                if(NAME.equals("-1")) break;
                                System.out.println("Enter Email");
                                String Email=scanner.next();
                                if(Email.equals("-1")) break;
                                System.out.println("Enter Password");
                                String Pass =scanner.next();
                                if(Pass.equals("-1")) break;
                                System.out.println("Enter Location");
                                String LOCATION =scanner.next();
                                if(LOCATION.equals("-1")) break;
                                System.out.println("Enter Phone Number");
                                String PhoneNumber =scanner.next();
                                if(PhoneNumber.equals("-1")) break;
                                u.Register(NAME,Email,Pass,LOCATION,PhoneNumber);
                            }
                            case 3->{
                                System.out.println("To cancel enter   -1  ");
                                System.out.println("Enter Email");
                                String Email=scanner.next();
                                if(Email.equals("-1")) break;
                                System.out.println("Enter Password");
                                String Pass =scanner.next();
                                if(Pass.equals("-1")) break;
                                UserInterface CurrentUser;
                                CurrentUser = usersFactory.GetUsersReference().GetByEmail(Email);
                                if (CurrentUser != null ) {
                                    if(CurrentUser.LogIn(Email, Pass)){
                                        do {
                                            System.out.println("--------------------------------------------------------------------------------------------------------------------");
                                            System.out.println("What do you want to do?");
                                            System.out.println("1-Show all restaurants");
                                            System.out.println("2-chose restaurant");
                                            System.out.println("3-Show all my Orders");
                                            System.out.println("4-Log out");
                                            input = scanner.nextInt();
                                            switch (input) {
                                                case 1 -> CurrentUser.printALlRestaurants();
                                                case 2 -> {
                                                    CurrentUser.printALlRestaurants();
                                                    System.out.println();
                                                    System.out.println("Enter the Index of the Restaurant");
                                                    int chosen = scanner.nextInt();
                                                    try {
                                                        CurrentUser.choseRestaurant(chosen);
                                                    } catch (Exception e) {
                                                        System.out.println("sorry ... we cant show the menu");
                                                    }
                                                    System.out.println("Do You want to make Order? Y/N");
                                                    char c= scanner.next().charAt(0);
                                                    switch (c) {
                                                        case 'Y', 'y' -> {
                                                            restaurant r = factory.GetRestaurantReference().ChoseByIndex(chosen);
                                                            List<reqItem> items = new LinkedList<>();
                                                            int i;
                                                            do {
                                                                System.out.println("Enter the Index of the item you want");
                                                                int item1 = scanner.nextInt();
                                                                System.out.println("Enter the quantity ");
                                                                int q = scanner.nextInt();
                                                                item II = r.getByCode(item1);
                                                                items.add(new reqItem(II, q));
                                                                System.out.println("Do you want to add something more?");
                                                                System.out.println("1-yes");
                                                                System.out.println("0-no");
                                                                i = scanner.nextInt();
                                                            } while (i != 0);
                                                            CurrentUser.makeOrder(new order(items), chosen);
                                                        }
                                                        case 'N','n' ->{}
                                                    }
                                                }
                                                case 3 -> CurrentUser.ListALlOrders();
                                                case 4 -> CurrentUser.LogOut();
                                                default -> {
                                                }
                                            }
                                        } while (input != 4);
                                    }

                                } else {
                                    System.out.println("Wrong Email or Password");
                                }
                            }
                            default -> {}
                        }
                    }while(Choice!=0);
                    }
                default -> {}
                }
        }while(input !=0);
        System.out.println("Thanks for Using Talabat");
    }
}