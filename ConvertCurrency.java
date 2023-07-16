import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.ImageIcon.*;

public class ConvertCurrency extends JFrame implements ActionListener {

    JLabel l1, l2, l3;
    JButton b1, b2, b3, b4, b5, b6, b7, b8,b9;
    JTextField t1, t2;

    public ConvertCurrency() {

        setLayout(new FlowLayout());
        getContentPane().setBackground(Color.white);

        l1 = new JLabel("Enter Amount(Rs)");
        add(l1);

        t1 = new JTextField(20);
        add(t1);

        b1 = new JButton("EUR");
        add(b1);
        b1.addActionListener(this);

        b2 = new JButton("JPY");
        add(b2);
        b2.addActionListener(this);

        b3 = new JButton("USD");
        add(b3);
        b3.addActionListener(this);

        b4 = new JButton("AFN");
        add(b4);
        b4.addActionListener(this);

        b5 = new JButton("COP");
        add(b5);
        b5.addActionListener(this);

        b6 = new JButton("DKK");
        add(b6);
        b6.addActionListener(this);

        b7 = new JButton("EGP");
        add(b7);
        b7.addActionListener(this);

        b8 = new JButton("CLEAR");
        b8.addActionListener(this);
        add(b8);

        b9 = new JButton("Exit");
        b9.addActionListener(this);
        add(b9);

        l2 = new JLabel("Convert Currency Amount");
        add(l2);

        t2 = new JTextField(20);
        add(t2);

        l3 = new JLabel();
        add(l3);
        
        setSize(350, 600);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b1) {
            double d = Double.parseDouble(t1.getText());
            double d1 = d * 0.011;
            String str1 = String.valueOf(d1);
            t2.setText(str1 + "Euro");

            
            ImageIcon icon = new ImageIcon("Europe.jpg");
            l3.setIcon(icon);
            setSize(350, 600);

        }
        if (e.getSource() == b2) {
            double d = Double.parseDouble(t1.getText());
            double d1 = d * 1.65;
            String str1 = String.valueOf(d1);
            t2.setText(str1 + "Yen");


            ImageIcon icon = new ImageIcon("japam.jpg");
            l3.setIcon(icon);
            setSize(350, 600);
        }
        if (e.getSource() == b3) {
            double d = Double.parseDouble(t1.getText());
            double d1 = d * 0.012;
            String str1 = String.valueOf(d1);
            t2.setText(str1 + "Doller");

            ImageIcon icon = new ImageIcon("USA.jpg");
            l3.setIcon(icon);
            setSize(350, 600);
        }
        if (e.getSource() == b4) {
            double d = Double.parseDouble(t1.getText());
            double d1 = d * 1.07;
            String str1 = String.valueOf(d1);
            t2.setText(str1 + "Afghan");

            ImageIcon icon = new ImageIcon("Afganistan.jpg");
            l3.setIcon(icon);
            setSize(350, 600);
        }
        if (e.getSource() == b5) {
            double d = Double.parseDouble(t1.getText());
            double d1 = d * 55.39;
            String str1 = String.valueOf(d1);
            t2.setText(str1 + "Colombian Peso");

            ImageIcon icon = new ImageIcon("colombia.jpg");
            l3.setIcon(icon);
           
            setSize(350, 600);
        }
        if (e.getSource() == b6) {
            double d = Double.parseDouble(t1.getText());
            double d1 = d * 0.083;
            String str1 = String.valueOf(d1);
            t2.setText(str1 + "Danish Krone");

            ImageIcon icon = new ImageIcon("Denmark.jpg");
            l3.setIcon(icon);
            setSize(350, 600);
        }
        if (e.getSource() == b7) {
            double d = Double.parseDouble(t1.getText());
            double d1 = d * 0.38;
            String str1 = String.valueOf(d1);
            t2.setText(str1 + "Egyptian Pound");

            ImageIcon icon = new ImageIcon("Egypt.jpg");
            l3.setIcon(icon);
            setSize(350, 600);
        }

        if (e.getSource() == b8) {
            t1.setText(" ");
            t2.setText(" ");
            getContentPane().setBackground(Color.white);
            l3.setIcon(null);
            

        }
        if(e.getSource()==b9)
        {
            setVisible(false);
        }

    }

    public static void main(String args[]) {
        new ConvertCurrency();
    }
}