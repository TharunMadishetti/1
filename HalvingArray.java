
class Solution {
    public int minSetSize(int[] arr) {
        HashMap<Integer,Integer> h = new HashMap<>(); 
        for(int i : arr) 
           h.put(i,h.getOrDefault(i,0)+1); 
        ArrayList<Integer> li = new ArrayList<>(h.values());
        Collections.sort(li);
        int size=arr.length/2,ans=0,s=0;
        for(int i=li.size()-1;i>=0;i--)
        {
            ans++;
            s=s+li.get(i);
            if(s>=size)
                break;
        }
        return ans;
        
    }
}
