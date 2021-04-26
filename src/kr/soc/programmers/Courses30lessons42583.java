package kr.soc.programmers;

import java.util.ArrayList;
import java.util.LinkedList;

public class Courses30lessons42583 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        class Truck {
            private int weight;
            private int positionOnBridge;

            public Truck(int weight, int positionOnBridge) {
                this.weight = weight;
                this.positionOnBridge = positionOnBridge;
            }

            public int getWeight() {
                return weight;
            }

            public void setWeight(int weight) {
                this.weight = weight;
            }

            public int getPositionOnBridge() {
                return positionOnBridge;
            }

            public void setPositionOnBridge(int positionOnBridge) {
                this.positionOnBridge = positionOnBridge;
            }
        }

        ArrayList<Truck> trucksWaitList = new ArrayList<>();
        ArrayList<Truck> trucksExitBridge = new ArrayList<>();
        for(int i=0; i<truck_weights.length; i++) {
            trucksWaitList.add(new Truck(truck_weights[i], 0));
        }


        int time = 0;
        int truckIndex = 0;
        int sumWeightOfTrucksOnBridge = 0;
        LinkedList<Truck> trucksOnBridge = new LinkedList<>();
        while (trucksExitBridge.size() < truck_weights.length) {
            time++;

            for(Truck x : trucksOnBridge) {
                x.setPositionOnBridge(x.getPositionOnBridge() + 1);
            }

            if(!trucksOnBridge.isEmpty()) {
                Truck firstTruck = trucksOnBridge.getFirst();
                if(firstTruck.getPositionOnBridge() > bridge_length) {
                    sumWeightOfTrucksOnBridge -= firstTruck.getWeight();
                    trucksExitBridge.add(trucksOnBridge.poll());
                }
            }

            if(trucksWaitList.isEmpty()) {
                continue;
            }

            if(trucksOnBridge.size() >= bridge_length) {
                continue;
            }

            Truck truck = trucksWaitList.get(0);
            if(weight < sumWeightOfTrucksOnBridge + truck.getWeight()) {
                continue;
            }

            sumWeightOfTrucksOnBridge += truck.getWeight();
            truck.setPositionOnBridge(1);
            trucksOnBridge.offer(truck);
            trucksWaitList.remove(truckIndex);
        }

        return time;
    }
}
