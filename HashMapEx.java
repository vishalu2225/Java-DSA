import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class HashMapEx
{
    static void main(String[] args)
    {

        //1.HashMap
        Map<String,String> mp=new HashMap<>();

        //inserion
        mp.put("in","India");
        mp.put("en","England");
        mp.put("us","United States");
        System.out.println(mp);//{in=India, en=England, us=United States}

        mp.put("in","India2");
        System.out.println(mp);//{in=India2, en=England, us=United States}value modified


        Map<String,String> mp1=new HashMap<>();

        mp1.put("br","brazil");
        System.out.println(mp1);//{br=brazil}

        mp1.putAll(mp);
        System.out.println(mp1);//{br=brazil, in=India2, en=England, us=United States}

        //deletion
        mp1.remove("en");
        System.out.println(mp1);//{br=brazil, in=India2, us=United States}

        System.out.println(mp1.size());//3

        mp1.putIfAbsent("in","India3");
        System.out.println(mp1);//{br=brazil, in=India2, us=United States}
        mp1.putIfAbsent("is","India3");
        System.out.println(mp1);//{br=brazil, in=India2, is=India3, us=United States}


        System.out.println(mp1.get("br"));//brazil

        System.out.println(mp1.getOrDefault("us","None"));//United States
        System.out.println(mp1.getOrDefault("usa","None"));//None

        System.out.println(mp1.containsKey("in"));//true
        System.out.println(mp1.containsKey("usa"));//false

        System.out.println(mp1.containsValue("United States"));//true
        System.out.println(mp1.containsValue("United States of America"));//false

        System.out.println(mp1);//{br=brazil, in=India2, is=India3, us=United States}
        mp1.replace("in","Indonesia");//{br=brazil, in=Indonesia, is=India3, us=United States}
        System.out.println(mp1);
        mp1.replace("in","Indonesia","India");//{br=brazil, in=India, is=India3, us=United States}
        System.out.println(mp1);

        Set<String> keySet=  mp1.keySet();
        System.out.println(keySet);//[br, in, is, us]

        Collection<String> valueSet=mp1.values();
        System.out.println(valueSet);//[brazil, India, India3, United States]

        //get all the entries from map
        System.out.println("Printing entry:"+mp1.entrySet());//Printing entry:[br=brazil, in=India, is=India3, us=United States]

        //Iterating over a map
        Map<Integer,String>map=new HashMap<>();
        map.put(1,"One");
        map.put(2,"Two");

        for(Map.Entry<Integer,String>entry:map.entrySet())
        {
            System.out.println("Key:"+entry.getKey()+",Value:"+entry.getValue());//Key:1,Value:One
                                                                                // Key:2,Value:Two
        }

        mp1.clear();
        System.out.println(mp1.size());//0








    }
}
