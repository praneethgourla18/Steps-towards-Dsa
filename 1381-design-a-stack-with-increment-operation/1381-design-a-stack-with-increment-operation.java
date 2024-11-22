class CustomStack {
    
    private int[] arr;
    private int pointer=-1;

    public CustomStack(int maxSize) {
        arr=new int[maxSize];
    }
    
    public void push(int x) {
        if(pointer<arr.length-1){
            arr[++pointer]=x;
        }
    }
    
    public int pop() {
        if(pointer==-1){
            return -1;
        }
        int ans=arr[pointer];
        pointer-=1;
        return ans;
    }
    
    public void increment(int k, int val) {
        if(k>=pointer+1){
            for(int i=0;i<=pointer;i++){
                arr[i]=arr[i]+val;
            }
        }
        else{
            for(int i=0;i<k;i++){
            arr[i]=arr[i]+val;
        }
        }
        
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */