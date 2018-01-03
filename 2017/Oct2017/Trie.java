class Trie {
    
        /** Initialize your data structure here. */
        class TrieNode{
            
            TrieNode [] next = new TrieNode[26];
            char c;
            boolean isWord = false;
            public TrieNode(char c){
                this.c = c;
                for(int i = 0; i < 26; i++){
                    this.next[i] = null;
                }
            }
            
            
        }
        TrieNode root = null;
        public Trie() {
            this.root = new TrieNode(' ');
        }
        
        /** Inserts a word into the trie. */
        public void insert(String word) {
            TrieNode tmp = this.root;
            for(char c : word.toCharArray()){
                if(tmp.next[c-'a'] == null) tmp.next[c-'a'] = new TrieNode(c);
                tmp = tmp.next[c-'a'];
            }
            tmp.isWord = true;
            
        }
        
        /** Returns if the word is in the trie. */
        public boolean search(String word) {
            TrieNode prev = this.root;
            for(char c : word.toCharArray()){
               if(prev.next[c - 'a'] == null) return false;
               prev = prev.next[c - 'a'];
            }
            return prev.isWord;
        }
        
        /** Returns if there is any word in the trie that starts with the given prefix. */
        public boolean startsWith(String prefix) {
            TrieNode prev = this.root;
            for(char c : prefix.toCharArray()){
               if(prev.next[c - 'a'] == null) return false;
               prev = prev.next[c - 'a'];
            }
            return true;
        }
    }
    
    /**
     * Your Trie object will be instantiated and called as such:
     * Trie obj = new Trie();
     * obj.insert(word);
     * boolean param_2 = obj.search(word);
     * boolean param_3 = obj.startsWith(prefix);
     */