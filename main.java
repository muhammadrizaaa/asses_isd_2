public class main {
    public static void main(String[] args) {
    minHeap q = new minHeap();
    q.add(new WorkOrder(0, "tes 1"));
    q.add(new WorkOrder(1, "tes 2"));
    q.add(new WorkOrder(2, "tes 3"));
    while (q.size() > 0)
    System.out.println(q.remove());
    }
   }
   