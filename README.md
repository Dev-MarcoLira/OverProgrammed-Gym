# Gym System

Esse projeto foi feito com fins de estudar OOP (Programação Orientada a Objeto), disciplina lecionada pelo professor Carlos Pantoja, na universidade federal Cefet-RJ.

// This is a university-oriented project, designed to improve student's knowledge upon OOP (and Java).

## Funções do projeto // features
A classe GymSystem é a principal, pois interage com todas as outras classes; ela deve ser usada nos testes (unitários e outros.)

### Person - super class to provide inheritance for Members and Employees

Person
```
    private String dtNascimento;
    private String telefone;
    private String eMail;
    private String endereco;
    private String cpf;
    private String nome;

    private char genero;
    private int matricula;
    private float peso;
    private float altura;
```

### Member Management – Register, check-in, check-out, view Member details.

Aluno (Member) : Person
```
    altura: float
    peso: float
```

### Employee - super class to provide inheritance for Employees

Funcionário (Employee) : Person
```
    cargo: String
    salario: float
    seguridade: int
    ctps: String
```

### Treinador //Trainer Management - Register, check-in, check-out, class.

Treinador (Trainer) : Employee
```
    aulas: Aula[]
    aulasAgendadas: Agendamentos[]
```    

### Aulas // Class Management – Class booking, availability checking, time assignment.

Aula (Class)
```
    professor: Professor
    descrição: String
```

### Agendamento // Reservation System – Allow reservations, cancellations, modify bookings.

Reserva/Agendamento de aula (Appointment / Scheduling)
```
    aula: Aula
    dataAgendada: String
```

### Pagamentos // Billing System – Generate invoices, handle payments.

## Database // Banco de Dados

Por enquanto, não trabalharemos com bancos de dados. Usaremos armazenamento em memória (estruturas de dados como ArrayList, Stack etc.).

For a while, it is not required to set a database up. So that, you shall join using in-memory storage solutions, such as ArrayList, Stack etc.