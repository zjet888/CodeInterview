package main

import (
	"fmt"
	"strings"
)

func main() {
	fmt.Println("Hello, playground")
	fmt.Printf("%s\n", returnLongestNonRepeatSubString("ABDEFGABEF"))
	fmt.Printf("%s\n", returnLongestNonRepeatSubString("BBBB"))
	fmt.Printf( "%s\n", returnLongestNonRepeatSubString("neatcoding"))
}

func returnLongestNonRepeatSubString(s string) string {
	if len(s) == 0 {
		return ""
	}
	subCollection := make([]string, 1)
	currentSub := ""

	for i := 0; i < len(s); i++ {
		var c = s[i]
		if !strings.Contains(currentSub, string(c)) {
			currentSub += string(c)
		} else {
			subCollection = append(subCollection, currentSub)
			currentSub = string(c)
		}
	}

	if len(currentSub) > 0 {
		subCollection = append(subCollection, currentSub)
	}

	var longest = ""

	for _, sub := range subCollection {
		if  len(sub) > len(longest) {
			longest = sub
		}
	}
	return longest
}
