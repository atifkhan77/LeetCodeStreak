class RecentCounter {
    private Queue<Integer> requestQueue;

    public RecentCounter() {
        requestQueue = new LinkedList<>();
        
    }
    
    public int ping(int t) {
        while (!requestQueue.isEmpty() && requestQueue.peek() < t - 3000) {
            requestQueue.poll();
        }

        // Add the current request timestamp
        requestQueue.offer(t);

        // The size of the queue represents the number of requests within the last 3000 milliseconds
        return requestQueue.size();
        
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */