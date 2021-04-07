public class Palindrome{
    public static boolean is_palindrome(String you)
    {
    
   int i; boolean tested_word=true; int end=you.length();
    for (i = 0; i < end/2; i++){
    if(you.charAt(i)!=you.charAt(end-1-i))
    {tested_word = false;}}
    return tested_word;

    }
}
