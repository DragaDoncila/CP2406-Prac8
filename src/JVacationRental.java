import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**Class determines price for a vacation rental based on location, number of bedrooms and meal options
 * Created by Draga on 19/09/2016.
 */
public class JVacationRental extends JFrame implements ItemListener{
    double totalPrice;
    String output;
    ButtonGroup locations = new ButtonGroup();
    ButtonGroup bedrooms = new ButtonGroup();
    ButtonGroup meals = new ButtonGroup();

    JLabel locationLabel = new JLabel("Locations Available: ");
    JRadioButton parkside = new JRadioButton("Parkside");
    JRadioButton poolside = new JRadioButton("Poolside");
    JRadioButton lakeside = new JRadioButton("Lakeside");
    double PARKSIDE = 600, POOLSIDE = 750, LAKESIDE = 825;

    JLabel bedLabel = new JLabel("Number of Bedrooms: ");
    JRadioButton one = new JRadioButton("One Bedroom");
    JRadioButton two = new JRadioButton("Two Bedrooms");
    JRadioButton three = new JRadioButton("Three Bedrooms");
    double ONE = 0, TWO = 75, THREE = 75*2;

    JLabel mealLabel = new JLabel("Meal Option: ");
    JRadioButton includeMeals = new JRadioButton("Meals Included");
    JRadioButton noMeals = new JRadioButton("No Meals");
    double MEALS = 200;

    JLabel priceLabel = new JLabel();

    JVacationRental(String title){
        super(title);
        setSize(500, 400);
        setVisible(true);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        locations.add(parkside);
        locations.add(poolside);
        locations.add(lakeside);

        bedrooms.add(one);
        bedrooms.add(two);
        bedrooms.add(three);

        meals.add(includeMeals);
        meals.add(noMeals);

        add(locationLabel);
        add(parkside);
        add(poolside);
        add(lakeside);

        parkside.addItemListener(this);
        poolside.addItemListener(this);
        lakeside.addItemListener(this);

        add(bedLabel);
        add(one);
        add(two);
        add(three);

        one.addItemListener(this);
        two.addItemListener(this);
        three.addItemListener(this);

        add(mealLabel);
        add(includeMeals);
        add(noMeals);

        includeMeals.addItemListener(this);
        noMeals.addItemListener(this);

        add(priceLabel);

    }
    @Override
    public void itemStateChanged(ItemEvent e) {
        Object source = e.getSource();
        if (source.equals(parkside)){
            int select = e.getStateChange();
            if (select == ItemEvent.SELECTED){
                totalPrice += PARKSIDE;
            }
            else {
                totalPrice -= PARKSIDE;
            }

        }
        else if (source.equals(poolside)){
            int select = e.getStateChange();
            if (select == ItemEvent.SELECTED){
                totalPrice += POOLSIDE;
            }
            else {
                totalPrice -= POOLSIDE;
            }

        }
        else if (source.equals(lakeside)){
            int select = e.getStateChange();
            if (select == ItemEvent.SELECTED){
                totalPrice += LAKESIDE;
            }
            else {
                totalPrice -= LAKESIDE;
            }
        }
        else if (source.equals(two)){
            int select = e.getStateChange();
            if (select == ItemEvent.SELECTED){
                totalPrice += TWO;
            }
            else {
                totalPrice -= TWO;
            }
        }
        else if (source.equals(three)){
            int select = e.getStateChange();
            if (select == ItemEvent.SELECTED){
                totalPrice += THREE;
            }
            else {
                totalPrice -= THREE;
            }
        }
        else if (source.equals(includeMeals)){
            int select = e.getStateChange();
            if (select == ItemEvent.SELECTED){
                totalPrice += MEALS;
            }
            else {
                totalPrice -= MEALS;
            }
        }
        output = "Your total for the weekend is $" + totalPrice;
        priceLabel.setText(output);

    }

    public static void main(String[] args) {
        JVacationRental myRental = new JVacationRental("Vacation Rental");
    }
}
