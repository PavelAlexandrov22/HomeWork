package home_work_1.take7;

public class Main7 {
    public static void main(String[] args) {
        /*
            Передаём массив и чисел и
            получаем отформатированный номер
         */
        String resultMethod = createPhoneNumber(new int[]{1,2,3,4,5,6,7,8,9,0});

        //Печатаем отформатированный номер
        System.out.println(resultMethod);
    }


    /**
     * Получить отформатированный номер
     * @param data набор цифр который необходимо поместить в номер
     * @return номер отформатированный в формате (XXX) XXX-XXXX
     */
    public static String createPhoneNumber(int[] data){
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", data[0]
                , data[1], data[2], data[3], data[4], data[5], data[6]
                , data[7], data[8], data[9]);
    }
}
