/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.problema3;

/**
 *
 * @author garya
 */
public class ImplLeakyStack<E> implements LeakyStack {
    int size;
    int num;
    CircularLinkedList<Object> lista=new CircularLinkedList<>();
    ImplLeakyStack(int cantUndo){
        num=cantUndo;
    }
      @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
       if(size==0) {
           return true;
                   }
       else{
           return false;
       }
               
    }

    @Override
    public Object saveHistory(Object e) {
        lista.addFirst(e);
        size++;
        return e;
    }

    @Override
    public Object actual() {
       return lista.first();
    }

    @Override
    public Object undo() throws IllegalArgumentException  {
        if(isEmpty()){
            return null;
        }
        else{
             lista.removeFirst();
             return lista.first();
        }
    }
    
}
