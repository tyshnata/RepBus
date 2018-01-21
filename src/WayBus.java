public class WayBus {
    static int pathLenght = 0, //длина пути автобуса между начальным и конечным пунктами
            lenght = 0, // расстояние между заданными остановками
            lenght1 = 0, //
            lenght2 = 0; //
    static TheBusIsRiding[] wayBus = new TheBusIsRiding[10]; //


    public static void main(String args[]) {
        int pathLenght = 0; //длина пути автобуса между начальным и конечным пунктами
        wayBus[0] = new TheBusIsRiding("A", 0);
        wayBus[1] = new TheBusIsRiding("B", 1);
        wayBus[2] = new TheBusIsRiding("C", 2);
        wayBus[3] = new TheBusIsRiding("D", 3);
        wayBus[4] = new TheBusIsRiding("E", 4);
        wayBus[5] = new TheBusIsRiding("F", 5);
        wayBus[6] = new TheBusIsRiding("G", 6);
        wayBus[7] = new TheBusIsRiding("H", 7);
        wayBus[8] = new TheBusIsRiding("I", 8);
        wayBus[9] = new TheBusIsRiding("J", 9);


        DistanceBetweenStop("B", "J"); //считаем расстояние между заданными остановками

    }

    public static void DistanceBetweenStop(String stopOne, String stopEnd) { // расстояние между заданными остановками

        int i1 = 0, i2 = 0; // индексы остатовок, между которыми считаем расстояние

        for (int i = 0; i < wayBus.length; i++) { // расстояние между первым и последним пунктами
            pathLenght += wayBus[i].kilometers;
        }
        //System.out.println(pathLenght);

        for (int i = 0; i < wayBus.length; i++){ // индекс остановки, от которой считать расстояние
            if (wayBus[i].stopBus == stopOne){
                i1 = i;
            }
        }

        for (int i = 0; i < wayBus.length; i++){ // индекс остановки, до которой считать расстояние
            if (wayBus[i].stopBus == stopEnd){
                i2 = i;
            }
        }

        int n = i2 - i1; // количество остановок, между заданными

        if ( n<= (wayBus.length/2)){            // если между заданными остановками остановок не больше 1/2
            for (int i = i1 + 1; i<= i2; i++){  // всех остановок
                lenght += wayBus[i].kilometers;
            }
            System.out.println (lenght);
        }
        else {                                  // если между заданными остановками остановок больше 1/2
            for (int i = 0; i <= i1; i++){      // всех остановок
                lenght1 += wayBus[i].kilometers;
            }
            //System.out.println (lenght1);
            for (int i = i2 + 1; i < wayBus.length; i++){
                lenght2 += wayBus[i].kilometers;
            }
            //System.out.println (lenght2);
            lenght = pathLenght - lenght1 - lenght2;
            System.out.println (lenght);
        }
    }

}

