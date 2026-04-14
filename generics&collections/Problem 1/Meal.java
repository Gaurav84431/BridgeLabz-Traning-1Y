interface MealPlan {}

class VegetarianMeal implements MealPlan {}
class VeganMeal implements MealPlan {}

class Meal<T extends MealPlan> {
    T plan;

    public Meal(T plan) {
        this.plan = plan;
    }

    public static <T extends MealPlan> void generate(T plan) {
        System.out.println(plan.getClass().getSimpleName());
    }
}