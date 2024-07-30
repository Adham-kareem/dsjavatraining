package ProjectsinJava;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUICurrencyConverter {
    public static void main(String[] args) {
        JFrame frame = new JFrame("CurrencyConverter");

        JLabel DollarLabel =new JLabel("enter Dollar:");
        JLabel RupeesLabel =new JLabel("enter Rupees:");
        JLabel ConvertLabel= new JLabel();

        JTextField DollarField=new JTextField();
        JTextField RupeesField=new JTextField();

        JButton ConvertButton =new JButton("Convert");

        DollarLabel.setBounds(30,10,150,140);
        DollarField.setBounds(110,73,50,20);
        RupeesLabel.setBounds(30,40,150,140);
        RupeesField.setBounds(110,100,50,20);
        ConvertButton.setBounds(30,130,90,40);
        ConvertLabel.setBounds(140,120,300,60);





        frame.add(DollarLabel);
        frame.add(DollarField);
        frame.add(RupeesLabel);
        frame.add(RupeesField);
        frame.add(ConvertButton);
        frame.add(ConvertLabel);






        frame.setLayout(null);
        frame.setSize(400,250);
        frame.setVisible(true);


        ConvertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               // Float Rupees= Float.valueOf(RupeesField.getText().toString());
               // Float Dollar= Float.valueOf(DollarField.getText().toString());
               if(!RupeesField.getText().isEmpty() && DollarField.getText().isEmpty()){
                    Float Rupees= Float.valueOf(RupeesField.getText().toString());
                    float RupeesToDollar=(float) (Rupees/83.73);
                    ConvertLabel.setText("In Dollar:"+String.valueOf(RupeesToDollar));

               }else if(RupeesField.getText().isEmpty() && !DollarField.getText().isEmpty()){
                     Float Dollar= Float.valueOf(DollarField.getText().toString());
                     float DollartToRupees=(float) (Dollar*83.73);
                     ConvertLabel.setText("In Rupees:"+String.valueOf(DollartToRupees));

               } else if (RupeesField.getText().isEmpty() && DollarField.getText().isEmpty()) {
                     ConvertLabel.setText("Enter atleast one amount to convert");
               }
               else {
                   Float Rupees= Float.valueOf(RupeesField.getText().toString());
                   float RupeesToDollar=(float) (Rupees/83.73);
                   Float Dollar= Float.valueOf(DollarField.getText().toString());
                   float DollartToRupees=(float) (Dollar*83.73);
                   ConvertLabel.setText("In Rs:"+String.valueOf(DollartToRupees) + " In USD:"+String.valueOf(RupeesToDollar));



               }


            }
        });
    }
}
