package DTO;

public class item {
    private String name ;
    private int code ;
    private double price ;

    public item(String name, int code, double price) {
        setName(name);
        this.code = code;
        setPrice(price);
    }

    public String getName() {return name;}

    public void setName(String name) {
        if(name.trim().equals(""))
            throw new IllegalStateException("Empty name");
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getPrice() {return price;}

    public void setPrice(double price) {
        if (price<0)
            throw new IllegalStateException("invalid num");
        this.price = price;
    }

    @Override
    public String toString() {
        return "item{" +
                "name='" + name + '\'' +
                ", code=" + code +
                ", price=" + price +
                '}';
    }
}
