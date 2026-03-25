public class Library {

    private String[] bookTitles;

    public Library(String[] bookTitles) {
        this.bookTitles = bookTitles.clone();
    }

    class BookIterator {
        private int currentIndex = 0;

        public boolean hasNext() {
            return currentIndex < bookTitles.length;
        }

        public String nextTitle() {
            if (!hasNext()) {
                throw new java.util.NoSuchElementException("No more books.");
            }
            return bookTitles[currentIndex++];
        }
    }

    public BookIterator getIterator() {
        return new BookIterator();
    }

    public static void main(String[] args) {
        Library library = new Library(new String[]{
            "Great Expectations",
            "Effective Java",
            "The Alchemist"
        });

        Library.BookIterator iterator = library.getIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.nextTitle());
        }
    }
}