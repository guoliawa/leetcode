package leetcode;

import java.util.ArrayList;
import java.util.List;

public class AddDigits {

    public static int addDigits(int num) {
        int result = num;
        List<Integer> numList = new ArrayList<Integer>();

        while (result >= 10) {
            numList.clear();
            numList = generateNumList(result);
            result = sumNumList(numList);
        }
        
        return result;
    }

    public static List<Integer> generateNumList(int num) {
        List<Integer> numList = new ArrayList<Integer>();
        do {
            numList.add(num % 10);
            num = num / 10;
        } while (num >= 10);

        numList.add(num);

        return numList;
    }

    public static int sumNumList(List<Integer> numList) {
        int sum = 0;
        for (Integer num : numList) {
            sum += num;
        }

        return sum;
    }
    
    public static int addDigitsCorrect(int num) {
        return (num - 1) % 9 + 1;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("The result is " + addDigits(10));
    }

}
