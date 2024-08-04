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
        String url ="jdbc:mysql://localhost:3306/reserveformdb";
        String user = "root";
        String password ="";

        try {
            Connection con = DriverManager.getConnection(url,user,password);
            System.out.println("db connected");
            JFrame frame= new JFrame("Railway Form");
            JLabel titlelabel=new JLabel("Booking Form");
            titlelabel.setBounds(200,20,80,50);
            titlelabel.setForeground(Color.RED);
            frame.add(titlelabel);

            JLabel passengernamelabel=new JLabel("Enter your Name");
            passengernamelabel.setBounds(20,60,150,50);
            passengernamelabel.setForeground(Color.BLUE);
            frame.add(passengernamelabel);

            JTextField passengernamefield=new JTextField();
            passengernamefield.setBounds(160,70,170,30);
            frame.add(passengernamefield);


            JLabel genderlabel=new JLabel("Enter your Gender");
            genderlabel.setBounds(20,100,150,50);
            genderlabel.setForeground(Color.BLUE);
            frame.add(genderlabel);

            JTextField genderfield=new JTextField();
            genderfield.setBounds(160,110,170,30);
            frame.add(genderfield);

            JLabel fromcitylabel=new JLabel("From City");
            fromcitylabel.setBounds(20,140,150,50);
            fromcitylabel.setForeground(Color.BLUE);
            frame.add(fromcitylabel);

            JTextField fromcityfield=new JTextField();
            fromcityfield.setBounds(160,150,170,30);
            frame.add(fromcityfield);

            JLabel tocitylabel=new JLabel("To City");
            tocitylabel.setBounds(20,180,150,50);
            tocitylabel.setForeground(Color.BLUE);
            frame.add(tocitylabel);

            JTextField tocityfield=new JTextField();
            tocityfield.setBounds(160,190,170,30);
            frame.add(tocityfield);

            JLabel trainnamelabel=new JLabel("Train Name");
            trainnamelabel.setBounds(20,220,150,50);
            trainnamelabel.setForeground(Color.BLUE);
            frame.add(trainnamelabel);

            JTextField trainnamefield=new JTextField();
            trainnamefield.setBounds(160,230,170,30);
            frame.add(trainnamefield);

            JLabel datelabel=new JLabel("Enter Travel Date");
            datelabel.setBounds(20,260,150,50);
            datelabel.setForeground(Color.BLUE);
            frame.add(datelabel);

            JTextField datefield=new JTextField();
            datefield.setBounds(160,270,170,30);
            frame.add(datefield);

            JLabel seattypelabel=new JLabel("Enter The Seat Type");
            seattypelabel.setBounds(20,310,150,50);
            seattypelabel.setForeground(Color.BLUE);
            frame.add(seattypelabel);

            JTextField seattypefield=new JTextField();
            seattypefield.setBounds(160,320,170,30);
            frame.add(seattypefield);

            JButton submitbutton=new JButton("Submit");
            submitbutton.setBounds(160,390,140,30);
            frame.add(submitbutton);


            //to click on the submit button

            submitbutton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String insert = "insert into reservetb(passengername,gender,fromcity,tocity,trainname,date,seattype) values(?,?,?,?,?,?,?)";



                    try {
                        PreparedStatement ps = null;
                        ps= con.prepareStatement(insert);
                        ps.setString(1,passengernamefield.getText());
                        ps.setString(2,genderfield.getText());
                        ps.setString(3,fromcityfield.getText());
                        ps.setString(4,tocityfield.getText());
                        ps.setString(5,trainnamefield.getText());
                        ps.setString(6,datefield.getText());
                        ps.setString(7,seattypefield.getText());
                        ps.executeUpdate();
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }

                }
            });






















            frame.setSize(450,550);
            frame.setLayout(null);
            frame.setVisible(true);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}