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
public class FaultyTV implements IPest{
    
    @Override
    public void beAnnoying()
    {
        System.out.println("The host turns on the television, moments later the picture fizzles out.");
        System.out.println("You volunteer to examine the issue, "
                + "\nproudly mentioning your extensive knowledge of television achitecture.");
    }
}
