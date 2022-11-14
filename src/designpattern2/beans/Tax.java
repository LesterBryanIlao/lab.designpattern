package designpattern2.beans;


public class Tax {
    private static Tax INSTANCE;
    private float taxPercentage;
    public static Tax instance() {
        if (INSTANCE == null) {
            INSTANCE = new Tax();
        }
        return INSTANCE;
    }
    
    public static Tax instance(float taxPercentage) {
        if (INSTANCE == null) {
            INSTANCE = new Tax(taxPercentage);
        }
        return INSTANCE;
    }
    
    
    
    private Tax() {
            
     }
    
     private Tax(float taxPercentage) {
           this.taxPercentage = taxPercentage / 100; 
    }
    
    
    public float getTax() {
        return this.taxPercentage;
    }
    
    public void setTax(float taxPercentage) {
        this.taxPercentage = taxPercentage / 100;
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("object cloning not supported");
    }
    
    


}
