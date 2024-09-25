public class Driver {

    public static void main(String[] args) {

        Bottle waterBottle = new Bottle(32,0, "Water");
        Bottle wineBottle = new Bottle(16, 0, "Wine");
        Mug coffeeMug = new Mug(8, 0, "Coffee");
        Mug espressoMug = new Mug(4, 0, "Espresso");
        DrinkContainer mysteryFlask = new DrinkContainer(20, 0, "Strong Mystery Potion");

        waterBottle.addLiquid(10);
        wineBottle.fill();
        coffeeMug.addLiquid(20);
        espressoMug.addLiquid(3);
        mysteryFlask.addLiquid(16);

        DrinkContainer[] drinkArray = new DrinkContainer[] {
            waterBottle,
            wineBottle,
            coffeeMug,
            espressoMug,
            mysteryFlask
        };

        for (DrinkContainer container : drinkArray) {
            System.out.println(container.toString());
        }
    }
}
