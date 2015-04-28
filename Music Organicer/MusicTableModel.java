import javax.swing.table.AbstractTableModel;

/**
 * Write a description of class MusicTableModel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MusicTableModel extends AbstractTableModel
{

    private String[] columnNames = {"Title", "Artist", "Album"}; //same as before...
    private TrackOrganizer trackOrganizer;

    
    public MusicTableModel( TrackOrganizer trackOrganizer )
    {
        super();
        this.trackOrganizer = trackOrganizer;
    }
    
    public int getColumnCount() {
        return columnNames.length;
    }

    public int getRowCount() {
        return this.trackOrganizer.getNumberOfTracks();
    }

    public String getColumnName(int col) {
        return columnNames[col];
    }

    public Object getValueAt(int row, int col) {
        String result = "";
        
        // First get the audiotrack corresponding to the row-number
        AudioTrack track  = this.trackOrganizer.getTrackAt(row);
        if (null != track)
        { 
            switch( col )
            {
                case 0:
                    //result = track.getTitle();
                    result = "ape";
                    break;
                    
                case 1:
                    //result = track.getArtist();
                    result = "suppegjøk";
                    break;
                case 2:
                    //result = track.getAlbum();
                    result = "habalababalala";
                    break;
                default:
                    result = "UNKNOWN";
                    break;
            }
            
        }
        
        
        return result;
    }

    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }
}
