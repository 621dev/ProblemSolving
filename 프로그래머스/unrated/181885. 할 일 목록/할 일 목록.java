import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> todoList = new ArrayList<>();
        for(int i=0; i<finished.length; i++){
            if(!finished[i]) todoList.add(todo_list[i]);
        }
        String[] answer = todoList.toArray(new String[0]);
        return answer;
    }
}