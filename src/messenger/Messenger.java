/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messenger;
import server.server;
import client.client;
/**
 *
 * @author Hkobir
 */
public class Messenger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new server().setVisible(true);
        new client().setVisible(true);
    }
    
}
