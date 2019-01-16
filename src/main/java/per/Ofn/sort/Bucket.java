package per.Ofn.sort;

/**
 * 桶排序
 * @author liao_
 *
 */
public class Bucket {
	/**
	 * 执行次数
	 */
	static int count = 0;
	/**
	 * 排0-1000的数
	 */
	static void sort() {
		int[] willSort = {53,52,63,96,112,56,36,1,9,888,563,52};
		int[] bucket = new int[1001];
		
		// 每个桶的个数默认为0
		// 执行A次，A为桶个数
		for(int i = 0;i <= 1000; i++) {
			bucket[i] = 0;
			count ++;
		}
		
		// 待排序的值，放到对应编号的桶内，桶内放置个数+1
		//执行B次，B为待排序的个数
		for(int j=0; j<willSort.length;j++) {
			bucket[willSort[j]] ++;
			count ++;
		}
		
		// 打印出来
		for(int i= 0;i<bucket.length;i++) {// 循环多少个桶     //执行A次
			System.out.print("i="+i+"  ");
			count ++;
			for(int j = 1;j<= bucket[i]; j++) { //循环每个桶里装的数值的个数，有几个就循环几次   //执行B次
				System.out.println(i);
				count ++;
			}
		}
		
		// 时间复杂度O() = O(2*(A+B)) ，时间复杂度可以忽略较小的常数，所以桶排序的时间复杂度为O() = O(A+B)
		System.out.println();
		System.out.println("count = " + count); // 2 * (1001 + 12) = 2026
	}
	
	public static void main(String[] args) {
		sort();
	}
}
