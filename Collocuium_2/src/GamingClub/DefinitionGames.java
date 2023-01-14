package GamingClub;

public abstract class DefinitionGames {
    protected String TypeOfGames;
    protected int PlayerCount;

    protected abstract void initializeGame();

    protected abstract void playGame();

    protected abstract void DeclareResults();

    protected abstract void endGame();

    public void setPlayerCount(int PlayerCount) {
        this.PlayerCount = PlayerCount;
    }

    public final void playOneGame(String TypeOfGames) {
        setPlayerCount(PlayerCount);
        initializeGame();
        playGame();
        DeclareResults();
        endGame();
    }
}
