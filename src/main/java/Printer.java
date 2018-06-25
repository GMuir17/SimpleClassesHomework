public class Printer {

    private int toner;
    private int paperLeft;

    public Printer(int paperLeft, int toner) {
        this.paperLeft = paperLeft;
        this.toner = toner;
    }

    public int getPaperLeft() {
        return this.paperLeft;
    }

    public void print(int numberOfPages, int numberOfCopies) {
        if(numberOfPages <= paperLeft) {
            this.paperLeft -= (numberOfPages * numberOfCopies);
            this.toner -= numberOfPages;
        }
        else {

        }
    }

    public void refill() {
        this.paperLeft = 10;
    }

    public int getToner() {
        return this.toner;
    }
}
