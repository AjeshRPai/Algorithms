package StringAlgorithms;//Created by Ajesh on 09/02/18

import java.util.HashMap;
import java.util.Map;
import static java.lang.System.out;

public class Anagram {
    
    public static void main(String[] args) {
        String[] strings={"ccadb","acdbb"};
        if(strings[0].length()!=strings[1].length())
            out.println("Not anagrams since different length");
        else {
            if (get_Anagram(strings))
                out.println("They are anagrams");
        }
    }
    
    static boolean get_Anagram(String[] strings){
        Map<Character,Integer> map=new HashMap<>(strings[0].length());
        for(int i=0;i<strings[0].length();i++){
            char c = strings[0].charAt(i);
            out.println(" "+c);
            if(map.containsKey(c))
                map.put(c,(map.get(c)+1));
            else
                map.put(c,1);
        }
        for(int i=0;i<strings[1].length();i++){
            char c = strings[1].charAt(i);
            out.println("2= "+c);
            if(map.containsKey(c) && map.get(c)>0)
                map.put(c,(map.get(c)-1));
            else {
                out.println("They are not anagrams since "+c+" is not/less in first one");
                return false;
            }
        }
        
        return true;
        
    }
    
}
