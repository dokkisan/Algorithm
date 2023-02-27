package programmers;

// 프로그래머스 콜라 문제
class Coke {
    public static int solution(int a,      // 갖다준 빈 병
                               int b,      // 빈 병 a개 주면 받는 콜라
                               int n) {    // 상빈이가 가진 빈 병

        int answer = 0;

        while (n >= a) {
            answer += b;
            n = n - a + b;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(2, 1, 20));
//        System.out.println(solution(3, 1, 20));
    }
}