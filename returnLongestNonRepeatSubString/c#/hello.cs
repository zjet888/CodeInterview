 string returnLongestNonRepeatSubString(string s)
        {
            if (string.IsNullOrEmpty(s))
            {
                return "";
            }

            List<string> subCollection = new List<string>();
            string currentSub = "";
            for (int i = 0; i < s.Length; i++)
            {
                char c = s[i];
                if (currentSub.IndexOf(c) == -1)
                {
                    currentSub += c;
                }
                else
                {
                    subCollection.Add(currentSub);
                    currentSub = "" + c;
                }
            }

            if (currentSub.Length > 0)
            {
                subCollection.Add(currentSub);
            }

            string longest = "";
            for (int i = 0; i < subCollection.Count; i++)
            {
                string sub = subCollection[i];
                if (sub.Length > longest.Length)
                {
                    longest = sub;
                }
            }

            return longest;
        }
