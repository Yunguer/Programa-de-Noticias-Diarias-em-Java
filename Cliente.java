package Questao2;
import java.time.LocalDateTime;
import java.util.ArrayList;

enum Assunto
{
  Esporte,Politica,Cultura; // Enum com Assuntos
}

public class Cliente 
{
    private static int ct=0; // Auto Incrementador do ID
    private int id; // ID do Cliente
    private float debito; // Debito do Cliente
    ArrayList<Assunto> assuntos; // Lista de Assuntos
    
    public Cliente() // Construtor Cliente
    {
        id = ct++;
        debito = 0.00f;
        assuntos = new ArrayList<Assunto>();
    }
    
    public void InserirAssuntos(Assunto assuntos_) // Inseri Assuntos
    {
        assuntos.add(assuntos_);
    }
    
    public void RemoverAssuntos(Assunto assuntos_) // Remove Assuntos
    {
            if(assuntos.contains(assuntos_))
            {
                assuntos.remove(assuntos_);
            }
            else
            {
                System.out.println("Esse assunto não está cadastrado!");
            }
    }
    
    public void ReceberNoticias() // Cria as Noticias
    {
        if(assuntos.size() == 0) // Se size for == 0 não tem assuntos na lista
        {
            System.out.println("O Cliente não tem assuntos cadastrados\n");
            return;
        }
        else
        {
            System.out.println("Imprimindo Noticias:\n");
            Noticia noticia = new NoticiaSimples(); // Cria Noticia Simples
            for(Assunto a : assuntos)
            {
                if(a == Assunto.Esporte)
                {
                    noticia = new NoticiaEsporte(noticia,getMensagemNoticia(a)); // Altera Noticia para uma de Esporte
                    debito += noticia.getValor();
                }
                else if(a == Assunto.Cultura)
                {
                    noticia = new NoticiaCultura(noticia,getMensagemNoticia(a)); // Altera Noticia para uma de Cultura
                    debito += noticia.getValor();
                }
                else if(a == Assunto.Politica)
                {
                    noticia = new NoticiaPolitica(noticia,getMensagemNoticia(a)); // Altera Noticia para uma de Politica
                    debito += noticia.getValor();
                }
            }
            noticia.ImprimirNoticia(); // Imprimi as Noticias
            System.out.printf("Debito total: R$%.2f\n",debito); // Imprimi o Debito
        }        
    }

    
    public String getMensagemNoticia(Assunto assunto) // Função que Escolhe a mensagem por dia da maquina
    {
        String mensagem = "";
        int dia = LocalDateTime.now().getDayOfMonth();
        if(dia > 10 && dia < 20) // Caso o dia atual seja entre 11 a 19 transforma em 1 a 9
        {
            dia = dia%10;
        }
        else if(dia > 20) // Caso o dia atual seja mair que 20 transforma em 1 a 9
        {
            dia = dia%20;
        }
        if(assunto == Assunto.Esporte)
        {
            mensagem = GeradorMensagem.MensagensEsportes.values()[dia-1].toString();
        }
        else if(assunto == Assunto.Cultura)
        {
            mensagem = GeradorMensagem.MensagensCultura.values()[dia-1].toString();
        }
        else if(assunto == Assunto.Politica)
        {
            mensagem = GeradorMensagem.MensagensPolitica.values()[dia-1].toString();
        }
        
        return mensagem; // Retorna a mensagem
    }
    
    public void ImprimirCliente() // Imprimi o cliente
    {
        System.out.println("ID do Cliente: "+id+"\n");
        System.out.println("Assuntos Cadastrados: "+assuntos+"\n");
        System.out.println("Debito do Cliente: "+debito+"\n");
    }
}
