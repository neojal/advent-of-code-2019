package day03;


import day02.ProgramAlarmTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class CrossedWiresTest {

    //input01.txt, example from readme
    //input.txt, actual input
    static final String programInputFile = "day03/input.txt";
    static String[] path01, path02;

    @BeforeEach
    void setup() throws IOException {

        ClassLoader classLoader = ProgramAlarmTest.class.getClassLoader();
        File inputFile = new File( classLoader.getResource(programInputFile).getFile() );

        List<String> paths = Files.readAllLines(inputFile.toPath() );

        path01 = paths.get(0).split(",");
        path02 = paths.get(1).split(",");
    }

    @Test
    void findClosestIntersection() {

        Assertions.assertEquals(2427, CrossedWires.getClosestIntersection(path01, path02));

    }
}
