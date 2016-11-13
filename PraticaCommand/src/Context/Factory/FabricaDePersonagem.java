package Context.Factory;


import Context.Personagem;


// interface para as fabricas de personagens com diferentes configurações
public abstract class FabricaDePersonagem {
    public abstract Personagem criarJogador();
    public abstract Personagem criarInimigo();
}
