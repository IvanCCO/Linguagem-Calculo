from dis import disco
import psutil, platform;
import random, time


def maquinaUm():
    
    percentCPU = psutil.cpu_percent(interval=None)
    percentDisk = psutil.disk_usage('/').percent
    percentMemory = psutil.virtual_memory().percent

    infomaquina = [percentCPU, percentDisk, percentMemory]

    return infomaquina



def maquinaDois():
    
    percentCPU = maquinaUm()[0]  
    percentDisk = maquinaUm()[1]
    percentMemory = maquinaUm()[2]

    percentCPU += 10.0
    percentDisk -= 5
    percentMemory += 10

    infomaquina = [percentCPU, percentDisk, percentMemory]

    return infomaquina

while True:
    valores = [maquinaUm()]
    for i in valores:
        time.sleep(1)
        print(i)

    
