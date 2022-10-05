public class Book {
    String bookName;
    Author author;
    int published;



    public Book(String bookName, Author author, int published) {
        this.bookName = bookName;
        this.author = author;
        this.published = published;
    }

    public String getBookName() {
        return bookName;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublished() {
        return published;
    }

    public void setPublished(int published) {
        this.published = published;
    }
}

public Static void addBook (Book book){
        boolean bookAdded=false;
        for(int i=0;i<books.length;i++){
        if(books[i]==null){
        books[i]=book;
        bookAdded=true;
        break
        }
        }
        if(!bookAdded){
        System.out.println("Нет места для новых книг");
        }
        }
        public String extendedBook info(Stringtitle){
        String result=null;
        for(Book book:books){
        if(book.getTitle().equals(title)){
        returnString.format(%s by%s was published in%s,book.getTitle(),book.getAuthor(),book.getPublicationYear());
        }
        }
        return result;
        }
        public void ChangePublicationYear (Stringtitle, int newPublicationYear){
    for (Book book: books){
        if (book. getTittle(). equals(title)){
            book. setPublicationYear (newPublicationYear);
                    }
        }
    public class Library{
        private final Book[] books;
        public Library (int librarySize){
            this.books = new Book [LibrarySize];
        }
    }
        }