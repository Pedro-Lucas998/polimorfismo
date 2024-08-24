package edu.pedrolucas.usuario;

import edu.pedrolucas.apps.FacebookMessenger;
import edu.pedrolucas.apps.MSNMessenger;
import edu.pedrolucas.apps.ServicoMensagemInstantanea;
import edu.pedrolucas.apps.Telegram;

public class Usuario {
    public static void main(String[] args) {
        ServicoMensagemInstantanea mensagem = null;

        String appEscolhido = "tele";

        if (appEscolhido.equals("msn")){
            mensagem = new MSNMessenger();
        } else if (appEscolhido.equals("fbm")) {
            mensagem = new FacebookMessenger();
        } else {
          mensagem = new Telegram();
        }

        mensagem.enviarMensagem();
        mensagem.receberMensagem();

    }




}
