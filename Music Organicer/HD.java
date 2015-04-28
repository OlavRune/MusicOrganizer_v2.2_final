
/**
 * Hard Disc Class
 * 
 * @Mest Olav, litt Kelvin 
 * @15.04.15
 */
public class HD extends Medium
{
    // instance variables - replace the example below with your own
    private String filename;
    private String filePath;
    private int fileSize;

    /**
     * Constructor for objects of class HD
     */
    public HD(String title, String filename, String filePath, int fileSize)
    {
        super(title);
        this.filename = filename;
        this.filePath = filePath;
        this.fileSize = fileSize;
    }

     /**
     * get filename
     * @return filename
     */
    public String getFilename() {
        return filename;
    }

    /**
     * Set filename
     * @param filename
     */
    public void setFilename(String filename) {
        this.filename = filename;
    }

    /**
     * get filePath
     * @return filePath
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * Set filePath
     * @param filePath
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    /**
     * get fileSize
     * @return fileSize
     */
    public int getFileSize() {
        return fileSize;
    }

    /**
     * Set fileSize in kB
     * @param fileSize
     */
    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }
    
    
    
    
}
