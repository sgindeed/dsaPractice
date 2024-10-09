class Solution {
    static Node construct(int arr[][]) {
        // Add your code here.
        Node upper=null,start=null, prev=null, head=null;
        int n=arr.length;
        int m=arr[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                Node temp=new Node(arr[i][j]);
                if(head==null)head=temp;
                if(upper==null)upper=start;
                if(i!=0){
                    upper.down=temp;
                    upper=upper.right;
                }
                if(j==0)start=temp;
                if(j!=0){
                    prev.right=temp;
                }
                prev=temp;
            }
        }
        return head;
    }
}