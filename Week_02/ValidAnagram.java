/**
 * Given two strings s and t , write a function to determine if t is an anagram of s.
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 * <example>
 *     输入: s = "anagram", t = "nagaram"
 *     输出: true
 * </example>
 *
 * 思路
 * 由于已只给定的条件范围是小写字母
 * 所以可以用数组替代HashMap
 */
class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        int[] array = new int['z'-'a'+1];
        for(char character : s.toCharArray()){
            array[character - 'a']++;
        }

        for(char character : t.toCharArray()){
            array[character - 'a']--;
        }

        for(int entity : array){
            if(entity != 0){
                return false;
            }
        }
        return true;
    }
}