class BrowserHistory(homepage: String) {
  private val chain = mutableListOf<String>(homepage)
  private var currentIndex = 0

  fun visit(url: String) {
    while (currentIndex != chain.size - 1)
      chain.remove(chain.last()) // .removeLast() is not recognized here
    chain.add(url)
    currentIndex++
  }

  fun back(steps: Int): String {
    currentIndex = maxOf(currentIndex - steps, 0)
    return chain[currentIndex]
  }

  fun forward(steps: Int): String {
    currentIndex = minOf(chain.size - 1, currentIndex + steps)
    return chain[currentIndex]
  }

}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * var obj = BrowserHistory(homepage)
 * obj.visit(url)
 * var param_2 = obj.back(steps)
 * var param_3 = obj.forward(steps)
 */