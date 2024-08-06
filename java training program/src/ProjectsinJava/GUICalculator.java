package ProjectsinJava;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUICalculator {




    public static void main(String[] args) {
        JFrame frame=new JFrame("Calculator");
        JButton one =new JButton("1");
        JButton two =new JButton("2");
        JButton three =new JButton("3");
        JButton four =new JButton("4");
        JButton five=new JButton("5");
        JButton six=new JButton("6");
        JButton seven =new JButton("7");
        JButton eight=new JButton("8");
        JButton nine=new JButton("9");
        JButton zero =new JButton("0");
        JButton plus=new JButton("+");
        JButton minus=new JButton("-");
        JButton multiply=new JButton("*");
        JButton divide =new JButton("/");
        JButton dot =new JButton(".");
        JButton equals =new JButton("=");
        JButton clear =new JButton("Cr");


        JTextField value = new JTextField();

        one.setBounds(10,200,60,50);
        two.setBounds(80,200,60,50);
        three.setBounds(150,200,60,50);
        four.setBounds(10,260,60,50);
        five.setBounds(80,260,60,50);
        six.setBounds(150,260,60,50);
        seven.setBounds(10,320,60,50);
        eight.setBounds(80,320,60,50);
        nine.setBounds(150,320,60,50);
        zero.setBounds(10,380,60,50);
        dot.setBounds(80,380,60,50);
        equals.setBounds(150,380,60,50);
        clear.setBounds(10,440,268,30);
        plus.setBounds(220,200,60,50);
        minus.setBounds(220,260,60,50);
        multiply.setBounds(220,320,60,50);
        divide.setBounds(220,380,60,50);




        frame.add(one);
        frame.add(two);
        frame.add(three);
        frame.add(four);
        frame.add(five);
        frame.add(six);
        frame.add(seven);
        frame.add(eight);
        frame.add(nine);
        frame.add(zero);
        frame.add(plus);
        frame.add(minus);
        frame.add(multiply);
        frame.add(divide);
        frame.add(dot);
        frame.add(equals);
        frame.add(clear);



        frame.setLayout(null);
        frame.setSize(310,520);
        frame.setVisible(true);


        ActionListener numberListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        };

    }
}




