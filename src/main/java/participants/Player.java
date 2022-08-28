package participants;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Player implements LetsPlay {

    private String whiteChess;

    private String blackChess;

    @Override
    public void makeMove() {

    }
}
