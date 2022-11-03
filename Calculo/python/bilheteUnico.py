import psutil, time

# Nome : Ivan Freire de Medeiros Miranda
# RA: 02221071
# Grupo: 1 - Pardalis


percentCPU = psutil.cpu_percent()
percentRAM = psutil.virtual_memory().percent
percentDisk = psutil.disk_usage('/').percent

maquina1 = [percentCPU, percentRAM, percentDisk]

linha = '-/-'*30

def maquinaDois():
    
    cpu = percentCPU * 1.1
    ram = percentRAM * 1.15
    disco = percentDisk * 0.95

    maquina = [round(cpu,2), round(ram,2), round(disco,2)]

    return maquina

def maquinaTres():
    cpu = (percentCPU * 1.1)
    cpu = cpu + (cpu * 0.05)
    ram = percentRAM * 1.15
    ram = ram - (ram * 0.05)
    disco = percentDisk * 0.95
    disco = disco * 3

    maquina = [round(cpu,2), round(ram,2), round(disco,2)]

    return maquina


while True:
    valores = [maquina1, maquinaDois(), maquinaTres()]
    count = 0

    print('CPU ---- RAM --- HD')
    for i in valores:
        time.sleep(1)
        if count == 0:
            print('Maquina Um')
            print(i)
        elif count == 1:
            print('Maquina Dois')
            print(i)
        else:
            print('Maquina Tres')
            print(i)
        print(linha)
        count+=1

    


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

    
