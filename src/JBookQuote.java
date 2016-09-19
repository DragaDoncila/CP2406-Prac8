import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**Displays favourite book quotes in GUI pane
 * Created by Draga on 19/09/2016.
 */
public class JBookQuote extends JFrame implements ActionListener {
    JLabel bookQuote = new JLabel();
    JButton seeTitle = new JButton("See Title");
    JLabel bookTitle = new JLabel();

    JBookQuote (String title, String quote){
        super(title);
        setLayout(new FlowLayout());
        this.bookQuote.setText(quote);
        add(bookQuote);
        seeTitle.addActionListener(this);
        add(seeTitle);
        add(bookTitle);


    }

    public static void main(String[] args) {
        JBookQuote bookFrame = new JBookQuote("Book Quotes",
                "It is a truth universally acknowledged, that a single man in possession of a good fortune, must be in want of a wife.");
        bookFrame.setSize(800, 400);
        bookFrame.setVisible(true);
        bookFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        bookTitle.setText("Pride and Prejudice");
    }
}
