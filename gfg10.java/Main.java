/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

//User function template for JAVA

/*Complete the Given Function

Node is as follows:
class Node{
    int data;
    Node left,right;
    Node(int d){
    	data=d;
    	left=null;
    	right=null;
    }
}*/

class Solution{
    public void toSumTree(Node root){
         //add code here.
         post(root);
    }
    public int post(Node root)
    {
        if(root == null)
        {
            return 0;
        }
        
        int left = post(root.left);
        int right = post(root.right);
        int old = root.data;
        root.data = left+right;
        return old+root.data;
    }
}
