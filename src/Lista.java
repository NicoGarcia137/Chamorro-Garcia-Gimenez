import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public  class  Lista<T> {

    //Methods
    public <T> void mostrar(List<T> milista)
    {
      for(int i=0;i<milista.size();i++)
      {
          System.out.println(milista.get(i).toString());
      }
    }
    public <T> void agregar(T dato,List<T> milista)
    {
        if ((dato!=null)&&(milista!=null)){
            milista.add(dato);}
    }

    public <T> int buscar(T dato,List<T>miLista)
    {
        int flag=0;
        int pos=-1;
        if ((dato!=null)&&(miLista!=null))
        {
           for(int i=0;i<miLista.size()&&flag==0;i++){
               if(miLista.get(i).equals(dato)==true)
               {
                   pos=i;
                   flag=1;
               }
           }
        }
        return pos;
    }

    public <T> void eliminar(T dato,List<T>miLista)
    {
        int pos=buscar(dato,miLista);
        if (pos!=-1)
        {
            miLista.remove(pos);
        }
        else
            System.out.println("El elemento a eliminar no se encuentra en su lista!\n");
    }

}
