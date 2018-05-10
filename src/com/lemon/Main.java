package com.lemon;

import javax.swing.*;

public class Main {
    JFrame mainFrame;
    JButton testButton;


    public static void main(String[] args) {
        Menu meme = new Menu();
        meme.stuffMaker();
        //	stuffMaker();

    }

    public static void levelLauncher() {
        BrickBreak BB = new BrickBreak();

        System.out.println("test");
        BB.initialise();


    }


}
