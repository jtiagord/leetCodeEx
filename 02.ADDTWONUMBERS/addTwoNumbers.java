class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode currentL1 = l1;
        ListNode currentL2 = l2;
        ListNode result = new ListNode();
        ListNode currResult = result;
        while(currentL1 != null || currentL2 != null){
            int x = 0;
            int y = 0;
            if(currentL1 != null){
                x = currentL1.val;
                currentL1 = currentL1.next;
            }
            if(currentL2 != null){
                y = currentL2.val;
                currentL2 = currentL2.next;
            }
            int sum = x + y + carry;
            currResult.val = sum % 10;
            carry = sum/10;
            if(currentL1 == null && currentL2 == null) break;
            currResult.next = new ListNode();
            currResult = currResult.next;
        }
        
        if(carry == 1) currResult.next = new ListNode(carry);
        
        
        return result;
    }
}