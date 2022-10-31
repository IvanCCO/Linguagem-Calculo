class Pessoa:

    # Construtor
    def __init__(self, username, idade):
        self.username = username
        self.idade = idade
        self.follower = 0
        self.following = 0
        self.status = True

    def follow(self, pessoa):
        self.following += 1
        pessoa.follower += 1


pessoa1 = Pessoa("Ivan Medeiros", 22)
pessoa2 = Pessoa("Steh Freitter", 20)

pessoa1.follow(pessoa2)
print(pessoa1.following)
print(pessoa2.follower)

