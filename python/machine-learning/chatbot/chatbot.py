from chatterbot import ChatBot
from chatterbot.trainers import ListTrainer


my_bot = ChatBot(
    name='MaslaBot',
    read_only=True,
    logic_adapters=['chatterbot.logic.MathematicalEvaluation', 'chatterbot.logic.BestMatch']
)

small_talk = [
    'No saludo, saludan los vagos',
    'Pingüino animal nefasto',
    'No se saluda, se procede directamente a la conversación y se masacra',
    'No hago recomendaciones de operatoria de mercados'
]

math_talk_1 = [
    'pythagorean theorem',
    'A squared plus B squared equals C squared'
]

math_talk_2 = [
    'law of cosines',
    'C**2 = A**2 + B**2 -2*A*B*cos(gamma)'
]

list_trainer = ListTrainer(my_bot)

for item in (small_talk, math_talk_1, math_talk_2):
    list_trainer.train(item)

print(my_bot.get_response(""))


