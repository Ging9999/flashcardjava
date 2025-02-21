# 📚 Flashcard Study App  

## 📝 Overview  
This project is a simple **Flashcard Study App**, designed to help users study using decks of flashcards. The application includes functionality for managing students, decks, and flashcards, with basic object-oriented programming principles in Java.

## 🚀 Features  
- **Create & Manage Flashcards**: Each flashcard has an ID, a topic, a question, and an answer.  
- **Deck System**: Decks contain multiple flashcards and track their size.  
- **Student Profiles**: Each student has an ID, first name, last name, and a list of decks they are studying.  
- **Categorization by Topic**: Flashcards are classified into topics (currently supports `Python` and `Java`).  

## 🏗️ Current Structure  

### 📌 `Flashcard.java`
Defines a **Flashcard** object with:  
- ID  
- Question (Title)  
- Answer  
- Topic  
- Difficulty level  

### 📌 `Deck.java`
Handles a **Deck** of flashcards using a queue. Features:  
- Stores flashcards in a queue (`LinkedList`)  
- Retrieves the next flashcard  
- Tracks the number of flashcards  

### 📌 `Student.java`
Manages **Student** details and their associated flashcard decks. Features:  
- Stores student ID, first name, last name  
- Manages a list of decks  

### 📌 `Topic.java`
An **Enum** for categorizing flashcards. Current topics:  
- `Python`  
- `Java`  

## 🛠️ Setup & Usage  
### 📌 Prerequisites  
- Java (JDK 8 or higher)  
- A Java-compatible IDE (e.g., IntelliJ IDEA, Eclipse, VS Code)  

### 📌 How to Run  
1. Clone the repository:  
   ```sh
   git clone https://github.com/Ging9999/flashcard-app.git
