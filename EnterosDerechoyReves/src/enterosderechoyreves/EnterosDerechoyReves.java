package enterosderechoyreves;

import javax.swing.JOptionPane;

/**
 * @author steel
 */
public class EnterosDerechoyReves {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        
        String num = String.valueOf(Number());
        
        if(Integer.parseInt(num) >= 0)
        {
            sb.append(num);
            System.out.println(sb.reverse());
        }
        else
        {
            String nums = num.substring(1, num.length());
            sb.append(nums);
            System.out.println("-" + sb.reverse());
        }
    }

    public static int Number()
    {
        int num = 0;
            try{
                num = Integer.parseInt(JOptionPane.showInputDialog( null, "Ingrese el numero a invertir."));
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "No ingresó un dato valido");
                Number();
            }
        return num;
    }
}
