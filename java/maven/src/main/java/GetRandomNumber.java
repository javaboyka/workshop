import java.util.Random;

/**
 * Created by zzy on 2/3/15.
 */
public class GetRandomNumber {
    public String getRandomNumber() {
        String randomStr = "";
//        while(randomStr.length() < 4){
//            Random random = new Random();
//            int randomNUm = random.nextInt(10);
//            if(!randomStr.contains(""+randomNUm)){
//                randomStr += randomNUm;
//            }
//        }

        int[] numArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for(int i =  0; i < 4; i++){
            Random random = new Random();
            int index = random.nextInt(numArr.length - 1);

            randomStr += numArr[index];
            numArr[index] = numArr[numArr.length - 1 - index];
        }


        return randomStr;
    }
}
