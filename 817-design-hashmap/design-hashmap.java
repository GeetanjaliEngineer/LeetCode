class MyHashMap {
    //create an array as map declaration
    private int[] map;

    public MyHashMap() {
        //create an array
        map = new int[1000001];
        //all values are filled with -1 
        Arrays.fill(map, -1);

    }
    
    public void put(int key, int value) {
        map[key]= value;
    }
    
    public int get(int key) {
        return map[key];
    }
    
    public void remove(int key) {
        map[key]= -1 ;
        
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */