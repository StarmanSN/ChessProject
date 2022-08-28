package characters;

public class Pawn extends Chessmen{

    public Pawn(Motion motion) {
        super(motion);
    }

    public void move() {
        motion.move();
    }
}
