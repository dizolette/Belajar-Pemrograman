10
CLS
PRINT "----Menu----"
PRINT "1.Makanan"
PRINT "2.Minuman"
PRINT "3.Keluar"
PRINT "------------"
INPUT "masukan pilihan: ", x

SELECT CASE x
    CASE 1
        PRINT "anda berada di menu makanan"
        SLEEP 2
        GOTO 10
    CASE 2
        PRINT "anda berada di menu minuman"
        SLEEP 2
        GOTO 10
    CASE 3
        END
    CASE ELSE
        PRINT "anda memasukkan angka yang tidak tertera"
        SLEEP 2
        GOTO 10

END SELECT
