mystring = "Gilang" #Data dengan condition name "mystring"
myfloat = 10.0      #Data dengan codition name "myfloat"
myint = 20          #Data dengan codition name "myint"

if nmystring == "Gilang":
    print "String: %s" % mystring   #Jika nama "mystring" sama dengan data maka akan muncul
if isinstance(myfloat, float) and myfloat ==10.0:
    print "Float: %d" % myfloat     #Jika angka "myfloat" sama dengan data maka akan muncul
if isinstance(myint, int) and myint == 20:
    print "Integer : %d" % myint    #Jika angka "myint" sama dengan data maka akan muncul

#NB : "isinstance" digunakan hanya untuk data float atau integer tidak dengan data string
#NB : "%d" digunakan hanya untuk data yang akan menghasilkan angka jika digunakan dengan data huruf maka akan error
