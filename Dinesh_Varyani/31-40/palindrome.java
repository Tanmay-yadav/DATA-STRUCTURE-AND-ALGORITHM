public class palindrome {
    public static boolean ispalindrome(String  word){
        char[]charArray=word.toCharArray();
        int start =0;
        int end = charArray.length-1;
        while (start<end){
            if(charArray[start]!= charArray[end]){
                return false;
            }
            start++;
            end--;
        }

        return true;
    }


    public static void main(String[]args){
      boolean result=  ispalindrome("oho");
        System.out.println(result);
    }
    
}
