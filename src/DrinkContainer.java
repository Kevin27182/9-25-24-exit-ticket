public class DrinkContainer {

    private double maxVolume;
    private double currentVolume;
    private String fluid;

    public DrinkContainer(double maxVolume, double currentVolume, String fluid) {
        this.maxVolume = maxVolume;
        this.currentVolume = currentVolume;
        this.fluid = fluid;
    }

    public double getCurrentVolume() {
        return currentVolume;
    }

    public void addLiquid(double amt) {

        if (currentVolume + amt > maxVolume) {
            System.out.println("Oops, some " + fluid + " was spilled!");
            fill();
            return;
        }

        currentVolume += amt;
    }

    public void removeLiquid(double amt) {
        currentVolume -= amt;
    }

    public double getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(double amt) {
        maxVolume = amt;
    }

    public String getFluid() {
        return fluid;
    }

    public void setFluid(String fluid) {
        this.fluid = fluid;
    }

    public double getPercentFilled() {
        return 100 * currentVolume / maxVolume;
    }

    public void fill() {
        currentVolume = maxVolume;
    }

    public String toString() {
        return "This is a drink container filled with " + fluid + "! It is " + getPercentFilled() + "% full.";
    }
}
