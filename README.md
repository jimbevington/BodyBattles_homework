# BodyBattles

Models a future where people with diseases can eat Nanobots that will attack Germs and apply medicine internally.


## Classes

### Person
Has a *name*, a *health* value, a *body* to contain **Germs** and **Nanobots** and a list of *immunities*.
The *body* is implemented as an ArrayList containing **Combatants** (see below).

### Combatant 
An abstract class providing shared parameters and methods for the **Germ** and **Nanobot** classes, including *strength* and *attackPower*.
The *attack* method allows Combatants to attack one another, reducing their strength.

### Germ
A child of Combatant. Germs also possess a *name* and a *multiply* method that increases their *strength*. 
When a Person catches a disease, a Germ is added to their body and reduces their health by the Germs strength value, unless they are immune to the disease.

### Nanobot
A child of Combatant. Nanobots possess a *disperseMedicine* method to increase the Health of their host Person by the Nanobots strength value.


