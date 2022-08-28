package characters;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Elephant extends Chessmen implements Motion{

    private List<?> step;

    public Elephant() {
        step = new ArrayList();
    }

    public Elephant(Motion motion, int n) {
        super(motion);
        this.step = Collections.singletonList(n);
    }

    public void moveDiagonal() {
        motion.move();
    }

    @Override
    public void move() {

    }
}
