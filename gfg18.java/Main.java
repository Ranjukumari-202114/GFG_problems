/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    //Function to find first node if the linked list has a loop.
    public static int findFirstNode(Node head){
        //code here
        Node slow = head;
        Node fast = head;
        Node temp = head;
        while(fast.next != null && fast.next.next !=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
            {
                while(temp != slow)
                {
                    temp = temp.next;
                    slow = slow.next;
                }
                return temp.data;
            }
        }
        return -1;
    }
}