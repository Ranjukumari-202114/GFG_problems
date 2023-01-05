/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    
     public static class TrieNode{
        TrieNode[] node;
        boolean isWord = false;
        TrieNode() {
            node = new TrieNode[26];
        }
    }
    
    public static void addWord(TrieNode root, String s){
        int idx;
        for(int i=0;i<s.length();i++)
        {
            idx = s.charAt(i)-'a';
            if(root.node[idx] == null) root.node[idx] = new TrieNode();
            root = root.node[idx];
        }
        root.isWord = true;
    }
    public static boolean isValid(TrieNode root,String s)
    {
        int idx;
        for(int i=0;i<s.length();i++)
        {
            idx = s.charAt(i)-'a';
            root = root.node[idx];
            if(!root.isWord) return false;
        }
        return true;
    }
    public static String longestString(int n, String[] arr) {
        // code here
        
         TrieNode root = new TrieNode();
        for(String s:arr)
        {
            addWord(root,s);
        }
        String ans = "";
        for(String s:arr){
            if(isValid(root,s)){
                if(ans.length()<s.length()) {
                    ans = s;
                }
                else if(ans.length() == s.length()){
                    if(ans.compareTo(s)>0)  ans = s;              
                }
            }
        }
        return ans;
    }
}
        