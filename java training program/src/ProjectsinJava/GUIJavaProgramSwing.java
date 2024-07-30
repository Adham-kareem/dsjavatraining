package ProjectsinJava;

import javax.swing.*;
 import java.awt.event.ActionEvent;
 import java.awt.event.ActionListener;


 public class GUIJavaProgramSwing {
    public static void main(String[] args) {
        //to create a frame using swing in java
        JFrame frame = new JFrame("BMI Calculator");

        //create UI components for BMI calculation
        JLabel hieghtLabel =new JLabel("Enter your hieght(m):");
        JLabel wieghtLabel =new JLabel("enter your wieght(kg):");
        JLabel bmiLabel =new JLabel();

        JTextField wieghtField=new JTextField();
        JTextField hieghtField=new JTextField();

        JButton bmiButton = new JButton("Calculate BMI");
        //to set the size and position of UI components
        hieghtLabel.setBounds(30,30,150,40);
        hieghtField.setBounds(170,30,50,40);
        wieghtLabel.setBounds(30,80,150,40);
        wieghtField.setBounds(170,80,50,40);
        bmiButton.setBounds(30,130,120,40);
        bmiLabel.setBounds(170,130,100,40);



        //to attach the label to frame
        frame.add(hieghtLabel);
        frame.add(hieghtField);
        frame.add(wieghtLabel);
        frame.add(wieghtField);

        frame.add(bmiButton);
        frame.add(bmiLabel);




        //to build the default layout
        frame.setLayout(null);
        //to set the size for frame
        frame.setSize(300,250);
        //to visible the frame on screen
        frame.setVisible(true);


        //to click on the bmi calculate button
        bmiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //to apply the bmi formula
                float wieght = Float.parseFloat(wieghtField.getText().toString());
                float hieght = Float.parseFloat(hieghtField.getText().toString());

                float output = wieght/(hieght * hieght);
                //18.5 < under wieght,18.5 to 24.9 = normal,24.9 to 29.9 = overwieght,29> obesity
                if(output<18.5){
                    bmiLabel.setText("iam underwieght");
                }else if(output>18.5 && output<24.9){
                    bmiLabel.setText("iam normal");
                }else if(output>24.9 && output<29.9){
                    bmiLabel.setText("iam overwieght");
                }else{
                    bmiLabel.setText("iam obesity");
                }
            }
        });

    }
}
