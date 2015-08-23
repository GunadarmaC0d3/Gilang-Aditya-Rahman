10 CLS
INPUT "Masukan nama anda : ", nama$
INPUT "Masukan nilai anda : ", nilai

SELECT CASE nilai
    CASE IS > 80
        PRINT "Nama anda : ", nama$
        PRINT "Selamat anda mendapatkan nilai A"
    CASE IS < 80 AND nilai >= 70
        PRINT "Nama anda : ", nama$
        PRINT "Selamat anda mendapatkan nilai B"
    CASE IS < 70 AND nilai >= 60
        PRINT "Nama anda : ", nama$
        PRINT "Selamat anda mendapatkan nilai C"
    CASE IS < 60 AND nilai >= 1
        PRINT "Anda salah memasukan nilainya"
        GOTO 10
    CASE ELSE
        PRINT "Nama anda : ", nama$
        PRINT "Maaf anda tidak lulus"
END SELECT


