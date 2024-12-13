from models.tarefa import Tarefa
import time

class ToDoList:
    def __init__(self):
        self.tarefas = []

    def adicionar_tarefa(self, nome, descricao):
        nova_tarefa = Tarefa(nome, descricao)
        self.tarefas.append(nova_tarefa)
        print("\nTarefa adicionada com sucesso!!!")
        time.sleep(2)
        

    def listar_tarefas(self):
        if not self.tarefas:
            print("\nNenhuma tarefa na lista.")
            time.sleep(2)
        else:
            print("\n--- Lista de Tarefas ---")
            for i, tarefa in enumerate(self.tarefas, 1):
                print(f"{i}. {tarefa}\n")
                

    def remover_tarefa(self, indice):
        try:
            tarefa_removida = self.tarefas.pop(indice - 1)
            print(f"Tarefa '{tarefa_removida.nome}' removida com sucesso!")
            time.sleep(2)
            
        except IndexError:
            print("Índice inválido. Tente novamente.")