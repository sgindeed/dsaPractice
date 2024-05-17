class Solution
{ 
    static void reverse(Stack<Integer> s)
    {
        rev(s);
    }
    
    static Stack<Integer> rev(Stack<Integer> s){
        if(s.isEmpty()){
            return s;
        }
        int a=s.pop();
        rev(s);
        insert(s, a);
        return s;
        
    }
    
    static Stack<Integer> insert(Stack<Integer> s, int val){
        if(s.isEmpty()){
            s.push(val);
            return s;
        }
        int a=s.pop();
        insert(s, val);
        s.push(a);
        return s;
    }
 
}
