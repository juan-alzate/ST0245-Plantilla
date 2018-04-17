public class BinarySearchTree
{
    private Nodo raiz;
    
    public String dibujar(){
        return "digraph G {\n"+dibujar(raiz)+"\n}";
    }
    
    private String dibujar(Nodo n){
        if (n.izquierda != null){
            return n.dato + " ->" + n.izquierda;
        }else{
            return n.dato + " ->" + n.derecha;
        }
    }
    
    private boolean buscar(Nodo nodo, int n){
        if(nodo.dato == n){
            return true;
        }
        if(nodo == null){
            return false;
        }
        if(n > nodo.dato){
            return buscar(nodo.derecha, n);
        }else{
            return buscar(nodo.izquierda, n);
        }
    }
    
    public boolean buscar(int n){
        return buscar(raiz,n);
    }
    
    private void insertar(Nodo nodo, int n){
        if(nodo.dato == n){
            return;
        }
        if(n > nodo.dato){
            if(nodo.derecha == null){}
        }
        else if(n < nodo.dato){
            if(nodo.izquierda == null){}
        }
    }
    
    public void insertar(int n){
        if(raiz == null){
            raiz = new Nodo(n);
        }else{
            insertar(raiz,n);
        }
    }
}
