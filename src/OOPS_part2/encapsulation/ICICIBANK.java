package OOPS_part2.encapsulation;

public class ICICIBANK {
    public static void main(String[] args) {
        kotakbank Divya = new kotakbank("divya", 1000);
        System.out.println(Divya.getBal());

        boolean iscashier = true;
        Divya.setBal(1000, iscashier);
        System.out.println(Divya.getBal());
        System.out.println(Divya.bankname);
        System.out.println(Divya.getName());
    }

}
    class kotakbank{
        private String name;
        private long bal;
        public String bankname="kotak";

        public long getBal() {
            return bal;
        }

        public void setBal(long bal,boolean iscashier) {
            if (iscashier){
                this.bal=bal;
            }else{
                System.out.println("not allowed to change bal");
            }
            this.bal = bal;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public kotakbank(String name, long bal) {
            this.name=name;
            this.bal=bal;
        }
    }

