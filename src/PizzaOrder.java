import java.util.List;

public class PizzaOrder {
    public static class Builder {
        // Same properties as the outer PizzaOrder class
        private List<Topping> toppings;
        private Cheese cheese;
        private Sauce sauce;
        private Base pizzaBase;
        private boolean stuffCrust;

        public Builder(Base pizzaBase, boolean stuffCrust) {
            // Enforce required choices
            this.pizzaBase = pizzaBase;
            this.stuffCrust = stuffCrust;
            // Default values
            this.cheese = Cheese.MOZZARELLA;
            this.sauce = Sauce.TOMATO;
        }

        // Sets property and returns itself (either for next property to be set, or .build() to be invoked)
        public Builder toppings(List<Topping> toppings) {
            this.toppings = toppings;
            return this;
        }

        public Builder cheese(Cheese cheese) {
            this.cheese = cheese;
            return this;
        }

        public Builder sauce(Sauce sauce) {
            this.sauce = sauce;
            return this;
        }

        public Builder base(Base pizzaBase) {
            this.pizzaBase = pizzaBase;
            return this;
        }

        public Builder stuffCrust(boolean stuffCrust) {
            this.stuffCrust = stuffCrust;
            return this;
        }

        // When .build() is called, a new concrete object is returned with the desired properties set
        public PizzaOrder build() {
            return new PizzaOrder(this);
        }
    }

    private final List<Topping> toppings;
    private final Cheese cheese;
    private final Sauce sauce;
    private final Base pizzaBase;
    private final boolean stuffCrust;

    // Removes default constructor and forces object creation through Builder inner class
    private PizzaOrder(Builder builder) {
        // Constructs concrete object with builder's property values
        this.pizzaBase = builder.pizzaBase;
        this.toppings = builder.toppings;
        this.cheese = builder.cheese;
        this.sauce = builder.sauce;
        this.stuffCrust = builder.stuffCrust;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public Cheese getCheese() {
        return cheese;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public Base getPizzaBase() {
        return pizzaBase;
    }

    public boolean isStuffCrust() {
        return stuffCrust;
    }

    @Override
    public String toString() {
        return "PizzaOrder{" +
                "toppings=" + toppings +
                ", cheese=" + cheese +
                ", sauce=" + sauce +
                ", pizzaBase=" + pizzaBase +
                ", stuffCrust=" + stuffCrust +
                '}';
    }
}
