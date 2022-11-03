import math

i=0

print("Esse teste é válido apenas para os 12 primeiros exercícios da atividade")

n = int(input("Quantos testes vc deseja? \n"))

while i < n:

    while i == i:
        print("\n Seu número está fracionado?")
        fracao = str(input("S para sim N para Não \n"))
        if(fracao == "S" or fracao == "N"):
            break
        else:
            print("Você deve digitar apenas S ou N")
    
    if(fracao == "S"):

        dividendo = int(input("Qual é o dividendo? \n"))
        divisor = int(input("Qual é o divisor? \n"))
        base = dividendo/divisor
        potencia = float(input("Potencia = "))
        resultado = base ** potencia;

        print("O resultado é",resultado);
    else:
        base = float(input("Base = "))
        potencia = float(input("Potencia = "))
        resultado = base ** potencia;

        print("O resultado é",resultado);        

print("Parabéns vc fez até o 12 kkk \n Lullyfito na Twitch.")
