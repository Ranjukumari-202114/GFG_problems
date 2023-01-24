/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

class Solution{
public:	
	// Converts arr[0..n-1] to reduced form.
	void convert(int arr[], int n) {
	    // code here
	     map<int, int> hashMap;
	    for(int i = 0; i < n; i++){
	        hashMap[arr[i]]=i;
	    }
	    int i = 0;
	    for(auto it: hashMap){
	        arr[it.second] = i++;
	    }
	}

};