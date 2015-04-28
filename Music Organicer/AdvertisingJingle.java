
/**
 * Write a description of class AdvertisingJingle here.
 * 
 * @NumTek Solutions 
 * @17.04.15
 */
public class AdvertisingJingle extends AudioTrack
{
    // instance variables - replace the example below with your own
    private String product;
    private String company;
    
    

    /**
     * Constructor for objects of class AdvertisingJingle
     */
    public AdvertisingJingle(String title, long minutes, long seconds,  Medium medium, String product, String company)
    {   
        super(title, minutes, seconds, medium);  
        this.company = company;
        this.product = product;
    }
    /**
     * get the product been adverticed
     * @return product
     */
    public String getProduct() {
        return product;
    }
    
    /**
     * set the product been adverticed
     * 
     * @param product
     */
    public void setProduct(String product) {
        this.product = product;
    }
    
    /**
     * get the company paying for the advertise
     * @return company
     */
    public String getCompany() {
        return company;
    }
    
    /**
     * set the company paying for the advertice
     * @param company 
     */
    public void setCompany(String company) {
        this.company = company;
    }
    
}
