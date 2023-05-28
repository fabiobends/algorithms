fun rangeExtraction(arr: IntArray): String {
    val list = mutableListOf<String>()
    var localList = mutableListOf<Int>()
    localList.add(arr[0])
    for (i in 1 until arr.size){
        if(arr[i] == localList.last() + 1) {
            localList.add(arr[i])
        } else {
            if (localList.size > 2){
                list.add("${localList.first()}-${localList.last()}")
            } else {
                list.add(localList.joinToString(","))
            }
            localList = mutableListOf<Int>()
            localList.add(arr[i])
        }
        if (i == arr.lastIndex){
            if (localList.size > 2){
                list.add("${localList.first()}-${localList.last()}")
            } else {
                list.add(localList.joinToString(","))
            }
        }
    }
    return list.joinToString(",")
}