fun persistence(num: Int) : Int {
    var counter = 0
    var n: Int
    var mul = num
    while (mul >= 10) {
        var temp = 1
        while (mul > 0) {
            n = mul % 10
            temp *= n
            mul /= 10
        }
        mul = temp
        counter++
    }
    return counter
}