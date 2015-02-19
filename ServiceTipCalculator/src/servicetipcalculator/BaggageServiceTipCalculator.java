package servicetipcalculator;


public class BaggageServiceTipCalculator implements TipCalculator {
    private static final double MIN_BILL = 0.00;
    private static final double MAX_BILL = 100.00;
    private static final String BILL_ENTRY_ERR =
            "Error: bill must be between " + MIN_BILL + " and "
            + MAX_BILL;
    private static final String BAG_COUNT_ERR=
            "Error: The number of bags must be greater than, or equal to, one!";
    private static final double GOOD_RATE = 0.20;
    private static final double FAIR_RATE = 0.15;
    private static final double POOR_RATE = 0.10;

    private double baseTipPerBag;
    private int bagCount;
    private double tip;

    private ServiceQuality serviceQuality;

    
    
    public BaggageServiceTipCalculator(ServiceQuality q, int bags) {
        this.setServiceRating(q); // perform validation
        this.setBagCount(bags);

        baseTipPerBag = 1.00; // set default value
    }

    /**
     *
     * @return
     */
    @Override
    public double getTip() {
        double tip = 0.00; // always initialize local variables

        switch(serviceQuality) {
            case GOOD:
                tip = (baseTipPerBag * bagCount * (1 + GOOD_RATE));
                break;
            case FAIR:
                tip = (baseTipPerBag * bagCount * (1 + FAIR_RATE));
                break;
            case POOR:
                tip = (baseTipPerBag * bagCount * (1 + POOR_RATE));
                break;
        }

        return tip;
    }

    public final void setServiceRating(ServiceQuality quality) {
        
        serviceQuality = quality;
    }

    public ServiceQuality getServiceQuality() {
        return serviceQuality;
    }

    public int getBagCount() {
        return bagCount;
    }

    public final void setBagCount(int bagCount) {
        if(bagCount < 0) {
            throw new IllegalArgumentException(
                    BAG_COUNT_ERR);
        }
        this.bagCount = bagCount;
    }

    public double getBaseTipPerBag() {
        return baseTipPerBag;
    }

    public void setBaseTipPerBag(double baseTipPerBag) {
        if(baseTipPerBag < 1) {
            throw new IllegalArgumentException(
                   BILL_ENTRY_ERR);
        }
        this.baseTipPerBag = baseTipPerBag;
    }

}
