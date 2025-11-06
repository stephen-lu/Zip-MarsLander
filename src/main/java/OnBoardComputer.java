public class OnBoardComputer implements BurnStream {

    @Override
    public int getNextBurn(DescentEvent status) {
        int burn = 100;
        int a = status.Altitude;
        int v = status.Velocity;

        while (true) {
            if (a <= 10000 && v > 100) {
                burn = 200;
            } else if (a < 200 && v > 50) {
                burn = 150;
            } else if (a < 60 && v > 10) {
                burn = 140;
            } else if (a < 20 && v > 2) {
                burn = 108;
            }
            System.out.println(burn);
            return burn;
        }
    }

}
