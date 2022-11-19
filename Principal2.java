package Questao2;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal2 {

    public static void main(String[] args) {
        int op = 0;

        Scanner sc = new Scanner(System.in);
        
        ArrayList<Cliente> c = new ArrayList<>(); // Lista de Clientes

        while(op != -1)
        {
            System.out.println("O que deseja fazer?");
            System.out.println("(1 = Deseja criar um Cliente?)\n(2 = Deseja acrescentar um Assunto?)\n(3 = Deseja remover um Assunto?)\n(4 = Receber Mensagens?)\n(5 = Imprimir Cliente?)\n(-1 = Parar)");
            op = sc.nextInt();
            if(op == 1) // Se op == 1 cria cliente
            {
                c.add(new Cliente());
            }
            if(op == 2)  // Se op == 2 adiciona assunto
            {
                int idc;
                System.out.println("Digite o ID do cliente:");
                idc = sc.nextInt();
                if(idc<c.size())
                {
                    System.out.println("Escolha o assunto que deseja inserir");
                    System.out.println("1 = Esporte\n2 = Cultura\n3 = Politica");
                    int opa = sc.nextInt();
                    c.get(idc).InserirAssuntos(getTipoAssunto(opa)); // Adiciona assunto escolhido
                }
                else
                {
                    System.out.println("O ID não existe"); // ID informado não existe
                }
            }
            if(op == 3) // Se op == 3 remove assunto
            {
                int idc;
                System.out.println("Digite o ID do cliente:");
                idc = sc.nextInt();
                if(idc<c.size())
                {
                    System.out.println("Escolha o assunto que deseja remover");
                    System.out.println("1 = Esporte\n2 = Cultura\n3 = Politica");
                    int opa = sc.nextInt();
                    c.get(idc).RemoverAssuntos(getTipoAssunto(opa)); // Remove assunto escolhido
                }
                else
                {
                    System.out.println("O ID não existe"); // ID informado não existe
                }
            }
            if(op == 4) // Se op == 4 mostra noticia dos assuntos
            {
                int idc;
                System.out.println("Digite o ID do cliente:");
                idc = sc.nextInt();
                if(idc<c.size())
                {
                    c.get(idc).ReceberNoticias(); // Imprimir as noticias
                }
                else
                {
                    System.out.println("O ID não existe"); // ID informado não existe
                }
            }
            if(op == 5) // Se op == 5 imprimi o cliente
            {
                int idc;
                System.out.println("Digite o ID do cliente:");
                idc = sc.nextInt();
                if(idc<c.size())
                {
                    c.get(idc).ImprimirCliente(); // Imprimi Cliente
                }
                else
                {
                    System.out.println("O ID não existe"); // ID informado não existe
                }
            }
        }   
    }
    
    public static Assunto getTipoAssunto(int i) // Função auxiliar para pegar o Assunto escolhido
    {
        Assunto assunto = null;
        if(i == 1)
        {
            assunto = Assunto.Esporte;
        }
        else if(i == 2)
        {
            assunto = Assunto.Cultura;
        }
        else if(i == 3)
        {
            assunto = Assunto.Politica;
        }
        
        return assunto;
    }
}
