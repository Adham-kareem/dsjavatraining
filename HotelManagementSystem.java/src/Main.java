import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String url ="jdbc:mysql://localhost:3306/hoteldb";
        String user ="root";
        String password ="";


        try {
            Connection con = DriverManager.getConnection(url,user,password);
            System.out.println("db connected");
            JFrame frame=new JFrame("Hotel Management System");
            JLabel titlelabel=new JLabel("Hotel Management");
            titlelabel.setBounds(195,20,150,50);
            titlelabel.setForeground(Color.RED);
            frame.add(titlelabel);

            JLabel namelabel=new JLabel("Enter  Name");
            namelabel.setBounds(20,60,150,50);
            namelabel.setForeground(Color.BLUE);
            frame.add(namelabel);

            JTextField namefield=new JTextField();
            namefield.setBounds(160,70,170,30);
            frame.add(namefield);


            JLabel agelabel=new JLabel("Enter the Age");
            agelabel.setBounds(20,100,150,50);
            agelabel.setForeground(Color.BLUE);
            frame.add(agelabel);

            JTextField agefield=new JTextField();
            agefield.setBounds(160,110,170,30);
            frame.add(agefield);

             JLabel genderlabel=new JLabel("Gender");
             genderlabel.setBounds(20,140,150,50);
             genderlabel.setForeground(Color.BLUE);
             frame.add(genderlabel);
             String[] options ={"Male","Female","Other"};
             JComboBox comboBox=new JComboBox(options);
             comboBox.setBounds(160,150,170,30);
             frame.add(comboBox);


           // JTextField genderfield=new JTextField();
            //genderfield.setBounds(160,150,170,30);
            //frame.add(genderfield);

            JLabel mobilenolabel=new JLabel("Mobile No");
            mobilenolabel.setBounds(20,180,150,50);
            mobilenolabel.setForeground(Color.BLUE);
            frame.add(mobilenolabel);

            JTextField mobilenofield=new JTextField();
            mobilenofield.setBounds(160,190,170,30);
            frame.add(mobilenofield);

            JLabel emailidlabel=new JLabel("Email id");
            emailidlabel.setBounds(20,220,150,50);
            emailidlabel.setForeground(Color.BLUE);
            frame.add(emailidlabel);

            JTextField emailidfield=new JTextField();
            emailidfield.setBounds(160,230,170,30);
            frame.add(emailidfield);

            JLabel addresslabel=new JLabel("Enter Address");
            addresslabel.setBounds(20,260,150,50);
            addresslabel.setForeground(Color.BLUE);
            frame.add(addresslabel);

            JTextField addressfield=new JTextField();
            addressfield.setBounds(160,270,170,30);
            frame.add(addressfield);

            JLabel checkinlabel=new JLabel("Checkin Date");
            checkinlabel.setBounds(20,310,150,50);
            checkinlabel.setForeground(Color.BLUE);
            frame.add(checkinlabel);

            JTextField checkinfield=new JTextField();
            checkinfield.setBounds(160,320,170,30);
            frame.add(checkinfield);

            JLabel checkoutlabel=new JLabel("CheckOut Date");
            checkoutlabel.setBounds(20,360,150,50);
            checkoutlabel.setForeground(Color.BLUE);
            frame.add(checkoutlabel);

            JTextField checkoutfield=new JTextField();
            checkoutfield.setBounds(160,370,170,30);
            frame.add(checkoutfield);

            JLabel roomtypelabel=new JLabel("Room Type");
            roomtypelabel.setBounds(20,410,150,50);
            roomtypelabel.setForeground(Color.BLUE);
            frame.add(roomtypelabel);

           // JTextField roomtypefield=new JTextField();
           // roomtypefield.setBounds(160,420,170,30);
           // frame.add(roomtypefield);
            JCheckBox a = new JCheckBox("AC");
            JCheckBox b = new JCheckBox("NON-AC");
            a.setBounds(160,420,50,30);
            b.setBounds(220,420,80,30);
            frame.add(a);
            frame.add(b);



            JLabel roomnolabel=new JLabel("Room No");
            roomnolabel.setBounds(20,460,150,50);
            roomnolabel.setForeground(Color.BLUE);
            frame.add(roomnolabel);

            JTextField roomnofield=new JTextField();
            roomnofield.setBounds(160,470,170,30);
            frame.add(roomnofield);

            JLabel amountlabel=new JLabel("Amount");
            amountlabel.setBounds(20,510,150,50);
            amountlabel.setForeground(Color.BLUE);
            frame.add(amountlabel);

            JTextField amountfield=new JTextField();
            amountfield.setBounds(160,520,170,30);
            frame.add(amountfield);


            JButton savebutton=new JButton("SAVE");
            savebutton.setBounds(180,560,70,40);
            frame.add(savebutton);

            savebutton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String insert = "insert into hoteltb(Name,age,gender,mobileno,emailid,address,checkin,checkout,roomtype,roomno,amount) values(?,?,?,?,?,?,?,?,?,?,?)";

                    try {
                        PreparedStatement ps =null;
                        ps= con.prepareStatement(insert);
                        ps.setString(1,namefield.getText());
                        ps.setString(2,agefield.getText());
//                      ps.setString(3,genderfield.getText());
                        String data = (String) comboBox.getItemAt(comboBox.getSelectedIndex());
                        ps.setString(3,data);
                        ps.setString(4,mobilenofield.getText());
                        ps.setString(5,emailidfield.getText());
                        ps.setString(6,addressfield.getText());
                        ps.setString(7,checkinfield.getText());
                        ps.setString(8,checkoutfield.getText());
                       // ps.setString(9,);
                        String str = "";
                        if(a.isSelected()){
                            str = "AC";
                        }else{
                            str ="NON_AC";
                        }
                        ps.setString(9,str);
                        ps.setInt(10, Integer.parseInt(roomnofield.getText()));
                        ps.setInt(11, Integer.parseInt(amountfield.getText()));
                        ps.executeUpdate();

                        namefield.setText("");
                        agefield.setText("");
                        mobilenofield.setText("");
                        emailidfield.setText("");
                        addressfield.setText("");
                        checkinfield.setText("");
                        checkoutfield.setText("");
                        roomnofield.setText("");
                        amountfield.setText("");

                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            });










            frame.setSize(550,700);
            frame.setLayout(null);
            frame.setVisible(true);








        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}