package day01;

import java.util.List;

public class FuelCalculator {

    /**
     *
     * @param massList
     * @return fuel required by day1-part1.
     */
    public static int calculateFuel(List<Integer> massList) {
        int fuel = 0;

        for (Integer mass : massList) {
            fuel += fuelCalculator(mass);
        }

        return fuel;
    }

    /**
     *
     * @param massList
     * @return mass-fuel's fuel, day1-part2
     */
    public static int calculateTotalFuel(List<Integer> massList) {

        int totalFuel = 0;

        for(Integer mass: massList) {

            int fuel = fuelCalculator(mass);
            while (fuel>0) {
                totalFuel+=fuel;
                fuel = fuelCalculator(fuel);
            }
        }

        return totalFuel;
    }

    private static int fuelCalculator(int mass) {

        return (int) Math.ceil(mass/3) - 2 ;
    }
}
