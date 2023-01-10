public class Code1 {

    public static void main(String[] args) {

        System.out.println("Array, Sorting, For Loop, Function, Branch");

        int[] data = {3, 5, 1, 2, 4, 7, 6}; // array

        sort(data); // function
    }

    public static void sort(int[] data){
        for (int i = 0; i < data.length; i++) { // perulangan / for loop
            for (int j = 0; j < data.length; j++) {
                // pengurutan / sorting
                if (data[i] < data[j]){ // pemilihan / branching
                    int temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }

        for (int i = 0; i < data.length; i++){
            System.out.print(data[i] + " "); // output hasil
        }
    }

}
