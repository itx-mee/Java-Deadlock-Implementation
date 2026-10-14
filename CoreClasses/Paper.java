package CoreClasses;
public class Paper{
    public synchronized void writeWithPenAndPaper(Pen pen){
        System.out.println(Thread.currentThread().getName() + " Acquired lock on paper and waiting for the pen.");
        pen.finishWriting();
    }
     public synchronized void finishWriting(){
        System.out.println(Thread.currentThread().getName() + " Finished writing.");
    }
}