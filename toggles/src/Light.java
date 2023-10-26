public class Light {
    private boolean state;

    public Light() {
        state = false;
    }

    public void turnOn() {
        state = true;
    }

    public void toggle() {
        state = !state;
    }

    public void turnOff() {
        state = false;
    }

    public boolean getState() {
        return state;
    }
}
