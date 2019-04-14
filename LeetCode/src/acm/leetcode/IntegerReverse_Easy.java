package acm.leetcode;

/**
 * #7 整数反转
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 *
 * 示例 1:
 * 输入: 123
 * 输出: 321
 *
 *  示例 2:
 * 输入: -123
 * 输出: -321
 *
 * 示例 3:
 * 输入: 120
 * 输出: 21
 *
 * 注意:
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−2^31,  2^31 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
 **/
public class IntegerReverse_Easy {
    public int reverse(int x) {
        int reverseNum = 0;
        while(x != 0) {
            int temp = x % 10;
            x /= 10;
            if (reverseNum > Integer.MAX_VALUE/10 || (reverseNum == Integer.MAX_VALUE/10 && temp > 7))
                return 0;
            if (reverseNum < Integer.MIN_VALUE/10 || (reverseNum == Integer.MIN_VALUE/10 && temp < -8))
                return 0;
            reverseNum = (reverseNum * 10) + temp;
        }
        return reverseNum;
    }
}
