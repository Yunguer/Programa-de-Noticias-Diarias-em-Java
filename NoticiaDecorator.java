package Questao2;

public abstract class NoticiaDecorator implements Noticia // Decorator Noticia
{
    private final Noticia noticiaDecorator;
    
    public NoticiaDecorator(Noticia noticia_) // Construtor do Decorator
    {
        noticiaDecorator = noticia_;
    }
    
    @Override
    public String getAssunto() // Pega assunto
    {
        return noticiaDecorator.getAssunto();
    }
    
    @Override
    public String getMensagem() // Pega a mensagem
    {
        return noticiaDecorator.getMensagem();
    }
    
    @Override
    public float getValor() // Pega o valor
    {
        return noticiaDecorator.getValor();
    }
    
    public Noticia getNoticia() // Pega a noticia
    {
        return noticiaDecorator;
    }
    
    @Override
    public void ImprimirNoticia() // Imprimi noticia
    {
        System.out.println("Assuntos:\n"+getAssunto());
        System.out.println("");
        System.out.println("Mensagens:\n"+getMensagem());
    }
    
}
