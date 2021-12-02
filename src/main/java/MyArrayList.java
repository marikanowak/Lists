public class MyArrayList {
    private String[] array;
    private int index = 0;

    public MyArrayList(int size) {
        this.array = new String[size];

    }

    public void add(String element) {
        if (array.length > index) {
            array[index] = element;
            index++;
        }else{
            String[] newArray = new String[array.length + 4];
            for(int i = 0; array.length > i; i++ ){
                newArray [i] = array [i];
            }
            array = newArray;
        }
    }

    public String get(int index) {
        return array[index];
    }


}
