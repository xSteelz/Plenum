package sumamaximatriangulo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author steel
 */
public class SumaMaximaTriangulo {

    static StringBuffer sb = new StringBuffer();
    static int lineas = 0;
    
    public static void main(String[] args) throws IOException {
        
        String txt = Read();
        String[] txtlist = txt.split(" |\\r?\\n");
        System.out.println(Arrays.toString(txtlist));
        System.out.println(txtlist.length);
        int[][] bArr = new int[lineas][lineas];
        
        bArr = FillArray(bArr, txtlist);
        
        System.out.println(Arrays.deepToString(bArr));
    }
    
    public static String Read() throws FileNotFoundException, IOException
    {
        File file;
        javax.swing.JFileChooser fc= new javax.swing.JFileChooser();
        fc.showOpenDialog(fc);
        try{
            String path= fc.getSelectedFile().getAbsolutePath(), txt;
            file = new File(path);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            while((txt = br.readLine())!=null)
            {
                sb.append(txt+"\n"); lineas++;
            }

            return sb.toString();
        }
        catch(NullPointerException e){}
        return null;
    }
    
    public static int[][] FillArray(int bArr[][], String txtlist[])
    {
        int intArr = 0;
        for(int i = 0; i < lineas; i++)
        {
            for(int j = 0; j <= i; j++)
            {
                if(intArr < 120)
                bArr[i][j] = Integer.parseInt(txtlist[intArr]);
                
                intArr++;
            }
        }
        
        return bArr;
    }
}
