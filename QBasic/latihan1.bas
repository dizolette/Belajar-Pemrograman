INPUT "masukan nilai p: ", p
INPUT "masukan nilai l: ", l
x = p * l

IF x > 1000 THEN
    ket$ = "sangat luas"
ELSEIF x > 500 THEN
    ket$ = "luas"
ELSE
    ket$ = "sempit"
END IF

print "luas perseg
