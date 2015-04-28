import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Write a description of class MainWindow here.
 * 
 * @author NumTek
 * @version (a version number or a date)
 */
public class MainWindow extends JFrame
{
    // instance variables - replace the example below with your own
    private TrackOrganizer trackOrganizer;
    /**
     * Constructor for objects of class MainWindow
     */
    public MainWindow()
    {
        super("Music Archive");
        this.trackOrganizer = new TrackOrganizer();
        //this.audioArchive.fillAudioArchive();
        makeFrame();
    }

   
    private void makeFrame()
    {
        Container contentPane = this.getContentPane();

        JTable table = new JTable(new MusicTableModel(this.trackOrganizer));
        
        JScrollPane scrollPane = new JScrollPane(table);
        table.setFillsViewportHeight(true);
        contentPane.add(scrollPane);

        // building is done - arrange the components and show        
        this.pack();
        this.setVisible(true);
        
    }
    
    /**
     * public static void main(String [] args)
    {
        MainWindow mainWin = new MainWindow();
        mainWin.setVisible(true);
    }
    */
}
