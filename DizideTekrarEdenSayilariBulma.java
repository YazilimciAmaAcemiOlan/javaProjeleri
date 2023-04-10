import java.util.Arrays;

public class DizideTekrarEdenSayilariBulma {

    static boolean isFind(int[] arr, int value){
        for (int i: arr){
            if (i == value){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] list = {3,7,3,3,2,9,10,21,1,2,33,9,1};
        int[] tekrarEdenSayilar = new int[list.length];
        int index = 0;
        for (int i = 0 ; i < list.length ; i++){
            for (int j = 0 ; j < list.length ; j++){
                if ((i != j) && (list[i] == list[j])){
                    if (!isFind(tekrarEdenSayilar,list[i])){
                        tekrarEdenSayilar[index] = list[i];
                        index++;
                    }
                    break;
                }
            }
        }
        for (int value: tekrarEdenSayilar){
            if (value != 0){
                System.out.println(value);
            }
        }
    }
}