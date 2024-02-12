package HomeWork;

import java.util.ArrayList;
import java.util.List;

/*
Напишите обобщенный метод compareArrays(),
который принимает два массива и возвращает true,
если они одинаковые, и false в противном случае.
Массивы могут быть любого типа данных, но должны иметь одинаковую длину
и содержать элементы одного типа.
 */
public class CompareArrays {

    public static <T,K> boolean compareArrays(T[] firstArray, K[] secondArray){
        return firstArray.length == secondArray.length && firstArray.getClass().getSimpleName().equals(secondArray.getClass().getSimpleName());
    }
}
