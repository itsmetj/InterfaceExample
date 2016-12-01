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
public class Telemarketer implements IPest{
        
    @Override
    public void beAnnoying() {
        
        System.out.println("Suddenly, your phone begins to ring.");
        System.out.println("You pick up the phone call and are greeted with a robotic voice.");
        System.out.println("\"Have you recently been involved in an accid-\"");
        System.out.println("You hang up the phone in frustration.");
    }
}
