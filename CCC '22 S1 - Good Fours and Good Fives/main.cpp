#include <iostream>
using namespace std;

int main (){
    cin.tie (0);
    ios::sync_with_stdio();
    
    int n;
    cin >> n;
    
    int ans = 0;
    
    if (n%4 == 0)
        ans ++;
    if (n%5 == 0)
        ans ++;
        
    for (int i = n - 5; i >= 4; i -= 5){
        if (i%4 == 0)
            ans ++;
    }
    
    cout << ans;
}
