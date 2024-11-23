class SelectToppingPizza extends Pizza {
    private boolean pepperoni = false;
    private boolean cheese = false;
    private boolean potato = false;
    private boolean bulgogi = false;
    
    public SelectToppingPizza(int size) {
        super(size);
    }
    
    public void addTopping(String toppingName) {
        switch (toppingName) {
            case "Pepperoni":
                pepperoni = true; break;                

            case "Cheese":
                cheese = true; break;                

            case "Potato":
                potato = true; break;                

            case "Bulgogi":
                bulgogi = true;  break;                

            default:
                System.out.println("Invalid topping\n");
                break;
        }
    }
    public String getName() {
        String name = super.getName();
        if (bulgogi) { name = "불고기 " + name; }
        if (potato) { name = "감자 " + name; }
        if (cheese) { name = "치즈 " + name; }
        if (pepperoni) { name = "페퍼로니 " + name; }
        return name;
    }

    public int getPrice() {
        int price = super.getPrice();
        if (bulgogi) price += ToppingsPrice.BULGOGI;
        if (potato) price += ToppingsPrice.POTATO;
        if (cheese) price += ToppingsPrice.CHEESE;
        if (pepperoni) price += ToppingsPrice.PEPPERONI;
        return price;
    }
}



