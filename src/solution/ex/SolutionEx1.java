package solution.ex;

public class SolutionEx1 {
    public int solution(int[] num_list) {
        int SumA = 0; // 홀수 번째 원소들의 합
        int SumB = 0; // 짝수 번째 원소들의 합

        for (int i = 0; i < num_list.length; i++) {
            if (i % 2 == 0) {  // 홀수 번째 인덱스
                SumA += num_list[i];
            } else {  // 짝수 번째 인덱스
                SumB += num_list[i];
            }
        }

        // 홀수 번재 합과 짝수 번째 합중 더 큰 값을 return
        return Math.max(SumA, SumB);
    }

    public static void main(String[] args) {
        SolutionEx1 sol = new SolutionEx1();

        int[] num_list1 = {4, 2, 6, 1, 7, 6};
        int[] num_list2 = {-1, 2, 5, 6, 3};


        System.out.println(sol.solution(num_list1)); //홀수 번째 인덱스 값들의 합
        System.out.println(sol.solution(num_list2)); //짝수 번째 인덱스 값들의 합
    }
}
