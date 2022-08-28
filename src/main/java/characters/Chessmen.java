package characters;

public abstract class Chessmen {

    protected String color;

    protected String type;

    Motion motion;

    public Chessmen(Motion motion) {
        this.motion = motion;
    }

    protected Chessmen() {
    }
}
