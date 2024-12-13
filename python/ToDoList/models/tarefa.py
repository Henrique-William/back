class Tarefa:
    def __init__(self, nome, descricao):
        self.nome = nome
        self.descricao = descricao

    def __str__(self):
        return f"Tarefa: {self.nome}\nDescrição: {self.descricao}"