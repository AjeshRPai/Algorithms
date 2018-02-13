package StringAlgorithms;

public class ReverseWords{
    
    public static void main(String[] args) {
        String string="i like this program very much";
        reverse(string);
    }
    
    
    private static void reverse(String string){
        String reversed[]=string.split("\\s");
        StringBuffer reversed_string=new StringBuffer();
        for(int i=reversed.length-1;i>=0;i--){
            reversed_string.append(reversed[i]).append(" ");
        }
        System.out.println(reversed_string.toString());
    }
}
