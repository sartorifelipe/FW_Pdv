
package PdvGUI;

import javax.swing.UIManager;

public class Main {
    public static void main(String[] args) {
         try {
            
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FWPdvMainScreen().setVisible(true);
            }
        });
    }
}
