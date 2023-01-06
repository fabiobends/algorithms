/**
function cookies(k: number, A: number[]): number {
    // Write your code here
    A.sort((a,b)=>a-b)
    
    let iterations = 0
    let index = 0
    
    while(A.length > 1 && A[0] < k){
      const firstCookie = A.shift()
      const secondCookie = A.shift()
      const newCookie = getNewCookie(firstCookie, secondCookie)
      index = A.findIndex(item => item >= newCookie)
      if (index === -1){
        A.push(newCookie)
      } else if (index < 2){
        A.unshift(newCookie)
      } else {
        A.splice(index, 0, newCookie)
      }      
      iterations++ 
    }
    if (A.length === 1 && A[0] < k) return -1
    return iterations
}
 */
// well typescript is too slow to do this challenge here is the solution in java

public static int cookies(int k, List<Integer> A) {
    // Write your code here
    PriorityQueue<Integer> pq = new PriorityQueue<>(A);
    
    int tot = 0;
    while (pq.size() > 1 && pq.peek() < k) {
        int a = pq.remove();
        int b = pq.remove();
        pq.add(a + (2 * b));
        tot += 1;
    }

    if (pq.size() == 1 && pq.peek() < k) return -1;
    else return tot;
} 