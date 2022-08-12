import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {

    protected JLabel label;
    protected JPanel panel;
    protected JButton[] buttons;


    public Calculator(){

        this.setSize(400, 550);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(null);
        this.setLocationRelativeTo(null);

        label = new JLabel();
        label.setOpaque(true);
        label.setBackground(Color.black);
        label.setForeground(Color.white);
        System.out.println(this.getContentPane().getHeight());
        label.setBounds(0,0,this.getContentPane().getWidth(), 100);
        Font labelFont = new Font("David", Font.CENTER_BASELINE, 35);
        label.setFont(labelFont);
        panel = new JPanel();
        panel.setBounds(0, 100, this.getContentPane().getWidth(), this.getContentPane().getHeight()-100);
        panel.setLayout(new GridLayout(4,4));

        buttons = new JButton[16];
        buttons[0] = new JButton("7");
        buttons[1] = new JButton("8");
        buttons[2] = new JButton("9");
        buttons[3] = new JButton("C");
        buttons[4] = new JButton("4");
        buttons[5] = new JButton("5");
        buttons[6] = new JButton("6");
        buttons[7] = new JButton("/");
        buttons[8] = new JButton("1");
        buttons[9] = new JButton("2");
        buttons[10] = new JButton("3");
        buttons[11] = new JButton("*");
        buttons[12] = new JButton("+");
        buttons[13] = new JButton("-");
        buttons[14] = new JButton("0");
        buttons[15] = new JButton("=");

        Font buttonsFont = new Font("David", Font.BOLD, 30);

        for (int i = 0; i < buttons.length; i++) {
            buttons[i].addActionListener(new Listener(buttons, label));
            buttons[i].setFont(buttonsFont);
            buttons[i].setBackground(Color.orange);
        }

        for (int i = 0; i < buttons.length; i++) {
            panel.add(buttons[i]);
        }

        this.add(label);
        this.add(panel);

        this.setVisible(true);

    }



}
