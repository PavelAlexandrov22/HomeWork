public class Main12 {
    public static void main(String[] args) {
        int[] flowers = new int[4];
        flowers[0] = 3;
        flowers[1] = 2;
        flowers[2] = 10;
        flowers[3] = 18;

        for (int  currentDay = 0;  currentDay < 14;  currentDay ++) {
            for (int flower : flowers) {
                if(flower < currentDay){
                    System.out.println("У нас испорченный цветок" + currentDay);
                    return;
                }

            }

        }

    }
}
