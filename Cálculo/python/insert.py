
import pymysql
import psutil as p 
import time 


conexao = pymysql.connect(db='BDpoint', user='aluno', passwd='sptech')
cursor = conexao.cursor()

def componente_cpu():
    
    cursor.execute(f"INSERT INTO Componente VALUES (null, 'CPU', 1)")

    conexao.commit()

    conexao.close()


def registro():

    cursor.execute(f"INSERT INTO Atributo VALUES (null, {p.cpu_percent()}, '%', now(), 1)")

    conexao.commit()

    conexao.close()


