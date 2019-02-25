package listadecompras;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Dados extends Compra{
    
    
    ArrayList<Compra> compras = new ArrayList();
    
    public void addItem(Compra compra){
        compras.add(compra);
    }
    
    public void remItem(Compra compra){
        compras.remove(compra);
    }
    
    public String numCompras(){
        return compras.size() + "";
    }
    
    public String salvar(){
        
        try{
            
            FileWriter fw = new FileWriter("compras.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println("                      ");
            pw.println("                      ");
            pw.println("Nome: " + this.getNome());
            pw.println("Preço: " + this.getPreco());
            this.setPrecoTotal(this.getPrecoTotal()+this.getPreco());
            pw.println("Quantidade: " + this.getQuantidade());
            pw.println("                      ");
            pw.println("                      ");
            pw.println("PREÇO TOTAL DA LISTA: "+ this.getPrecoTotal());
            pw.println("______________________");
            pw.flush();
            pw.close();
            fw.close();
            
        }catch(IOException ex){
            Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return "Item adicionado com sucesso!";
    }
    
    public String deletar(){
        File file = new File( "compras.txt" );
        file.delete();
        return "Lista apagada com sucesso!";
    }
    
    public void mostrar(){
        try {
            java.awt.Desktop.getDesktop().open( new File( "compras.txt" ) );
        } catch (IOException ex) {
            Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
