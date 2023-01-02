/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    ArrayList<Integer> maximumValue(Node node) {
       //code here
       
        if(node == null)
        {
           return new ArrayList<>();
        }
        ArrayList<Integer> StoreResult = new ArrayList<>();
        LevelOrderTraversal(node,StoreResult);
        return StoreResult;
       
    }
    public void LevelOrderTraversal(Node node,ArrayList<Integer> StoreResult)
    {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);
        while(!queue.isEmpty())
        {
            int currentLevelMax = Integer.MIN_VALUE;
            int size = queue.size();
            for(int i = 0; i<size; i++)
            {
                Node currentNode = queue.poll();
                if(currentLevelMax < currentNode.data){
                    currentLevelMax = currentNode.data;
                }
                if(currentNode.left != null){
                    queue.offer(currentNode.left);
                }
                if(currentNode.right != null){
                    queue.offer(currentNode.right);
                }
                
            }
            StoreResult.add(currentLevelMax);
        }
    }
}