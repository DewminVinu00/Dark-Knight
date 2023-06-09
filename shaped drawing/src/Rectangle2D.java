import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rectangle2D extends JFrame {
    private JPanel mypanel4;
    private JTextField textField1;
    private JTextField textField2;
    private JButton createButton;
    private JRadioButton redRadioButton;
    private JRadioButton greenRadioButton;
    private JRadioButton blueRadioButton;
    private JButton backButton;
    private JRadioButton black;
    private ButtonGroup colorButtonGroup; // ButtonGroup to manage radio button selection

    public Rectangle2D(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setContentPane(mypanel4);
        this.pack();

        // Create the ButtonGroup and add radio buttons to it
        colorButtonGroup = new ButtonGroup();
        colorButtonGroup.add(redRadioButton);
        colorButtonGroup.add(greenRadioButton);
        colorButtonGroup.add(blueRadioButton);

        createButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int height = Integer.parseInt(textField1.getText());
                int width = Integer.parseInt(textField2.getText());
                Color color;

                if (redRadioButton.isSelected()) {
                    // Red radio button is selected
                    // Do something with the red selection
                    color = Color.RED;
                } else if (greenRadioButton.isSelected()) {
                    // Green radio button is selected
                    // Do something with the green selection
                    color = Color.GREEN;
                }
                else if (black.isSelected()) {
                    // Green radio button is selected
                    // Do something with the green selection
                    color = Color.BLACK;
                }
                else if (blueRadioButton.isSelected()) {
                    // Blue radio button is selected
                    // Do something with the blue selection
                    color = Color.BLUE;
                } else {
                    // No radio button is selected
                    // Handle the case where no selection is made
                    color = Color.BLACK; // or set a default color value
                }

                RectangleView2D rectangleView = new RectangleView2D(width, height, color);
                rectangleView.setVisible(true);
                rectangleView.setSize(1000, 600);
            }
        });
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Rectangle2D.super.dispose();
                JFrame frame2= new shapes2D("All 2D");
                frame2.setVisible(true);
                frame2.setSize(1000, 600);
            }
        });
    }
}
