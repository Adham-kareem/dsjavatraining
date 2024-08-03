import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        //pass the database url,username,password in string
        String url = "jdbc:mysql://localhost:3306/expensedb";
        String user ="root";
        String password ="";

        try {
            Connection con= DriverManager.getConnection(url,user,password);
            System.out.println("connected");
            //Design the java UI for expense Calculator
            JFrame frame=new JFrame("Adham Expenses");
            JLabel titlelabel=new JLabel("Expenses");
            titlelabel.setBounds(210,20,80,50);
            titlelabel.setForeground(Color.BLUE);
            frame.add(titlelabel);

            JLabel expensetypelabel=new JLabel(" Enter Expenses Type");
            expensetypelabel.setBounds(20,50,150,50);
            expensetypelabel.setForeground(Color.RED);
            frame.add(expensetypelabel);


            JTextField expensetypefield=new JTextField();
            expensetypefield.setBounds(170,60,100,30);
            frame.add(expensetypefield);

            JLabel expenseamountlabel=new JLabel(" Enter Expenses Amount");
            expenseamountlabel.setBounds(20,90,170,50);
            expenseamountlabel.setForeground(Color.RED);
            frame.add(expenseamountlabel);

            JTextField expenseAmountfield=new JTextField();
            expenseAmountfield.setBounds(170,100,100,30);
            frame.add(expenseAmountfield);

            JLabel incomeamountlabel=new JLabel(" Enter income Amount");
            incomeamountlabel.setBounds(20,130,170,50);
            incomeamountlabel.setForeground(Color.RED);
            frame.add(incomeamountlabel);

            JTextField incomeAmountfield=new JTextField();
            incomeAmountfield.setBounds(170,140,100,30);
            frame.add(incomeAmountfield);

            JButton savebutton=new JButton("Save");
            savebutton.setBounds(180,200,80,40);
            frame.add(savebutton);

            //to click on the save button
            savebutton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String insert = "insert into expensetb(incomeamount,expensetype,expenseamount) values(?,?,?)";
                    try {
                        PreparedStatement ps= null;
                         ps= con.prepareStatement(insert);
                        ps.setInt(1, Integer.parseInt(incomeAmountfield.getText()));
                        ps.setString(2,expensetypefield.getText());
                        ps.setInt(3, Integer.parseInt(expenseAmountfield.getText()));
                        ps.executeUpdate();
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }

                }
            });




            frame.setSize(500,400);
            frame.setLayout(null);
            frame.setVisible(true);
            //to insert the data into table

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}