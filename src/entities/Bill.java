package entities;
public class Bill {
	
    public char gender;
    public int beer;
    public int softDrink;
    public int barbecue;
    public double ticket = 0;
    public double cover = 0;
    
    public double getTicketPrice() {
        if (gender == 'M') {
            ticket = 10;
        } else if (gender == 'F') {
            ticket = 8;
        }
        return ticket;
    }
    
    public double getBeerCost() {
        return beer * 5;
    }
    
    public double getSoftDrinkCost() {
        return softDrink * 3;
    }
    
    public double getBarbecueCost() {
        return barbecue * 7;
    }
    
    public double getFeedingCost() {
        return getBeerCost() + getSoftDrinkCost() + getBarbecueCost();
    }
    
    public double getCoverCharge() {
        if (getFeedingCost() < 30) {
            cover += 4;
        }
        return cover;
    }
    
    public double getTotalCost() {
        return getFeedingCost() + getCoverCharge() + getTicketPrice();
    }
}
