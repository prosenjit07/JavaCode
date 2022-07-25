package encapsulation;
public class Encapsulation {

    private String name;
    private int id;
    private double cgpa;
    
    public Encapsulation(String newName, int newId, double newCgpa)
    {
        this.name = newName;
        this.id = newId;
        this.cgpa = newCgpa;
    }
    //Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

 // Getter methods    
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
    
    public double getCgpa() {
        return cgpa;
    }
}