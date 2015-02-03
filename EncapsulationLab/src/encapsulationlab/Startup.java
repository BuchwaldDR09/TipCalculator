package encapsulationlab;


public class Startup {
    public static void main(String[] args) {
   

        Employer employer = new Employer();
        
        employer.hireEmployee("Peter","Piper","333-1234");

        System.out.println("The employee's status is: " + employer.getStatus());
    }
    
    
}
