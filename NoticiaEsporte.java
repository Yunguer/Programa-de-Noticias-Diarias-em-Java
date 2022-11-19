package Questao2;

public class NoticiaEsporte extends NoticiaDecorator // Decorator Noticia Esporte
{
    private String mensagem;
            
    public NoticiaEsporte(Noticia noticia_,String mensagem_) // Construtor
    {
        super(noticia_);
        mensagem = mensagem_;
    }
    
    @Override
    public String getAssunto() // Pega Assunto + Esporte
    {
        return super.getAssunto()+"Esporte\n";
    }
    
    @Override
    public String getMensagem() // Pega mensagem + mensagem atual
    {
        return super.getMensagem()+mensagem; 
    }
    
    @Override
    public float getValor() // Pega valor + o valor da mensagem de esporte
    {
        return super.getValor()+ 1.20f ;
    }
    
    @Override
    public void ImprimirNoticia() // Imprimi noticia
    {
        System.out.println("Assuntos:\n"+getAssunto());
        System.out.println("");
        System.out.println("Mensagens:\n"+getMensagem());
    }
}
