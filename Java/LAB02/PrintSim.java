package LAB02;
import java.util.Random;
public class PrintSim {
    private final JobQueue tenPageQueue = new JobQueue("10-Page Jobs");
    private final JobQueue twentyPageQueue = new JobQueue("20-Page Jobs");
    private final JobQueue fiftyPageQueue = new JobQueue("50-Page Jobs");
    private final int printer = 3;
    private final int SIMULATION_TIME = 100;
    public void runSimulation() {
        Random random = new Random();
        int[] timeDone = new int[printer];
        int clock = 0; 
        while (clock < SIMULATION_TIME) {
            int numPages = random.nextInt(50) + 1;
            if (numPages < 10) {
                tenPageQueue.checkNewArrival(clock, numPages, true);
            } else if (numPages < 20) {
                twentyPageQueue.checkNewArrival(clock, numPages, true);
            } else {
                fiftyPageQueue.checkNewArrival(clock, numPages, true);
            }
            for (int j = 0; j < printer; j++) {
                if (clock >= timeDone[j]) {
                    timeDone[j] = startServe(j, clock);
                }
            }     
            clock++;
        }
        int totalTime = clock - 1;
        System.out.println("Time required in minutes: " + totalTime);
    }
    private int startServe(int printer, int clock) {
        int nextTime = clock;
        if (!tenPageQueue.isEmpty() || !twentyPageQueue.isEmpty() || !fiftyPageQueue.isEmpty()) {
            if (!tenPageQueue.isEmpty()) {
                nextTime = tenPageQueue.update(clock, printer, true);
            } else if (!twentyPageQueue.isEmpty()) {
                nextTime = twentyPageQueue.update(clock, printer, true);
            } else {
                nextTime = fiftyPageQueue.update(clock, printer, true);
            }
        }
        return nextTime;
    }
    public static void main(String[] args) {
        PrintSim sim = new PrintSim();
        sim.runSimulation();
    }
}