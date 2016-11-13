package Context.Factory;


import Strategy.Escudo.Escudo;
import Strategy.Escudo.EscudoFogo;
import Strategy.Escudo.EscudoNeve;
import Strategy.Escudo.EscudoTerra;
import Strategy.Escudo.EscudoVento;
import java.util.Random;


// a cadeia de escudos retornada sera gerada aleatoriamente
public class FabricaDeEscudos {
    private static FabricaDeEscudos instancia = new FabricaDeEscudos(); // atributo que guarda a unica instancia da classe
    
    
    private FabricaDeEscudos(){ 
        super();
    }
    
    public Escudo criarCadeiaEscudos(){
        Escudo escudoneve = new EscudoNeve();
        Escudo escudoterra = new EscudoTerra();
        Escudo escudofogo = new EscudoFogo();
        Escudo escudovento = new EscudoVento();
       
        int tipo;
        Random gerador = new Random();
        tipo = gerador.nextInt(3);
        if(tipo == 0){
        escudoneve.setSucessor(escudoterra);
        escudoterra.setSucessor(escudofogo);
        escudofogo.setSucessor(escudovento);
        escudovento.setSucessor(null);
        }
        if(tipo == 1){
          escudoneve.setSucessor(escudovento);
          escudovento.setSucessor(escudoterra);
          escudoterra.setSucessor(null);
        }
        if(tipo == 2){
          escudoneve.setSucessor(escudofogo);
          escudovento.setSucessor(null);
        }
      return escudoneve;  
    }
    
     public Escudo criarCadeiaEscudosNivelFacil(){ // no nivel facil jogadores tem todos os escudos para facilitar a defesa
        Escudo escudoneve = new EscudoNeve();
        Escudo escudoterra = new EscudoTerra();
        Escudo escudofogo = new EscudoFogo();
        Escudo escudovento = new EscudoVento();
       
       escudoneve.setSucessor(escudoterra);
        escudoterra.setSucessor(escudofogo);
        escudofogo.setSucessor(escudovento);
        escudovento.setSucessor(null);
      return escudoneve;  
    }
     
         public Escudo criarCadeiaEscudosNivelNormal(){ // nos niveis medio e avançado o jogador tem menos escudos
        Escudo escudoneve = new EscudoNeve();
        Escudo escudoterra = new EscudoTerra();
        Escudo escudofogo = new EscudoFogo();
  
        escudoneve.setSucessor(escudoterra);
        escudoterra.setSucessor(escudofogo);
        escudofogo.setSucessor(null);
        
      return escudoneve;  
    }
         
        public Escudo criarCadeiaEscudosNivelAvancado(){ 
        Escudo escudoneve = new EscudoNeve();
        Escudo escudoterra = new EscudoTerra();
        
       
       escudoneve.setSucessor(escudoterra);
        escudoterra.setSucessor(null);
        
      return escudoneve;  
    }
    
    
    public static FabricaDeEscudos getInstancia(){
        return instancia;
    }
}
