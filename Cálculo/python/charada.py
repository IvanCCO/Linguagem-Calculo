from random import randint
import os
import time


palavras = ['Repolho', 'Nabo', 'Rabanete', 'Cenoura']

def sortear():
    return randint(0,len(palavras)-1)

def linhas(palavra):
    traco = len(palavra)
    print("_"*traco)

def resultado(palavra, letra):

    arr_resultado = []
    letra_lower = letra.lower()
    palavra_lower = palavra.lower()
    is_array_void = True

    # for i in palavra:
        
        # if(palavra_lower.index(letra_lower) > 0)
        # if(is_array_void):
        #     if(palavra_lower.index(letra_lower) >= 0):
        #         arr_resultado.append(palavra.index(letra))
        #         is_array_void = False
        # else:
        #     for i in arr_resultado:
        #         if(palavra_lower.index(letra_lower) > i):
        #             arr_resultado.append(palavra.index(letra))

        
def is_letra_valida(palavra, letra):
    for i in palavra.lower():
        if(i == letra.lower()):
            return True
    return False

def limparTerminal():
    os.system('cls' if os.name == 'nt' else 'clear')

while True:

    try:
        
        n = int(input("Quantas vezes deseja jogar?\n"))

        for i in range(0,n):
            count = 0
            palavraEscondida = palavras[sortear()]
            while count < 6:
                limparTerminal()
                linhas(palavraEscondida)       
                letra = input("Digite uma letra\n")
                if(not is_letra_valida(palavraEscondida, letra)):
                    count += 1
                    print(f"Agora você tem {6-count} chances")
                time.sleep(2)

        break
            
    except:
        print("Valor errado, digite novamente")




