


    // [ " CRIADOR: LUIZ ÂNGELO MARTINS " ]:



// PACOTE DA CLASSE:
package numeroaleatorio;


// IMPORTAÇÃO DE BIBLIOTECA:
import classes.Numero;
import java.util.Scanner;


// MÉTODO PRINCIPAL:
public class Menu {
    
    
    // DECLARAÇÃO DE VARIAVEIS E OBJETOS:
    int valor1 = 0;
    int valor2 = 0;
    Numero gerador = new Numero();
    
    
    // FUNÇÃO PARA EXIBIÇÃO DO MENU E ENTRADA DE DADOS:
    public void exibir_menu() {

        System.out.println("");
        System.out.println("");
        System.out.println("GERADOR DE NÚMERO ALEATÓRIO:");
        System.out.println("");
        
        System.out.printf("DESEJA GERAR QUANTOS NÚMEROS: ");
        Scanner quantia_de_numeros = new Scanner(System.in);
        valor1 = quantia_de_numeros.nextInt();
        
        System.out.printf("DESEJA GERAR NÚMEROS ENTRE QUAL INTERVALO ?: 0 - ");
        Scanner intervalo_de_numeros = new Scanner(System.in);
        valor2 = intervalo_de_numeros.nextInt();
        
        gerador.gerando_numero(valor1, valor2);
        
    }

    
}




