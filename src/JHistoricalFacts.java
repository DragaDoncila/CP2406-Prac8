import oracle.jrockit.jfr.JFR;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**Class displays historical facts in turn
 * Created by Draga on 19/09/2016.
 */
public class JHistoricalFacts extends JFrame implements ActionListener{
    JLabel label1 = new JLabel("Egypt is in Africa.");
    JLabel label2 = new JLabel("World War 2 was the second world war");
    JLabel label3 = new JLabel("Australia is younger than Europe");
    JLabel label4 = new JLabel("Winston Churchill was British");
    JLabel label5 = new JLabel("Dodos are extinct.");
    JLabel[] myLabels = {label1, label2, label3, label4, label5};
    int labelCount;

    JButton seeNext = new JButton("See Next");

    JHistoricalFacts(String title){
        super(title);
        this.setLayout(new FlowLayout());
        add(label1);
        seeNext.addActionListener(this);
        add(seeNext);
        labelCount = 0;

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
            if(source.equals(seeNext)){
                this.remove(myLabels[labelCount]);
                ++labelCount;
                if(labelCount == 5){
                    labelCount = 0;
                }
                this.add(myLabels[labelCount]);
                this.revalidate();
                this.repaint();
            }
    }

    public static void main(String[] args) {
        JHistoricalFacts myFacts = new JHistoricalFacts("Historical Facts");
        myFacts.setSize(500, 500);
        myFacts.setVisible(true);
        myFacts.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
