import javax.swing.SwingUtilities;

public class BloodTest {
    public static void main(String[] args) {
       // Launch the GUI on the Event Dispatch Thread
    SwingUtilities.invokeLater(new Runnable() {
        @Override
        public void run() {
            NewJFrameBloodTest frame = new NewJFrameBloodTest();
            frame.setVisible(true); // Ensure this is called on a JFrame
        });
    }
}


