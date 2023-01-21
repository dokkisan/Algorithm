package programmers;

import java.util.Arrays;
import java.util.Collections;

// 프로그래머스 135808. 과일 장수
public class FruitSeller {
    public static void main(String[] args) {
        int[] score = {1, 2, 3, 1, 2, 3, 1};    // 사과들의 점수
        int k = 3;  // 사과의 최대 점수/
        int m = 4;  // 한 상자에 들어가는 사과의 수
        int answer = 0;

        Integer[] scoreArray = Arrays.stream(score).boxed().toArray((Integer[]::new));
        Arrays.sort(scoreArray, Collections.reverseOrder());
//        System.out.println(Arrays.stream(scoreArray).collect(Collectors.toList()));

        for (int i = 0; i < scoreArray.length; i++) {
            if ((i + 1) % m == 0) answer += scoreArray[i] * m;
        }
        System.out.println(answer);
    }
}
