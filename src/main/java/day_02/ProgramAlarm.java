package day_02;

import java.util.Arrays;

public class ProgramAlarm {

    public static int fix(int[] program) {

        return computer(program, 12, 2)[0];
    }

    public static int findNounAndVerb(int[] program, int expectedOutput) {

        for( int noun = 0; noun<=99; noun++ ) {
            for( int verb = 0; verb<=99; verb++ ) {

                // clone required to create a new array in memory
                int[] tmpProgram = program.clone();
                if( computer(tmpProgram, noun, verb)[0] == expectedOutput ) {
                    return 100*noun+verb;
                }
            }
        }
        return -1;
    }

    private static int[] computer(int[] program, int noun, int verb) {

        program[1]=noun;
        program[2]=verb;

        for(int i=0; program[i]!=99; i+=4) {

            try {

                if(program[i]==1) {
                    program[program[i+3]] = program[program[i+1]] + program[program[i+2]];
                }
                if(program[i]==2) {
                    program[program[i+3]] = program[program[i+1]] * program[program[i+2]];
                }
            } catch (ArrayIndexOutOfBoundsException ex) {
                break;
            }
        }

        return program;
    }
}
