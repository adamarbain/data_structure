package week8.lab.Q3;

public class ComparableBook implements Comparable<ComparableBook> {
    private int id;
    private String title;

    public ComparableBook(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public int compareTo(ComparableBook o) {
        if (this.id > o.id) {
            return 1;
        } else if (this.id < o.id) {
            return -1;
        } else {
            return 0;
        }
    }

    public String toString() {
        return "Book ID: " + id + " Title: " + title;
    }
}
