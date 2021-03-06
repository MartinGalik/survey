package survey.frontend;

import java.awt.BorderLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import survey.backend.SurveyEngine;
import survey.backend.SurveyEngineException;
import survey.frontend.panels.jPanelMain;

/**
 * Main class
 * @author Peter Petkanič
 */
public class Main {
    public static void main(String[] args) {
        
        try {
            UIManager.setLookAndFeel(
                    UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(-1);
        }
        
        SurveyEngine surveyEngine = null;
        
        try {
            surveyEngine = new SurveyEngine("src/xml/survey.xml");
        } catch (SurveyEngineException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(-1);
        }
        
        final SurveyEngine se = surveyEngine;
        
        javax.swing.SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Survey creator");
			frame.setIconImage(new ImageIcon("src/web/favicon.png").getImage());
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new BorderLayout());
            frame.add(new jPanelMain(se), BorderLayout.CENTER);
            frame.pack();
            frame.setVisible(true);
        });
        
        
        
        
        
    }
}
