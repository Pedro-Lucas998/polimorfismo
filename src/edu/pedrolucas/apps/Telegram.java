package edu.pedrolucas.apps;

public class Telegram extends ServicoMensagemInstantanea{

    @Override
    protected void validarConectadoInternet() {
        super.validarConectadoInternet();
    }

    @Override
    public void enviarMensagem() {
        System.out.println("Enviando mensagem pelo Telegram...");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Telegram...");
    }

    @Override
    public void salvarHistoricoMensagem() {
        System.out.println("Salvando mensagem no histórico do Telegram...");
    }
}
