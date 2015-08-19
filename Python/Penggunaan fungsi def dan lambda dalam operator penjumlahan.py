def nama ():
    gelar = "Bapak"
    aksi = (lambda x: gelar + " " + x)
    return aksi
tulis_nama = nama ()
act = nama()

#Penggunaan nya dengan menuliskan act("Nama anda") 

z = (lambda a = "tic", b = "tac", c = "toe" : a + b + c)

#Penggunaan lambda dengan perjumlahan bernilai string
#Penggunaan z("string")

f = lambda x, y, z: x + y + z

#Penggunaan lambda untuk menghitung 3 angka dengan nilai integer
#Penggunaan nya yaitu "f(x,y,z)" yang akan di tambahkan secara berurutan,
