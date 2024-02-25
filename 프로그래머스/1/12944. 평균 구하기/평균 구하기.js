function solution(arr) {
    var answer = 0;
    
    const sum = arr.reduce((acc, curr) =>(acc + curr));
    answer = sum / arr.length;
    return answer;
}