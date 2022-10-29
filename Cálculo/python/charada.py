from random import randint
import os
import time
import csv


arr = []
with open("..\Documentos\palavras.csv", 'r') as file:
  csvreader = csv.reader(file)
  for row in file:
    arr.append(row)

palavras = []

for i in arr:
    x = i.replace('"','')
    palavras.append(x)


def sortear():
    return randint(0,len(palavras)-1)

        
def is_letra_valida(palavra, letra):
    for i in palavra.lower():
        if(i == letra.lower()):
            return True
    return False

def limpar_terminal():
    os.system('cls' if os.name == 'nt' else 'clear')


def is_letra_repetida(letra):
    for k in arr_palavra_linha:
        if(k.lower()==letra.lower()):
            print("Letra repetida")
            return True

    return False

def acerto(letra):

    for i in range(0,len(arr_palavra_certa)):
        if arr_palavra_certa[i].lower() == letra.lower():
            arr_palavra_linha[i] = arr_palavra_certa[i]
           


def is_palavra_terminada():
    
    for i in arr_palavra_linha:
        if(i == "_"):
            return False
    return True

def limiter():
    print("="*60)

print("""   
 _   _      _ _       _ _
| | | | ___| | | ___ | | |
| |_| |/ _ \ | |/ _ \| | |
|  _  |  __/ | | (_) |_|_|
|_| |_|\___|_|_|\___/(_|_)
""")
time.sleep(1)
print("""Esse jogo foi criado para simplesmente passar o tempo e desenvolver minhas habiliades de lógica."
Você primeiramente digitará a quantiade de Vezes que desejará jogar e então o jogo já começa.
Boa sorte e não se engane as palavras são Mais difíceis do que parece""")

total_acertos = 0

while True:

    try:
        limiter()
        n = int(input("Quantas vezes deseja jogar?\n"))

        for i in range(0,n):

            count = 0
            limiter()
            print("Escolhendo um nova Palavra")
            time.sleep(2)
            palavraEscondida = palavras[sortear()]

            arr_palavra_certa = list(palavraEscondida)

            tamanho_frase = len(arr_palavra_certa)
            tamanho_frase -= 1

            arr_palavra_linha = ["_"]*tamanho_frase

            count_acerto = len(arr_palavra_linha)

            arr_respota = []

            while count < 6:
                limpar_terminal()
                print(f"Vida: {6-count}\n")
                print(*arr_palavra_linha, sep=" ")
                print("\n")
                limiter()
                print("Letras já utilizadas: ")
                print(*arr_respota, sep="-")
                limiter()
                letra = input("Digite uma letra:\n")

                if(not is_letra_valida(palavraEscondida, letra) or is_letra_repetida(letra)):

                    count += 1
                    

                else:
                        acerto(letra)
                        count_acerto -= 1


                arr_respota.append(letra)

                if count == 6:
                    limpar_terminal()
                    print(f"Você não conseguiu descobrir a palavra\nA palavra era:")
                    print(*arr_palavra_certa, sep="")
                    print("Mais sorte da próxima vez")
                    time.sleep(3)
                    break

                time.sleep(1)


                if is_palavra_terminada():
                    limpar_terminal()
                    print("Parabéns")
                    print(*arr_palavra_certa)
                    time.sleep(1)
                    total_acertos+=1
                    break
        break
            
    except:
        print("Valor errado, digite novamente")


print(f"""\nTotal de Palavras: {n}\nTotal de acertos:{total_acertos}""")




