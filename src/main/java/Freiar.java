public class Freiar implements Comando{
    private ControleRemoto controleRemoto;

    public Freiar(ControleRemoto controleRemoto){
        this.controleRemoto.ligado = true;
    }

    @Override
    public void executar() {
        this.controleRemoto.freiar();
    }

    @Override
    public void cancelar() {
        this.controleRemoto.acelerar();
    }
}
