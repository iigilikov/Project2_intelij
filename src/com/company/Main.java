package com.company;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Создание экземпляра класса GUI
        GUI gui = new GUI();

        // Установка действия по закрытию окна
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

