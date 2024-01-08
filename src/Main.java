public class Main {
    public static void main(String[] args) {
        Pizza obj=new Pizza(false);
        obj.addExtraTopping();
        obj.addExtraCheese();
        obj.getBill();

        Delux dp=new Delux(false);
        dp.getBill();

}}