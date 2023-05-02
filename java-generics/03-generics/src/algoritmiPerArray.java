public class algoritmiPerArray {
    // prender il valore minore all'iter
    /* public static String min(String[] values){
        if (values == null || values.length == 0) return null;
        
        String min = values[0];

        for(String item : values){
            if (item.compareTo(min) < 0) {
                min = item;
            }
        }

        return min;


    }

    public static Integer min(Integer[] values){
        if (values == null || values.length == 0) return null;
        Integer min = values[0];

        for(Integer item : values){
            if (item.compareTo(min) < 0) {
                min = item;
            }
        }

        return min;





    } */

    public static <T extends Comparable<T>> T min(T[] values){
        if (values == null || values.length == 0) return null;
        T min = values[0];

        for(T item : values){
            if (item.compareTo(min) < 0) {
                min = item;
            }
        }

        return min;


    }




}
