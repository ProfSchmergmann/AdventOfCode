package aoc2021;

import aoc2021.day6.Day6;
import org.jetbrains.annotations.NotNull;
import utils.Day;
import utils.Utilities;

public class Main {

    public static void main(String[] args) {
        printResults(new Day6());
    }

    public static void printResults(@NotNull Day day) {
        System.out.println("Result of day " + day.number + ":");
        System.out.println(Utilities.PART_ONE + day.resultPartOne());
        System.out.println(Utilities.PART_TWO + day.resultPartTwo());
    }
}
