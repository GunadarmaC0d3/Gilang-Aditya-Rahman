INPUT "Masukan nama anda : ", nama$
INPUT "Masukan nilai anda : ", nilai

IF nilai >= 80 THEN
    PRINT "Nama anda adalah "; nama$
    PRINT "Selamat anda lulus dan mendapatkan nilai A"
ELSEIF nilai < 80 AND nilai >= 70 THEN
    PRINT "Nama anda adalah "; nama$
    PRINT "Selamat anda lulus dan mendapatkan nilai B"
ELSEIF nilai >= 60 THEN
    PRINT "Nama anda adalah "; nama$
    PRINT "Selamat anda lulus dan mendapatkan nilai C"
ELSE
print "Nama anda adalah "; nama$
    PRINT "Maaf anda tidak lulus"
END IF
