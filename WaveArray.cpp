class Solution {
public:
    static void convertToWave(int n, std::vector<int>& a) {
        for (int i = 0; i < n - 1; i += 2) {
            std::swap(a[i], a[i+1]);
        }
    }
};
