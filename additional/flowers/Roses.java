package additional.flowers;

public class Roses implements IFlowers {
    private int expirationDate = 24;

    @Override
    public int getExpirationDate() {
        return expirationDate;
    }
}
