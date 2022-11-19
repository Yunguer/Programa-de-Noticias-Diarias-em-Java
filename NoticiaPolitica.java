package Questao2;

public class NoticiaPolitica extends NoticiaDecorator // Decorator Noticia Politica
{
    private String mensagem;
    
    public NoticiaPolitica(Noticia noticia_,String mensagem_) // Construtor
    {
        super(noticia_);
        mensagem = mensagem_;
    }
    
    @Override
    public String getAssunto() // Pega Assunto + Politica
    {
        return super.getAssunto()+"Politica\n";
    }
    
    @Override
    public String getMensagem() // Pega mensagem + mensagem atual
    {
        return super.getMensagem()+mensagem; 
    }
    
    @Override
    public float getValor() // Pega valor + o valor da mensagem de politica
    {
        return super.getValor()+ 1.10f ;
    }
    
    @Override
    public void ImprimirNoticia() // Imprimi noticia
    {
        System.out.println("Assuntos:\n"+getAssunto());
        System.out.println("");
        System.out.println("Mensagens:\n"+getMensagem());
    }
}
