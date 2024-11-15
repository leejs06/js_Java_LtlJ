package solution.ex;

public class SolutionEx3 {

    // solution 함수, 물 부족 시점을 예측하는 함수
    public static int solution(int storage, int usage, int[] change) {
        // 매달 변화율에 맞춰 물 사용량을 계산하고, 저수지에서 물을 차감
        for (int i = 0; i < change.length; i++) {
            // 이번 달 물 사용량 계산 (소수점 이하 버리기)
            usage = (int) (usage * (1 + change[i] / 100.0));  // 변화율을 적용

            // 저수지에서 물을 차감
            storage -= usage;

            // 물이 부족하면 그 달을 리턴
            if (storage < 0) {
                return i + 1;  // 1부터 시작하는 달 번호를 반환
            }
        }

        // 물이 부족하지 않으면 -1을 리턴
        return -1;
    }

    public static void main(String[] args) {
        // 물이 부족하지 않음
        int storage1 = 5141;
        int usage1 = 500;
        int[] change1 = {10, -10, 10, -10, 10, -10, 10, -10, 10, -10};
        System.out.println(solution(storage1, usage1, change1));  // 출력: -1

        // 물이 부족한 경우
        int storage2 = 500;
        int usage2 = 100;
        int[] change2 = {10, 10, 10, 10, 10};
        System.out.println(solution(storage2, usage2, change2));  // 출력: 4
    }

}
