'PROGRAM BACA DATA DARI SISWA.DAT DAN MENCETAK KE LAYAR
CLS
OPEN "SISWA.DAT" FOR INPUT AS #1
PRINT "-------------------------------------------------------------------"
PRINT "NO.INDUK   NAMA            TEORI     PRAKTEK   RATA-RATA   LULUS   "
PRINT "-------------------------------------------------------------------"
POLA$ = "\        \ \             \ ###.##    ###.##    ###.##      \     \ "
VIEW PRINT 4 TO 23
WHILE NOT EOF(1)
    INPUT #1, NO_INDUK$, NAMA$, TEORI, PRAKTEK
    RATA = (TEORI + PRAKTEK) / 2
    IF RATA < 60 THEN
        LULUS$ = "TIDAK"
    ELSE
        LULUS$ = "YA"
    END IF
    PRINT USING POLA$; NO_INDUK$; NAMA$; TEORI; PRAKTEK; RATA; LULUS$
WEND
CLOSE #1
END
