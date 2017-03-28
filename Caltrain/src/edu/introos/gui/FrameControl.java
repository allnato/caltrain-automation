/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.introos.gui;

import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author Allendale
 */
public class FrameControl extends JFrame {
    public FrameControl(){
        this.setTitle("CalTrain Control Panel");
        this.setSize(400,600);
        this.setMinimumSize(new Dimension(400,600));
        this.setMaximumSize(new Dimension(400,600));
        this.setLocation(10, 10);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.add(new ControlPanel());
    }
}