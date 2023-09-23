class Pessoa:

    def __init__(self, nome, idade, comendo = False, falando = False):
        self.nome = nome
        self.idade = idade
        self.comendo = comendo
        self.falando = falando

    def comer(self, alimento):
        if self.falando:
            print(f'{self.nome} não pode falar comendo.')
        elif self.comendo:
            print(f'{self.nome} já está comendo.')
        else:
            print(f'{self.nome} está comendo {alimento}')
            self.comendo = True

    def pararComer(self):
        if self.comendo:
            print(f'{self.nome} parou de comer.')
            self.comendo = False
        else:
            print(f'{self.nome} não está comendo.')

    def falar(self, assunto):
        if self.comendo:
            print(f'{self.nome} não pode falar comendo.')
        elif self.falando:
            print(f'{self.nome} já está falando.')
        else:
            print(f'{self.nome} está falando sobre {assunto}.')
            self.falando = True

    def pararFalar(self):
        if self.falando:
            print(f'{self.nome} parou de falar.')
            self.falando = False
        else:
            print(f'{self.nome} não está falando.')



