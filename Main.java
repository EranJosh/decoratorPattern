public class Main {
    public static void main(String[] args) {

        
        Coffee blackCoffee = new BlackCoffee();

        
        Milk milkCoffee = new Milk();
        milkCoffee.setCoffee(blackCoffee);

        
        CaramelSyrup caramelCoffee = new CaramelSyrup();
        caramelCoffee.setCoffee(milkCoffee);

        
        System.out.println(caramelCoffee.getDescription());
        System.out.println("Total Cost: ₱ " + caramelCoffee.getCost());
    }
}
