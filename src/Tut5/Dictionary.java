package Tut5;

public class Dictionary extends Book{
    private int words; // number of words in the dictionary

    Dictionary(int words, int pages) {
        super(pages);
        // missing line 1 goes here - should call the parent constructor here
        this.words = words;
    }
    /*** for subquestion 2 implement toString() here ***/
    public String toString() {
        String s = "Number of pages: " + super.toString();
        s = s + ", Number of words: " + words;
        return s;
    }
}
