import CoreClasses.Paper;
import CoreClasses.Pen; 
import Task.Task1;
import Task.Task2;  

class DeadLockExample{
    public static void main(String[] args){
        Pen pen = new Pen();
        Paper paper = new Paper();
        Task1 task1 = new Task1(pen, paper);
        Task2 task2 = new Task2(pen, paper);
        Thread thread1 = new Thread(task1, "Thread-1");
        Thread thread2 = new Thread(task2, "Thread-2");
        thread1.start();
        thread2.start();
    }
}