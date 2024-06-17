# Desafio POO - Abstraindo um Bootcamp

Este projeto foi desenvolvido como parte de um desafio para praticar os conceitos fundamentais de Programação Orientada a Objetos (POO) utilizando Java. O objetivo principal é simular a estrutura de um Bootcamp de desenvolvimento, onde são definidos cursos, mentorias e devs inscritos.

## Funcionalidades Implementadas

| Classe      | Descrição                                                                       |
|-------------|---------------------------------------------------------------------------------|
| Bootcamp    | Representa um Bootcamp com nome, descrição, data inicial e final, e conteúdos.  |
| Conteudo    | Classe abstrata que define o conceito genérico de conteúdo.                     |
| Curso       | Extende Conteudo e representa um curso com título, descrição e carga horária.   |
| Mentoria    | Extende Conteudo e representa uma mentoria com título, descrição e data.        |
| Dev         | Representa um desenvolvedor com nome, conteúdos inscritos e concluídos, e métodos para interação com o Bootcamp. |

## Como Utilizar

### Clonar o Repositório

```bash
git clone https://github.com/GlailtonNascimento/Desafio-poo-Dio-Abstraindo-Um-Bootcamp.git
