package additional.flowers;

public class Roses implements IFlowers {
    private int lives;

    public Roses(int lives) {
        this.lives = lives;
    }

    @Override
    public int getExpirationDate() {
        return lives;
    }

}
