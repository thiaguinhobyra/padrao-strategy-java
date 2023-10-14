import dio.facade.Facade;
import dio.singleton.SingletonEager;
import dio.singleton.SingletonLazy;
import dio.singleton.SingletonLazyHolder;
import dio.strategy.Comportamento;
import dio.strategy.ComportamentoDefensivo;
import dio.strategy.ComportamentoNormal;
import dio.strategy.ComportamentoOfensivo;
import dio.strategy.Robo;

public class App {
    public static void main(String[] args) {
        // Singleton
        System.out.println("Singleton");
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        System.out.println();

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);
        System.out.println();

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        System.out.println();

        // Strategy
        System.out.println("Strategy");
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento ofensivo = new ComportamentoOfensivo();
    
        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        System.out.println();
        robo.setComportamento(ofensivo);
        robo.mover();
        robo.mover();
        System.out.println();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.mover();
        System.out.println();

        // Facade
        System.out.println("Facade");
        Facade facede = new Facade();
        facede.migrarCliente("thiago", "65400000");
    }
}
