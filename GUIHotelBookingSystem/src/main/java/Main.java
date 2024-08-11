import com.mongodb.client.MongoClients;
import org.bson.Document;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        JFrame frame= new JFrame("Hotel Booking System");
        JLabel titlelabel =new JLabel("Hotel Booking Form");
        titlelabel.setBounds(300,10,150,70);
        frame.add(titlelabel);


        JLabel fnamelabel=new JLabel("First Name");
        fnamelabel.setBounds(20,90,150,50);
        fnamelabel.setForeground(Color.BLUE);
        frame.add(fnamelabel);

        JTextField fnamefield=new JTextField();
        fnamefield.setBounds(160,100,170,30);
        frame.add(fnamefield);

        JLabel lnamelabel=new JLabel("Last Name");
        lnamelabel.setBounds(380,90,150,50);
        lnamelabel.setForeground(Color.BLUE);
        frame.add(lnamelabel);

        JTextField lnamefield=new JTextField();
        lnamefield.setBounds(510,100,170,30);
        frame.add(lnamefield);


        JLabel doblabel=new JLabel("Date Of Birth");
        doblabel.setBounds(20,140,150,50);
        doblabel.setForeground(Color.BLUE);
        frame.add(doblabel);

        JTextField dobfield=new JTextField();
        dobfield.setBounds(160,150,170,30);
        frame.add(dobfield);

        JLabel genderlabel=new JLabel("Gender");
        genderlabel.setBounds(380,140,150,50);
        genderlabel.setForeground(Color.BLUE);
        frame.add(genderlabel);
        String[] options ={"Male","Female","Other"};
        JComboBox comboBox=new JComboBox(options);
        comboBox.setBounds(510,150,170,30);
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

        JLabel secondmobilenolabel=new JLabel("Alternate No");
        secondmobilenolabel.setBounds(380,180,150,50);
        secondmobilenolabel.setForeground(Color.BLUE);
        frame.add(secondmobilenolabel);

        JTextField secondmobilenofield=new JTextField();
        secondmobilenofield.setBounds(510,190,170,30);
        frame.add(secondmobilenofield);

        JLabel emailidlabel=new JLabel("Email id");
        emailidlabel.setBounds(20,220,150,50);
        emailidlabel.setForeground(Color.BLUE);
        frame.add(emailidlabel);

        JTextField emailidfield=new JTextField();
        emailidfield.setBounds(160,230,170,30);
        frame.add(emailidfield);

        JLabel adharlabel=new JLabel("Aadhar No");
        adharlabel.setBounds(380,220,150,50);
        adharlabel.setForeground(Color.BLUE);
        frame.add(adharlabel);

        JTextField adharfield=new JTextField();
        adharfield.setBounds(510,230,170,30);
        frame.add(adharfield);

        JLabel addresslabel=new JLabel("Enter Address");
        addresslabel.setBounds(20,260,150,50);
        addresslabel.setForeground(Color.BLUE);
        frame.add(addresslabel);

        JTextField addressfield=new JTextField();
        addressfield.setBounds(160,270,170,30);
        frame.add(addressfield);

        JLabel Citylabel=new JLabel(" Enter City");
        Citylabel.setBounds(380,260,150,50);
        Citylabel.setForeground(Color.BLUE);
        frame.add(Citylabel);

        JTextField Cityfield=new JTextField();
        Cityfield.setBounds(510,268,170,30);
        frame.add(Cityfield);

        JLabel pinlabel=new JLabel("Pincode");
        pinlabel.setBounds(20,310,150,50);
        pinlabel.setForeground(Color.BLUE);
        frame.add(pinlabel);

        JTextField pinfield=new JTextField();
        pinfield.setBounds(160,320,170,30);
        frame.add(pinfield);

        JLabel statelabel=new JLabel(" Enter State");
        statelabel.setBounds(380,310,150,50);
        statelabel.setForeground(Color.BLUE);
        frame.add(statelabel);

        JTextField statefield=new JTextField();
        statefield.setBounds(510,320,170,30);
        frame.add(statefield);

        JLabel checkinlabel=new JLabel("Checkin Date");
        checkinlabel.setBounds(20,350,150,50);
        checkinlabel.setForeground(Color.BLUE);
        frame.add(checkinlabel);

        JTextField checkinfield=new JTextField();
        checkinfield.setBounds(160,360,170,30);
        frame.add(checkinfield);

        JLabel checkoutlabel=new JLabel("CheckOut Date");
        checkoutlabel.setBounds(380,350,150,50);
        checkoutlabel.setForeground(Color.BLUE);
        frame.add(checkoutlabel);

        JTextField checkoutfield=new JTextField();
        checkoutfield.setBounds(510,360,170,30);
        frame.add(checkoutfield);

        JLabel roomtypelabel=new JLabel("Room Type");
        roomtypelabel.setBounds(20,400,150,50);
        roomtypelabel.setForeground(Color.BLUE);
        frame.add(roomtypelabel);

        String[] room ={"AC","NON-AC"};
        JComboBox RoomBox=new JComboBox(room);
        RoomBox.setBounds(160,410,170,30);
        frame.add(RoomBox);

        JLabel roompreferencelabel=new JLabel("Room Preference");
        roompreferencelabel.setBounds(380,400,150,50);
        roompreferencelabel.setForeground(Color.BLUE);
        frame.add(roompreferencelabel);

        String[] roompref ={"Mountain View","Lake Vew","City View"};
        JComboBox roomprefBox=new JComboBox(roompref);
        roomprefBox.setBounds(510,410,170,30);
        frame.add(roomprefBox);

        JLabel noOfAdultlabel=new JLabel("No Of Adults");
        noOfAdultlabel.setBounds(20,450,150,50);
        noOfAdultlabel.setForeground(Color.BLUE);
        frame.add(noOfAdultlabel);

        JTextField noOfAdultfield=new JTextField();
        noOfAdultfield.setBounds(160,460,170,30);
        frame.add(noOfAdultfield);

        JLabel noOfchildlabel=new JLabel("No Of Childrens");
        noOfchildlabel.setBounds(380,450,150,50);
        noOfchildlabel.setForeground(Color.BLUE);
        frame.add(noOfchildlabel);

        JTextField noOfchildfield=new JTextField();
        noOfchildfield.setBounds(510,460,170,30);
        frame.add(noOfchildfield);

        JLabel meallabel=new JLabel("Meal");
        meallabel.setBounds(20,500,150,50);
        meallabel.setForeground(Color.BLUE);
        frame.add(meallabel);
        String[]  mealh ={"YES","NO"};
        JComboBox comboBox1 = new JComboBox(mealh);
        comboBox1.setBounds(160,510,170,30);
        frame.add(comboBox1);




        // JTextField roomtypefield=new JTextField();
        // roomtypefield.setBounds(160,420,170,30);
        // frame.add(roomtypefield);
