def returnLongestNonRepeatSubString(s):
    if not s:
        return ""
    subCollection = []
    currentSub = ""
    for c in s:
        if (currentSub.find(c) == -1):
            currentSub += c
        else:
            subCollection.append(currentSub)
            currentSub = c
    
    if currentSub:
        subCollection.append(currentSub)
    
    longest = ""
    for sub in subCollection:
        if (len(sub) > len(longest)):
            longest = sub
            
    return longest
