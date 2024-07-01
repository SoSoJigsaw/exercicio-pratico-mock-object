# Exercício Prático 03 - Mock Object

- Este projeto foi desenvolvido para atender aos requisitos especificados pela equipe da Caixa Econômica Federal, que solicitou a implementação de uma classe responsável por coletar os números sorteados da Mega Sena armazenados em um objeto `CustomStack`, ordená-los em ordem ascendente e retornar uma lista. A seguir, detalhamos os requisitos, a implementação das classes, e o uso do Mockito e JUnit para testes.

## Requisitos do Exercício

1. **Implementar a classe `NumberAscOrder`:**
   - Deve coletar todos os números da pilha `CustomStack`.
   - Ordenar os números em ordem ascendente.
   - Retornar uma lista dos números ordenados.
   - Lançar exceção `StackEmptyException` se a pilha estiver vazia.

2. **Implementar a classe de teste:**
   - Testar a classe `NumberAscOrder` para uma pilha com 6 números sorteados.
   - Testar a classe `NumberAscOrder` para uma pilha vazia.
   - Utilizar o framework Mockito para simular o comportamento da pilha `CustomStack`.
   - Utilizar JUnit 5 para verificar os resultados.

## Implementação das Classes

### NumberAscOrder

A classe `NumberAscOrder` é responsável por coletar todos os números da pilha, ordená-los e retornar uma lista dos números ordenados. O método `sort` verifica se a pilha está vazia e lança uma exceção `StackEmptyException` se necessário. Em seguida, coleta os números da pilha em uma lista, ordena a lista e retorna os números ordenados.

### CustomStack

A classe `CustomStack` é uma implementação de uma pilha genérica. Ela suporta operações básicas de pilha, incluindo `push` para adicionar elementos, `pop` para remover e retornar o último elemento, e `isEmpty` para verificar se a pilha está vazia. Se a pilha estiver cheia ao tentar adicionar um elemento, a classe lança uma exceção `StackFullException`. Se a pilha estiver vazia ao tentar remover um elemento, a classe lança uma exceção `StackEmptyException`.

### StackEmptyException

A classe `StackEmptyException` é uma exceção personalizada usada para indicar que a pilha está vazia.

## Implementação dos Testes

### NumberAscOrderTest

A classe `NumberAscOrderTest` contém testes para validar a funcionalidade da classe `NumberAscOrder`. Utiliza o Mockito para criar um mock da pilha `CustomStack` e configurar o comportamento esperado dos métodos mockados.

#### Uso do Mockito

- `@Mock` cria um mock da pilha `CustomStack`.
- `MockitoAnnotations.openMocks(this)` inicializa os mocks.
- `when(stack.isEmpty())` e `when(stack.pop())` configuram o comportamento esperado dos métodos mockados.

#### Testes

- `testSortWithNumbers`: Testa o método `sort` com uma pilha de números, verificando se a lista retornada está ordenada corretamente.
- `testSortWithEmptyStack`: Testa o método `sort` com uma pilha vazia, verificando se a exceção `StackEmptyException` é lançada.

## Dependências do Projeto

As dependências do projeto são gerenciadas pelo Maven, conforme especificado no arquivo `pom.xml`.

### Dependências

- **JUnit 5**:
  - `junit-jupiter-api`: Proporciona as APIs para escrever testes usando JUnit 5.
  - `junit-jupiter-engine`: Executa os testes escritos com JUnit 5.

- **Mockito**:
  - `mockito-core`: Proporciona as funcionalidades principais do Mockito para criar mocks.
  - `mockito-junit-jupiter`: Integração do Mockito com JUnit 5.
