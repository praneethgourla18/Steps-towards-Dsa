class Solution {
    public boolean judgeCircle(String moves) {

        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<moves.length();i++){
           
        if(!map.containsKey(moves.charAt(i))){
          map.put(moves.charAt(i),0);
        }
         else{
            map.put(moves.charAt(i),map.get(moves.charAt(i))+1);
         }  
           
        }
       int horizontal = map.getOrDefault('R', 0) - map.getOrDefault('L', 0);
        int vertical = map.getOrDefault('U', 0) - map.getOrDefault('D', 0);
        
        return horizontal == 0 && vertical == 0;
    }
}