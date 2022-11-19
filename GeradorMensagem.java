package Questao2;

public class GeradorMensagem 
{
    
    public enum MensagensEsportes // Enum com as mensagens de esporte
    {
        Texto1("Flamengo é Campeão da Libertadores\n"),
        Texto2("Flamengo é Campeão do Brasileirão\n"),
        Texto3("Flamengo é Campeão do Mundial de Clubes\n"),
        Texto4("Flamengo é Campeão da Serie A\n"),
        Texto5("Flamengo é Campeão da Super Copa\n"),
        Texto6("Flamengo é Campeão do Carioca\n"),
        Texto7("Flamengo é Campeão da Copa do Brasil\n"),
        Texto8("Vasco é rebaixado para Serie B\n"),
        Texto9("Vasco é rebaixado para Serie C\n"),
        Texto10("Brasil é Campeão da Copa do Mundo\n");
        private final String getMensagensEsportes;

        MensagensEsportes(String mensagensEsportes_) {
            getMensagensEsportes = mensagensEsportes_;
        }
        
        @Override
        public String toString() {
            return getMensagensEsportes;
        }
    }
    
    public enum MensagensPolitica // Enum com as mensagens de politica
    {
        Texto1("Governo Brasileiro devolve a liderança do Pais para os Indios\n"),
        Texto2("Planalto pega fogo\n"),
        Texto3("Governador do Rio de Janeiro é preso\n"),
        Texto4("Prefeito do Rio de Janeiro é Preso\n"),
        Texto5("Cabo Daciolo é eleito Presidente (GLORIA A DEUS)\n"),
        Texto6("PEC32 foi revogada\n"),
        Texto7("Bolsonaro recebe outra facada\n"),
        Texto8("Lula perde outro dedo\n"),
        Texto9("Alunos da UFF recebem bolsas de milhoes\n"),
        Texto10("Brasilia sofre atentado terrorista\n");
        private final String getMensagensPolitica;

        MensagensPolitica(String mensagensPolitica_) {
            getMensagensPolitica = mensagensPolitica_;
        }
        
        @Override
        public String toString() {
            return getMensagensPolitica;
        }
    }
    
    public enum MensagensCultura // Enum com as mensagens de cultura
    {
        Texto1("Imagine Dragons lanca novo Album\n"),
        Texto2("A banda Lagum completa 8 anos\n"),
        Texto3("Rock in Rio recebe milhares de pessoas\n"),
        Texto4("Justin Bieber precisou cancelar seu show no Rock In Rio\n"),
        Texto5("Bastille lanca novo Album\n"),
        Texto6("Coldplay faz mais um show de sucesso no Brasil\n"),
        Texto7("OneRepublic lanca novo Album\n"),
        Texto8("Shawn Mendes termina o namoro\n"),
        Texto9("Ed Sheeran lanca novo Album\n"),
        Texto10("Melim faz mais um show de sucesso\n");
        private final String getMensagensCultura;

        MensagensCultura(String mensagensCultura_) {
            getMensagensCultura = mensagensCultura_;
        }
        
        @Override
        public String toString() {
            return getMensagensCultura;
        }
    }
}
