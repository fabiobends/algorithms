class Solution {
    fun feasible(weights: IntArray, c: Int, days: Int): Boolean {
        var daysNeeded = 1
        var currentLoad = 0
        for (weight in weights) {
            currentLoad += weight
            if (currentLoad > c) {
                daysNeeded++
                currentLoad = weight
            }
        }
        return daysNeeded <= days
    }

    fun shipWithinDays(weights: IntArray, days: Int): Int {
        var totalLoad = 0;
        var maxLoad = 0
        for (weight in weights) {
            totalLoad += weight
            maxLoad = Math.max(maxLoad, weight)
        }
        while (maxLoad < totalLoad) {
            var mid = (maxLoad + totalLoad) / 2
            if (feasible(weights, mid, days)) {
                totalLoad = mid
            } else {
                maxLoad = mid + 1
            }
        }
        return maxLoad
    }
}