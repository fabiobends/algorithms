class MyHashSet() {

    val list = mutableListOf<Int>()
  
    fun add(key: Int) {
        if (!list.contains(key)) list.add(key)
    }

    fun remove(key: Int) {
        list.remove(key)
    }

    fun contains(key: Int): Boolean {
        return list.contains(key)
    }

}
