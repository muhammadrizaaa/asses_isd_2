public class WorkOrder implements Comparable {
    private int priority;
    private String name;
    private int umur;
    /**
    * Constructs a work order with a given priority and description.
    *
    * @param aPriority the priority of this work order
    * @param aName the description of this work order
    @param aUmur
    */
    public WorkOrder(String aPriority, String aName, int aUmur) {
    if(aPriority.equals("hijau")){
        priority = 0;
    }
    else if(aPriority.equals("merah")){
        priority = 1;
    }
    else if(aPriority.equals("kuning")){
        priority = 2;
    }
    else if(aPriority.equals("biru")){
        priority = 3;
    }
    name = aName;
    umur = aUmur;
    }
    public String toString() {
    return "name pasien= " + name + ", usia= " + umur;
    }
    public int compareTo(Object otherObject) {
    WorkOrder other = (WorkOrder) otherObject;
    if (priority < other.priority) return -1;
    if (priority > other.priority) return 1;
    return 0;
    }
   }