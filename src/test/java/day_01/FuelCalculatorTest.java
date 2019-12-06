package day_01;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FuelCalculatorTest {

    static final String massInputFile = "day_01/input.txt";
    static List<Integer> massList = new ArrayList<>();

    @BeforeAll
    static void setup() throws IOException {

        ClassLoader classLoader = FuelCalculatorTest.class.getClassLoader();
        File inputFile = new File( classLoader.getResource(massInputFile).getFile() );

        List<String> massInput = Files.readAllLines( inputFile.toPath() );
        massInput.forEach(mass -> massList.add(Integer.parseInt(mass)));
    }

    @Test
    void getFuel() {

        assertEquals(3239890, FuelCalculator.calculateFuel(massList));
    }

    @Test
    void getTotalFuel() {

        assertEquals(4856963, FuelCalculator.calculateTotalFuel(massList));
    }

}
