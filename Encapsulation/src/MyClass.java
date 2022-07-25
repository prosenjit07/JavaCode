public class MyClass {
    
    public static void main(String[] args) {
        
        Encapsulation p1 = new Encapsulation("Prosenjit" , 68);
              
        System.out.println("Name: "+p1.getName());
        System.out.println("Age: "+p1.getId());
        
        
        p1.setName("Biswas");
        p1.setId(203);
        
        System.out.println("\nAfter updating information:");
        System.out.println("Name: "+p1.getName());
        System.out.println("Age: "+p1.getId());
     
        
    }
    
}