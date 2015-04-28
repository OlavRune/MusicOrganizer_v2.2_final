
/**
 * Write a description of class SoundEffects here.
 * 
 * @Olav, såklart 
 * @17.04.15
 */
public class SoundEffects extends AudioTrack
{
    // instance variables - replace the example below with your own
    private String description;
    

    /**
     * Constructor for objects of class SoundEffects
     */
    public SoundEffects(String title, long minutes, long seconds, String description,  Medium medium )
    {   
        super(title, minutes, seconds, medium);
        this.description = description;
        
        
    }
    /**
     * return the description of the sound effect
     * @return descrition
     */
    public String getDescription() {
        return description;
    }
    /**
     * change the description of the sound effect
     * @param description 
     */
    public void setDescription(String description) {
        this.description = description;
    }

    
}
