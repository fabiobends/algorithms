import java.util.HashMap;

class Solution {
    public int solution(int[] A) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int number : A){
            int previous = 0;
            if (map.get(number) != null){
                previous = map.get(number);
            }
            map.put(number, previous + 1);
        }
        return map.size();        
    }
}