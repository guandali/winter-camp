public class SolutionvalidIPAddress {
    public String validIPAddress(String IP) {
        IP = IP.trim();
        String IPv4Type = "IPv4";
        String IPv6Type = "IPv6";
        String notAny = "Neither";
        String expIPv4 = "^[0-9]*$";
        String expIPv6 = "^[0-9a-zA-z]*$";
        if(IP.startsWith(".")||IP.startsWith(":")||IP.endsWith(".")||IP.endsWith(":")){
            return notAny;
        }
        if(IP.contains(".")){
            String[] list = IP.split("\\.");
            if(list.length != 4){
                return notAny;
            }
            for(int i = 0; i <list.length; i++){
                int val;
                try{
                    val = Integer.parseInt(list[i]);
                    
                }catch(NumberFormatException e){
                    val = -1;
                }
                if( val > 255 || val < 0|| (list[i].startsWith("0") && list[i].length() != 1)|| !list[i].matches(expIPv4)){
                    return notAny;
                }
            }
            return IPv4Type;
        }
        else if(IP.contains(":")) {
            int cap = Integer.parseInt("ffff",16);
            String[] list = IP.split("\\:");
            if(list.length != 8){
                return notAny;
            }
            for(int i = 0; i <list.length; i++){
                int val;
                try{
                    val = Integer.parseInt(list[i],16);
                    
                }catch(NumberFormatException e){
                    val = -1;
                }
                if( val > cap  || val < 0|| list[i].length()>4 || !list[i].matches(expIPv6)){
                    return notAny;
                }
            }
            
            return IPv6Type;
            
            
            
            
        }
        
        return notAny;
        
    }
}