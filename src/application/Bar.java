package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Bill;

public class Bar {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        Bill bill = new Bill();
        
        System.out.print("Sexo: ");
        bill.gender = sc.next().charAt(0);
        
        System.out.print("Quantidade de cervejas: ");
        bill.beer = sc.nextInt();
        System.out.print("Quantidade de refrigerantes: ");
        bill.softDrink = sc.nextInt();
        System.out.print("Quantidade de espetinhos: ");
        bill.barbecue = sc.nextInt();

        double feedingCost = bill.getFeedingCost();
        double coverCharge = bill.getCoverCharge();
        double ticketPrice = bill.getTicketPrice();
        double totalCost = bill.getTotalCost();
        
        System.out.println("\nRELATÓRIO:");
        System.out.printf("Consumo = R$%.2f\n", feedingCost);
        if (coverCharge <= 0) {
            System.out.println("Isento de Couvert");
        } else {
            System.out.printf("Couvert = R$%.2f\n", coverCharge);
        }
        System.out.printf("Ingresso = R$%.2f\n", ticketPrice);
        System.out.println();
        System.out.printf("Valor a pagar = R$%.2f\n", totalCost);
        
        sc.close();
    }
}
