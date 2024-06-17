import java.util.HashSet;

class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = 0;
        int sumB = 0;
        
        for (int size : aliceSizes) {
            sumA += size;
        }
        
        HashSet<Integer> setB = new HashSet<>();
        for (int size : bobSizes) {
            sumB += size;
            setB.add(size);
        }
        
        int delta = (sumB - sumA) / 2;
        
        for (int a : aliceSizes) {
            int b = a + delta;
            if (setB.contains(b)) {
                return new int[] {a, b};
            }
        }
        
        return new int[0]; // No answer required by the problem statement
    }
}
