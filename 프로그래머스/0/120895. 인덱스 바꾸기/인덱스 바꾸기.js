function solution(my_string, num1, num2) {
    // 배열 split로 쪼개서 num배열끼리 바꿔주기
    const arr = my_string.split('');
    const exchange = arr[num1]
    arr[num1] = arr[num2]
    arr[num2] = exchange;
    return arr.join('');
}