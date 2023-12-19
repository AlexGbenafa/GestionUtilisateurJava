/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Models.User;

/**
 *
 * @author alexk
 */
public class Test {
        public static void main(String[] args){
        User u = new User(1,"Xela", "GTR", "Dakrai", "123456", "765718965");
        //User newU = new User(1,"Xela", "Gbenafa", "Nosferap", "123456", "776163253");
        TraitementUser traitement = new TraitementUser();
        //traitement.addUser(u);
        //traitement.updateUser(newU);
        traitement.deleteUser(2);
    }
    
}