//        JCheckBox a = new JCheckBox("AC");
//        JCheckBox b = new JCheckBox("NON-AC");
//        a.setBounds(160,420,50,30);
//        b.setBounds(220,420,80,30);
//        frame.add(a);
//        frame.add(b);




        JButton restartbutton=new JButton("RESTART");
        restartbutton.setBounds(400,590,100,40);
        frame.add(restartbutton);

        JButton savebutton=new JButton("SUBMIT");
        savebutton.setBounds(260,590,100,40);
        frame.add(savebutton);


        savebutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                var client = MongoClients.create("mongodb://localhost:27017/");
                var database = client.getDatabase("hotelbookingForm");
                database.createCollection("HotelbookingCollection");
                var HotelbookingCollection =database.getCollection("HotelbookingCollection");
                var bookingDocument = new Document();
                String a =(String) comboBox.getItemAt(comboBox.getSelectedIndex());
                String b =(String) RoomBox.getItemAt(RoomBox.getSelectedIndex());
                String c =(String) roomprefBox.getItemAt(roomprefBox.getSelectedIndex());
                String d =(String) comboBox1.getItemAt(comboBox1.getSelectedIndex());

                Random random = new Random();
                bookingDocument.append("bookingID",random.nextInt(999999));
                bookingDocument.append("FirstName",fnamefield.getText());
                bookingDocument.append("LastName",lnamefield.getText());
                bookingDocument.append("DateOfBirth",dobfield.getText());
                bookingDocument.append("Gender",a);
                bookingDocument.append("MobileNo",mobilenofield.getText());
                bookingDocument.append("AlternateNo",secondmobilenofield.getText());
                bookingDocument.append("EmailId",emailidfield.getText());
                bookingDocument.append("AadhaarNo",adharfield.getText());
                bookingDocument.append("Address",addressfield.getText());
                bookingDocument.append("City",Cityfield.getText());
                bookingDocument.append("PinCode",pinfield.getText());
                bookingDocument.append("State",statefield.getText());
                bookingDocument.append("CheckinDate",checkinfield.getText());
                bookingDocument.append("CheckOutDate",checkoutfield.getText());
                bookingDocument.append("RoomType",b);
                bookingDocument.append("RoomPreference",c);
                bookingDocument.append("NoOfAdult",noOfAdultfield.getText());
                bookingDocument.append("NoOfChildrens",noOfchildfield.getText());
                bookingDocument.append("Meal",d);
                HotelbookingCollection.insertOne(bookingDocument);

            }

        });
        restartbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fnamefield.setText("");
                lnamefield.setText("");
                dobfield.setText("");
                mobilenofield.setText("");
                secondmobilenofield.setText("");
                emailidfield.setText("");
                adharfield.setText("");
                addressfield.setText("");
                Cityfield.setText("");
                pinfield.setText("");
                statefield.setText("");
                checkinfield.setText("");
                checkoutfield.setText("");
                noOfAdultfield.setText("");
                noOfchildfield.setText("");

            }
        });
























        frame.setSize(800,770);
        frame.setLayout(null);
        frame.setVisible(true);



    }
}