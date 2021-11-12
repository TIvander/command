public class Carro {

    public void executarComando(Comando comando) {
        comando.executar();
    }

    public void cancelarComando(Comando comando) {
        comando.cancelar();
    }
}
