/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticket;

import java.util.Scanner;

/**
 *
 * @author 4d3h3
 */
public class Main {
    
    public static void main(String[] args) {
        Ticket[] tickets = {
            new Economy("Ekonomi"),
            new Business("Bisnis"),
            new Executive("Eksekutif")
        };
        
        start(tickets);
    }
    
    protected static void start(Ticket[] tickets) {
        boolean stop = false;
        
        while (!stop) {
            printTicketList(tickets);

            Scanner input = new Scanner(System.in);
            int ticketIndex, quantity, price;
            String again;

            System.out.println("Masukkan Pesanan Anda");
            System.out.print("Kelas = ");

            ticketIndex = input.nextInt();
            
            if (tickets.length < ticketIndex) {
                System.out.println("=================");
                
                System.out.println("Tolong masukkan nomor tiket sesuai list!");
                
                continue;
            }

            System.out.print("Jumlah Penumpang = ");

            quantity = input.nextInt();

            int total = tickets[ticketIndex - 1].getPrice() * quantity;

            System.out.println("Total Bayar = " + total);
            
            System.out.println("=================");
            
            boolean stopAsk = false;
            
            while (!stopAsk) {
                System.out.println("Pesan Tiket Lagi? (Y/N) ");

                again = input.next();

                if (!again.toLowerCase().equals("y") && !again.toLowerCase().equals("n")) {
                    continue;
                }
                
                stopAsk = true;
                
                if (again.toLowerCase().equals("n")) {
                    stop = true;
                }
            }
        }
    }
    
    protected static void printTicketList(Ticket[] tickets) {
        System.out.println("=================");
        System.out.println("List Tiket Kereta");
        
        for (int i = 0; i < tickets.length; i++) {
            System.out.println((i + 1) + ". " + tickets[i].getName());
        }
        
        System.out.println("=================");
    }
    
}
