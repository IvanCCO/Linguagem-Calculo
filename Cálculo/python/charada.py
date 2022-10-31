from random import randint, random
import os
import time
import csv
import random

class TextFormatter:
    """
    Contains numerous ANSI escape sequences used to apply
    formatting and styling to text.
    """
    # Blue colouring
    BLUE_COL = '\033[94m'
    # Red Colouring
    RED_COL = '\033[91m'
    # Green colouring
    GREEN_COL = '\033[92m'
    
    # Reset formatting and styling
    RESET = '\033[0m'
    # Underlined text
    UNDERLINE = '\033[4m'
    # Yellow colouring
    YELLOW_COL = '\033[93m'


arr = []
with open("../Documentos/palavras.csv", 'r') as file:
  csvreader = csv.reader(file)
  for row in file:
    arr.append(row)

palavras = []

for i in arr:
    x = i.replace('"','')
    palavras.append(x)
        
def is_letra_valida(palavra, letra):
    for i in palavra.lower():
        if(i == letra.lower()):
            return True
    return False

def limpar_terminal():
    os.system('cls' if os.name == 'nt' else 'clear')


def is_letra_repetida(letra):
    for k in arr_respota:
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
            # Default 0
            count = 0
            limiter()
            print("Escolhendo um nova Palavra")
            time.sleep(2)
            palavraEscondida = random.choice(palavras)

            arr_palavra_certa = list(palavraEscondida)

            tamanho_frase = len(arr_palavra_certa)
            tamanho_frase -= 1

            arr_palavra_linha = ["_"]*tamanho_frase

            count_acerto = len(arr_palavra_linha)

            arr_respota = []

            while count < 6:
                limpar_terminal()
                print(f"Vida: {6-count}   Partida: {i+1}\n")
                print(*arr_palavra_linha, sep=" ")
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
                    print(""" 
                            
                                _ _      
                                | |      
  ___ ___  _ __   __ _ _ __ __ _| |_ ___ 
 / __/ _ \| '_ \ / _` | '__/ _` | __/ __|
| (_| (_) | | | | (_| | | | (_| | |_\__ 
 \___\___/|_| |_|\__, |_|  \__,_|\__|___/
                  __/ |                  
                 |___/          

        """)
                    print(*arr_palavra_certa)
                    time.sleep(1)
                    total_acertos+=1
                    break
        break
            
    except Exception as e:
        print(e)
        print("Valor errado, digite novamente")


print(f"""\nTotal de Palavras: {n}\nTotal de acertos:{total_acertos}""")




