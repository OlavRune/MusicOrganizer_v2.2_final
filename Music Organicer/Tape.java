
/**
 * Write a description of class Tape here.
 * 
 * @Olav
 * @15.04.15
 */
public class Tape extends Medium
{
    String type;
    int archiveNumber;
    

    /**
     * Constructor for objects of class Tape
     */
    public Tape(String title, String type, int archiveNumber)
    {
        super(title);
        this.type = type;
        this.archiveNumber = archiveNumber;
        
    }
     
    /**
     * get the type of tape
     * @return type
     */
    public String getType() {
        
        return type;
    }

    /**
     * set type of tape
     * @param type (analog/digital)
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * get the objects number in the archive
     * @return archiveNumber
     */
    public int getArchiveNumber() {
        return archiveNumber;
    }

    /**
     * set a new archive number
     * @param archiveNumber 
     */
    public void setArchiveNumber(int archiveNumber) {
        this.archiveNumber = archiveNumber;
    }
    
    
    
    
    
  
    

    
    
}
