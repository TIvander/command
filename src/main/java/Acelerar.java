public class Acelerar implements Comando{

   private ControleRemoto controleRemoto;

   public Acelerar(ControleRemoto controleRemoto){
       this.controleRemoto.ligado = true;
   }

    @Override
    public void executar() {
        this.controleRemoto.acelerar();
    }

    @Override
    public void cancelar() {
       this.controleRemoto.freiar();
    }
}
