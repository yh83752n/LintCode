public class Solution {
    public boolean isPalindrome(String s) {
        if(s==null||s.length()==0){
            return true;
        }
        int front=0;
        int end=s.length()-1;
        while(front<end){
            while(front<s.length() && !isValid(s.charAt(front))){
                front++;
            }
            if(front==s.length()){
                return true;
            }
            while(end>=0&&!isValid(s.charAt(end))){
                end--;
            }
            if(Character.toLowerCase(front)!=Character.toLowerCase(end)){
                break;
            }else{
                front++;
                end--;
            }
        }
        return end<=front;
    }
    private boolean isValid(char c){
        return Character.isLetter(c)||Character.isDigit(c);
    }
}
