class Solution {
    public int countBit(int n) {
        int quotient = 0, numBits = 0;

        do {
            quotient = n / 2;
            numBits += n % 2;
            n = quotient;
        } while (quotient > 0);

        return numBits;
    }

    public int[] countBits(int n) {
        int[] bits = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            bits[i] = countBit(i);
        }

        return bits;
    }
}
