package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Signup2 extends JFrame implements ActionListener {

    
    JTextField pan, aadhar;
    JButton next;
    JRadioButton syes, sno, eyes, eno;
    JComboBox religion, education, income, category, occupation;
    String formno;
   

    Signup2(String formno) {
        
        this.formno = formno;

        setLayout(null);

        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");

        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290, 80, 400, 30);
        add(additionalDetails);

        JLabel religionc = new JLabel("Religion:");
        religionc.setFont(new Font("Raleway", Font.BOLD, 20));
        religionc.setBounds(100, 140, 100, 30);
        add(religionc);

        String valReligion[] = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
        religion = new JComboBox(valReligion);
        religion.setBounds(300, 140, 400, 30);
        religion.setBackground(Color.WHITE);
        add(religion);

        JLabel categoryc = new JLabel("Category:");
        categoryc.setFont(new Font("Raleway", Font.BOLD, 20));
        categoryc.setBounds(100, 190, 200, 30);
        add(categoryc);

        String valcategory[] = {"General", "OBC", "ST", "SC", "Other"};
        category = new JComboBox(valcategory);
        category.setBounds(300, 190, 400, 30);
        category.setBackground(Color.WHITE);
        add(category);

        JLabel incomesource = new JLabel("Income:");
        incomesource.setFont(new Font("Raleway", Font.BOLD, 20));
        incomesource.setBounds(100, 240, 200, 30);
        add(incomesource);

        String incomecategory[] = {"Null", "< 1,50,000", "<2,50,000", "< 5,00,000", "Upto 10,00,000"};
        income = new JComboBox(incomecategory);
        income.setBounds(300, 240, 400, 30);
        income.setBackground(Color.WHITE);
        add(income);

        JLabel educational = new JLabel("Educational");
        educational.setFont(new Font("Raleway", Font.BOLD, 20));
        educational.setBounds(100, 290, 200, 30);
        add(educational);
        JLabel qualifaction = new JLabel("Qualifaction:");
        qualifaction.setFont(new Font("Raleway", Font.BOLD, 20));
        qualifaction.setBounds(100, 315, 200, 30);
        add(qualifaction);

        String valeducation[] = {"Non-Graduation", "Graduation", "Post-Graduation", "Other"};
        education = new JComboBox(valeducation);
        education.setBounds(300, 315, 400, 30);
        education.setBackground(Color.WHITE);
        add(education);

        JLabel occupat = new JLabel("Occupation:");
        occupat.setFont(new Font("Raleway", Font.BOLD, 20));
        occupat.setBounds(100, 390, 200, 30);
        add(occupat);

        String valoccupation[] = {"Salaried", "Self-Employed", "Student", "Bussiness", "Retired", "Other"};
        occupation = new JComboBox(valoccupation);
        occupation.setBounds(300, 390, 400, 30);
        occupation.setBackground(Color.WHITE);
        add(occupation);

        JLabel pannumber = new JLabel("PAN Number:");
        pannumber.setFont(new Font("Raleway", Font.BOLD, 20));
        pannumber.setBounds(100, 440, 200, 30);
        add(pannumber);

        pan = new JTextField();
        pan.setFont(new Font("Raleway", Font.BOLD, 14));
        pan.setBounds(300, 440, 400, 30);
        add(pan);

        JLabel aadharno = new JLabel("Aadhar Number:");
        aadharno.setFont(new Font("Raleway", Font.BOLD, 20));
        aadharno.setBounds(100, 490, 200, 30);
        add(aadharno);

        aadhar = new JTextField();
        aadhar.setFont(new Font("Raleway", Font.BOLD, 14));
        aadhar.setBounds(300, 490, 400, 30);
        add(aadhar);

        JLabel scitizen = new JLabel("Senior Citizen:");
        scitizen.setFont(new Font("Raleway", Font.BOLD, 20));
        scitizen.setBounds(100, 540, 200, 30);
        add(scitizen);

        syes = new JRadioButton("Yes");
        syes.setBounds(300, 540, 60, 30);
        syes.setBackground(Color.WHITE);
        add(syes);

        sno = new JRadioButton("No");
        sno.setBounds(400, 540, 100, 30);
        sno.setBackground(Color.WHITE);
        add(sno);

        ButtonGroup scitizengroupe = new ButtonGroup();
        scitizengroupe.add(syes);
        scitizengroupe.add(sno);

        JLabel exisiting = new JLabel("Exisiting Account:");
        exisiting.setFont(new Font("Raleway", Font.BOLD, 20));
        exisiting.setBounds(100, 590, 200, 30);
        add(exisiting);

        eyes = new JRadioButton("Yes");
        eyes.setBounds(300, 590, 60, 30);
        eyes.setBackground(Color.WHITE);
        add(eyes);

        eno = new JRadioButton("No");
        eno.setBounds(400, 590, 100, 30);
        eno.setBackground(Color.WHITE);
        add(eno);

        ButtonGroup exisitinggroup = new ButtonGroup();
        exisitinggroup.add(eyes);
        exisitinggroup.add(eno);

        next = new JButton("Next️");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.WHITE);

        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String sreligion = (String) religion.getSelectedItem();
        String scategory = (String) category.getSelectedItem();
        String sincome = (String) income.getSelectedItem();
        String seducation = (String) education.getSelectedItem();
        String soccupation = (String) occupation.getSelectedItem();
        String span = pan.getText();
        String saadhar = aadhar.getText();
        String scitizengroupe = null;
        if (syes.isSelected()) {
            scitizengroupe = "yes";
        } else if (sno.isSelected()) {
            scitizengroupe = "no";
        }
        String exisiting = null;
        if (eyes.isSelected()) {
            exisiting = "yes";
        } else if (eno.isSelected()) {
            exisiting = "no";
        }
        

        try {
            if (pan.equals("")) {
                JOptionPane.showMessageDialog(null, "Name is Religion");
            } else {
                Conn c = new Conn();
                String query = "insert into signup2 values('" + formno + "','" + sreligion + "','" + scategory + "','" + sincome + "','" + seducation + "','" + soccupation + "','" + span + "','" + saadhar + "','" + scitizengroupe + "','" + exisiting + "')";
                c.s.executeUpdate(query);
                
                setVisible(false);
                new Signup3(formno).setVisible(true);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
        new Signup2("");
    }
}
