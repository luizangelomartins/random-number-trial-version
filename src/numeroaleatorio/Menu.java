


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
    int escolha = 0;
    int repetir = 1;
    Numero gerador = new Numero();
    
    
    // FUNÇÃO PARA EXIBIÇÃO DO MENU E ENTRADA DE DADOS:
    public void exibir_menu() {

        while ( repetir != 0 ) {
            
        // EXIBIÇÃO/CONSTRUÇÃO DO MENU:
        System.out.println("GERADOR DE NÚMERO ALEATÓRIO:");
        System.out.println("");
        System.out.println("0 - SAIR.");
        System.out.println("1 - GERAR NÚMERO(S) ALEATÓRIO(S).");
        System.out.println("");
        System.out.printf("DIGITE SUA RESPOSTA: ");
        Scanner escolha_usuario = new Scanner(System.in);
        escolha = escolha_usuario.nextInt();
        
            // "FILTRAGEM DA ESCOLHA DO USUARIO":
            switch ( escolha ) {
                
                // CASO "0" - SAIR:
                case 0:
                    repetir = escolha;
                break;
                    
                // CASO "1" - GERAR NÚMERO(S) ALEATÓRIO(S):
                case 1:
                    System.out.println("");
                    System.out.printf("DESEJA GERAR QUANTOS NÚMEROS: ");
                    Scanner quantia_de_numeros = new Scanner(System.in);
                    valor1 = quantia_de_numeros.nextInt();
                    System.out.printf("DESEJA GERAR NÚMEROS ENTRE QUAL INTERVALO ?: 0 - ");
                    Scanner intervalo_de_numeros = new Scanner(System.in);
                    valor2 = intervalo_de_numeros.nextInt();
                    gerador.gerando_numero(valor1, valor2);
                break;
                
                // VALORES INVALIDOS:
                default:
                    System.err.println("POR FAVOR DIGITE UM VALOR VALIDO!");
                    System.err.println("TENTE NOVAMENTE!");
                    
        }
        
            
    }
        
    System.out.println("");
        
    }

    
}




