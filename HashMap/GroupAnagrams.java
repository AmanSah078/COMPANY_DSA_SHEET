import java.util.HashMap;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class GroupAnagrams {

    public List<List<String>> groupanagrams(String[] str)
    {
        //create the list
        HashMap<String,List<String>> map= new HashMap<>();

        //Take loop
        for(int word=0; word<str.length; word++)
        {
            //convert the word in to the char

            char[] chars= str[word].toCharArray();

            //Need to sort the char
            Arrays.sort(chars);

            //Again need to store in the String format

            String key= new String(chars);

            //Now check is this key jo hain wo map mein avaialble hain as a key in the map or not dude

            //If the key is not availble inside the map as a key then?
            //create new Arraylist
            if(!map.containsKey(key))
            {
                map.put(key,new ArrayList<>());
            }

            //add in to the array]
            //arr dude get(key) mean finally store what ? value an yrr
            map.get(key).add(str[word]);
        }

        //now return  all the values dude
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args)
    {
        String[] str= {"eat","tea","tan","ate","nat","bat"};

        GroupAnagrams obj = new GroupAnagrams();

        System.out.println(obj.groupanagrams(str));
    }
}