public class main {
    public static void main(String[] args) {
    minHeap q = new minHeap();
    q.add(new WorkOrder("biru", "Nur Aisyah", 30));
    q.add(new WorkOrder("merah", "Rima", 20));
    q.add(new WorkOrder("hijau", "Kira", 10));
    while (q.size() > 0){
        System.out.println(q.remove());
    }
    }
   }
   