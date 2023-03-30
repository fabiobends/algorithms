package squares

fun sqInRect(lng:Int, wdth:Int):List<Int>? {
    if (lng == wdth) return null
    val list = mutableListOf<Int>()
    var length = lng
    var width = wdth
    while (width != length) {
        if (width > length){
            list.add(length)
            width -= length
        } else {
            list.add(width)
            length -= width
        }       
    }
    list.add(width)
    return list
}