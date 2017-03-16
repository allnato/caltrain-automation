/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.introos.dto;

import edu.introos.services.RobotNameGenerator;

/**
 *
 * @author Allendale
 */
public class Robot {
    private String ROBOT_NAME;
    private String ROBOT_STATUS; // Stasuses: 'WAITING' & 'ONBOARD'
    
    public Robot(){
        // GENERATE RANDOM NAME
        RobotNameGenerator nameGenerator = new RobotNameGenerator();
        this.ROBOT_NAME = nameGenerator.generateName();
        this.ROBOT_STATUS = "WAITING";
    }
    
    
}
