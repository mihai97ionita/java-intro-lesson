package ro.java.lesson;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String... args) {
        List<ICar> carList = new ArrayList<ICar>();
        carList.add(new BoringCar());
        carList.add(new TurboCar());
        carList.add(new N54());
//        for (ICar car : carList) {
//            if (isCoolCar(car)) {
//                System.out.println("Found a cool car " + car.getClass());
//            }
//
//        }
        carList.forEach((car) -> {
            if (isCoolCar(car)) {
                System.out.println("Found a cool car " + car.getClass());
            }
        });

        Integer x = null;
        try {
            x.byteValue();
        }catch (Throwable e){
            System.out.println("a picat");
        }



    }

    public static boolean isCar(Object object) {
        return object instanceof ICar;
    }

    public static boolean isCoolCar(ICar car) {
        return car instanceof N54;
    }


}

