class Solution {
    public String defangIPaddr(String address) {
        String a="";
        for(int i=0;i<address.length();i++){
            if(address.charAt(i)=='.'){
                a+="[.]";
            }
            else{
                a+=address.charAt(i);
            }
        }
        return a;
    }
}