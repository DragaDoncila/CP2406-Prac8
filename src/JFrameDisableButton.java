import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**Frame shows abutton which disables once clicked.
 * Created by Draga on 19/09/2016.
 */
public class JFrameDisableButton extends JFrame implements ActionListener {
    JButton myButton = new JButton("Enabled");
    int numClicks;

    JFrameDisableButton(String title){
        super(title);
        myButton.addActionListener(this);
        add(myButton);
        this.numClicks = 0;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(myButton)){
            ++numClicks;
            if (numClicks == 8){

                myButton.setText("That's Enough");
                myButton.setEnabled(false);
            }
        }
    }

    public static void main(String[] args) {
        JFrameDisableButton myFrame = new JFrameDisableButton("Button Disabler");
        myFrame.setSize(200, 200);
        myFrame.setVisible(true);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
