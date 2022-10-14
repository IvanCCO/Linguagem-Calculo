import csv
import pymysql


conexao = pymysql.connect(db='prova', user='aluno', passwd='sptech')

f = open('data000000000000.csv', 'rt')
file_content=f.read()

cr = csv.reader(file_content.splitlines(), delimiter=',')
my_list = list(cr)

isx = True

for i in my_list:

    if i[0] == "id_municipio":next

    cursor.execute(f"INSERT INTO Componente clima (id_municipio, id_estacao, estacao, data_fundacao, latitude, longitude, altitude) VALUES ({i[0]}, '{i[1]}', '{i[2]}', '{i[3]}', '{i[4]}', '{i[5]}', '{i[6]}')")

    conexao.commit()


conexao.close()


