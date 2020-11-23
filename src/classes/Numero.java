


    // [ " CRIADOR: LUIZ ÂNGELO MARTINS " ]:



// PACOTE DA CLASSE:
package classes;


// IMPORTAÇÃO DE BIBLIOTECAS:
import java.util.Random;


// MÉTODO PRINCIPAL:
public class Numero {
    
    
    // DECLARAÇÃO DE VARIAVEIS E OBJETOS:
    Random aleatorio = new Random();

    
    // FUNÇÃO PARA GERAR OS NÚMEROS ALEATÓRIOS:
    public void gerando_numero( int quantia_a_gerar, int limite_gerador ) {
        
        int numero = 0;
        numero = aleatorio.nextInt(limite_gerador);
        System.out.println(numero);
         
    }
    
    
}




