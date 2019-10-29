fun returnLongestNonRepeatSubString(s: String?): String {
   if (s == null || s.length == 0) {
       return ""
   }

   val subCollection = ArrayList<String>()
   var currentSub = ""
   for (i in 0 until s.length) {
       val c = s[i]
       if (currentSub.indexOf(c) == -1) {
           currentSub += c
       } else {
           subCollection.add(currentSub)
           currentSub = "" + c
       }
   }

   if (currentSub.length > 0) {
       subCollection.add(currentSub)
   }

   var longest = ""
   for (i in subCollection.indices) {
       val sub = subCollection[i]
       if (sub.length > longest.length) {
           longest = sub
       }
   }

   return longest
}
