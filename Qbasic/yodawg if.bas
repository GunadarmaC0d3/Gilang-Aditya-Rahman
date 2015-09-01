PRINT "Jalan jalan ke mana aja lah"

10 INPUT "Masukan nama anda :", nama$
INPUT "Masukan umur anda :", umur
INPUT "Masukan jenis anda (L/P) :", jenisanda$
PRINT " "
PRINT " "
IF umur >= 17 THEN
    IF jenisanda = p THEN
        ket$ = "Selamat anda lulus"
        total = total + 1
    ELSE
        ket$ = "Maaf anda bukan cewe"
    END IF
ELSE
    ket$ = "Maaf anda terlalu muda"
END IF
PRINT nama$, "Umur anda adalah "; umur, ket$
IF total = 5 THEN
    END
END IF

GOTO 10



