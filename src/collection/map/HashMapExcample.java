package collection.map;

import java.util.*;

public class HashMapExcample {
    public static void main(String[] args) {
        /*
            Map - HashMap, Hashtable
            키(key)와 값(value)을 쌍으로 이루어진 객체를 저장하는 구조이다.
            키는 중복될수 없지만 값은 중복될 수 있다.
            
            Map - 사용 방법
            객체추가
            - V put(K key, V value)
              주어진 키와 값을 추가, 저장되면 값을 리턴
            객체검색
            - boolean containsKey(Object key)
              주어진 키가 있는지 여부
            - boolean containsValue(Object value)
              주어진 값이 있는지 여부
            - Set(Map.Entry<K,V>> entrySet()
              키와 값의 쌍으로 구성된 모든 Map.Entry 객체를 Set에 담아서 리턴
            - V get(Object key)
              주어진 키가 있는 값을 리턴
            - boolean isEmpty()
              컬렉션이 비어 있는지 여부
            - Set<K> keySet()
              모든 키를 Set 객체에 담아서 리턴
            - int size()
              저장된 키의 총 개수 리턴
            - Collection<V> values()
              저장된 모든 값을 Collection에 담아서 리턴
            객체삭제
            - vold clear()
              모든 Map.Entry(키와 값)를 삭제
            - V remove(Object key)
              주어진 키와 일치하는 Map.Entry를 삭제하고 값을 리턴
        */
        Map<String, Object> map = new HashMap<>();
        //추가
        map.put("name", "kim");
        map.put("age", 30);
        map.put("address", "nowon");

        //검색
        System.out.println("Map 값 꺼내기 = " + map.get("name"));

        //특정 key,value 삭제
        map.remove("age");
        System.out.println(map.get("key")); //null

        //전체 삭제
        map.clear();
        System.out.println(map); //{}


        //keySet() -> 모든 키를 Set 객체에 담아서 리턴
        Map<String, Object> keyMap = new HashMap<>();

        keyMap.put("name", "kim");
        keyMap.put("age", 30);
        keyMap.put("address", "노원");

        Set<String> set = keyMap.keySet();
        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println("keySet = " + keyMap.get(key));
        }

        //entrySet() -> Map.Entry를 set 컬렉션으로 얻은 다음, 반복자를 통해 값을 꺼낸다.
        Set<Map.Entry<String, Object>> entryMap = keyMap.entrySet();

        for (Map.Entry<String, Object> stringObjectEntry : entryMap) {
            String entryKey = stringObjectEntry.getKey();
            Object entryValue = stringObjectEntry.getValue();

            System.out.println("entryKey = " + entryKey);
            System.out.println("entryValue = " + entryValue);
        }
        
        //Map - 객체 저장
        Map<Student, Integer> studentMap = new HashMap<>();
        studentMap.put(new Student(0, "kim"), 100);
        studentMap.put(new Student(1, "lee"), 60);
        studentMap.put(new Student(1, "lee"), 70); // Map은 중복값일 경우 데이터를 덮어씌운다.

        Set<Map.Entry<Student, Integer>> entries = studentMap.entrySet();

        for (Map.Entry<Student, Integer> entry : entries) {
            Student entryKey = entry.getKey();
            int entryValue = entry.getValue();

            System.out.println("Key = " + entryKey.toString() + " Value = " + entryValue);
            /*System.out.println("Key = " + entryKey.getName() + " Value = " + entryValue);
            System.out.println("Key = " + entryKey.getNo() + " Value = " + entryValue);*/
        }

    }
}
