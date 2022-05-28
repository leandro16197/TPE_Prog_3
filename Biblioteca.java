

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class Biblioteca {
    ArrayList<Libro> libros;
    private String genero;
    private Biblioteca izquierda;
    private Biblioteca derecha;

    public Biblioteca(){
        this.libros=new ArrayList<>();
    }


    public void addLibros(Libro l){
      Iterator<String> it=l.getGeneros().iterator();
      while(it.hasNext()){
          String g=it.next();
          addLibro(l,g);
      }
    }

    private void addLibro(Libro l, String g) {
        if(this.genero==null) {
            this.genero=g;
            this.libros.add(l);
            return;
        }else if(this.genero.equals(g)){
            this.libros.add(l);
            return;
        } else {
            if(this.genero.compareTo(g)>0){
                if(this.izquierda!=null){
                    this.izquierda.addLibro(l,g);
                }else {
                    this.izquierda=new Biblioteca();
                    this.izquierda.addLibro(l,g);
                }
            }else{
                if(this.genero.compareTo(g)<0){
                    if(this.derecha!=null){
                        this.derecha.addLibro(l,g);
                    }else {
                        this.derecha=new Biblioteca();
                        this.derecha.addLibro(l,g);
                    }

                }

            }

        }
    }


    public ArrayList buscarPorGenero(String g){
        ArrayList aux=new ArrayList();
        if(this.genero.compareTo(g)==0){
            return this.libros;
        }
        if(this.genero.compareTo(g)>0){
            if(this.izquierda!=null){
                return this.izquierda.buscarPorGenero(g);
            }
        }
        if(this.genero.compareTo(g)<0){
            if(this.derecha!=null){
                return this.derecha.buscarPorGenero(g);
            }
        }
        return aux;
    }

}
