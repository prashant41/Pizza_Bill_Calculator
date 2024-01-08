public class Pizza {
    private boolean veg;
    private int price;

    private int extraCheese=100;

    private boolean isExtraCheezeAdded=false;
    private boolean isExtraToppingsAdded=false;
    private  boolean isOptedTakeAway=false;

    public int getExtraCheese() {
        return extraCheese;
    }

    public int getExtraToppings() {
        return extraToppings;
    }

    public int getCarryBag() {
        return carryBag;
    }

    private int extraToppings=200;
    private int carryBag=20;

    private int basePricePizza;
    Pizza(boolean veg){
        this.veg=veg;
        if(this.veg){
            this.price=100;
        }else {
            this.price=400;
        }
        basePricePizza=this.price;
    }
    void addExtraCheese(){
        isExtraCheezeAdded=true;
        System.out.println("Extra Cheeze Added");
        this.price+=extraCheese;
    }
    void addExtraTopping(){
        isExtraToppingsAdded=true;
        System.out.println("Extra Toppings Added");
        this.price+=extraToppings;
    }
    void takeout(){
        isOptedTakeAway=true;
        System.out.println("Take Away Added");
        this.price+=carryBag;
    }
    void getBill(){
        String bill="";
        if(isExtraCheezeAdded){
            bill+="Extra cheese added: "+extraCheese;
        }
        if(isExtraToppingsAdded){
            bill+="Extra Topings added: "+extraToppings;
        }
        if(isOptedTakeAway){
            bill+="Take Away: "+extraCheese;
        }
        bill+="Bill :"+this.price+"\n";
        System.out.println(bill);
    }
}
