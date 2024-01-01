import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public String[] solution(String myStr) {
        String[] myStrList = myStr.split("a");
        List<String> strList = new ArrayList<String>(List.of(myStrList));
        strList = joinString(strList, "b");
        strList = joinString(strList, "c");

        if(strList.isEmpty()){
            return new String[]{"EMPTY"};
        }
        return strList.toArray(new String[0]);
    }

    public List<String> joinString(List<String> strArr, String splStr){
        List<String> strArray = new ArrayList<String>();
        for(String str:strArr){
            String[] strArrTemp = str.split(splStr);
            strArray.addAll(Arrays.asList(strArrTemp));
        }
        strArray = strArray.stream()
                .filter(s -> !s.isEmpty())
                .collect(Collectors.toList());
        return strArray;
    }
}