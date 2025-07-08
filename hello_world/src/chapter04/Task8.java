package chapter04;

public class Task8 {
    int sum;
    public int sumOfArrayNums(int... nums) {
        for (int num : nums) {
            for (int i=num; i>=0; i--) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Task8 array = new Task8();
        System.out.println(array.sumOfArrayNums(4,5,10,15));
    }
}
