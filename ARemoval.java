public class ARemoval{
    public static String removeA(String remove){
        while(remove.indexOf("a") != -1){
            int index = remove.indexOf("a");
            remove = (remove.substring(0,index) + remove.substring(index+1));
        }
        return remove;
    }
}
