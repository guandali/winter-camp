class SolutionReplaceWords {
    class TrieNode{
        char c;
        boolean isWord = false;
        TrieNode [] nodes = new TrieNode[26];
        public TrieNode(char c){
            this.c = c;
        }
    }
    class Trie{
        TrieNode root = new TrieNode('a');
        public void addWord(String str){
            TrieNode cur = root;
            char[] arr = str.toCharArray();
            for(int i=0; i<arr.length;i++){
                char c = arr[i];
                int idx = c - 'a';
                if(cur.nodes[idx]==null){
                    cur.nodes[idx] = new TrieNode(c);
                }
                if(i==arr.length-1) cur.nodes[idx].isWord = true;
                cur = cur.nodes[idx];
            }
        }
        
        public String findRoot(String word){
            StringBuilder sb = new StringBuilder();
            TrieNode cur = root;
            for(char c:word.toCharArray()){
                int idx = c - 'a';
                if(cur.nodes[idx]!=null){
                    cur = cur.nodes[idx];
                    sb.append(cur.c);
                    if(cur.isWord) break;
                }
                else break;
            }
            return cur.isWord?(sb.toString()):("");
        }
        
    }
    public String replaceWords(List<String> dict, String sentence) {
        if(dict==null||sentence==null) return null;
        String[] words = sentence.split("\\s+");
        Trie trie = new Trie();
        for(String rootWord:dict){
            trie.addWord(rootWord);
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<words.length;i++){
            String tmp = trie.findRoot(words[i]);
            sb.append(tmp.equals("")?(words[i]):(tmp));
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}