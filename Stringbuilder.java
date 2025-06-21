public class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Jony");
        System.out.println(sb.charAt(0));
        sb.setCharAt(0, 'p');
        System.out.println(sb);
        sb.insert(1,'s');
        System.out.println(sb);
        sb.delete(1, 3);
        System.out.println(sb);
    }
}

