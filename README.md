# 🎯 Template Plugin — Spigot

Un plugin básico de Minecraft para servidores Spigot.  
Crea un simple comando `/hola` que saluda al jugador, ideal como base para desarrollar plugins más avanzados.

---

## 🧩 Características

- ✅ Comando `/hola` que envía el mensaje `ola como estas` al jugador.
- 🎨 Mensajes decorados y coloridos en la consola al activarse/desactivarse.
- 🔧 Compatible con **Spigot 1.20.1/+**.
- 💡 Código limpio, sin advertencias y fácil de extender.

---

## 📦 Estructura del proyecto

```
template/
├── pom.xml
└── src/
    └── main/
        ├── java/
        │   └── yours4nty/template/Main.java
        └── resources/
            └── plugin.yml
```

---

## 🚀 Cómo compilar

1. Asegúrate de tener **Java 8** (o superior) y **Maven** instalados.
2. Clona el repositorio:

```bash
git clone https://github.com/YourS4nty/template.git
cd template
```

3. Compila el plugin:

```bash
mvn clean package
```

4. El archivo `.jar` estará en la carpeta `target/`.

---

## 🛠️ Cómo usar

1. Coloca el archivo `template-1.0.0.jar` en la carpeta `plugins/` de tu servidor Spigot.
2. Inicia el servidor.
3. Usa `/hola` dentro del juego para recibir un saludo.

---

## ⭐ ¿Te fue útil?

¡Dale una ⭐ al repo y compártelo con otros desarrolladores de plugins!
