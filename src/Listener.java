import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Listener implements ActionListener {
    protected JButton[] buttons;
    protected JLabel label;

    public Listener(JButton[] buttons, JLabel label) {
        this.buttons = buttons;
        this.label = label;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String result;
        for (int i = 0; i < buttons.length; i++) {
            if (e.getSource() == buttons[3]){
                label.setText("");
            }
            if (e.getSource() == buttons[15]) {
                System.out.println(label.getText()); // debug
                calculate(label.getText());
                break;
            }
            if (e.getSource() == buttons[i])
                label.setText(label.getText() + buttons[i].getText());
        }

    }


    public void calculate(String str){
        int result;
        int i = 0;
        String temp1 = "";
        int first;
        String temp2 = "";
        int second;


        while (str.charAt(i) != '+' && str.charAt(i) != '-' && str.charAt(i) != '/' && str.charAt(i) != '*' ) {
            temp1 += str.charAt(i);
            i++;
        }
        first = Integer.parseInt(temp1);

        for (int j = i+1; j < str.length(); j++) {
            temp2+=str.charAt(j);
        }
        second = Integer.parseInt(temp2);

        if (str.charAt(i) == '*') result = first*second;
        else if (str.charAt(i) == '/') result = first/second;
        else if (str.charAt(i) == '+') result = first+second;
        else result = first-second;


        String toSet = String.valueOf(result);
        System.out.println(toSet);
        label.setText(toSet);
    }

}
