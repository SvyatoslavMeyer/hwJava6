import java.util.*;

public class hwJTask1 {
    public static void main(String[] args) {
        hwJTask1 tk = new hwJTask1();
        Integer[] tkArray = tk.initArray();
        System.out.println(tk.getPercentUniqueValues(tkArray));
    }
    public Integer[] initArray() {
        Integer[] someArray = new Integer[1000];
        Random rnd = new Random();
        for (int i = 0; i < someArray.length; i++) {
            someArray[i] = rnd.nextInt(25);
        }
        return someArray;
    }
    public double getPercentUniqueValues(Integer[] array){
        Set<Integer> uniqueElsSet = new HashSet<>();
        Set<Integer> notUniqueElsSet = new HashSet<>();
        for (Integer arrayEl : array){
            if (notUniqueElsSet.contains(arrayEl)){
                continue;
            } else if (!uniqueElsSet.contains(arrayEl)) {
                uniqueElsSet.add(arrayEl);
            } else {
                uniqueElsSet.remove(arrayEl);
                notUniqueElsSet.add(arrayEl);
            }
        }
        return (double) uniqueElsSet.size()/array.length;
    }
}
