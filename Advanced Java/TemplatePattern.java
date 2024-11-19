// Abstract Class
abstract class Meal {
    // Template method
    public final void prepareMeal() {
        prepareIngredients();
        cook();
        serve();
    }

    // Concrete method
    private void prepareIngredients() {
        System.out.println("Preparing ingredients.");
    }

    // Abstract methods
    protected abstract void cook();
    protected abstract void serve();
}

// Concrete Class for Pasta
class PastaMeal extends Meal {
    @Override
    protected void cook() {
        System.out.println("Cooking pasta.");
    }

    @Override
    protected void serve() {
        System.out.println("Serving pasta with sauce.");
    }
}

// Concrete Class for Salad
class SaladMeal extends Meal {
    @Override
    protected void cook() {
        System.out.println("Mixing salad ingredients.");
    }

    @Override
    protected void serve() {
        System.out.println("Serving salad with dressing.");
    }
}

// Client Code
public class TemplatePattern {
    public static void main(String[] args) {
        Meal pastaMeal = new PastaMeal();
        pastaMeal.prepareMeal();
        
        System.out.println();

        Meal saladMeal = new SaladMeal();
        saladMeal.prepareMeal();
    }
}