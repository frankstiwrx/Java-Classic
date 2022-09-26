package visao;

import javax.swing.JOptionPane;
import modelo.Produto;

/**
 *
 * @author frank
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       
        String nome = JOptionPane.showInputDialog("Digite o nome do produto 1: ");
        double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o Preço do produto 1: "));
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a Quantidade do produto 1: "));
        
        String nome2 = JOptionPane.showInputDialog("Digite o nome do produto 2: ");
        double preco2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Preço do produto 2: "));
        int quantidade2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a Quantidade do produto 2: "));
        
        
        
        Produto p = new Produto();
        p.AlterarNome(nome);
        p.AlterarPreco(preco);
        p.AlterarQuantidade(quantidade);
        
        Produto p2 = new Produto();
        p2.AlterarNome(nome2);
        p2.AlterarPreco(preco2);
        p2.AlterarQuantidade(quantidade2);
        
        double valortotal1 = quantidade*preco;
        double valortotal2 = quantidade2*preco2;
        double valortotalprodutos = quantidade*preco + quantidade2*preco2;
        
        JOptionPane.showMessageDialog(null,p); 
        JOptionPane.showMessageDialog(null,p2);
        JOptionPane.showMessageDialog(null,"Total de "+nome+ " = " + valortotal1);
        JOptionPane.showMessageDialog(null,"Total de "+nome2+ " = " + valortotal2);
        JOptionPane.showMessageDialog(null,"Total dos produtos = "+valortotalprodutos);
   
        
        
    }

}
