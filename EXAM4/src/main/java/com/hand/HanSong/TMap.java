package com.hand.HanSong;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class TMap {
	public static void main(String[] args) {
		Map<Integer,List<Integer>> map=new HashMap<Integer,List<Integer>>();
		int[] arr=random();
		System.out.println("随机生成 50 个小于 100 的数,分别为: ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int j=0;j<10;j++){
			List<Integer> list=new ArrayList<Integer>();
			int key=j;
			for(int i=0;i<arr.length;i++){
				if(arr[i]/10==key){
					list.add(arr[i]);
				}
			}
			map.put(key, list);
		}
		Set<Integer> sets = map.keySet();
		Iterator<Integer> it = sets.iterator();
		System.out.println("Map 中的数值为: {");
		while(it.hasNext()){
			int key=it.next();
			List<Integer> values = map.get(key);
			System.out.print(key+"=>"+values+",");
		}
		System.out.println("}");
		System.out.println("排序后的 Map 为: {");
		map=sort(map);
		Set<Integer> sets2 = map.keySet();
		Iterator<Integer> it2 = sets2.iterator();
		while(it2.hasNext()){
			int key=it2.next();
			List<Integer> values = map.get(key);
			System.out.print(key+"=>"+values+",");
		}
		System.out.println("}");
	}
	public static int[] random(){
		int[] arr=new int[50];
		for(int i=0;i<arr.length;i++){
			int num=(int) (Math.random()*100);
			arr[i]=num;
		}
		return arr;
	}
	
	public static Map sort(Map<Integer,List<Integer>> map){
		Set<Integer> sets = map.keySet();
		Iterator<Integer> it = sets.iterator();
		while(it.hasNext()){
			int key=it.next();
			List<Integer> values = map.get(key);
			int[] arr2=new int[values.size()];
			for(int i=0;i<arr2.length;i++){
				arr2[i]=values.get(i);
			}
			mergerSort(arr2, 0, arr2.length);
			List<Integer> lists=new ArrayList<Integer>();
			for(int i=0;i<arr2.length;i++){
				lists.add(arr2[i]);
			}
			map.put(key, lists);
		}
		return map;
	}
	
	public static void mergerSort(int[] arr,int x,int y){
		if(arr==null||y-x<=1){
			return;
		}
		int mid=(x+y)/2;
		mergerSort(arr, x, mid);
		mergerSort(arr, mid, y);
		int i=x,j=mid;
		int[] newarr=new int[y-x];
		int k=0;
		while(i<mid||j<y){
			if(i==mid){
				newarr[k++]=arr[j++];
			}else if(j==y){
				newarr[k++]=arr[i++];
			}else if(arr[i]<arr[j]){
				newarr[k++]=arr[i++];
			}else{
				newarr[k++]=arr[j++];
			}
		}
		for(int t=0;t<newarr.length;t++){
			arr[x+t]=newarr[t];
		}
	}
}