package DAO;

import DTO.*;

import java.util.LinkedList;
import java.util.List;

public class AllResturants implements AllResInterface{
    private List<restaurant> allRes=new LinkedList<>();


    private static final AllResturants all =new AllResturants();
    private AllResturants(){}
    public static AllResturants GETALLRESTURANTS(){
        return all ;
    }
    //Print all
    public void printALl(){
        for(restaurant r : allRes){
            System.out.println(r);
        }
    }
    public void AddResturant(restaurant r){
        for(restaurant u : allRes){
            if(r.getName().equals(u.getName())){
                allRes.set(allRes.indexOf(u),r);
                return;
            }
        }
        allRes.add(r);
        RearrangeIndex();
    }
    public boolean removeResturant(String HOTLINE){
        allRes.remove(SearchByHOTLINE(HOTLINE));
        RearrangeIndex();
        return true;
    }
    public restaurant ChoseByIndex(int index){
        for (restaurant r : allRes) {
            if (index== r.getIndex()) {
                return r;
            }
        }
        return null ;
    }

    public restaurant SearchByHOTLINE(String HOTLINE) {
        for (restaurant r : allRes) {
            if (HOTLINE.equals(r.getHOTLINE())) {
                return r;
            }
        }
        return null ;
    }
    public List<restaurant> getAllRes() {
        return allRes;
    }

    public void setAllRes(List<restaurant> allRes) {
        this.allRes = allRes;
    }
    private void RearrangeIndex(){
        int index =1 ;
        for(restaurant r : allRes){
            r.setIndex(index);
            index++;
        }
    }
}
