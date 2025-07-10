# 🎯 Template Plugin — Spigot

A basic Minecraft plugin for Spigot servers.  
It creates a simple `/hola` command that greets the player — ideal as a starting point for building more advanced plugins.

> ⚠️ **Note:** This is just a **template plugin** compatible with **Spigot 1.20+** only.

---

## 🧩 Features

- ✅ `/hola` command that sends the message `ola como estas` to the player.
- 🎨 Colorful and decorative messages in the console on enable/disable.
- 🔧 Compatible with **Spigot 1.20.1 and above**.
- 💡 Clean, warning-free code that is easy to extend.

---

## 📦 Project Structure

```

template/
├── pom.xml
└── src/
└── main/
├── java/
│   └── yours4nty/template/Main.java
└── resources/
└── plugin.yml

````

---

## 🚀 How to Build

1. Make sure you have **Java 8** (or higher) and **Maven** installed.
2. Clone the repository:

```bash
git clone https://github.com/YourS4nty/template.git
cd template
````

3. Build the plugin:

```bash
mvn clean package
```

4. The `.jar` file will be located in the `target/` folder.

---

## 🛠️ How to Use

1. Place the `template-1.0.0.jar` file into your server's `plugins/` folder.
2. Start the server.
3. Use `/hola` in-game to receive a greeting.

---

## ⭐ Was this helpful?

Leave a ⭐ on the repo and share it with other plugin developers!
