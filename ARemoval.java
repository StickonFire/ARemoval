public class ARemoval{
    public static String removeA(String remove){
        String[] vowels = {"a","A"};
        for(String v : vowels){
            while(remove.indexOf(v) != -1){
                int index = remove.indexOf(v);
                remove = (remove.substring(0,index) + remove.substring(index+1));
            }
        }
        return remove;
    }
}
