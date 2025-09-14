package a_awal;

public class a2_number {
    public static void main(String[] args) {
        /* Tipe Data Number: Integer dan Floating Point
            - Integer Number
            Tipe Data       Min                 Max             Size        Default
            byte            -128                127             1 byte      0
            short           -32,768             32,767          2 bytes     0
            int             -2,147,483,648      2,147,483,647   4 bytes     0
            long            -9,223,372,036,     9,223,372,036,  8 bytes     0
                            854,775,808         854,775,807                         */
        byte iniByte = 127;
        // byte iniByte = 130;   Akan error (garis merah)
        short iniShort = 3000;
        int iniInt = 20000;
        long iniLong1 = 900000;
        long iniLong2 = 900000L;   // bisa tambahkan L di akhir utk tahu value ini long

        System.out.printf("%d %s\n", iniByte, ((Object) iniByte).getClass().getName());
        System.out.printf("%d %s\n", iniShort, ((Object) iniShort).getClass().getName());
        System.out.printf("%d %s\n", iniInt, ((Object) iniInt).getClass().getName());
        System.out.printf("%d %s\n", iniLong1, ((Object) iniLong1).getClass().getName());
        System.out.printf("%d %s\n", iniLong2, ((Object) iniLong2).getClass().getName());


        /*  - Floating Point Number:
        Tipe Data       Min                 Max             Size        Default
        float           3.4e-038            3.4e+038        4 byte      0.0
        double          1.7e-308            1.7e+308        8 bytes     0.0    */
        float iniFloat = 10.10F;
        double iniDouble1 = 10.10;      // Defaultnya akan double tanpa keterangan simbol
        double iniDouble2 = 10.10D;

        System.out.printf("%f %s\n", iniFloat, ((Object) iniFloat).getClass().getName());
        System.out.printf("%f %s\n", iniDouble1, ((Object) iniDouble1).getClass().getName());
        System.out.printf("%f %s\n", iniDouble2, ((Object) iniDouble2).getClass().getName());


        // Tambahan: KODE LITERALS
        int decimalInt = 200;
        int binInt = 0b11001000;     // Prefixnya 0b  -> (0 dan 1)
        int oktInt = 0310;           // Prefixnya 0   -> (0, 1, 2, 3, 4, 5, 6, 7)
        int hexInt = 0xC8;           // Prefixnya 0x  -> (0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F)

        System.out.printf("%d %s | ", decimalInt, ((Object) decimalInt).getClass().getName());
        System.out.printf("%d %s | ", binInt, ((Object) binInt).getClass().getName());
        System.out.printf("%d %s | ", oktInt, ((Object) oktInt).getClass().getName());
        System.out.printf("%d %s\n", hexInt, ((Object) hexInt).getClass().getName());

        // Tambahan: Underscore
        int amount = 60_000_000;    // Tidak wajib, hanya utk mengetahui jumlah satuan, ribuan, ... utk memudahkan saat baca
        System.out.println(amount);


        /* Konversi Tipe Data Number
        - Widening Casting (Otomatis): Aturan= byte -> short -> int -> long -> float -> double
        - Narrowing Casting (Manual): Aturan= double -> float -> long -> int -> char -> short -> byte  */

        // Widening Casting, dari kecil ke besar
        byte wideByte  = 10;
        short wideShort = wideByte;
        int wideInt = wideShort;
        long wideLong = wideInt;
        float wideFloat = wideLong;
        double wideDouble = wideFloat;

        // Narrowing Casting, dari besar ke kecil
        float narrowFloat = (float) 99.5762562438;
        long narrowLong = (long) narrowFloat;
        int narrowInt = (int) narrowLong;
        short narrowShort = (short) narrowInt;
        byte narrowByte = (byte) narrowShort;

        System.out.printf("%d -> %d -> %d -> %d -> %f -> %f\n", wideByte, wideShort, wideInt, wideLong, wideFloat, wideDouble);
        System.out.printf("%f -> %d -> %d -> %d -> %d\n", narrowFloat, narrowInt, narrowInt, narrowShort, narrowByte);
    }
}
