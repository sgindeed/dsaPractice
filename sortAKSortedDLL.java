class Solution {
    public DLLNode sortAKSortedDLL(DLLNode head, int k) {
        if(head==null||head.next==null) return head;
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
        int count=0;
        while(count<=k){
            count++;
            pq.add(head.data);
            head=head.next;
            if(head==null){
                DLLNode h=new DLLNode(pq.poll());
                DLLNode temp=h;
                //DLLNode prev=null;
                
                while(!pq.isEmpty()) {
                    DLLNode nn=new DLLNode(pq.poll());
                    //prev=temp;
                    temp.next=nn;
                    nn.prev=temp;
                    temp=temp.next;
                }
                return h;
            }
            
        }
        DLLNode h=new DLLNode(pq.poll());
        DLLNode temp=h;
        while(head!=null){
            pq.add(head.data);
            DLLNode nn=new DLLNode(pq.poll());
            temp.next=nn;
            nn.prev=temp;
            temp=temp.next;
            head=head.next;
        }
        while(!pq.isEmpty()) {
                    DLLNode nn=new DLLNode(pq.poll());
                    //prev=temp;
                    temp.next=nn;
                    nn.prev=temp;
                    temp=temp.next;
                }
                return h;
    }
}
