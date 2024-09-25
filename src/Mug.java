public class Mug extends DrinkContainer{

    private boolean hot;

    public Mug (double maxVolume, double currentVolume, String fluid) {
        super(maxVolume, currentVolume, fluid);
        hot = false;
    }

    public void addHeat() {
        hot = true;
    }

    public void removeHeat() {
        hot = false;
    }

    public boolean isHot() {
        return hot;
    }

    public String toString() {

        String msg = "This is a mug filled with " + getFluid() + "! It is " + getPercentFilled() + "% full. ";

        if (isHot()) {
            msg += "Be careful, it's hot!";
        }

        return msg;
    }
}
