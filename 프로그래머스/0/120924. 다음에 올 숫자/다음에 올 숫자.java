class Solution {
    public int solution(int[] common) {
        return calculate(common);
    }

    private int calculate(int[] common) {
        if (isSequence(common)) {
            return common[common.length - 1] + sequence(common);
        }
        return (int) (common[common.length - 1] * ratio(common));
    }

    private int sequence(int[] common) {
        return common[1] - common[0];
    }

    private double ratio(int[] common) {
        return (double) common[1] / common[0];
    }

    private boolean isSequence(int[] common) { // 등비 수열 확인 -> 등차 수열 확인하는 것으로 변경
       return common[1] - common[0] == common[2] - common[1];
    }
}