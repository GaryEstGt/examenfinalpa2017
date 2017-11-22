/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.problema2;

import java.util.List;


/**
 *
 * @author garya
 */
public class ImplArrayManipulator<E> implements ArrayManipulator{
    int n;
   int repeticiones=0;

    @Override
    public int subsets(gt.edu.url.problema2.List set) {
          if(set.size()==1){
            String texto="";
                
           texto+=""+set.toString();
           repeticiones++;
            
           System.out.println(texto);
            
        }
        else{
            for (int i = 0; i < n-1; i++) {
                subsets(set);
                set.remove(i);
                
                if(n-1 % 2==0){
                    Object temp=set.get(i);
                    set.add(i, set.get(set.size()-1));
                    set.add(i, temp);
                }
                else{
                    Object temp=set.get(0);
                    set.add(0,set.get(set.size()-1));
                    set.add(set.size()-1, temp);
                }
            }
            subsets(set);
            set.remove(set.size()-1);
         
    }
            return repeticiones; 
    }



  

    
    
}
