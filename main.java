class main {
    public static void main (String[] args) {
        // Array shorting in accending order
        int a[] = {45, 2, 33, 874, 74, 65, 55, 56, 46, 63, 27, 17, 72, 37, 74 };
        int swap, num ;
        for (int i=0; i < a.length; i++) {
           for ( int j = i ;j < a.length ; j ++) {
                if (a[i] > a[j]) {
                }
                else {swap = a[j];
                    a[j] = a[i];

                    a[i] = swap;
                }
           } 
        } 
        for (int i = 0; i< a.length; i++) {
            System.out.println(a[i]);
        }   
    } 
}