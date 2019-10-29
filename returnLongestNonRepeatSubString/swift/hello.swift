func returnLongestNonRepeatSubString (s: String) -> String {
 
  if (s == nil || s.isEmpty) {
           return ""
  }
  var subCollection =  [String]()
  var currentSub = ""
  
  for c in s {
      let i = currentSub.firstIndex(of: c)
      if(i == nil) {
          currentSub = currentSub + String(c)
      }
      else {
          subCollection.append(currentSub);
          currentSub = String(c)
      }
  }
 
   var longest = ""
   for sub in subCollection {
        if sub.length > longest.length {
            longest = sub
        }
   }
 
   return longest
 
}
