string
returnLongestNonRepeatSubString (const string & s)
{
    if (s.empty ())
    {
        return "";
    }
    std::vector <string> subCollection;
    string currentSub;
    for (int i = 0; i < s.length (); i++)
    {
        char c = s[i];
        if (currentSub.find (c) == -1)
        {
            currentSub += c;
        }
        else
        {
            subCollection.push_back (currentSub);
            currentSub = string (1, c);
        }
    }

    if(!currentSub.empty())
    {
        subCollection.push_back (currentSub);
    }

    string longest = "";

    for (int i = 0; i < subCollection.size(); i++)
    {
        string sub = subCollection.at(i);
        if (sub.length() > longest.length())
        {
            longest = sub;
        }
    }
    return longest;
}
