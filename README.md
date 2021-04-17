# pv260_tennis

## Rules

- Each player starts with 0 points
- The scoring then goes like this 0 → 15 → 30 → 40
- If A has 40 and scores, and B doesn't have 40, A wins
- If both have 40 and A scores, A has Advantage
- If A has Advantage and scores, they win
- If A has Advantage, B has 40 and scores, both are at 40 again 
- Scores are written in the format `A - B`, e.g. `30 - 15`
- When A has Advantage, the score is written as `A - 40`
- If scores are equal, e.g. both have 30, it is called `30 all`
- If both players have 40 points, it is called `deuce`

## Task

- Try to not skip ahead and always have passing tests for
existing functionality before moving forward
- We want to create a TennisGame which has scoredA(),
scoredB() and showScore()
- The show method should return score in the format defined above,
if there is a winner it gives `winner: A/B`
- Also, if there is a winner already and either scoredA() or
scoredB() is called, exception should be thrown