class SolutionKillProcess {
    public List<Integer> killProcess(List<Integer> pid, List<Integer> ppid, int kill) {
        List<Integer> answer = new ArrayList<>();
        //ppid --> pid
        Map<Integer, List<Integer>> parents = new HashMap<>();
        for(int i = 0; i<ppid.size(); i++){
            List<Integer> tmp = null;
            if(parents.containsKey(ppid.get(i))){
                tmp = parents.get(ppid.get(i));
            }
            else tmp = new ArrayList<>();
            tmp.add(pid.get(i));
            if(ppid.get(i) == 0) continue;
            else parents.put(ppid.get(i), tmp);
        }
        if(parents.containsKey(kill)){
            List<Integer> targets = new ArrayList<>();
            targets.add(kill);
            killTargets(targets,answer, parents);
        }
        else answer.add(kill);
        return answer;
    }
    
    private void killTargets(List<Integer> targets, List<Integer> answer, Map<Integer, List<Integer>> parents){
        for(Integer ppid:targets){
            answer.add(ppid);
            if(parents.containsKey(ppid)){
                List<Integer> children = parents.get(ppid);
                killTargets(children,answer, parents);
            }
        }
        return;
    }
}