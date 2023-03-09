public class TABs {
    public static void main(String[] args) {
        int[] tab1 = {1, 2, 3};
        int[] tab2 = {1, 2, 3,4};
        int[] tab3;
        tab3 = new int[tab1.length];
        dodawanieTablic(tab1,tab2,tab3);
        for (int i = 0; i < tab3.length; i++) {
            System.out.print(tab3[i]);
        }


    }

    public static int[] dodawanieTablic(int[] tab1, int[] tab2, int[] tab3) {
        if (tab1.length == tab2.length) {
            for (int i = 0; i < tab1.length; i++) {
                tab3[i] = tab1[i] + tab2[i];


            }
            return tab3;
        }else {
            return tab3;
        }
    }

}