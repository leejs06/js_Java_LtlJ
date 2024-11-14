package solution.ex;

public class SolutionEx2 {
    public int solution(int[] num_list) {

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] < 0) {  // 음수를 찾으면
                return i;  // 해당 인덱스를 반환
            }
        }
        // 음수가 없다면 -1을 return
        return -1;
    }

    public static void main(String[] args) {
        SolutionEx2 sol = new SolutionEx2();

        int[] num_list1 = {12, 4, 15, 46, 38, -2, 15};
        int[] num_list2 = {13, 22, 53, 24, 15, 6};

        System.out.println(sol.solution(num_list1));
        System.out.println(sol.solution(num_list2));

    }
}