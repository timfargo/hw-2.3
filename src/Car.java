public class Car extends WheelableTransport implements Servicable {

    public Car(String modelName,int wheelsCount){
        super(modelName,wheelsCount);
    }

        public void updateTyre() {
            System.out.println("Меняем покрышку машины");
        }

        public void checkEngine() {
            System.out.println("Проверяем двигатель машины");
        }

            @Override
                    public void check(){
                System.out.println("Обслуживаем"+ getModelName());
                for (int i=0;i<getWheelsCount();i++) {
                    updateTyre();
                }
                    checkEngine();
                }
            }



