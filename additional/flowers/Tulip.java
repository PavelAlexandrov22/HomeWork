package additional.flowers;

public class Tulip implements IFlowers{
    int expirationDate = 48;
    @Override
    public int getExpirationDate() {
        return expirationDate;
    }


}
