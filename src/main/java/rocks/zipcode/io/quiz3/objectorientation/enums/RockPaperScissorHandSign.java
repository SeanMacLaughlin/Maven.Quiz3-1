package rocks.zipcode.io.quiz3.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
    ROCK, PAPER, SCISSOR;

    public RockPaperScissorHandSign getWinner() {
        if (this == ROCK) {
            return PAPER;
        } else if (this == SCISSOR) {
            return ROCK;
        } else {
            return SCISSOR;
        }
    }

    public RockPaperScissorHandSign getLoser() {
        if (this == ROCK) {
            return SCISSOR;
        } else if (this == SCISSOR) {
            return PAPER;
        } else {
            return ROCK;
        }
    }
}
