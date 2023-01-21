package programmers;

import java.util.*;

// 프로그래머스 69644. 두 수 뽑아서 더하기
public class PickTwo {
    public static void main(String[] args) {
        Set<Integer> list = new TreeSet<>();
        int[] numbers = {2,1,3,4,1};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                list.add(numbers[i] + numbers[j]);
            }
        }
        int[] answer = new int[list.size()];
        Iterator<Integer> iterator = list.iterator();
        int i = 0;
        while(iterator.hasNext()) {
            answer[i] = iterator.next();
            i++;
            if(i > answer.length) {
                break;
            }
        }
        System.out.println(Arrays.toString(answer));
    }
}