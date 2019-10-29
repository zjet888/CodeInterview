returnLongestNonRepeatSubString(s){
    if(!s){
      return "";
    }
 
    let subCollection = [];
    let currentSub = "";
    for(let i = 0; i < s.length; i ++) {
      let c = s[i];
      if(currentSub.indexOf(c) === -1) {
        currentSub += c;
      } 
      else {
        subCollection.push(currentSub);
        currentSub = "" + c;
      }
    }
 
    if(currentSub.length > 0){
      subCollection.push(currentSub);
    }
 
    let longest = ""; 
    for(let i = 0 ; i < subCollection.length ; i ++) {
      let sub = subCollection[i];
      if(sub.length > longest.length)  {
        longest = sub;
      }
    }
 
    return longest;
  }
