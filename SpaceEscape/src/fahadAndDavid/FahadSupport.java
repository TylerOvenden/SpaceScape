package fahadAndDavid;

public interface FahadSupport {

	public void generateMap();
	
	public void toggleLights(int row, int col);
	
	public boolean isVictorious();

	public boolean stillPlaying();

	public String getValidUserInput();
	
	public boolean validInput();

	public boolean[][] getGameBoard();
}
