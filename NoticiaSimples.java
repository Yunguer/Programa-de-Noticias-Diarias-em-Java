package Questao2;

public class NoticiaSimples implements Noticia // Classe base de Noticia
{   
    @Override
    public String getAssunto() // Retorna assunto vazio
    {
        return "";
    }
    
    @Override
    public String getMensagem() // Retorna mensagem vazia
    {
        return ""; 
    }
    
    @Override
    public float getValor() // Retorna Valor zerado
    {
        return 0f;
    }
    
    @Override
    public void ImprimirNoticia() // Imprimi a noticia
    {
        System.out.println("Assuntos:\n"+getAssunto());
        System.out.println("");
        System.out.println("Mensagens:\n"+getMensagem());
    }
}
