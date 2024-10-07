# Number Guessing Game

A simple Java-based number guessing game where the player has three attempts to guess a random number between 1 and 100.

## Features
- A random number between 1 and 100 is generated at the start of each game.
- The player has **3 attempts** to guess the number correctly.
- After each incorrect guess, a hint is provided:
  - If the guess is too low, the player is told to guess a higher number.
  - If the guess is too high, the player is told to guess a lower number.
- If the player uses all attempts without guessing correctly, the game reveals the correct number.

## How to Play
1. The game prompts you to guess a number between 1 and 100.
2. You have 3 attempts to guess the correct number.
3. After each guess, you will receive feedback to help you adjust your next guess:
   - **Higher**: Your guess was too low.
   - **Lower**: Your guess was too high.
4. If you guess correctly, you win the game!
5. If you run out of attempts, the game ends and displays the correct number.

## Installation
To run this game locally, make sure you have Java installed. Then, follow these steps:

1. Clone the repository:
    ```bash
    git clone https://github.com/emrenos/SayiTahmin.git
    ```

2. Navigate to the project directory:
    ```bash
    cd SayiTahmin
    ```

3. Compile the Java code:
    ```bash
    javac Main.java
    ```

4. Run the game:
    ```bash
    java Main
    ```

## Usage
When you run the game, you will be prompted to enter a guess. Follow the instructions provided after each guess until you either guess correctly or run out of attempts.

## Example Output
```
Sayı tahmin oyununa hoş geldin! 1-100 arasında bir sayı tahmin et. 3 deneme hakkın var.
Lütfen tahmininizi giriniz: 50
Yanlış! Daha yüksek bir sayı seçmelisiniz. Kalan hak: 2
Lütfen tahmininizi giriniz: 75
Yanlış! Daha düşük bir sayı seçmelisiniz. Kalan hak: 1
Lütfen tahmininizi giriniz: 60
Oyun bitti! Doğru sayı: 67
```

## License
This project is open-source and available under the MIT License.
