from urllib import response
import psutil
import time
import os
import webbrowser

def desenho():
    print("="*40)
    print("twitch.tv/Lullyfito -- "*2)
    print("="*40)
    print("\n")
    

core = psutil.cpu_count();
thread = psutil.cpu_count(logical=False)    
disco = psutil.disk_usage('/')[0]

user = psutil.users()[0][0]

desenho()

while True:
    try:
        print("[1] Sim")
        print("[2] Não")
        print("Olá ", user, ", vamos começar a ver suas configurações?\n")
        comecar = int(input())
        if comecar == 1:    
            time.sleep(1)
            print("Let's gooooooo")
            break
        elif comecar == 2:
            time.sleep(4)
            try:
                comecar2 = int(input("Mais uma vez. Você quer rodar o código direito?\n"))
                if comecar2 == 1:
                    print("Ufaaa, pensei que tinha rodado atoa")
                    break
                elif comecar2 == 2:
                    print("?"*30)
                    time.sleep(1)
                    desenho()
                    try:
                        ajudar = int(input("Entendi, você não quer mesmo rodar o código. Você deseja pelo menos me ajudar no meu sideProject?\n"))
                        if ajudar == 1:
                            print("Cara muito obrigado de verdade. Irei te redirecionar em alguns segundos")
                            for i in range(5):
                                time.sleep(0.3)
                                desenho()
                            webbrowser.open('https://www.twitch.tv/Lullyfito')
                        elif ajudar == 2:
                            print("Ok, como desejar. Muito obrigado mesmo assim")
                            exit()
                        else:
                             print("[1] Sim")
                             print("[2] Não")
                    except:
                        time.sleep(2)
                        print("Eita ", user, " vejo que está com dificuldade, irei te ajudar")
                        time.sleep(1)
                        print("[1] Sim")
                        print("[2] Não")
                else:
                    print("[1] Sim")
                    print("[2] Não")
                    
                        
            except:
                time.sleep(2)
                print("Eita ", user, " vejo que está com dificuldade, irei te ajudar")
                time.sleep(1)
                print("[1] Sim")
                print("[2] Não")
    except:
        print("Resposta inválida")

while True:
    try:
        
        print("[1] Quantidade de cores?")
        print("[2] Quantidade de Threads")
        print("[3] Tamanho do Disco")
        print("[4] Temperatura do CPU")
        print("[5] Sair")
        
        resposta = int(input("Selecione o que deseja \n"))

        if resposta == 1:
            print(core)
        elif resposta == 2:
            print(thread)
        elif resposta == 3:
            print(disco)
        elif resposta == 4:
            print("dfuiebh")
        elif resposta == 5:
            break
    except:
        print("Digite apenas os números válidos")
    



    