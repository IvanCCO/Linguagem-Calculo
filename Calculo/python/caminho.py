from email import header
from json import loads
from time import sleep
from urllib3 import PoolManager
import json
import csv



def conversor(valor):
    return float(valor[0:4].replace(",", '.'))





with PoolManager() as pool:

   
    f = open('arquivo.csv', 'w',  newline='')

    writer = csv.writer(f)



    for i in range (1,2001):

        response = pool.request('GET', 'http://192.168.1.7:8085/data.json')
        data = response.data.decode('utf-8')
        dataJson = json.loads(data)
        disc_value = conversor(dataJson["Children"][0]["Children"][3]["Children"][1]["Children"][0]["Value"])
        cpu_value = conversor(dataJson["Children"][0]["Children"][0]["Children"][2]["Children"][0]["Value"])
        ram_value = conversor(dataJson["Children"][0]["Children"][1]["Children"][0]["Children"][0]["Value"])
        temp_value = conversor(dataJson["Children"][0]["Children"][0]["Children"][1]["Children"][0]["Value"])

        arr_valores = [i, disc_value, cpu_value, ram_value, temp_value]

        writer.writerow(arr_valores)

        print(f"Foram inseridos {i} dados")

        sleep(0.5)

writer.writerows(data)

f.close()


        








        

   
