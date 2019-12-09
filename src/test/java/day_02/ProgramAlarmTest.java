package day_02;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProgramAlarmTest {

    static final String programInputFile = "day_02/input.txt";
    static int[] inputProgram;

    @BeforeAll
    static void setup() throws IOException {

        ClassLoader classLoader = ProgramAlarmTest.class.getClassLoader();
        File inputFile = new File( classLoader.getResource(programInputFile).getFile() );

        String programInput = Files.readString( inputFile.toPath() );

        inputProgram = Arrays.stream(programInput.split(",")).mapToInt(Integer::parseInt).toArray();

    }

    @Test
    void programAlarmFixTest() {

        assertEquals(3058646, ProgramAlarm.fix(inputProgram));
    }

    @Test
    void findNounAndVerb() {

        assertEquals(8976, ProgramAlarm.findNounAndVerb(inputProgram, 19690720));
    }

}
