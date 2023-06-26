public class FirstUniqueCharacter {
    public static int firstUniqChar(String s) {
        int[] count = new int[26];

        // Calculate the frequency of each character
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        // Find the first unique character
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        // If no unique character is found, return -1
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));        
        System.out.println(firstUniqChar("loveleetcode"));   
        System.out.println(firstUniqChar("aabb"));            
    }
}



