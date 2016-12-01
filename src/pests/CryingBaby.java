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
public class CryingBaby implements IPest{

    @Override
    public void beAnnoying() {
        System.out.println("A baby begins to cry in the room next door. You notice the host is shocked, "
                + "as it turns out, none of the guests or the host have baby.");
    }
    
}
