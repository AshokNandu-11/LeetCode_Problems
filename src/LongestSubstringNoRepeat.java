import java.util.*;

public class LongestSubstringNoRepeat {
    public int substring(String s) {
        HashSet<Character> map1;
        map1 = new HashSet<>();
        int left =0,right=0;
        int maxLength =0;
       while (right !=s.length()){
            while (map1.contains(s.charAt(right))){
                map1.remove(s.charAt(left));
                left++;
            }
            map1.add(s.charAt(right));
            maxLength = Math.max(maxLength,right-left+1);
            right++;
        }
        return  maxLength;


    }
}