CLS
RANDOMIZE TIMER
num = INT(RND * 20) + 1
FOR count = 1 TO 5
    INPUT "Masukan nomor keberuntungan anda (1 - 20) : ", answer
    IF answer = num THEN
        PRINT "Anda menang setelah"; count; "pengunjung"
    ELSEIF answer > 20 THEN
        PRINT "Maaf angka terlalu jauh, permainan tidak dapat diulang"
    END IF
NEXT
PRINT "You lose"
