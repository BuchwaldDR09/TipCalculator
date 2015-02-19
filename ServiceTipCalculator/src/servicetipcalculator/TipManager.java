package servicetipcalculator;

/**
 *
 * @author Dan
 */
public class TipManager {
    
    
    private TipCalculator tipCalculator;
    
    public TipManager(TipCalculator tipCalculator) {
        this.tipCalculator = tipCalculator;
    }
 
    public TipCalculator getTip() {
      
        return this.tipCalculator;
    }
    
    public void setTipCalculator (TipCalculator tipCalculator){
       
        this.tipCalculator = tipCalculator;
    }
    
    
    
}

