public class Elevator {
    private int currentFloor = 1;
    private int minFloor;
    private int maxFloor;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public void moveDown(int numberFloor) {
        currentFloor = currentFloor - 1;
    }

    public void moveUp(int numberFloor) {
        currentFloor = currentFloor + 1;
    }

    public void move(int floor) {
        if (floor > maxFloor || floor < minFloor) {
            System.out.println("Floor " + floor + " is not exist");
            return;
        }
        while (!(currentFloor == floor)) {
            if (floor < currentFloor) {
                moveDown(floor);
            } else {
               moveUp(floor);
            }
            System.out.println(currentFloor);
        }
    }

    public int getCurrentFloor() {
        return currentFloor;
    }
}
