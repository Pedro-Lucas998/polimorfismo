package edu.pedrolucas.apps;

public class MSNMessenger extends ServicoMensagemInstantanea{

    @Override
    protected void validarConectadoInternet() {
        super.validarConectadoInternet();
    }

    @Override
    public void enviarMensagem() {
        System.out.println("Enviando mensagem pelo MSNMensagem..");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo MSNMensagem...");
    }

    @Override
    public void salvarHistoricoMensagem() {
        System.out.println("Salvando mensagem no histórico do MSNMensagem...");
    }
}
