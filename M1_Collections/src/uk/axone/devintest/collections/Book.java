package uk.axone.devintest.collections;

public class Book implements Comparable<Book>{

    private int bookID;
    private String bookName;

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Book(int bookId, String bookName){
        this.bookID = bookId;
        this.bookName = bookName;
    }

    @Override
    public int compareTo(Book anotherBook) {
       //comparison based on bookID
        Integer bkID = bookID;
        return(bkID.compareTo(anotherBook.bookID));
       /* if(this.bookID > anotherBook.bookID){
            return 1;
        }
        else if (this.bookID < anotherBook.bookID){
            return -1;
        }
        else{
            return 0;
        }*/
        //comparison based on bookName
        //return bookName.compareTo(anotherBook.getBookName());
    }
}
