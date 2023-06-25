package study.semDuaKosongSatuTujuh.Q2;


public interface StackInterface<E> {
    
    
    /**
     * 
     * @return the number of elements int this stack. 
     */
    public int size();
    
    /**
     * 
     * @return the top element of this stack. 
     */
    public E peek ();
    
    /**
     * 
     * @return and remove the top elements in this stack 
     */
    public E pop();
    
    /**
     * 
     * @return the new elements that to the top of this stack 
     */
    public void push(E element);
    
    /**
     * 
     * @return true of the stack is empty 
     */
    public Boolean isEmpty();
}
