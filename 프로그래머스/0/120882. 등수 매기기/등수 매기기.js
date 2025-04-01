function solution(score) {
    //평균 계산 -> 등수 매기기
    const avg = score.map((test) => test.reduce((a,b)=>a+b,0)/test.length);
    const sortedAvg = [...avg].sort((a,b)=> b-a);
    const rank = avg.map((a)=>sortedAvg.indexOf(a)+1);
    
    return rank; 
}