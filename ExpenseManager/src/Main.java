import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Main {
    //pass the database url,username,password in string
    static String url = "jdbc:mysql://localhost:3306/expensedb";
    static String user = "root";
    static String password = "";
    static Connection con;
    static JTextField deleteField;
    static JTextField expensetypefield;
    static JTextField expenseAmountfield;
    static JTextField incomeAmountfield;

    public static void main(String[] args) {


        createExpenseCalculatorFrame();

    }

    private static void createExpenseCalculatorFrame() {
        try {
            con = DriverManager.getConnection(url, user, password);
            System.out.println("connected");
            //Design the java UI for expense Calculator
            JFrame frame = new JFrame("Adham Expenses");
            JLabel titlelabel = new JLabel("Expenses");
            titlelabel.setBounds(210, 20, 180, 50);
            titlelabel.setForeground(Color.BLUE);
            frame.add(titlelabel);

            JLabel expensetypelabel = new JLabel(" Enter Expenses Type");
            expensetypelabel.setBounds(20, 50, 150, 50);
            expensetypelabel.setForeground(Color.RED);
            frame.add(expensetypelabel);


            expensetypefield = new JTextField();
            expensetypefield.setBounds(170, 60, 100, 30);
            frame.add(expensetypefield);

            JLabel expenseamountlabel = new JLabel(" Enter Expenses Amount");
            expenseamountlabel.setBounds(20, 90, 170, 50);
            expenseamountlabel.setForeground(Color.RED);
            frame.add(expenseamountlabel);

            expenseAmountfield = new JTextField();
            expenseAmountfield.setBounds(170, 100, 100, 30);
            frame.add(expenseAmountfield);

            JLabel incomeamountlabel = new JLabel(" Enter income Amount");
            incomeamountlabel.setBounds(20, 130, 170, 50);
            incomeamountlabel.setForeground(Color.RED);
            frame.add(incomeamountlabel);

            incomeAmountfield = new JTextField();
            incomeAmountfield.setBounds(170, 140, 100, 30);
            frame.add(incomeAmountfield);

            JButton savebutton = new JButton("Save");
            savebutton.setBounds(250, 200, 80, 40);
            frame.add(savebutton);

            JButton deletebutton = new JButton("Delete");
            deletebutton.setBounds(150, 200, 80, 40);
            frame.add(deletebutton);

            deletebutton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(savebutton.isVisible()){
                        //to hide the insertion form
                        incomeamountlabel.setVisible(false);
                        incomeAmountfield.setVisible(false);
                        expenseamountlabel.setVisible(false);
                        expenseAmountfield.setVisible(false);
                        expensetypelabel.setVisible(false);
                        expensetypefield.setVisible(false);
                        savebutton.setVisible(false);
                        titlelabel.setText("Enter ID to Delete Expenses");

                        deleteField = new JTextField();
                        deleteField.setBounds(50,60,180,40);
                        frame.add(deleteField);

                    }
                    else {
                        String deleteQuery = "delete from expensetb where id = ?";
                        try {
                            PreparedStatement ps = con.prepareStatement(deleteQuery);
                            ps.setInt(1, Integer.parseInt(deleteField.getText()));
                            ps.executeUpdate();
                            JOptionPane.showMessageDialog(null,"Expense Deleted Successfully");
                            incomeamountlabel.setVisible(true);
                            incomeAmountfield.setVisible(true);
                            expenseamountlabel.setVisible(true);
                            expenseAmountfield.setVisible(true);
                            expensetypelabel.setVisible(true);
                            expensetypefield.setVisible(true);
                            savebutton.setVisible(true);
                            deleteField.setVisible(false);
                            titlelabel.setText("Expense Calculator");
                        } catch (SQLException ex) {
                            throw new RuntimeException(ex);
                        }
                    }

                }
            });

            JButton viewbutton = new JButton("View");
            viewbutton.setBounds(350, 200, 80, 40);
            frame.add(viewbutton);

            viewbutton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (savebutton.isVisible()){
                        //to hide insert form
                        incomeamountlabel.setVisible(false);
                        incomeAmountfield.setVisible(false);
                        expenseamountlabel.setVisible(false);
                        expenseAmountfield.setVisible(false);
                        expensetypelabel.setVisible(false);
                        expensetypefield.setVisible(false);
                        savebutton.setVisible(false);
                        titlelabel.setText("Enter ID to Update Expenses");

                        deleteField = new JTextField();
                        deleteField.setBounds(50,60,180,40);
                        frame.add(deleteField);

                    }else{
                        String deleteQuery="select * from expensetb where id = ?";
                        try {
                            PreparedStatement ps=con.prepareStatement(deleteQuery);
                            ps.setInt(1, Integer.parseInt(deleteField.getText()));
                            ResultSet rs =ps.executeQuery();
                            while (rs.next()){
                                System.out.println("ID:" + rs.getInt("id"));
                                System.out.println("Income amount:" + rs.getInt("incomeamount"));
                                System.out.println("Expense Type:" + rs.getString("expensetype"));
                                System.out.println("Expense Amount:" + rs.getInt("expenseamount"));
                                incomeAmountfield.setText(String.valueOf(rs.getInt("incomeamount")));
                                expenseAmountfield.setText(String.valueOf(rs.getInt("expensemount")));
                                expensetypefield.setText(rs.getString("expensetype"));

                                JButton updatebutton = new JButton("Update");
                                updatebutton.setBounds(400,200,80,40);
                                frame.add(updatebutton);
                                updatebutton.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        String updateQuery = "update expensetb set incomeamount =?,expensetype=?,expenseamount=? where id = ?";
                                        try {
                                            PreparedStatement ps=con.prepareStatement(updateQuery);
                                            ps.setInt(1, Integer.parseInt(incomeAmountfield.getText()));
                                            ps.setString(2,expensetypefield.getText());
                                            ps.setInt(3, Integer.parseInt(expenseAmountfield.getText()));
                                            ps.setInt(4,31);
                                            ps.executeUpdate();
                                        } catch (SQLException ex) {
                                            throw new RuntimeException(ex);
                                        }
                                    }
                                });

                            }
                            JOptionPane.showMessageDialog(null,"Record has been Deleted");
                            incomeamountlabel.setVisible(true);
                            incomeAmountfield.setVisible(true);
                            expenseamountlabel.setVisible(true);
                            expenseAmountfield.setVisible(true);
                            expensetypelabel.setVisible(true);
                            expensetypefield.setVisible(true);
                            savebutton.setVisible(true);
                            deleteField.setVisible(false);
                            titlelabel.setText("Expense Calculator");
                        } catch (SQLException ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                }
            });


            JButton clearbutton = new JButton("Clear");
            clearbutton.setBounds(50, 200, 80, 40);
            frame.add(clearbutton);
            clearbutton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    //to clear the form
                    clearForm();
                }
            });

            //to click on the save button
            savebutton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    //insert the data into database
                    insertexpenseindb();


                }
            });


            frame.setSize(500, 400);
            frame.setLayout(null);
            frame.setVisible(true);
            //to insert the data into table

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }


    private static void clearForm() {
        incomeAmountfield.setText("");
        expensetypefield.setText("");
        expenseAmountfield.setText("");
    }

    private static void insertexpenseindb() {
        String insert = "insert into expensetb(incomeamount,expensetype,expenseamount) values(?,?,?)";
        try {
            PreparedStatement ps = null;
            ps = con.prepareStatement(insert);
            ps.setInt(1, Integer.parseInt(incomeAmountfield.getText()));
            ps.setString(2, expensetypefield.getText());
            ps.setInt(3, Integer.parseInt(expenseAmountfield.getText()));
            ps.executeUpdate();


            //to clear the form after data submission
            clearForm();

            //to pass the data submission response to user
            JOptionPane.showMessageDialog(null, "Record has been added");

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}