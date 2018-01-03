class SolutionFindRestaurant(object):
    def findRestaurant(self, list1, list2):
        """
        :type list1: List[str]
        :type list2: List[str]
        :rtype: List[str]
        """
        m  = {}
        tmp = []
        minSum = sys.maxsize
        for idx, name in enumerate(list1):
            m[name] = idx
        
        for idx, name in enumerate(list2):
            if name in m: 
                tmpSum = m[name] + idx;
                if(tmpSum == minSum):
                    tmp.append(name)
                if(tmpSum < minSum):
                    tmp = []
                    tmp.append(name)
                    minSum = tmpSum 
        return tmp
                    
        
        