
import pymysql
import psutil as p 
import time 

def insetzada():
    cpu_percent = p.cpu_percent()
    ram_percent = p.virtual_memory().percent
    disk_percent = p.disk_usage("/").percent

    conexao = pymysql.connect(db='BDpoint', user='aluno', passwd='sptech')

    cursor = conexao.cursor()

    cursor.execute(f"INSERT INTO DADOS VALUES (null, {cpu_percent}, {ram_percent}, {disk_percent})")

    conexao.commit()

    conexao.close()


for i in range(0, 200):
    time.sleep(2)
    print(i)
    insetzada()



