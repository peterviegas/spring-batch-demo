### 🧠 What is Spring Batch?

👉 Spring Batch is a framework within the Spring ecosystem used to:

Automatically process large volumes of data in batches.

---

### 🔥 Real-world examples

🧾 1. Process orders

- Read thousands of orders

- Update status

- Generate reports

🌎 Product Translation

- Read products from the database

- Translate names (PT → EN / ES)

- Save results

📊 Data Import

- CSV → Database

- External API → MySQL

💰 4. Financial Management

- Calculate commissions

- Close daily billing

---

⚙️ How it works (basic structure)

A Spring Batch job is divided as follows:

🧩 1. Job

- 👉 The complete process

🔄 2. Step

- 👉 Process steps

📥📤 3. Chunk (the heart)

- It works like this:

- READ → PROCESS → WRITE

💡 Visual example: Database → (Reader)

→ (Processor)

→ (Writer) → Database/API

___

### Project Structure
```
com.example.batch
 ├── config
 ├── entity
 ├── repository
 ├── batch
 │    ├── reader
 │    ├── processor
 │    ├── writer
 │    └── job
 └── BatchApplication
```
