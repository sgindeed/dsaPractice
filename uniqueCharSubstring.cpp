class Solution {
  public:
    int longestUniqueSubstr(string &s) {
        // code here
        int n=s.size();
        vector<int> ch(n,0);
        map<char,int> mp;
        int ans=1;
        int m=-1e9;
        mp[s[0]]=-2;
        for(int i=1;i<n;i++){
            mp[s[i]]+=i;
            if(mp[s[i]]!=i) {
                if(mp[s[i]]-i==-2){
                    i=1;
                }
                else{
                    i=mp[s[i]]-i+1;
                }
                // ch[i]=mp[s[i]];
                ans=0;
                mp.clear();
                mp[s[i]]=i;
                // mp[s[i]]++;
            }
            ans++;
            m=max(m,ans);

        }
        // int t=m.size();
        return m;
    }
};