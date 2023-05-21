class PaginationHelper<T>(val collection: List<T>, val itemsPerPage: Int) {

  val itemCount: Int {
    get() = collection.size
  }

  val pageCount: Int
    get() {
       var result = collection.size / itemsPerPage
       if (collection.size % itemsPerPage > 0) result++
       return result
    }
  }

  fun pageItemCount(pageIndex: Int): Int {
      if (pageIndex < 0 || pageIndex >= this.pageCount) return -1
      if (itemsPerPage * (pageIndex + 1) > collection.size) return collection.size - itemsPerPage * pageIndex
      return itemsPerPage
  }

  fun pageIndex(itemIndex: Int): Int {
      if (itemIndex < 0 || itemIndex > collection.size - 1) return -1
      return itemIndex / itemsPerPage
  }
}

// Nice solution below
// class PaginationHelper<T>(private val collection: List<T>, private val itemsPerPage: Int) {

//     private val pages = collection.chunked(itemsPerPage)

//     /** Returns the number of items within the entire collection. */
//     val itemCount get() = collection.size

//     /** Returns the number of pages. */
//     val pageCount get() = pages.size

//     /**
//      * Returns the number of items on the page with index [pageIndex] (zero based).
//      * Returns -1 if the provided page index is out of range.
//      */
//     fun pageItemCount(pageIndex: Int) = if (pageIndex in pages.indices) pages[pageIndex].size else -1

//     /**
//      * Returns the number of the page the item with index [itemIndex] is on (zero based).
//      * Returns -1 if the provided item index is out of range.
//      */
//     fun pageIndex(itemIndex: Int) = if (itemIndex in collection.indices) itemIndex / itemsPerPage else -1
// }