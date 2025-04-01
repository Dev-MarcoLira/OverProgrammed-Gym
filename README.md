# Gym System

Esse projeto foi feito com fins de estudar OOP (Programação Orientada a Objeto), disciplina lecionada pelo professor Carlos Pantoja, na universidade federal Cefet-RJ.

// This is a university-oriented project, designed to improve student's knowledge upon OOP (and Java).

## Funções do projeto

### Person (main class that to provide inheritance)

Person
```
    nome: String
    cpf: String
    endereco: String
    e-mail: String
    telefone: String
    dtNascimento: String
    genero: char
    matricula: int
```

### Member Management – Register, check-in, check-out, view Member details.

Aluno (Member)
```
    altura: float
    peso: float
```

### Trainer Management - Register, check-in, check-out, class.

Funcionario (Trainer)
```
    cargo: String
    salario: String

    seguridade: int
    ctps: int
```    

### Class Management – Class booking, availability checking, time assignment.

Aula (Class)
```
    id: int
    memberId: int
    descrição: String
```

### Reservation System – Allow reservations, cancellations, modify bookings.

Reserva de aula (Assignment / Scheduling)
```
    id: int
    classId: int
    dataAgendada: String
```

### Billing System – Generate invoices, handle payments.

## Database // Banco de Dados

Por enquanto, não trabalharemos com bancos de dados. Usaremos armazenamento em memória (estruturas de dados como ArrayList, Stack etc.).

For a while, it is not required to set a database up. So that, you shall join using in-memory storage solutions, such as ArrayList, Stack etc.