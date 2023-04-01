package filereader

import calculator.Calculator

import java.awt.Toolkit

class NumberReader {

    static File resourceDir = new File("src/main/resources")

    static void readResourceFiles() {
        List<Integer> numbers = getNumbers(resourceDir).sort()

        println(numbers.toString())
        println("Highest number is " + numbers.max())
        println("Sum is " + Calculator.addition(numbers))
    }


    static List<Integer> getNumbers(File fromFilesInPath) {
        List<Integer> numbers = new ArrayList<>()
        for (File file : fromFilesInPath.listFiles()) {
            file.withReader {
                println(it.lines().forEach {
                    numbers.add(Integer.valueOf(it.replaceAll(/[^0-9]/, "")))
                })
            }
        }
        return numbers;
    }

}
