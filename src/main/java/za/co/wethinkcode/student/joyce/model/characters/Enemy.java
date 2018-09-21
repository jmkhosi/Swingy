package za.co.wethinkcode.student.joyce.model.characters;


public class Enemy extends Player{

    public String winningMessage;
    public String losingMessage;


    public Enemy() {
    }

    public void setWinningMessage(String winningMessage) {
        this.winningMessage = winningMessage;
    }

    public void setLosingMessage(String losingMessage) {
        this.losingMessage = losingMessage;
    }

    public String getWinningMessage() {
        return winningMessage;
    }

    public String getLosingMessage() {
        return losingMessage;
    }
}
