class ParkingSystem(big: Int, medium: Int, small: Int) {

    var list = arrayListOf(big, medium, small)

    fun addCar(carType: Int): Boolean {
      val index = carType - 1 
      if (list[index] > 0) {
        list[index]--
        return true
      }
      return false   
    }

}