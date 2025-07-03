package GreedyApproach;

class DiStringMatch {
    public int[] diStringMatch(String s) {
        int n = s.length();

        int low = 0;
        int high = n;
        int[] result = new int[n + 1];
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'I') {
                result[i] = low++;
            } else {
                result[i] = high--;
            }
        }
        result[n] = low;
        return result;
    }

    public static void main(String[] args) {
        DiStringMatch sol = new DiStringMatch();
        String s = "IDID";

        int[] res = sol.diStringMatch(s);
        System.out.print("Result: ");
        for (int num : res) {
            System.out.print(num + " ");
        }
    }
}
