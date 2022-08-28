package base;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Coordinate {

    int positionX;
    int positionY;

    @Override
    public String toString() {
        return "Coordinate{" +
                "positionX=" + positionX +
                ", positionY=" + positionY +
                '}';
    }

    public boolean isValidPosition() {
        if ((positionX >= 0 && positionX < 8) && (positionY >= 0 && positionY < 8)) {
            return true;
        }
        return false;
    }
}
