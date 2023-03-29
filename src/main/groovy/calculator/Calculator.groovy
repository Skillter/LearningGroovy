package calculator

class Calculator {

    static int addition(int number1, int number2) {
        return number1 + number2
    }

    static int addition(List<Integer> numbers) {
        int result = 0;
        for (int number : numbers) {
            result += number
        }
        return result
    }

    static int subtraction(int number1, int number2) {
        return number1 - number2
    }

    static int subtraction(List<Integer> numbers) {
        int result = numbers[0]
        for (int number : numbers.stream().skip(1)) {
            result -= number
        }
        return result
    }

    static int multiplication(int number1, int number2) {
        return number1 * number2
    }

    static int multiplication(List<Integer> numbers) {
        int result = numbers[0]
        for (int number : numbers.stream().skip(1)) {
            result *= number
        }
        return result
    }

    static int division(int number1, int number2) {
        if (number2 == 0) {
            throw new IllegalArgumentException("Can't divide by 0.")
        } else {
            return number1 / number2
        }
    }

    static int division(List<Integer> numbers) {
        int result = numbers[0]

        for (int number : numbers.stream().skip(1)) {
            if (number == 0)
                throw new IllegalArgumentException("Can't divide by 0.")
            result /= number
        }
        return result
    }


}
