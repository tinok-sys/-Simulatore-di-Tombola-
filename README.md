# Simulatore di Tombola (Versione Principiante)
Un semplice programma in Java per simulare un'estrazione della tombola o del lotto. Questo progetto è stato creato per esercitarsi con le basi della programmazione senza l'uso di librerie complesse.

## Punti chiave del progetto
L'obiettivo principale era gestire l'unicità dei numeri (non estrarre mai due volte lo stesso numero) utilizzando solo strutture fondamentali:

Array (int[]): Per memorizzare i numeri estratti.

Cicli while e for: Per gestire le ripetizioni e le verifiche manuali.

Logica di ricerca: Un algoritmo manuale per controllare se un numero esiste già nell'elenco.

## Come funziona?
Il programma segue una logica lineare:

Chiede all'utente il numero di estrazioni e il valore massimo.

Genera un numero casuale con Random.

Verifica manualmente se il numero è già presente nell'array dei risultati.

Se il numero è nuovo, lo aggiunge. Altrimenti, ripete l'estrazione.


# English Version

## Tombola Lottery Simulator (Beginner Version)
A simple Java program to simulate a lottery or "Tombola" draw. This project was designed to practice programming fundamentals without relying on high-level libraries.

## Key Features
The main challenge was ensuring uniqueness (never drawing the same number twice) using only core structures:

Arrays (int[]): To store the drawn numbers.

while and for loops: To manage repetitions and manual checks.

Search Logic: A manual algorithm to verify if a number is already in the list.

## How it works
The program follows a clear step-by-step logic:

Ask the user for the number of draws and the maximum limit.

Generate a random number using Random.

Manually check if that number is already stored in the results array.

If the number is new, add it. Otherwise, re-roll.
