package jitlaptop;

public class JitLaptop {
    private String model;
    private int code;
    private String brand;
    private double price;
    
    public JitLaptop (String a, int b, String c, double d){
        this.model = a;
        this.code = b;
        this.brand = c;
        this.price = d;
    }
    public void setModel(String a){
        this.model = a;
    }
    public void setCode(int a){
        this.code = a;
    }
    public void setBrand(String a){
        this.brand = a;
    }
    public void setPrice(double a){
        this.price = a;
    }
    public String getModel(){
        return this.model;
    }
    public int getCode(){
        return this.code;
    }
    public String getBrand(){
        return this.brand;
    }
    public double getPrice(){
        return this.price;
    }
    
}
