# Academia CEFET

Projeto desenvolvido por alunos do CEFET Maria da Graça na disciplina de **Java Orientada a Objetos**.

---

## 🚨 Regras de Contribuição

### 🚫 Não faça alterações diretas na branch `main`
A branch `main` representa a versão estável do sistema. Todas as alterações devem ser feitas em branches baseadas na branch `new-gym` e revisadas antes de serem integradas à `main`.

### ✅ Fluxo de Trabalho

1. **Atualize a branch `main` no seu ambiente local:**
   ```bash
   git checkout main
   git pull origin main
   ```

2. **Troque para a branch `new-gym`:**
   ```bash
   git checkout new-gym
   ```

3. **Crie uma nova branch a partir de `new-gym`:**
   Escolha um nome que descreva a funcionalidade ou correção que você irá implementar, por exemplo:
   ```bash
   git checkout -b cadastro-aluno
   ```

4. **Implemente as alterações necessárias e faça o commit:**
   ```bash
   git add .
   git commit -m "Adicionei cadastro de aluno"
   ```

5. **Envie sua branch para o GitHub:**
   ```bash
   git push origin cadastro-aluno
   ```

> **Nota:** A branch `main` deve permanecer estável. Todas as novas funcionalidades ou correções devem ser desenvolvidas a partir da branch `new-gym`.

---

## ✅ Funcionalidades do Projeto

### **Gerenciamento de Pessoas**
- **Classe Base:** `Person`
  ```java
  nome: String
  cpf: String
  endereco: String
  email: String
  telefone: String
  dtNascimento: String
  genero: char
  matricula: int
  ```

### **Gerenciamento de Alunos**
- **Classe:** `Aluno` (herda de `Person`)
  ```java
  altura: float
  peso: float
  ```

### **Gerenciamento de Funcionários**
- **Classe:** `Funcionario` (herda de `Person`)
  ```java
  cargo: String
  salario: String
  seguridade: int
  ctps: int
  ```

### **Gerenciamento de Aulas**
- **Classe:** `Aula`
  ```java
  id: int
  memberId: int
  descricao: String
  ```

### **Sistema de Reservas**
- **Classe:** `Reserva`
  ```java
  id: int
  classId: int
  dataAgendada: String
  ```

### **Sistema de Cobrança**
- Geração de faturas e gerenciamento de pagamentos.

---

## 💻 Interface Gráfica (JavaFX)

O projeto utiliza **JavaFX** para renderização das janelas em modo desktop, compatível com os principais sistemas operacionais.

### Como executar:

1. **Instale as dependências:**
   ```bash
   mvn install
   ```

2. **Execute a aplicação com interface gráfica:**
   ```bash
   mvn clean javafx:run
   ```

3. **(Opcional) Execute sem interface gráfica:**
   ```bash
   mvn exec:java
   ```

---

## 🗄️ Banco de Dados

Atualmente, o projeto utiliza **armazenamento em memória** com estruturas como `ArrayList` e `Stack`. Não é necessário configurar um banco de dados.

---

## 📚 Tecnologias Utilizadas

- **Linguagem:** Java
- **Framework de Interface:** JavaFX
- **Gerenciador de Dependências:** Maven

---

## 📜 Licença

Este projeto é de uso acadêmico e não possui uma licença específica.

---

## 👥 Contribuidores

Desenvolvido por alunos do CEFET Maria da Graça.