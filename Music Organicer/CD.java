/**
 * Write a description of class CD here.
 * 
 * @Kelvin
 * @15.04.15
 */
public class CD extends Medium
{
    // instance variables - replace the example below with your own
    private String artist;
    private int releaseYear;
    private String recordLabel;
    private int archiveNumber;
    
    

    /**
     * Constructor for objects of class CD
     */
    public CD(String title, String artist, int releaseYear, String recordLabel, int archiveNumber)
    {
        super(title);
        this.artist = artist;
        this.releaseYear = releaseYear;
        this.recordLabel = recordLabel;
        this.archiveNumber = archiveNumber;
    }

    /**
     * get artist
     * @return artist
     */
    public String getArtist() {
        return artist;
    }

    /**
     * set artist
     * @param artist
     */
    public void setArtist(String artist) {
        this.artist = artist;
    }

    /**
     * get release year
     * @return releaseYear
     */
    public int getReleaseYear() {
        return releaseYear;
    }

    /**
     * set releaseYear
     * @param releaseYear
     */
    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    /**
     * get record label
     * @return recordLabel
     */
    public String getRecordLabel() {
        return recordLabel;
    }

    /**
     * set record label
     * @param recordLabel
     */
    public void setRecordLabel(String recordLabel) {
        this.recordLabel = recordLabel;
    }

    public int getArchiveNumber() {
        return archiveNumber;
    }

    public void setArchiveNumber(int archiveNumber) {
        this.archiveNumber = archiveNumber;
    }
    
    
    
}
    