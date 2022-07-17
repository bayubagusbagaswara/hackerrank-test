public Class Binary {

    /**
    Complete the function below
     */

     static int counting(String s) {
        int i = 0;
        int count = 0;
        int count0 = 0; // menghitung binary 0
        int count1 = 0; // menghitung binary 1

        // selama i kurang dari panjang string, maka lakukan perulangan
        while (i < s.length()) {

            // cek tiap karakter pada string, apakah == 0
            if (s.charAt(i) == '0') {
                // cek jika count1 = 0
                if (count1 == 0) {
                    count0 = count0 + 1;
                    i++;
                    continue;
                }
                
                while(i < s.length() && s.charAt(i) == '0' && count1 > 0) {
                    count1--;
                    count0++;
                    count++;
                    i++;
                }
                count1 = 0;        
           } else {
                if (count0 == 0) {
                    count1++;
                    i++;
                    continue;
                }
                while(i < s.length() && s.charAt(i) =='1' && count0 > 0) {
                    count0--;
                    count1++;
                    count++;
                    i++;
                }
                count0=0;
            }
        }
        return count;
    }
}