package edu.pedrolucas.apps;

public class FacebookMessenger extends ServicoMensagemInstantanea {

    @Override
    protected void validarConectadoInternet() {
        super.validarConectadoInternet();
    }

    @Override
    public void enviarMensagem() {
        System.out.println("Enviando mensagem pelo Facebook Messanger...");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Facebook Messanger...");
    }

    @Override
    public void salvarHistoricoMensagem() {
        System.out.println("Salvando mensagem no histórico do Facebook Messanger...");
    }
}
