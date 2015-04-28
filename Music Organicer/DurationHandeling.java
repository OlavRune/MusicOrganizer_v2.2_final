import java.time.Duration;

/**
 * Duration handeling, adding a duration to each track and be able to get seconds, string of duration, etc.
 * 
 * @Kelvin and Vegard
 * @20.04.15
 */
public class DurationHandeling
{
    // instance variables - replace the example below with your own
    private Duration duration;
    private String time;
    private long totSec;
    private long sec;
    private long min;
    

    /**
     * Constructor for objects of class DurationTesting
     */
    public DurationHandeling()
    {
        // nothing to do here
    }

    /**
     * Setting the value of duration by inputs for minutes and seconds.
     * 
     * @param  min, sec     the minutes and seconds of the duration.
     */
    public void setDuration(long min, long sec)
    {
        this.totSec = sec + min*60;
        this.duration = duration.ofSeconds(totSec);
    }
    
    /**
     * Getting a string of the total duration in the form ; "1H2M3S"
     *
     * @return     string of duration.
     */
    public String getDurationString()
    {
        String[] parts = duration.toString().split("PT");
        time = parts[1];
        return time;
    }
    
    /**
     * Getting the total amount of duration seconds
     *
     * @return     total seconds
     */
    public long getTotalSeconds()
    {
        return totSec;
    }
    
    public void addSeconds(long secToAdd)
    {
        totSec += secToAdd;
    }
    public void removeSeconds(long secToRemove)
    {
        totSec -= secToRemove;
    }
      


}
