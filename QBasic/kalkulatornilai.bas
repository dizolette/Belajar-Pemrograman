5
CLS
PRINT "====kalkulator nilai===="
INPUT "masukan nama anda: ", nama$
INPUT "masukan nilai pertama: ", nilai1%
INPUT "masukan nilai kedua: ", nilai2%
rata2 = (nilai1% + nilai2%) / 2
CLS


10
CLS
PRINT "===menu==="
PRINT "1.Hitung nilai rata-rata"
PRINT "2.Kategori nilai"
PRINT "3.Ubah nilai"
PRINT "4.Exit"
INPUT "masukan pilihan: ", pil

SELECT CASE pil
    CASE 1
        PRINT
        PRINT "Nama: "; nama$
        PRINT "Rata-rata nilai anda: "; rata2
        PRINT
        SLEEP 2
        GOTO 10

    CASE 2
        IF rata2 > 90 THEN
            grade$ = "A"
        ELSEIF rata2 > 80 THEN
            grade$ = "B"
        ELSEIF rata2 > 70 THEN
            grade$ = "C"
        ELSEIF rata2 > 60 THEN
            grade$ = "D"
        ELSE
            grade$ = "E"
        END IF
        PRINT
        PRINT "Nama: "; nama$
        PRINT "Kategori nilai: "; grade$
        PRINT
        SLEEP 2
        GOTO 10

    CASE 3
        GOTO 5
    CASE 4
        END


END SELECT


