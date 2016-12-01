/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceexample;

import java.util.*;
import pests.*;

/**
 *
 * @author Tanaka
 */
public class InterfaceExample {

    private static ArrayList<IPest> pestList = new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        initialise();
        
        System.out.println("You emerge from your vehicle, the host greets you.");
        System.out.println("You are then led into the host\'s home and join the other guests at the dinner table.");
        System.out.println("The chef brings the starter: Tomato soup accompanied by a warm, freshly baked baguette.");
        System.out.println();
        
        annoyingEvent();
        
        System.out.println("At that moment, all the lights in the room go out...");
        
    }
    
    private static void initialise()
    {
        pestList.add(new HouseFly());
        pestList.add(new Telemarketer());
        pestList.add(new FaultyTV());
    }
    
    private static void annoyingEvent()
    {
        Random rand = new Random();
        
        int randomEventIndex = rand.nextInt(pestList.size());
        
        IPest pestToUse = pestList.get(randomEventIndex);
        pestToUse.beAnnoying();
        System.out.println();
    }
}
