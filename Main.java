import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 9, 11, 5,0,12,43,11,76,33);
        List<Integer> list2 = List.of(5, 9, 3, 8,0,12,44,12,76,23); //создали 2 списка
        List<Boolean> result = sravnitLists(list1, list2); //вызвали метод сравнения
        System.out.println(result); //вывели результат
    }
    public static List<Boolean> sravnitLists(List<Integer> list1, List<Integer> list2) {//для сравнения двух листов
        List<Boolean> result = new ArrayList<>();//новый лист для результатов(тру или фальш)
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i).equals(list2.get(i))) {//если равно то тру
                result.add(true);
            } else {
                result.add(false);//или фальш. все добавляем в результаты
            }
        }
        return result;
    }}