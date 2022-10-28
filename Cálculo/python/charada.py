from random import randint
import os
import time


palavras = ['Repolho', 'Nabo', 'Rabanete', 'Cenoura']

def sortear():
    return randint(0,len(palavras)-1)

        
def is_letra_valida(palavra, letra):
    for i in palavra.lower():
        if(i == letra.lower()):
            return True
    return False

def limpar_terminal():
    os.system('cls' if os.name == 'nt' else 'clear')


def is_letra_repetifa(letra):
    for k in arr_palavra_linha:
        if(k.lower()==letra.lowera()):
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

    

while True:

    try:
        
        n = int(input("Quantas vezes deseja jogar?\n"))

        for i in range(0,n):

            count = 0
            
            print("Nova palavra:")

            time.sleep(1)

            palavraEscondida = palavras[sortear()]

            arr_palavra_certa = list(palavraEscondida)

            arr_palavra_linha = ["_"]*len(arr_palavra_certa)

            count_acerto = len(arr_palavra_linha)

            while count < 6:

                limpar_terminal()

                print(*arr_palavra_linha, sep=" ")
                letra = input("Digite uma letra\n")


                if(not is_letra_valida(palavraEscondida, letra) or is_letra_repetifa(letra)):

                    count += 1
                    print(f"Agora você tem {6-count} chances")

                else:
                        acerto(letra)
                        print("Acertou")
                        count_acerto -= 1

                        

                if count == 6:
                    print("Você não conseguiu descobrir a palavra")
                    time.sleep(1)
                    break

                time.sleep(1)


                if is_palavra_terminada():
                    print("Parabéns")
                    break
        break
            
    except:
        print("Valor errado, digite novamente")




