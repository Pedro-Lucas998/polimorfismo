package edu.pedrolucas.apps;

public abstract class ServicoMensagemInstantanea {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    // Mais um métodos que todos os filhos deverão implemetar:
    protected abstract void salvarHistoricoMensagem();

    // Somente os filhos os classes que estão no mesmo pacote conhecem este método:
    protected void validarConectadoInternet(){
        System.out.println("Validando se está conectado à internet...");
    };
}
