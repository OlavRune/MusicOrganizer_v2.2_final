
/**
 * Write a description of class LP here.
 * 
 * @author Stort sett Olav 
 * @version (a version number or a date)
 */
public class LP extends Medium
{
    // instance variables - replace the example below with your own
    private String artist;
    private int releaseYear;
    private String recordLabel;
    private int archiveNumber;

    /**
     * Constructor for objects of class LP
     */
    public LP(String title, String artist, int releaseYear, String recordLabel, int archiveNumber)
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
    /**
         * set archive number
         * @return archiveNumber
         */
        public int getArchiveNumber() {
            return archiveNumber;
        }
    /**
         * set the archive number
         * @param archiveNumber 
         */
        public void setArchiveNumber(int archiveNumber) {
            this.archiveNumber = archiveNumber;
        }
    
    
    
}
