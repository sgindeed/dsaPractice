class Solution {
    
    Node copyList(Node head) {
        Map<Node,Node> map = new HashMap<>();
        Node cur=head;
        while(cur!=null){
            map.put(cur,new Node(cur.data));
            cur=cur.next;
        }
        for(Map.Entry<Node,Node> e : map.entrySet()){
            Node key=e.getKey();
            Node val=e.getValue();
            if(key.next!=null)
            val.next=map.get(key.next);
            if(key.random!=null)
            val.random=map.get(key.random);
        }
        return map.get(head);
    }
}