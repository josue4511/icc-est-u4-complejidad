public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int[]array = {1, 2, 3, 4, 5};
        System.out.println(array);
        System.out.println(array[0]);

        // for Normal
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }

        // for-each
        for(int i: array){
            System.out.println(i);
            
        }
    }
}
