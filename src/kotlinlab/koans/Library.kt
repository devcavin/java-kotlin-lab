package kotlinlab.koans

class Book(
    val title: String,
    val author: String,
    var isCheckedOut: Boolean = false
)

// storage for books
class Library(
    val books: MutableList<Book>
) {
    // returns a list of unchecked out books
    fun listOfAvailableBooks(): MutableList<Book> {
        val availableBooks = mutableListOf<Book>()
        for (book in books) {
            if (!book.isCheckedOut) availableBooks.add(book)
        }
        return availableBooks
    }

    // fetching a book by title
    fun bookByTitle(title: String): Book? {
        return books.find { it.title == title }
    }

    // book checked out
    fun checkoutBook(title: String) {
        val book = books.find { it.title == title }
        book?.isCheckedOut = true
    }

    // book returned
    fun returnBook(title: String) {
        val book = books.find { it.title == title }
        book?.isCheckedOut = false
    }
}