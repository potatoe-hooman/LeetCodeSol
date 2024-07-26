func strStr(haystack string, needle string) int {
	var max_length int = len(haystack) - len(needle)
	var curr string = ""
	if (haystack==needle) {
		return 0
	}
	if max_length > 0 {
		for i:=0; i <= max_length; i++ {
			curr = haystack[i: (i+len(needle))]
			if curr==needle {
				return i
			}
		}
	}

	return -1
}
