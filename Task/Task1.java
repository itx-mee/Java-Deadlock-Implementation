package Task;
import CoreClasses.Paper;
import CoreClasses.Pen; 

public class Task1 implements Runnable{
    private Pen pen ;
    private Paper paper;

    public Task1(Pen pen, Paper paper){
        this.pen = pen;
        this.paper = paper;
    }

    @Override 
    public void run(){
        // synchronized(paper){ //solution for deadlock
            pen.writeWithPenAndPaper(paper);
        // }
    }
}