public class SortString{
    public static void main(String[] args){
        String[] strings = {"Lichi", "Coconut", "Banana", "Apple"};
        int n = strings.length;
        for(int i = 0; i < n-1; i++){
            for(int j = 0; j<n-i-1; j++){
                if(strings[j].compareTo(strings[j+1]) > 0){
                    String temp = strings[j];
                    strings[j] = strings[j+1];
                    strings[j+1] = temp;
                } 
            }
        }

        for(String ele : strings){
            System.out.println(ele);
        }

    }
}