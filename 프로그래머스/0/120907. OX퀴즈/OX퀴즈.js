function solution(quiz) {
  return quiz.map((expression, i) => {
    const [a, sign, b, equal, result] = expression.split(" ");
    if (sign === "+") {
      return Number(a) + Number(b) === Number(result) ? "O" : "X";
    } else {
      return Number(a) - Number(b) === Number(result) ? "O" : "X";
    }
  });
}