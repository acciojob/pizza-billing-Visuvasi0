package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int cheese;
    private int toppings;
    private int bag;
    private boolean extraCheeseAdded;
    private boolean extraToppingsAdded;
    private boolean isTakeaway;
    private boolean isBillGenerated;

    public Pizza(Boolean isVeg)
    {
        this.isVeg = isVeg;
        
        extraCheeseAdded = false;
        extraToppingsAdded = false;
        isTakeaway = false;
        isBillGenerated = false;
        
        if(isVeg)
        {
            price = 300;
            cheese = 80;
            toppings = 70;
            bag = 20;
            bill += "Base Price Of The Pizza: " + price + "\n";
        }
        else
        {
            price = 400;
            cheese = 80;
            toppings = 120;
            bag = 20;
            bill += "Base Price Of The Pizza: " + price + "\n";
        }
    }

    public int getPrice()
    {
        return this.price;
    }

    public void addExtraCheese()
    {
        if(!extraCheeseAdded)
        {
            price+=cheese;
        }
    }

    public void addExtraToppings()
    {
        if(!extraToppingsAdded)
        {
            price+=toppings;
        }
    }

    public void addTakeaway()
    {
        if(!isTakeaway)
        {
            price+=bag;
        }
    }

    public String getBill()
    {
        if(!isBillGenerated)
        {
            if(extraCheeseAdded)
            {
                bill+="Extra Cheese Added: " + cheese + "\n";
            }
            if(extraToppingsAdded)
            {
                bill+="Extra Toppings Added: " + toppings + "\n";
            }
            if(isTakeaway)
            {
                bill+="Paperbag Added: " + bag + "\n";
            }
        }
        bill+="Total Price: " + price;
        return this.bill;
    }
}
