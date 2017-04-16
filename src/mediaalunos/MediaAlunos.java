package mediaalunos;

import java.util.*;

public class MediaAlunos {

    
    public static void main(String[] args) {
        
        // Quantidade de alunos
        int quantidadeAlunos = 3;
        
        // Variáveis locais para leitura do teclado
        String nome = "";
        double nota1 = 0.0;
        double nota2 = 0.0;
        
        // Objeto para leitura de dados do teclado
        Scanner leitura = new Scanner (System.in);
        
        // Le a quantidade de alunos
        System.out.println ("Informe a quantidade de alunos: ");
        quantidadeAlunos = leitura.nextInt ();
        
        // Vetor com objetos da classe Aluno criado com QUANTIDADE elementos
        Aluno [] aluno = new Aluno [quantidadeAlunos];
        
        // Leitura dos nomes e notas dos alunos
        for (int i = 0; i < quantidadeAlunos; ++ i) {
            
            System.out.print ("Informe o nome do aluno #" + (i + 1) + ": ");
            nome = leitura.next ();
            
            System.out.print ("Informe a primeira nota do aluno #" + (i + 1) + ": ");
            nota1 = leitura.nextDouble ();
            
            System.out.print ("Informe a segunda nota do aluno #" + (i + 1) + ": ");
            nota2 = leitura.nextDouble ();
            
            aluno [i] = new Aluno (nome, nota1, nota2);
        }
        
        // Impressão dos valores lidos e do diagnostico
        for (int i = 0; i < quantidadeAlunos; ++ i) {
            
            System.out.println ("Aluno #" + (i + 1));
            
            System.out.println ("   Nome...........: " + aluno [i].getNome ());
            System.out.println ("   Primeira nota..: " + aluno [i].getNota1 ());
            System.out.println ("   Segunda nota...: " + aluno [i].getNota2 ());
            System.out.println ();
            System.out.println ("    Media.........: " + aluno [i].getMedia ());
            
            System.out.print   ("    Status........: ");
            
            if (aluno [i].getMedia () < 4.0) {
                
                System.out.println ("REPROVADO POR MEDIA");
            } else if (aluno [i].getMedia () >= 7.0) {
                
                System.out.println ("APROVADO POR MEDIA");
            } else {
                
                System.out.println ("NA FINAL");
                
                System.out.println ("    Precisa de....: " + ((50 - (aluno [i].getMedia () * 7.0)) / 3.0));
            }
            
            
            
        }
        
        
    }
    
}
