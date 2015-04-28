
/**
 * Write a description of class News here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class News extends AudioTrack
{
    // instance variables - replace the example below with your own
    private String story;
    private String journalist;
    private int dateProduced;
    private int dateBroadcasted;
    

    /**
     * Constructor for objects of class News
     */
    public News(String title, long minutes, long seconds, Medium medium, String story, String journalist, int dateProduced, int dateBroadcasted)
    {   
          super(title, minutes, seconds, medium);
          this.story = story;
          this.journalist = journalist;
          this.dateProduced = dateProduced;
          this.dateBroadcasted = dateBroadcasted;
          
        
    }

    
    
    /**
     * get the story
     * @return story
     */
    public String getStory() {
        return story;
    }
    /**
     * set story
     * @param story 
     */
    public void setStory(String story) {
        this.story = story;
    }
    /**
     *  get the journalist
     * @return journalist
     */
    public String getJournalist() {
        return journalist;
    }
    /**
     * change the journalist
     * @param journalist 
     */
    public void setJournalist(String journalist) {
        this.journalist = journalist;
    }
    /**
     * return the date it was produced
     * @return 
     */
    public int getDateProduced() {
        return dateProduced;
    }
    /**
     * change the date the story was produced
     * @param dateProduced 
     */
    public void setDateProduced(int dateProduced) {
        this.dateProduced = dateProduced;
    }
    /**
     * return the date first broadcasted
     * @return dateBroadcasted
     */
    public int getDateBroadcasted() {
        return dateBroadcasted;
    }
    /**
     * change the date it was broadcasted
     * @param dateBroadcasted 
     */
    public void setDateBroadcasted(int dateBroadcasted) {
        this.dateBroadcasted = dateBroadcasted;
    }
    
    
    
}
