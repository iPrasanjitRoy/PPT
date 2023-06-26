import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {
    public static int firstUniqChar(String s) {
        // Create a map to store the frequency of each character 
        HashMap <Character, Integer> frequencyMap = new HashMap<>(); 

        // Calculate the frequency of each character
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1); 
        }

        // Find the first unique character
        for (int i = 0; i < s.length(); i++) {
            if (frequencyMap.get(s.charAt(i)) == 1) {
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



