
import java.util.HashSet;

class JewelsAndStones {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        HashSet<Character> set = new HashSet<>();
        for (char c : jewels.toCharArray()) {
            set.add(c);
        }
        for (char c : stones.toCharArray()) {
            if (set.contains(c)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        JewelsAndStones js = new JewelsAndStones();
        String jewels = "aA";
        String stones = "aAAbbbb";
        System.out.println(js.numJewelsInStones(jewels, stones));
    }
}