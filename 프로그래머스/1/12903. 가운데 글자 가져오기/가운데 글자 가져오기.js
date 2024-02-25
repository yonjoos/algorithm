function solution(s) {
    var answer = '';
    
    let len = s.length;
    if(len%2 === 0){
        len /= 2;
        return s.substring(len - 1, len + 1)
    }
    
    len /= 2;
    return s.substring(len, len + 1);
}