public class Printer {


    private int paperLeft;

    public Printer(int paperLeft) {
        this.paperLeft = paperLeft;
    }

    public int getPaperLeft() {
        return this.paperLeft;
    }

    public void print(int numberOfPages, int numberOfCopies) {
        if(numberOfPages <= paperLeft) {
            this.paperLeft -= (numberOfPages * numberOfCopies);
        }
        else {

        }
    }

    public void refill() {
        this.paperLeft = 10;
    }
}
