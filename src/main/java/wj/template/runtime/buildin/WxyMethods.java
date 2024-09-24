package wj.template.runtime.buildin;

public class WxyMethods {

    public static String uncap_first(String str) {
        return Character.toLowerCase(str.charAt(0)) + str.substring(1);
    }

    public static String cap_first(String str) {
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }

    public static String lower_case(String str) {
        return str.toLowerCase();
    }

    public static String upper_case(String str) {
        return str.toUpperCase();
    }

    public static int last_index_of(String str, String indexStr) {
        return str.lastIndexOf(indexStr);
    }

    public static int index_of(String str, String indexStr) {
        return str.indexOf(indexStr);
    }

    public static String substring(String str, int beginIndex, int endIndex) {
        if(endIndex < 0) {
            return "";
        }
        return str.substring(beginIndex, endIndex);
    }
    public static String substring(String str, int beginIndex) {
        return str.substring(beginIndex);
    }

    public static String replace(String str, String target, String replacement) {
        return str.replace(target,replacement);
    }
}
