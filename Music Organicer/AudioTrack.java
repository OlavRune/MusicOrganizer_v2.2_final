import java.time.Duration;
/**
 * Common audiotrack logic
 * 
 * @HialsEliten
 * @10.04.15
 */
public class AudioTrack
{
    // instance variables
    private String title;
    private DurationHandeling duration;
    private Medium medium;

    /**
     * Constructor for objects of class AudioTrack
     */
    public AudioTrack(String title, long minutes, long seconds, Medium medium)
    {
        this.title = title;
        this.medium = medium;
        duration = new DurationHandeling();
        duration.setDuration(minutes, seconds);
        //this.duration;
    }

    /**
     * Returns the title of the track
     * 
     * @return     title 
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * Returns the duration of the track in seconds
     * 
     * @return     duration 
     */
    public long getDurationSeconds()
    {
        return duration.getTotalSeconds();
    }
    
    /**
     * Returns the medium referance of the track
     * 
     * @return     medium   referance to medium
     */
    public Medium getMedium()
    {
        return medium;
    }
    
    /**
     * Set new title
     * 
     * @param   newTitle
     */
    public void setTitle(String newTitle)
    {
        this.title = newTitle;
    }
    
    /**
     * Set new duration
     * 
     * @param   newDuration
     */
    public void setNewDuration(long min, long sec)
    {
        this.duration.setDuration(min, sec);
    }
    
    public String getDurationString()
    {
        return duration.getDurationString();
    }
    
    /**
     * Set new medium referance
     * 
     * @param   newMedium
     */
    public void setMedium(Medium newMedium)
    {
        this.medium = newMedium;
    }
    
}
