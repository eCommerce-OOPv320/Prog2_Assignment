# include <bits/stdc++.h>
# include "./demo/Portal1.h"
using namespace std;

int main()
{
    Portal1 *p1 = new Portal1("portal1");
    
    // this is the vector<string>a that will contain the first string as name of the object and second one the number specified(if any like that of FlightSimple)
    while(true)
    {
        string s;
        getline(cin,s);
        string a1 = ""; // this will be used for appending each char of a continuous string(continous string->string with no spaces)
        vector<string>a;
        //logic for the splitting of the command
        for(int i=0;i<s.size();i++)
        {
            if(s[i]!=' '&& i!=(int)s.size()-1)
            {
                a1+=s[i];
            }
            else if(i!=(int)s.size()-1 && s[i]==' ') // if we encounter a space when iterating through a input then we add the a1 string to the vector of strings and reinitalizes the original string.
            {
                a.push_back(a1);
                a1 = "";
            }
            else if(i==(int)s.size()-1) // if we are at the last index then we just that element to the a1 string and add the a1 string to the vector of strings.
            {
                a1+=s[i];
                a.push_back(a1);
            }
            
        }

        //if a list buy or start command is called, we call to process it
        if(a[0]=="List" || a[0]=="Buy" || a[0]=="Start")
        {
            p1->processUserCommand(s);
        }
        //if check is called we check the responses from platform
        else if(s=="Check")
        {
            p1->Response();
        }
        //else we terminate the program if end is called
        else if (s == "End"){
            break;
        }
        
    }
    return 0;
}