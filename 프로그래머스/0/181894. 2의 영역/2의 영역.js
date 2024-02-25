function solution(arr) {
    var answer = [];
    if(!arr.includes(2)) return [-1];
    
    // const indexes = arr
    // .map((item, index) => {
    //     if(item === 2) return index;
    //     else return -1;
    // })
    // .filter((item, index) => (item !== -1));
    
    const ind = arr.reduce((a, c, index) => {
        if(c === 2){
            a.push(index);
        }
        return a;
    },[]);
    
    return arr.slice(ind[0], ind.at(-1) + 1);
    
}