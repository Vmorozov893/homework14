public abstract class Transport implements Serviceable {
    private final String modelName;
    private final int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    private void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    @Override
    public void service() {
        System.out.println(this.toString());
        for (int i = 0; i < this.wheelsCount; i++) {
            this.updateTyre();
        }
    }

    @Override
    public String toString() {
        return "Транспорт: " +
                "название - " + modelName +
                ", количество колес - " + wheelsCount +
                '.';
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }
}
