// Justin Ho

package CS113.Homework.HW5;

public class Book {
    int pages;
    String title;
    public int getPages(){
        return this.pages;
    }
    public String getTitle(){
        return this.title;
    }

    public Book(int pages, String title){
        this.pages = pages;
        this.title = title;
    }

    @Override
    public String toString(){
        return "Book title: " + this.title +", Book page count: " + this.pages;

    }

    @Override
    public boolean equals(Object other){
        if (other instanceof Book){
            Book otherBook = (Book)other;
            if(otherBook.title.equals(this.title)){
                return true;
            }
        }
        return false;
    }
    public int compareTo(Book otherBook){
        if(otherBook.pages < this.pages) {
            return 1;
        } else if (otherBook.pages > this.pages) {
            return -1;
        } else{
            // same page count
            return 0;
        }
    }
}
