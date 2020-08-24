public class Printer {

    private int pagesLeft;
    private int tonerLeft;

    public Printer(int pagesLeft, int tonerLeft) {
        this.pagesLeft = pagesLeft;
        this.tonerLeft = tonerLeft;
    }

    public int getPagesLeft() {
        return pagesLeft;
    }

    public void setPagesLeft(int pagesLeft) {
        this.pagesLeft = pagesLeft;
    }

    public int getTonerLeft() {
        return tonerLeft;
    }

    public void setTonerLeft(int tonerLeft) {
        this.tonerLeft = tonerLeft;
    }

    public void print(int pages, int copies) {
        int pagesRequested = pages * copies;
        if (this.pagesLeft > pagesRequested) {
            this.pagesLeft -= pagesRequested;
            this.tonerLeft -= pagesRequested;
        }
    }

}
