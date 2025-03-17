/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author azizi
 */
public class BloodTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Launch the Blood Test Scheduler GUI
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrameBloodTest().setVisible(true);
            }
        });
    }
}
