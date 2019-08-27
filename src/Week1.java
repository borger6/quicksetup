public class Week1 {

    public static void main(String[] args) {
        int[] liste = {1,2,4,3,354,5433,4,-23};
        System.out.println(findMaximum(liste));
    }

    //Denne funksjonen finner maksimum i et array med tall.
    static int findMaximum(int[] values){
        int størst = values[0];
        for (int i=0; i<values.length; i++){
            int value = values[i];
            if(value > størst){
                størst=value;
            }
        }
        return størst;

        Added a simple bug here
    }
}
