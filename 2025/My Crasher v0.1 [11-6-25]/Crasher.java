package MyFrame;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.*;

public class Crasher extends JFrame {

    Random RDM = new Random();

    Crasher() {

        ArrayList<String> texts = new ArrayList<>();
        texts.add("67");
        texts.add("THIX THEVEN");

        String textLabels = texts.get(RDM.nextInt(0, texts.size()));

        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setSize(400, 400);
        this.setResizable(false);
        this.setVisible(true);
        this.setTitle("");

        /*
        * - IMPORTANT NOTE -
        * I don't know Text/Font yet so learn it.
        * Hopefully this note will be deleted
         */

        // Fonts
        JLabel text = new JLabel(textLabels,  JLabel.CENTER);
        text.setFont(new Font("Dialog", Font.BOLD, 50));
        text.setForeground(Color.WHITE);
        // Fonts: Serif, SansSerif, Monospaced, Dialog(Default), DialogInput

        // Text Output
        this.add(text, BorderLayout.CENTER);

        ImageIcon icon = new ImageIcon("watch.png");
        this.setIconImage(icon.getImage());

        setter(RDM);

    }
    public void setter(Random RDM) {

        while (true) {

            // Random Vars
            int r = RDM.nextInt(0, 255);
            int g = RDM.nextInt(0, 255);
            int b = RDM.nextInt(0, 255);

            int x = RDM.nextInt(0, 1060);
            int y = RDM.nextInt(0, 520);

            // Sets Random Color
            this.getContentPane().setBackground(new Color(r, g, b));
            r = RDM.nextInt(0, 255);
            g = RDM.nextInt(0, 255);
            b = RDM.nextInt(0, 255);

            // Sets Random Location
            this.setLocation(x, y);
            x = RDM.nextInt(0, 1060);
            y = RDM.nextInt(0, 520);

            // Output In Console
            System.out.println("A Window was Opened At: "+"\nX: "+x+" :Y: "+y);
            System.out.println("It's Colors Are: "+"\nRed: "+r+", Green: "+g+", Blue: "+b);

            // New Crasher
            new Crasher();
        }
    }
}
