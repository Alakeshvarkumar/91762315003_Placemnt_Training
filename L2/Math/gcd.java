class gcd {

    public int commonFactors(int a, int b) {

        int gcd = findGCD(a, b);
        int count = 0;

        for (int i = 1; i <= gcd; i++) {
            if (gcd % i == 0) {
                count++;
            }
        }

        return count;
    }

    private int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

// class Solution {
//     public int commonFactors(int a, int b) {
//         int cf = 1;
//         int mini = b;
//         if (a < b) {
//             mini = a;
//         }

//         for (int i = 2; i <= mini; i++) {
//             if (a % i == 0 && b % i == 0) {
//                 cf++;
//             }
//         }
//         return cf;
//     }
// }