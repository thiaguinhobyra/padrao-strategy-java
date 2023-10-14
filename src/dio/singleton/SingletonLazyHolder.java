package dio.singleton;

public class SingletonLazyHolder {
    private static class InstanciaHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstancia() {
        return InstanciaHolder.instancia;
    }
}
