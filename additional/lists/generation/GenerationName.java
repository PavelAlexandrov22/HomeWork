package additional.lists.generation;


import java.util.Random;

public class GenerationName {
    public static String random(int length){
        Random rnd = new Random();
        StringBuffer sb = new StringBuffer();
        while(sb.length() < length){
            sb.append(Integer.toHexString(rnd.nextInt()));
        }
        return sb.toString().substring(0, length);

    }





}
