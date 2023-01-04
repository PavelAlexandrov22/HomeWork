package additional.flowers;

public class Tulip implements IFlowers{
  private int lives;

    public Tulip(int lives) {
        this.lives = lives;
    }

    @Override
    public int getExpirationDate() {
        return lives;
    }
}
