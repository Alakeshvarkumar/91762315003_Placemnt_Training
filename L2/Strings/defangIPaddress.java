class Solution {
    public String defangIPaddr(String address) {
        String[] arr = address.split("\\.");
        StringBuilder s = new StringBuilder();
        for(int i=0;i<arr.length;i++){
            s.append(arr[i]);
            if(i!=arr.length-1){
                s.append("[.]");
            }
        }
        return new String(s);
    }
}
// class Solution {
//     public String defangIPaddr(String address) {
//         // String[] arr = address.split("\\.");
//         StringBuilder sb = new StringBuilder();
//         for (char c : address.toCharArray()) {
//             if (c == '.')
//                 sb.append("[.]");
//             else
//                 sb.append(c);
//         }
//         return sb.toString();
//     }
// }



//return address.replace(".", "[.]");