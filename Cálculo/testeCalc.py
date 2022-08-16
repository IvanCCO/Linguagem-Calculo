import time
import matplotlib.pyplot as plt
desenho = str("="*30)

print(desenho)
print("Programa para Calcular o IMC")
print(desenho)

tipo = ["Abaixo do Peso", "Normal", "Sobrepeso", "Obeso", "Mórbido"]
quantidade = [0,0,0,0,0]
total =0

while True:

    while True:
        print("\n")
        peso=float(input('Quanto você pesa em Kg? (kg) \n'))
        altura=float(input('Quanto você mede em altura? (m) \n'))
        IMC = peso/(altura**2)
        
        if(peso <= 0 or altura <= 0):
            print(desenho)
            print("Peso ou altura menor que 0")
            print(desenho)
    
        else:
            total += 1
            break
            
    
    

    print(desenho) 
    print("Seu IMC é de {:.2f}".format(IMC))
    print(desenho)

    if IMC < 18.5:
        quantidade[0]+=1;
    elif IMC >=18.5 and IMC <25:
        quantidade[1] +=1
    elif IMC >=25 and IMC <30:
        quantidade[2]+=1;
    elif IMC >=30 and IMC <40:
        quantidade[3]+=1;
    else:
        quantidade[4]+=1;

    while True:
        print("\n Deseja finalizar o programa?")
        print("\n 1 - Sim \n 2 - Não \n")
        
        finalizar = str(input())

        if(finalizar == "1"):
            
            contador = 0;
            print(desenho)
            print("Total de Pessoas entrevistadas: ", total)

            for i in tipo:
                time.sleep(1)
                print(desenho)
                print("Diagnóstico:", i, "\nQuantidade:", quantidade[contador])
                # print(contador, quantidade[0], quantidade[1],quantidade[2],quantidade[3], quantidade[4], quantidade[contador])

                contador+=1

                if contador == 4:
                    time.sleep(2)
                    print("Agora vamos para os gráficos")
                    plt.plot(tipo, quantidade)
                    plt.show()

                
                
            exit()
        elif finalizar == "2":
            break
        else:
            print("\n Digite apenas 1 ou 2")


