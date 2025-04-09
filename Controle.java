package jogodamemoria;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import jogodamemoria.PintarBotoes;
import jogodamemoria.Tela;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Controle {
    
    private String jogador;
    private int pontuacao;
    private int rodada;
    private List<Integer> sequenciaAtual;
    private List<Integer> cliquesJogador;
    private int indiceCliqueAtual;
    
    private String dificuldade;
    
    /*Instancia da Tela*/
    private Tela telaPrincipal;
    /* Vetor de JButtons que irá referencia os botões da tela e permitir a sua manipulação através do controle */
    private JButton[] listaBotoes;
    private JButton botaoIniciar;
    
    /***************** Semáforos ***************** */
    private boolean sequenciaAutomaticaIniciada;
    private boolean rodadaIniciada;
    private boolean jogoIniciado;
    
    /*Variavel que controle o tempo que o botão piscará*/
    int delay;
    
    public Controle(Tela telaPrincipal) {        
        this.telaPrincipal=telaPrincipal;
        this.listaBotoes=telaPrincipal.obterInstanciaBotoesAcao();
        this.botaoIniciar=telaPrincipal.obterInstaciaBotaoIniciar();
    }
    public void iniciarNovoJogo(String jogador, String dificuldade){
        
        this.dificuldade= dificuldade;
        this.jogador = jogador;
        pontuacao=0;
        rodada=0;
        delay=500;
        
        sequenciaAtual = new ArrayList<>();
        cliquesJogador = new ArrayList<>();
        
        jogoIniciado = true;
        botaoIniciar.setEnabled(false);
        
        
    }
    public void iniciarRodada(){
        
        System.out.println("Rodada: " + rodada);
System.out.println("Sequência: " + sequenciaAtual);

        rodada++;
        rodadaIniciada = true;
        sequenciaAutomaticaIniciada = true;
        
        // Adicinoar 1 número na sequencia
        adicionarNumeroNaSequencia();
        
        cliquesJogador.clear();
        indiceCliqueAtual = 0;
        
        JButton[] botoesSequencia = new JButton[sequenciaAtual.size()];
        for(int i = 0; i < sequenciaAtual.size(); i++){
            botoesSequencia[i] = listaBotoes[sequenciaAtual.get(i)];
        }
        
        // Piscar botões
        
        pintarBotoesSequencia(botoesSequencia);
        
        telaPrincipal.atualizarRodada(String.valueOf(rodada));
        telaPrincipal.atualizarPontuacao(String.valueOf(pontuacao));
        botaoIniciar.setEnabled(false);
        
    }
    public void acaoClick(java.awt.event.MouseEvent evt){
        System.out.println("Clique detectado. Automática? " + sequenciaAutomaticaIniciada + " | Rodada iniciada? " + rodadaIniciada);
        if(sequenciaAutomaticaIniciada || !rodadaIniciada) return;
        
        JButton botaoClicado = (JButton) evt.getSource();
        int indiceBotao = -1;
        
        for(int i = 0; i < listaBotoes.length; i++){
            if(listaBotoes[i] == botaoClicado){
                indiceBotao = i;
                break;
            }
        }
        
        if(indiceBotao == -1) return;
        
        final int indiceBotaoFinal = indiceBotao;
        
        cliquesJogador.add(indiceBotao);
        
        PintarBotoes.piscarBotoes(botaoClicado, delay, () -> {
            if(!validaSequencia(indiceBotaoFinal)){
            sequenciaInvalida();
            return;
            }

            indiceCliqueAtual++;

            if(indiceCliqueAtual == sequenciaAtual.size()){
                sequenciaValida();
            }
        });
        
    }    
//    private void callbackAcaoClick(){;
//        /*Método executado quando a ação de piscar botão for finalizada*/
//        JOptionPane.showMessageDialog(null, "Foi!");
//    }
//    
    private void pintarBotoesSequencia(JButton[] botoes){
        System.out.println("Vai piscar os botões da sequência: " + sequenciaAtual);
        PintarBotoes.piscarBotoes(botoes, delay, () -> {
            sequenciaAutomaticaIniciada = false;
//             tste
//            if(rodada == 1){;
//                JOptionPane.showMessageDialog(null, "Sua vez");
//            }
        });
    }
    
    private void callbackPintarBotoesSequencia(){
        /*Método executado quando a ação de piscar os botões em sequencia for finalizada*/
        sequenciaAutomaticaIniciada = false;
        JOptionPane.showMessageDialog(null, "Agora é sua vez!");
    }
    
    private boolean validaSequencia(int botaoClicado){
        
        int esperado = sequenciaAtual.get(indiceCliqueAtual);        
        return botaoClicado == esperado;
        
    }
    
    
    private void sequenciaValida(){
        pontuacao+=10;
        rodadaIniciada = false;
        // teste JOptionPane.showMessageDialog(null, "Rodada completa!");
        botaoIniciar.setEnabled(true);
        
        new Thread(() -> {
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            iniciarRodada();
        }).start();
    }
    private void sequenciaInvalida(){
        rodadaIniciada = false;
        jogoIniciado = false;
        botaoIniciar.setEnabled(false);
        
        JOptionPane.showMessageDialog(null, "Game Over!");
    }
    
    private JButton[] gerarSequenciaBotoes(int qtdSequencias){
        /*Utilizando a sequencia numérica aletoria, converte essa sequencia em uma sequencia de botões utilizando a ListaBotoes*/
        JButton[] botoes = new JButton[qtdSequencias];
        
        for(int i = 0; i <qtdSequencias; i++){
            int index = sequenciaAtual.get(i);
            botoes[i] = listaBotoes[index];
        }
        
        return botoes;
    }
    private void adicionarNumeroNaSequencia(){
        Random random = new Random();
        int numeroAleatorio =  random.nextInt(listaBotoes.length);
        sequenciaAtual.add(numeroAleatorio);
    }
    
}
