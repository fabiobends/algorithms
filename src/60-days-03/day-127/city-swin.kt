package kata

object Kata {
	fun rainVolume(towers: IntArray): Int {
		if (towers.size == 0) return 0
        var biggestTowerHeightLeft = 0
        var biggestTowerHeightRight = 0
        var total = 0
        var left = 0
        var right = towers.size - 1
        while (left <= right) {
            if (biggestTowerHeightLeft <= biggestTowerHeightRight) {
                 biggestTowerHeightLeft = Math.max(biggestTowerHeightLeft, towers[left])
                 total += biggestTowerHeightLeft - towers[left]
                 left++
            } else {
                 biggestTowerHeightRight = Math.max(biggestTowerHeightRight, towers[right])
                 total += biggestTowerHeightRight - towers[right]
                 right--
            }
        }
        return total
	}
}