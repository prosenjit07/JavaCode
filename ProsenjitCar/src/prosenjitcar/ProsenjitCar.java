package prosenjitcar;

public class ProsenjitCar {

    private String model;
    private int code;
    private String brand;
    private double price;

    public ProsenjitCar(String a, int b, String c, double d) {
        this.model = a;
        this.code = b;
        this.brand = c;
        this.price = d;
    }

    public void setModel(String a) {
        this.model = a;
    }

    public void setCode(int b) {
        this.code = b;
    }

    public void setBrand(String c) {
        this.brand = c;
    }

    public void setPrice(double d) {
        this.price = d;
    }

    public String getModel() {
        return this.model;
    }

    public int getCode() {
        return this.code;
    }

    public String getBrand() {
        return this.brand;
    }

    public double getPrice() {
        return this.price;
    }
}
 