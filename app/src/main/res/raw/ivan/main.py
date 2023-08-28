import abc
import random
import time


class Hero(abc.ABC):
    def __init__(self, hp, name, baseDamage, lvl, a=0):
        self.hp = hp
        self.name = name
        self.baseDamage = baseDamage
        self.lvl = lvl
        self.a = a

    @abc.abstractmethod
    def attack(self) -> int:
        pass

    @abc.abstractmethod
    def ult(self) -> int:
        pass

    @abc.abstractmethod
    def ability(self) -> int:
        pass


class Knight(Hero):
    def __init__(self, hp, name, baseDamage, lvl, a=0):
        super().__init__(hp, name, baseDamage, lvl, a=0)
        self.class_ = 'Knight'

    def attack(self):
        return int(self.baseDamage * self.lvl * random.uniform(0.5, 2))

    def ult(self):
        return int(self.baseDamage * self.lvl * random.uniform(2, 3))

    def ability(self):
        if self.a == 1:
            return int(0.3 * self.baseDamage * self.lvl * random.uniform(0.5, 2))
        else:
            return 0


class Game:
    def __init__(self, hero1, hero2):
        self.hero1 = hero1
        self.hero2 = hero2
        self.round = 0

    def __playRound(self):
        print("-" * 30)
        print("-" * 30)
        i = input()
        if i == "Give up":
            self.hero1.hp = 0
            print(f"{self.hero1.name} loose the fight... You gave up. Ha - ha")
            exit(0)
        else:
            pass
        self.round += 1
        damage_by_first = self.hero1.attack()
        damage_by_second = self.hero2.attack()
        ult_by_first = self.hero1.ult()
        ult_by_second = self.hero2.ult()
        heal_by_first = self.hero1.ability()
        heal_by_second = self.hero2.ability()
        if self.round % 5 == 0:
            print('\n!!!!')
            print("You can use your ultra abilities")
            print('!!!!\n')
            self.hero2.hp -= (damage_by_first + ult_by_first - heal_by_second)
            self.hero1.hp -= (damage_by_second + ult_by_second - heal_by_first)
        else:
            self.hero2.hp -= (damage_by_first - heal_by_second)
            self.hero1.hp -= (damage_by_second - heal_by_first)
        if self.hero2.hp >= 0 and self.hero1.hp >= 0:
            print(f"{self.hero1.name} has made {damage_by_first} damage to {self.hero2.name}")
            print(f"{self.hero2.name}'s health is {self.hero2.hp} now")
            print(f"{self.hero2.name} has made {damage_by_second} damage to {self.hero1.name}")
            print(f"{self.hero1.name}'s health is {self.hero1.hp} now")
            print(f"Round {self.round} has ended")
            print("-"*30)
        elif self.hero2.hp < 0:
            print(f"{self.hero1.name} has made {damage_by_first} damage to {self.hero2.name}")
            print(f"{self.hero2.name}'s health is 0 now")
            print(f"Round {self.round} has ended.\n")
            print("-" * 30)
            print("-" * 30)
            print("-" * 30)
            print(f"GAME OVER!\n{self.hero1.name} is the winner")
        elif self.hero1.hp < 0:
            print(f"{self.hero1.name} has made {damage_by_first} damage to {self.hero2.name}")
            print(f"{self.hero2.name}'s health is {self.hero2.hp} now")
            print(f"{self.hero2.name} has made {damage_by_second} damage to {self.hero1.name}")
            print(f"{self.hero1.name}'s health is 0 now")
            print(f"Round {self.round} has ended.\n")
            print("-" * 30)
            print("-" * 30)
            print("-" * 30)
            print(f"GAME OVER!\n{self.hero2.name} is the winner")

    def play_game(self):
        print(f'Fight started between {self.hero1.name} and {self.hero2.name}')
        while self.hero1.hp > 0 and self.hero2.hp > 0:
            self.__playRound()
            time.sleep(1)


Hero1 = Knight(400, "Gleb", 35, 1, 1)
Hero2 = Knight(400, "Bot", 35, 1, 1)
Gm = Game(Hero1, Hero2)
Gm.play_game()


