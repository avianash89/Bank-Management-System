package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener {

    JButton cash1000, cash2000, cash5000, cash8000, cash10000, cash15000,
            back;
    String pinnumber;

    FastCash(String pinnumber) {
        this.pinnumber = pinnumber;

        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);

        JLabel text = new JLabel("Selecct Withdrawl Amount");
        text.setBounds(220, 300, 700, 35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        image.add(text);

        cash1000 = new JButton("Rs 1000");
        cash1000.setBounds(170, 415, 150, 30);
        cash1000.addActionListener(this);
        image.add(cash1000);

        cash2000 = new JButton("Rs 2000");
        cash2000.setBounds(355, 415, 150, 30);
        cash2000.addActionListener(this);
        image.add(cash2000);

        cash5000 = new JButton("Rs 5000");
        cash5000.setBounds(170, 450, 150, 30);
        cash5000.addActionListener(this);
        image.add(cash5000);

        cash8000 = new JButton("Rs 8000");
        cash8000.setBounds(355, 450, 150, 30);
        cash8000.addActionListener(this);
        image.add(cash8000);

        cash10000 = new JButton("Rs 10000");
        cash10000.setBounds(170, 485, 150, 30);
        cash10000.addActionListener(this);
        image.add(cash10000);

        cash15000 = new JButton("Rs 15000");
        cash15000.setBounds(355, 485, 150, 30);
        cash15000.addActionListener(this);
        image.add(cash15000);

        back = new JButton("Back");
        back.setBounds(355, 520, 150, 30);
        back.addActionListener(this);
        image.add(back);

        setSize(900, 900);
        setLocation(300, 0);
        setUndecorated(true);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == back) {
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        } else {
            String amount = ((JButton) ae.getSource()).getText().substring(3);
            Conn c = new Conn();
            try {
                ResultSet rs = c.s.executeQuery("SELECT * FROM bank WHERE pinnumber = '" + pinnumber + "'");
                int balance = 0;
                while (rs.next()) {
                    if (rs.getString("type").equals("Deposit")) {
                        balance += Integer.parseInt(rs.getString("amount"));
                    } else {
                        balance -= Integer.parseInt(rs.getString("amount"));
                    }
                }
                if (ae.getSource() != back && balance < Integer.parseInt(amount)) {
                    JOptionPane.showMessageDialog(null, "Insufficient Balance");
                    return;
                }
                Date date = new Date();
                String query = "INSERT INTO bank VALUES('" + pinnumber + "','" + date + "','Withdraw','" + amount + "')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Rs " + amount + " Debited Sucessfully");

                setVisible(false);
                new Transactions(pinnumber).setVisible(true);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String args[]) {
        new FastCash("");
    }

}
