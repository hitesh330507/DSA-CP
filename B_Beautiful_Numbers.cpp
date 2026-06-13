#define ll long long int
#include<bits/stdc++.h>
 
using namespace std;
 
 
int main()
{
//    freopen("input.txt","r",stdin);
//    freopen("output.txt","w",stdout);
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    ll t,n,m,x,y;
    char c;
    cin>>t;
    while(t--)
    {
 
        cin>>x;
        ll s=0;
        vector<ll> d;
        // get digit of x
        while(x>0)
        {
            d.push_back(x%10);
            s += x%10;
            x/=10;
        }
        if(s<10)
        {
            cout<<0<<endl;
            continue;
        }
        ll ans=0;
        ll k = d.back();
        sort(d.begin(),d.end(), greater<ll>());
        for (ll i=0; i<d.size(); i++)
        {
            if(d[i] == 0)
            {
                continue;
            }
            if(i<d.size()-1 && d[i] == k && d[i+1] != k){
                s-=d[i]-1;
                k = 10;
            }
            else s-=d[i];
            ans++;
            if(s<10)
            {
                break;
            }
        }
        cout<<ans<<endl;
    }
}