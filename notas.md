# Anotações

## Procedural vs POO
- Nas linguagens procedurais, podemos chamar funções e métodos, na POO só chamamos métodos (funções atreladas a objetos).
Ex:
JavaScript:`acelerar()`
Java: `Carro.acelerar()` (Isto é, se a classe previamente criada Carro tiver o método acelerar)

## Boas práticas
- Não faça nenhum print dentro da classe, ao invés disso retorne String, isso aumenta a flexibilidade da classe.

## Agregação e Composição
- **Agregação (independência)** = diamante em branco
- **Composição (dependência)** = diamante preenchido
- **CUIDADO: Quando a relacionamento com outra classe é N, indica um array (n instâncias da classe)**
![Composica - Carro](composicao.png)


## Agreg. e Compos. VS Herança
- No conceito de herança, podemos imaginar um diagrama "é um...",
- No conceito de agreg. e compos. a pergunta de associação "é um..." sempre será falso.
![Heranca](heranca.png)


## Herança
- Atributos `protected` são privados para todas as classes, exceto as que suas filhas.

## Polimorfismo
- Se você não incluir um método específico na classe pai, ele não poderá ser aplicado com polimorfismo!
- Quando uma classe ou método estiver em _itálico_, ela é abstrata