package DTO;
import java.util.List;

public class order {
    private List<reqItem> reustedItems;               //typo
    private boolean paied ;                           //typo

    public order(List<reqItem> reustedItems) {
        this.reustedItems = reustedItems;
    }

    public List<reqItem> getReustedItems() {
        return reustedItems;
    }

    public void setReustedItems(List<reqItem> reustedItems) {
        this.reustedItems = reustedItems;
    }

    public boolean isPaied() {
        return paied;
    }

    public void setPaied(boolean paied) {
        this.paied = paied;
    }

    @Override
    public String toString() {
        return "order{" +
                "reustedItems= " + reustedItems.toString()+
                ", paied= " + paied +
                '}';
    }
}

