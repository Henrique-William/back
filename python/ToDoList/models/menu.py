from models.todo_list import ToDoList
import time

todo_list = ToDoList()
class Menu:
    def menu(self):
            while True:
                print("\n--- To-Do List ---")
                print("1. Adicionar Tarefa")
                print("2. Listar Tarefas")
                print("3. Remover Tarefa")
                print("4. Sair")
                opcao = input("\nEscolha uma opção: ")

                if opcao == "1":
                    nome = input("\nDigite o nome da tarefa: ")
                    descricao = input("Digite a descrição da tarefa: ")
                    todo_list.adicionar_tarefa(nome, descricao)
                elif opcao == "2":
                    todo_list.listar_tarefas()
                    time.sleep(2)
                elif opcao == "3":
                    todo_list.listar_tarefas()
                    indice = int(input("\nDigite o número da tarefa para remover: "))
                    todo_list.remover_tarefa(indice)
                elif opcao == "4":
                    print("\nSaindo... Até logo!")
                    break
                else:
                    print("\nOpção inválida. Tente novamente.")