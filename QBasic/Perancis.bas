10
PRINT " "
INPUT "masukan nama: ", nama$
INPUT "masukan umur: ", umur%
INPUT "jenis kelamin: ", jk$

IF umur% > 17 THEN
    IF jk$ = "p" THEN
        ket$ = "anda lulus"
        total% = total% + 1
    ELSE
        ket$ = "anda laki-laki"
    END IF
ELSE
    ket$ = "anda dibawah umur"
END IF

PRINT
PRINT "nama anda: "; nama$
PRINT "Keterangan: "; ket$

IF total% = 5 THEN
    END
ELSE
    GOTO 10
END IF
