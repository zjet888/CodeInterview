String returnLongestNonRepeatSubString(String s)
{
   if (s == null || s.length() == 0)
   {
       return "";
   }

   List<String> subCollection = new ArrayList<String>();
   String currentSub = "";
   for (int i = 0; i < s.length(); i++)
   {
       char c = s.charAt(i);
       if (currentSub.indexOf(c) == -1)
       {
           currentSub += c;
       }
       else
       {
           subCollection.add(currentSub);
           currentSub = "" + c;
       }
   }

   if (currentSub.length() > 0)
   {
       subCollection.add(currentSub);
   }

   String longest = "";
   for (int i = 0; i < subCollection.size(); i++)
   {
       String sub = subCollection.get(i);
       if (sub.length() > longest.length())
       {
           longest = sub;
       }
   }

   return longest;
}
