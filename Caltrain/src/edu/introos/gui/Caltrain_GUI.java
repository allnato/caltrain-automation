/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.introos.gui;

import javax.swing.JFrame;

/**
 *
 * @author Allendale
 */

public class Caltrain_GUI {
    
    public static JFrame stationFrame;
    public static JFrame trainFrame;
    public static JFrame textFrame;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
        public void run() {
              stationFrame = new StartFrame();
//            textFrame = new TextFrame();
//            trainFrame = new TrainFrame();
//            stationFrame = new StationFrame();
            
            
        }
    });
    }
    
}
