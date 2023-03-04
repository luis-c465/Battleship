# Battleship

Battleship game for AP Computer Science AB 2022-2023 in Ivan Rico's class

## Dependencies for running

- [Java 1.8](https://www.oracle.com/java/technologies/javase/javase8-archive-downloads.html) or [higher](https://adoptium.net/)

## Running

- First download the **[Latest release](https://github.com/luis-c465/Battleship/releases/latest)**
- Then run in the command line _(Or just double click on the file)_
  ```bash
  java -jar [path to downloaded jar file]
  ```

## Building

### Dependencies

- **[Maven v3.8.4](https://maven.apache.org/download.cgi)**

### How to build

Run the following in the [command line](https://www.freecodecamp.org/news/how-to-use-the-cli-beginner-guide/#how-to-locate-your-cli)

```bash
mvn clean compile assembly:single
```

- Then the **Executable Jar** `battleship.jar` will be in the root folder 🎉

## Project Requirements

Due: **Mon, Mar 6 2023** @1 AM

- Two players
- Easy mode has only 3 ships for each player
- Easy mode also lets you see enemy ships
- Normal mode has at least 5 ships
- Each ship has a different number of hits regardless of mode
- Ships indicate when they have been hit
- Tracks wins/losses for each player
- Exit anytime
