package LAB02;
import java.util.Queue;
import java.util.ArrayDeque;
public class JobQueue {
    private final Queue<Request> theQueue;
    private int numServed;
    private int totalWait;
    private final String queueName;
    public JobQueue(String queueName) {
        this.queueName = queueName;
        this.theQueue = new ArrayDeque<>();
        this.numServed = 0;
        this.totalWait = 0;
    }
    public void checkNewArrival(int clock, int numPages, boolean showAll) {
        int procTime = (int) Math.ceil(((double) numPages) / 10.0);
        Request newRequest = new Request(clock, numPages, procTime);
        theQueue.offer(newRequest);
        if (showAll) {
            System.out.println("Time is " + clock + ": " + queueName + " arrival, new queue size is " + theQueue.size());
        }
    }
    public int update(int clock, int printer, boolean showAll) {
        if (!theQueue.isEmpty()) {
            Request nextRequest = theQueue.poll();
            int timeStamp = clock;
            numServed++;
            totalWait += (clock - nextRequest.getArrivalTime());
            if (showAll) {
                System.out.println("Time is " + clock + ": Printer " + printer + " Serving " + queueName + " with time stamp " + timeStamp);
            }
            return clock + nextRequest.getProcessingTime();
        } else {
            if (showAll) {
                System.out.println("Time is " + clock + ": Printer " + printer + " is idle");
            }
            return clock;
        }
    }
    public int getNumServed() {
        return numServed;
    }
    public int getTotalWait() {
        return totalWait;
    }
    public void setArrivalRate(double arrivalRate) {
    }
    public boolean isEmpty() {
        return theQueue.isEmpty();
    }
}