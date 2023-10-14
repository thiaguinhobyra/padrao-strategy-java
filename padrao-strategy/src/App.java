import dio.strategy.Comportamento;
import dio.strategy.ComportamentoDefensivo;
import dio.strategy.ComportamentoNormal;
import dio.strategy.ComportamentoOfensivo;
import dio.strategy.Robo;

public class App {
    public static void main(String[] args) {
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento ofensivo = new ComportamentoOfensivo();
    
        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(ofensivo);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.mover();
    }
}
