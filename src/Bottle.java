public class Bottle extends DrinkContainer {

    private boolean open;

    public Bottle(double maxVolume, double currentVolume, String fluid) {
        super(maxVolume, currentVolume, fluid);
        open = false;
    }

    public void open() {
        open = true;
    }

    public void close() {
        open = false;
    }

    public boolean isOpen() {
        return open;
    }

    public String toString() {

        String msg = "This is a bottle filled with " + getFluid() + "! It is " + getPercentFilled() + "% full. ";

        if (isOpen()) {
            msg += "Be careful, it's open!";
        }

        return msg;
    }
}
