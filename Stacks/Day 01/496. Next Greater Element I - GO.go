import ( 
    "fmt"
) 
func nextGreaterElement(nums1 []int, nums2 []int) []int {
    le := len(nums1)
    le2 := len(nums2)
    rt := make([]int,le) // that's how to declare an array of fixed length
    m := make(map[int]int) // that's how to declare a map

    stack := Stack{}

    for i:=0;i<le2;i++{
        curr := nums2[i]
        fmt.Print("curr ",curr,"\n")
        for stack.Len()>-1 && stack.Peek()<curr {
            fmt.Print("curr " , curr ," peek ", stack.Peek()," \n")
            m[stack.Pop()] = curr
        }
        stack.Push(curr)
    }
    for j:=0;j<le;j++{
       // if m.containsKey(nums1[j]){
        if val, found := m[nums1[j]]; found {
            rt[j] = val
        } else {
            rt[j] = -1
        }
    }
    return rt
}

type Stack struct {
    items []int
}

func (s *Stack) Push(item int) {
    s.items = append(s.items, item)
}

func (s *Stack) Pop() int {
    if len(s.items) == 0 {
        return -1 // Error: Stack is empty
    }
    lastIndex := len(s.items) - 1
    popped := s.items[lastIndex]
    s.items = s.items[:lastIndex]
    return popped
}

func (s *Stack) Peek() int {
    if len(s.items) == 0 {
        return -1 // Error: Stack is empty
    }
    lastIndex := len(s.items) - 1
    return s.items[lastIndex]
}
func (s *Stack) Len() int {
    if len(s.items) == 0 {
        return -1 // Error: Stack is empty
    }
    lastIndex := len(s.items) - 1
    return lastIndex
}
