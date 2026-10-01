/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividadeavaliativa1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 1667158
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void cadastrarVetsESalas(ArrayList<Veterinario> veterinarios, ArrayList<Sala> salas){
        //veterinarios.add(new Veterinario());
        
        //salas.add(new Sala());
        
    }
    
    public static void main(String[] args) {
        ArrayList<Veterinario> veterinarios = new ArrayList<Veterinario>();
        ArrayList<Sala> salas = new ArrayList<Sala>();
        ArrayList<Atendimento> atendimentos = new ArrayList<Atendimento>();
        ArrayList<Procedimento> procedimentos = new ArrayList<Procedimento>();
        
        cadastrarVetsESalas(veterinarios, salas);
        
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;
        
        do {
            System.out.println( "1. Cadastrar atendimento\n" +
                                "2. Associar um veterinário a uma sala\n" +
                                "3. Atribuir atendimento a uma sala\n" +
                                "4. Exibir todos os atendimentos atribuídos a uma sala específica. Informe também o total de atendimentos ao final.\n" +
                                "5. Informar a quantidade total de atendimentos finalizados por cada sala\n" +
                                "6. Buscar atendimentos por status. É necessário exibir os detalhes do atendimento, incluindo sala e veterinário.\n" +
                                "7. Exibir os detalhes completos de um atendimento específico\n" +
                                "0. Sair");
            opcao = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcao) {
                case 1: 
                    
                    
                    break;
                
                default: break;
            }
        } while (opcao != 0);
    }
}
