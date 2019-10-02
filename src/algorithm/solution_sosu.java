package algorithm;


public class solution_sosu {

    public static void main(String[] args) {
        int n = 5;
        System.out.println(solution(n));
    }

    public static int solution(int n) {
        int answer = 0;


        for (int i = 2; i <= n; i++) {
            int cnt = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    cnt++;
                }
            }
            if (cnt == 0)
                answer++;
        }


        return answer;
    }
}
