//package com.company;
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//
//public class GUI{
//    public static void main(String args[]){
//        JLabel label = new JLabel("Input: ");
//        JFrame frame = new JFrame("My First GUI");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(300,300);
//        JButton button = new JButton("Press");
//        frame.getContentPane().add(button); // Adds Button to content pane of frame
//        frame.setVisible(true);
//    }
//}

package com.company;
import javax.swing.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class GUI extends JFrame {
    private JTextField wordField;
    private JTextArea resultArea;

    public GUI() {

        setTitle("Конвертер слов");
        setSize(400, 200);

        JPanel panel = new JPanel();
        JLabel wordLabel = new JLabel("Введите слово:");
        wordField = new JTextField( 30);

        JLabel resultLabel = new JLabel("Результат:");
        resultArea = new JTextArea(3, 30);
        resultArea.setEditable(false);

        JButton convertButton = new JButton("Конвертировать");
        convertButton.addActionListener(e -> {
            String word = wordField.getText();
            String reversedWord = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reversedWord += word.substring(i, i + 1);
            }
            resultArea.setText(reversedWord);
        });


        panel.add(wordLabel);
        panel.add(wordField);
        panel.add(convertButton);
        panel.add(resultLabel);
        panel.add(resultArea);

        add(panel);
        setVisible(true);
    }
}



