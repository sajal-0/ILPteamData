# IPL Player Management Application

This application allows users to manage and query IPL player statistics with an interactive menu-driven interface. Below is the description of the functionality provided by the application.

## Features

### Menu Options:

| Option | Description                                 |
|--------|---------------------------------------------|
| 0      | Print all batters                          |
| 1      | Print all all-rounders                     |
| 2      | Print all bowlers                          |
| 3      | Print all RCB batters                      |
| 4      | Print all MI batters                       |
| 5      | Print all CSK batters                      |
| 6      | Print all RCB bowlers                      |
| 7      | Print all MI bowlers                       |
| 8      | Print all CSK bowlers                      |
| 9      | Print players whose names start with a character |
| 10     | Add players to RCB                         |
| 11     | Exit the application                       |

---

## Sample Outputs

### 0 - Print All Batters:

```
List Of All Batters In IPL:
+---------------------+-----------+-------+---------+------+
| Player Name         | Jersey No | Runs  | Wickets | Team |
+---------------------+-----------+-------+---------+------+
| Virat Kohli         | 18        | 11000 | 4       | RCB  |
| AB de Villiers      | 17        | 10000 | 59      | RCB  |
| Kieron Pollard      | 55        | 10000 | 25      | MI   |
| Ruturaj Gaikwad     | 31        | 10000 | 29      | CSK  |
| Rohit Sharma        | 45        | 9000  | 15      | MI   |
| Faf du Plessis      | 19        | 8000  | 5       | RCB  |
| Suryakumar Yadav    | 63        | 8000  | 51      | MI   |
| Glenn Maxwell       | 32        | 7000  | 60      | RCB  |
| Ishan Kishan        | 23        | 7000  | 18      | MI   |
| MS Dhoni            | 7         | 7000  | 7       | CSK  |
| Moeen Ali           | 18        | 7000  | 75      | CSK  |
| Ambati Rayudu       | 9         | 6000  | 8       | CSK  |
| Hardik Pandya       | 33        | 5500  | 55      | MI   |
| Ravindra Jadeja     | 8         | 5001  | 150     | CSK  |
+---------------------+-----------+-------+---------+------+
```

### 1 - Print All All-Rounders:

```
List Of All All-Rounders In IPL:
+---------------------+-----------+-------+---------+------+
| Player Name         | Jersey No | Runs  | Wickets | Team |
+---------------------+-----------+-------+---------+------+
| AB de Villiers      | 17        | 10000 | 59      | RCB  |
| Glenn Maxwell       | 32        | 7000  | 60      | RCB  |
| Suryakumar Yadav    | 63        | 8000  | 51      | MI   |
| Hardik Pandya       | 33        | 5500  | 55      | MI   |
| Ravindra Jadeja     | 8         | 5001  | 150     | CSK  |
| Moeen Ali           | 18        | 7000  | 75      | CSK  |
+---------------------+-----------+-------+---------+------+
```

### 2 - Print All Bowlers:

```
List Of All Bowlers In IPL:
+---------------------+-----------+-------+---------+------+
| Player Name         | Jersey No | Runs  | Wickets | Team |
+---------------------+-----------+-------+---------+------+
| AB de Villiers      | 17        | 10000 | 59      | RCB  |
| Mohammed Siraj      | 13        | 900   | 229     | RCB  |
| Yuzvendra Chahal    | 3         | 650   | 289     | RCB  |
| Glenn Maxwell       | 32        | 7000  | 60      | RCB  |
| Harshal Patel       | 24        | 1500  | 100     | RCB  |
| Wanindu Hasaranga   | 99        | 1200  | 150     | RCB  |
| Jasprit Bumrah      | 93        | 600   | 200     | MI   |
| Suryakumar Yadav    | 63        | 8000  | 51      | MI   |
| Hardik Pandya       | 33        | 5500  | 55      | MI   |
| Trent Boult         | 18        | 1100  | 150     | MI   |
| Rahul Chahar        | 28        | 800   | 90      | MI   |
| Ravindra Jadeja     | 8         | 5001  | 150     | CSK  |
| Moeen Ali           | 18        | 7000  | 75      | CSK  |
| Deepak Chahar       | 90        | 800   | 65      | CSK  |
| Dwayne Bravo        | 47        | 2000  | 170     | CSK  |
+---------------------+-----------+-------+---------+------+
```

### Additional Queries

- **Print Players Based on Starting Character (Option 9):**
    Enter a character, and the application will display players whose names start with that character.

---

## How to Use

1. Clone the repository to your local system.
2. Run the application file.
3. Use the menu to interact with the application and perform queries on IPL player data.
4. Follow the on-screen instructions to provide input for specific options.

---

## Exit

To exit the application, choose option `11`. A message will be displayed:

```
Exiting the application. Thank you!
```

