package numerospalindromos;

import javax.swing.JOptionPane;

/**
 * @author steel
 */
public class NumerosPalindromos {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();

        int num = Number();
        
        sb.append(String.valueOf(num));
        
        if(sb.reverse().toString().equals(String.valueOf(num))){
            System.out.println(true);
        }
        else
            System.out.println(false);
    }
    
    public static int Number()
    {
        int num = 0;
            try{
                num = Integer.parseInt(JOptionPane.showInputDialog( null, "Ingrese el posible palindromo."));
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "No ingresó un numero");
                Number();
            }
            
        return num;
    }
}
