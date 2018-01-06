package StringAlgorithms;

public class Permutation {
    
    public static void main(String[] args) {
        String string="ABC";
        computePermutation(string,0,string.length()-1);
    }
    
   
    private static void computePermutation(String str, int l, int r) {
        System.out.println("Str "+str+" l="+l);
        if (l == r){
        
        }
        else {
            for (int i = l; i <= r; i++) {
                System.out.println("i "+i);
                str = swap(str,l,i);
                computePermutation(str, l+1, r);
                str = swap(str,l,i);
            }
        }
    }
    
    /**
     * Swap Characters at position
     * @param a string value
     * @param i position 1
     * @param j position 2
     * @return swapped string
     */
    public static String swap(String a, int i, int j) {
        System.out.println(""+a+" "+i+" "+j);
        
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
