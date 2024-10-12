import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        System.out.println("ent string");
        String s = se.next();
        System.out.println("your string is: " + s);
        
        if(s.length() == 0)
            System.out.println("0");
        
        int left = 0, maxLen = 0, right = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        while(right < s.length())
        {
            if(map.containsKey(s.charAt(right)))
                left = Math.max(left, map.get(s.charAt(right)) + 1);
            map.put(s.charAt(right), right);
            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }
        System.out.println("length of largest substring without repeating characters " + maxLen);
    }
}
