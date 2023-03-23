
package actividad2303;

import java.io.FileReader;
import java.io.IOException;

public class Actividad2303 {

    public static void main(String[] args) {
     String texto = "";
FileReader in = null;
try {
//notas.txt debe estar en la carpeta del proyecto:
in = new FileReader("notas.txt");
int c = in.read();
while (c != -1) {
texto = texto + (char) c;
c = in.read();
}
} catch (IOException ex) {
System.out.println(ex.getMessage());
}
System.out.println(texto);
}
    }
    

