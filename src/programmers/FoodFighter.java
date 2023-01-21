package programmers;

public class FoodFighter {
    public static void main(String[] args) {
        String answer = "";
        int[] food = {1, 3, 4, 6};

        String left = "";

        for (int i = 1; i < food.length; i++) {
            for (int j = 0; j < food[i] / 2; j++) {
                left += Integer.toString(i);
            }
        }

        answer = left + "0";    // 물의 갯수는 항상 1

        StringBuilder right = new StringBuilder(left);
        answer += right.reverse();

        System.out.println(answer);
    }
}
