package CoreClasses;

public class Pen{
    public synchronized void writeWithPenAndPaper(Paper paper){
        System.out.println(Thread.currentThread().getName() + " Acquired lock on pen and waiting for the paper.");
        paper.finishWriting();;
    }
    public synchronized void finishWriting(){
        System.out.println(Thread.currentThread().getName() + " Finished writing.");
    }
}