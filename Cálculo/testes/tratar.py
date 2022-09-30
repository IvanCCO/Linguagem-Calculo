texto = []
with open("marcas.txt",'r') as data_file:
    for line in data_file:
        data = line.split()
        data_array = data[1]
        texto.append(data_array)

# for i in texto:
#     print(texto)

csv = ',\n'.join(texto)
data_file.close()

with open("marcas.csv", "x") as arquivo_csv:

    arquivo_csv.writelines(csv)
    arquivo_csv.close()

        
        
