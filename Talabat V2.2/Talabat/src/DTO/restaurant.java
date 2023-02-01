package DTO;
import java.io.File;
import java.time.LocalTime;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class restaurant {
    private int index ;
    private String name ,location,HOTLINE ,type;
    private List<item> items =new LinkedList<>();
    private File menu;
    private Queue<order> orders = new ArrayDeque<>();
    private LocalTime timeON , timeOFF, time;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }


    private static int in =1 ;
    //edited to take the menu too
    public restaurant(String name, String location, String HOTLINE, String type, LocalTime timeON, LocalTime timeOFF , File menu) {
        try{
            this.index= restaurant.in;
            restaurant.in++;
            setName(name);
            setLocation(location);
            setHOTLINE(HOTLINE);
            setType(type);
            this.timeON = timeON;
            this.timeOFF = timeOFF;
            this.menu=menu;
        }catch (Exception e){
            System.out.println("Invalid data");
        }
    }

    public String OnOrOff(){
          time =LocalTime.now();
          int i1= time.compareTo(timeON);
          int i2 = timeOFF.compareTo(time);
          if(i1>0 && i2>0){
              return "OPEN";
          }else{
              return "CLOSE";
          }
    }

    public File getMenu() {
        return menu;
    }

    public void setMenu(File Image ) {
        this.menu = Image ;
    }

    public void setTimeON(LocalTime timeON) {
        this.timeON = timeON;
    }

    public void setTimeOFF(LocalTime timeOFF) {
        this.timeOFF = timeOFF;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.trim().equals(""))
            throw new IllegalStateException("Empty name");
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        if(location.trim().equals(""))
            throw new IllegalStateException("Empty Location");
        this.location = location;
    }

    public String getHOTLINE() {return HOTLINE;}

    public void setHOTLINE(String HOTLINE) {
        this.HOTLINE = HOTLINE;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type=type;
    }

    public Queue<order> getOrders() {
        return orders;
    }

    public void setOrders(Queue<order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return  "-"+  getIndex() +
                "   name=  " + name + '\'' +
                "   location=  " + location + '\'' +
                ",  Phone Number=  " + HOTLINE + '\'' +
                ",  Type =   " + type + '\'' +
                ",  timeON=  " + timeON +
                ",  timeOFF= " + timeOFF +
                "   ON/OFF   " + OnOrOff() ;
    }

    public List<item> getItems() {
        return items;
    }
    public void setItems(List<item> items) {
        this.items = items;
    }
    public boolean FoundInMenu(item I){
        for(item r : items){
            if(I!=null&&I.getCode()==r.getCode()){
                return true;
            }
        }
        return false;
    }
    public item getByCode(int Code){
        for(item r : items){
            if(Code==r.getCode()){
                return r;
            }
        }
        return null;
    }
    }

