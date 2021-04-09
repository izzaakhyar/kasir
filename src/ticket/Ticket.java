/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticket;

/**
 *
 * @author 4d3h3
 */
public interface Ticket {
    
    /**
     * Ambil nama tiket tersebut
     *
     * @return String
     */
    String getName();
    
    /**
     * Ambil harga tiket tersebut
     *
     * @return int
     */
    int getPrice();
    
}
