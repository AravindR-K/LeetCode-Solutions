class Solution {
    public String getValue(String s) {
        char[] cArr = s.toCharArray();
        Arrays.sort(cArr);
        return new String(cArr);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            String newStr = getValue(str);

            if (!map.containsKey(newStr)) {
                map.put(newStr, new ArrayList<>());
            }

            map.get(newStr).add(str);
        }
        return new ArrayList<>(map.values());
    }
}