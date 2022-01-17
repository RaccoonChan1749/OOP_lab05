package com.averkina;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamAPIClass {
    /*
        метод, возвращающий среднее значение списка целых чисел;
    */
    public static double getAvgElement(List<Integer> list) {
        return list
                .stream()
                .mapToInt(Integer::intValue)
                .average()
                .getAsDouble();
    }

    /*
        метод, приводящий все строки в списке в верхний регистр и добавляющий к ним префикс «new»;
    */
    public static List<String> getUpperElement(List<String> list, String prefix) {
        return list
                .stream()
                .map(s -> prefix + s.toUpperCase())
                .collect(Collectors.toList());
    }

    /*
        метод, возвращающий список квадратов всех встречающихся только один раз элементов списка;
    */
    public static List<Integer> getSquareUniqueElements(List<Integer> list) {
        return list
                .stream()
                .filter(i -> Collections.frequency(list, i) == 1)
                .map(i -> i * i)
                .collect(Collectors.toList());
    }

    /*
        метод, принимающий на вход коллекцию строк и возвращающий все строки, начинающиеся с заданной буквы, отсортированные по алфавиту;
    */
    public static List<String> getSortedList(List<String> list, char oneLetter) {
        return list
                .stream()
                .filter(s -> Character.toUpperCase(s.charAt(0)) == Character.toUpperCase(oneLetter))
                .sorted()
                .collect(Collectors.toList());
    }

    /*
        метод, принимающий на вход коллекцию и возвращающий её последний элемент или кидающий исключение, если коллекция пуста;
    */
    public static Object getLastElement(Collection<?> list) {
        return list
                .stream()
                .reduce((curr, next) -> next)
                .orElseThrow(() -> new IndexOutOfBoundsException("Пустой список!"));
    }

    /*
        метод, принимающий на вход массив целых чисел, возвращающий сумму чётных чисел или 0, если чётных чисел нет;
    */
    public static int getSumEvenNumbers(List<Integer> list) {
        return list
                .stream()
                .filter(s -> s % 2 == 0)
                .reduce(0, Integer::sum);
    }

    /*
        метод, преобразовывающий все строки в списке в Map, где первый символ – ключ, оставшиеся – значение;
    */
    public static Map<Character, String> setMap(List<String> list) {
        return list
                .stream()
                .collect(Collectors.toMap(s -> s.charAt(0), s -> s.substring(1), (existing, replacement) -> existing));
    }
}
