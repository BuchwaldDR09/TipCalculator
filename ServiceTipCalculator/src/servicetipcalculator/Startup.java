package servicetipcalculator;


import java.text.NumberFormat;




public class Startup {
   
    
    
    
    
    public static void main(String[] args) {
        TipCalculator calc1 = new BaggageServiceTipCalculator(ServiceQuality.POOR, 5);        
        TipCalculator calc2 = new FoodServiceTipCalculator(ServiceQuality.FAIR, 150.55);
        double amt = calc1.getTip();
        double amt2 = calc2.getTip();
        
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        
        System.out.println("Baggage Service Tip: " + (formatter.format(amt)));
        System.out.println("Food Service Tip: " + (formatter.format(amt2)));
        
    }

}
