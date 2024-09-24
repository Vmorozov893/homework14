public abstract class EngineTransport extends Transport implements Serviceable{
    public EngineTransport(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    private void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void service() {
        super.service();
        this.checkEngine();
    }
}
