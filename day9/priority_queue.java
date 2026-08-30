package DAY9;

import java.util.PriorityQueue;



class Patient{
    String name;
    int priority;
    Patient(String name, int priority){
        this.name=name;
        this.priority= priority;
    }
}

public class priority_queue {
    public static void main(String[] args) {
        PriorityQueue<Patient> queue=new PriorityQueue<>(
            (p1,p2)->p1.priority-p2.priority);
            queue.add(new Patient("VIJAY THALAPATHY", 2));
            queue.add(new Patient("VINOD", 4));
            queue.add(new Patient("YASH", 9));
            queue.add(new Patient("HRITHIK ROSHAN", 5));
            queue.add(new Patient("RANVEER SINGH", 8));
            while (!queue.isEmpty()) {
                Patient p =queue.poll();
                System.out.println(p.name+ " Priority "+p.priority);

                
            }


        }
    }
	

