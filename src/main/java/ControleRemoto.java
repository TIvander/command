public class ControleRemoto {
    private boolean acelerar;
    private boolean freiar;
    public boolean ligado;

    public ControleRemoto(boolean acelerar, boolean freiar, boolean ligado) {
       this.acelerar = acelerar;
       this.freiar = freiar;
       this.ligado = ligado;
    }

    public String getStatus(){
        return this.ligado?"Ligado":"Desligado";
    }

    public void acelerar(){
        this.acelerar = true;
        this.freiar = false;
    }

    public void freiar(){
        this.freiar = true;
        this.acelerar = false;
    }
}
