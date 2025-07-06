package StringBuffer_Builder;

public class SB_01 {
    public static void main(String[]args){
        StringBuffer sb=new StringBuffer("doin");
        sb.append("gskdfsdf");
        System.out.println(sb);
        sb.replace(0,5,"C++");
        System.out.println(sb);
    }
}
