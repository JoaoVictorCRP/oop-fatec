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