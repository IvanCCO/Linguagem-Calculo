from random import randint


def valorValido(valor):
    return valor == 1 or valor == 2 or valor == 3


def ataque(valor):

    if valorValido(valor):
        if valor == 1:
            print("Pedra")
        elif valor == 2:
            print("Papel")
        elif valor == 3:
            print("Tesoura")

def mensagem():
    print("1- Pedra\n2- Papel\n3- Tesoura")


def resultado(maquina, user):
    if(maquina == user):
        print("Draw")
    elif(maquina > user and maquina != 3):
        print("Maquina Ganhou")
    elif(maquina > user and user == 1):
        print("User ganhou")
    else:
        print("User ganhou")



while True:
    try:
        n = int(input("São quantas neguinhas?\n"))
        for i in range(0,n):
            mensagem()
            ataque_user = int(input("Faça seu ataque\n"))
            ataque(ataque_user)
            print("O computador escolheu...")
            ataque_maquina = randint(1,3)
            ataque(ataque_maquina)
            resultado(ataque_maquina, ataque_user)

        break


    except:
        print("Valor inválido")
