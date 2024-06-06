import java.util.ArrayList;

public class minHeap{
    private ArrayList<Comparable> element;
    public minHeap(){
        element = new ArrayList<Comparable>();
        element.add(null);
    }

    private static int getLeftChildIndex(int index){
        return 2*index;
    }
    private static int getRightChildIndex(int index){
        return 2*index+1;
    }
    private static int getParentIndex(int index){
        return index/2;
    }
    public void add(Comparable newElements){
        element.add(null);
        int index = element.size()-1;
        while (index > 1 && getParent(index).compareTo(newElements) > 0){
            element.set(index, getParentIndex(index));
            index = getParentIndex(index);
        }
        element.set(index, newElements);
    }
    public Comparable peek(){
        return element.get(1);
    }
    public Comparable remove(){
        Comparable minimum = element.get(1);
        int lastIndex = element.size()-1;
        Comparable last = element.remove(lastIndex);
        if(lastIndex>1){
            return element.set(1, last);
            
        }
        return minimum;
    }
    private void fixHeap(){
        Comparable root = element.get(1);

        int lastIndex = element.size()-1;
        boolean more = true;
        int index = 1;
        while(more){
            int childIndex = getLeftChildIndex(index);
            if(childIndex <= lastIndex){
                Comparable child = getLeftChild(index);
                if(getRightChildIndex(index) <= lastIndex && getRightChild(index).compareTo(child) < 0){
                    childIndex = getRightChildIndex(index);
                    child = getRightChildIndex(index);
                }
                if(child.compareTo(root)<0){
                    element.set(index, child);
                index = childIndex;
                } else {
                // Root is smaller than both children
                more = false;
                }
                } else {
                // No children
                more = false;
                }
                }
                // Store root element in vacant slot
                element.set(index, root);
                }
                /**
                 * Returns the number of element in this heap.
                 */
                public int size() {
                return element.size() - 1;
                }
            /**
 * Returns the value of the left child.
 *
 * @param index the index of a node in this heap
 * @return the value of the left child of the given node
 */
 private Comparable getLeftChild(int index) {
    return element.get(2 * index);
    }
    /**
    * Returns the value of the right child.
    *
    * @param index the index of a node in this heap
    * @return the value of the right child of the given node
    */
    private Comparable getRightChild(int index) {
    return element.get(2 * index + 1);
    }
    /**
    * Returns the value of the parent.
    *
    * @param index the index of a node in this heap
    * @return the value of the parent of the given node
    */
    private Comparable getParent(int index) {
    return element.get(index / 2);
    }
   }
        
    

