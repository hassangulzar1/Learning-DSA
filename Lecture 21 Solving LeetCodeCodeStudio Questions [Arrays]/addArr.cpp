// vector<int> reverse(vector<int> v) {
//
//     int s = 0;
//     int e = v.size()-1;
//
//     while(s<e)
//     {
//         swap(v[s++], v[e--]);
//     }
//     return v;
// }
//
//
// vector<int> findArraySum(vector<int>&a, int n, vector<int>&b, int m) {
//
// 	// Write your code here.
// 	int i = n -1;
// 	int j = m -1;
// 	int carry = 0;
//     vector <int> ans;
//
// 	while(i >= 0 && j >= 0){
//
// 	  int sum = a[i] + b[j] + carry;
// 	  carry = sum / 10;
//       sum = sum % 10;
//       ans.push_back(sum);
// 	  i--;
// 	  j--;
//
// 	}
// 	// first Case
// 	while(i >= 0){
//      int sum = a[i] + carry;
// 	  carry = sum / 10;
//       sum = sum % 10;
//       ans.push_back(sum);
// 	  i--;
// 	}
//
// 	// second Case
// 	while(j >= 0){
// 	 int sum = b[j] + carry;
// 	  carry = sum / 10;
//       sum = sum % 10;
//       ans.push_back(sum);
// 	  j--;
// 	}
//
//    // third Case
//
//    while(carry != 0){
//       int sum =  carry;
// 	  carry = sum / 10;
//       sum = sum % 10;
//       ans.push_back(sum);
//    }
//
//    return reverse(ans);
// }