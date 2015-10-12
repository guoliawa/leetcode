package leetcode;

public class UglyNumber {

    public boolean isUgly(int num) {
        boolean result = false;

        if (num == 0) {
            return false;
        }
        
        if (num == 1) {
            return true;
        }

        while (num % 2 == 0) {
            num /= 2;
        }
        while (num % 3 == 0) {
            num /= 3;
        }
        while (num % 5 == 0) {
            num /= 5;
        }
        result = (num == 1) ? true : false;

        return result;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
