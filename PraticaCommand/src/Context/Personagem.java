package Context;


import Estado.Estado;
import Estado.EstadoMorto;
import Estado.EstadoNormal;
import Strategy.Ataque.Ataque;
import Strategy.Corrida.Correr;
import Strategy.Decorator.Dano2x;
import Strategy.Decorator.Dano3x;
import Strategy.Decorator.Poder1;
import Strategy.Decorator.Poder2;
import Strategy.Decorator.Poder3;
import Strategy.Pulo.Pular;
import java.util.*;
import java.util.Observable;
import java.util.Observer;

// cada personagem é observado mas tbm atua como observador
// os metodos "update" foram implementados na classe jogador e inimigo, pois estes são observadores.

public abstract class Personagem extends Observable implements Observer {
private Estado estado;
    private Pular p;
    private Correr c;
    private Ataque a;
    private double x;
    private double y;
    private String nome;
    private int vida ;

    public String getNome() {
        return this.nome;
    }
public Personagem(){
    this.estado = new EstadoNormal(this);
    this.vida = 70;
}
    public void decrementarVida(int dano) {
        this.vida = vida - dano;
    }
    public void ganharVida(int moedinha){
        this.vida = vida+moedinha;
    }

    public int getVida() {
        return this.vida;
    }
    public void setVida(int vida){
        this.vida = vida;
    }

    // metodo para decorar o ataque do personagem
    public void adicionarPoderes() {
        this.a = new Poder1(this.a);
        this.a = new Poder2(this.a);
        this.a = new Poder3(this.a);

    }

    
    public void decorarDano1(){
        this.a = new Dano2x(this.a);
    }
    
    public void decorarDano2(){
        this.a = new Dano3x(this.a);
    }
    

    public void setPosicao(double x, double y) {
        this.x = x;
        this.y = y;
        setChanged();
        notifyObservers();
        // implementaçao sem usar a API observable  notificarObservadores();

    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public void setPulo(Pular p) {
        this.p = p;
    }

    public void setCorrer(Correr c) {
        this.c = c;
    }

    public void setAtaque(Ataque a) {
        this.a = a;
    }

    public Ataque getAtaque() {
        return this.a;
    }

    public void pular() {
        p.pular();
    }

    public void correr() {
        c.correr();
    }

    public void atacar(Personagem p){
        a.atacar(p);
    }
    
    public Pular getPulo(){
        return this.p;
    }
    
    public Correr getCorrida(){
        return this.c;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Estado getEstado() {
        return this.estado;
    }

    public void IrPraCima() {
      this.y =   this.y +1; 
       setPosicao(this.x,this.y) ;
    }
    public void IrPraBaixo(){
         this.y =   this.y -1; 
       setPosicao(this.x,this.y) ;
    }
     public void IrPraDireita(){
         this.x =   this.x +1; 
       setPosicao(this.x,this.y) ;
    }
      public void IrPraEsquerda(){
         this.x =   this.x -1; 
       setPosicao(this.x,this.y) ;
    }

    public void abaixar() {

    }

    public void soltaMagia() {
    }
}
