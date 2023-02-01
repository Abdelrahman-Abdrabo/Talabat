package DTO;

import BAO.*;
import DAO.*;
import DTO.*;
public class reqItem {
    private item i ;
    private int qun ;

    public reqItem(item i, int qun) {
        this.i = i;
        this.qun = qun;
    }

    public item getI() {
        return i;
    }

    public void setI(item i) {
        this.i = i;
    }

    public int getQun() {
        return qun;
    }

    public void setQun(int qun) {
        this.qun = qun;
    }

    @Override
    public String toString() {
        return "i=" + i.toString() +
                ", qun= " + qun
                ;
    }
}
