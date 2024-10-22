//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Create concrete object
        PizzaOrder pizzaOrder = new PizzaOrder.Builder(Base.DEEP_PAN, true).sauce(Sauce.BBQ).build();

        System.out.println(pizzaOrder);
    }
}