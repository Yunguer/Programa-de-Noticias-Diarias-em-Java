package Questao2;

public class NoticiaCultura extends NoticiaDecorator // Decorator Noticia Cultura
{
    private String mensagem;
    
    public NoticiaCultura(Noticia noticia_,String mensagem_) // Construtor
    {
        super(noticia_);
        mensagem = mensagem_;
    }
    
    @Override
    public String getAssunto() // Pega Assunto + Cultura
    {
        return super.getAssunto()+"Cultura\n";
    }
    
    @Override
    public String getMensagem() // Pega mensagem + mensagem atual
    {
        return super.getMensagem()+mensagem; 
    }
    
    @Override
    public float getValor() // Pega valor + o valor da mensagem de cultura
    {
        return super.getValor()+ 1.30f ;
    }
    
    @Override
    public void ImprimirNoticia() // Imprimi noticia
    {
        System.out.println("Assuntos:\n"+getAssunto());
        System.out.println("");
        System.out.println("Mensagens:\n"+getMensagem());
    }
}

