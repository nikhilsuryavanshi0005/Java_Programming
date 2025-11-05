import javax.swing.*;
import java.awt.event.*;

class Calculator implements ActionListener {
    JFrame fobj;
    JTextField num1, num2;
    JButton addButton, subButton, mulButton, divButton;
    JLabel resultLabel,Numberlabel1,Numberlabel2;

    public Calculator() {
        fobj = new JFrame("Calculator");
        fobj.setSize(500, 400);
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Numberlabel1 = new JLabel("Number 1:");
        Numberlabel1.setBounds(50, 50, 100, 30);
        fobj.add(Numberlabel1);

        Numberlabel2 = new JLabel("Number 2:");
        Numberlabel2.setBounds(50, 100, 100, 30);
        fobj.add(Numberlabel2);
        fobj.setLayout(null);

        num1 = new JTextField();
        num1.setBounds(150, 50, 100, 30);
        fobj.add(num1);

        num2 = new JTextField();
        num2.setBounds(150, 100, 100, 30);
        fobj.add(num2);

    addButton = new JButton("+");
    addButton.setBounds(50, 150, 50, 20);
    fobj.add(addButton);

    subButton = new JButton("-");
    subButton.setBounds(100, 150, 50, 20);
    fobj.add(subButton);

    mulButton = new JButton("*");
    mulButton.setBounds(150, 150, 50, 20);
    fobj.add(mulButton);

    divButton = new JButton("/");
    divButton.setBounds(200, 150, 50, 20);
    fobj.add(divButton);

    resultLabel = new JLabel("Result:");
    resultLabel.setBounds(50, 190, 250, 30);
    fobj.add(resultLabel);

    addButton.addActionListener(this);
    subButton.addActionListener(this);
    mulButton.addActionListener(this);
    divButton.addActionListener(this);

        fobj.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == addButton) {
                int sum = Integer.parseInt(num1.getText()) + Integer.parseInt(num2.getText());
                resultLabel.setText("Result: " + sum);
            } else if (e.getSource() == subButton) {
                int diff = Integer.parseInt(num1.getText()) - Integer.parseInt(num2.getText());
                resultLabel.setText("Result: " + diff);
            } else if (e.getSource() == mulButton) {
                int prod = Integer.parseInt(num1.getText()) * Integer.parseInt(num2.getText());
                resultLabel.setText("Result: " + prod);
            } else if (e.getSource() == divButton) {
                int a = Integer.parseInt(num1.getText());
                int b = Integer.parseInt(num2.getText());
                if (b == 0) {
                    resultLabel.setText("Cannot divide by zero");
                } else {
                    double div = (double) a / b;
                    resultLabel.setText("Result: " + div);
                }
            }
        } catch (NumberFormatException ex) {
            resultLabel.setText("Enter valid integers");
        }
    }
}

class GUICalculator {
    public static void main(String Arr[]) {
        Calculator cobj = new Calculator();
    }
}