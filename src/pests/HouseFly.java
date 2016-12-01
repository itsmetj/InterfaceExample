/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pests;

/**
 *
 * @author Tanaka
 */
public class HouseFly implements IPest{

    @Override
    public void beAnnoying() {
        
        System.out.println("A fly appears and starts buzzing around your head.");
        System.out.println("The fly proceeds to land on the bread next to your soup.");
        System.out.println("You grimace, then mumble angrily as you shoo the fly away.");
    }
    
    
}
