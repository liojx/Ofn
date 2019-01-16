package per.Ofn.sort;

/**
 * 冒泡排序
 * @author liao_
 *
 */
public class Bubbling {
	/**
	 * 执行次数
	 */
	static int cnt = 0;
	/*
	 * 一趟一趟的比较
	 * 时间复杂度为 O(N的平方)
	 */
	static void sort() {
//		int[] willSort = {95,56,90,4,66674,567};
		int[] willSort = {892,562,425,362,100,53,2}; //这种是按照由小达到的最坏情况，测试执行次数
		for(int i = 0;i < willSort.length;i++) {
//			System.out.println("willSort[i=" + i + "]=" + willSort[i]);
			for(int j = willSort.length - 1; j > i; j--) {
				cnt ++;
//				System.out.println("willSort[j=" + j + "]=" + willSort[j]);
				if(willSort[i] > willSort[j]) {
					int tmp = willSort[i];
					willSort[i] = willSort[j];
					willSort[j] = tmp;
				}
			}
		}
		
		for(int i = 0;i<willSort.length;i++) {
			System.out.println(willSort[i]);
		}
		// 对于n位的数列则有比较次数为 (n-1) + (n-2) + ... + 1 = n * (n - 1) / 2，这就得到了最大的比较次数
		// 时间复杂度，所谓度，其实是一个表示数量级的单位，这里n * (n -1 ) /2 ，等于 n^2 - n ,那个1/2 常数忽略，而 n 相对于n^2 太小，也可忽略，所以时间复杂度就是N ^ 2
		// 问题规模是比较次数
		System.out.println("执行次数cnt = "+cnt); // 21 = 6 + 5 + 4 + 3 + 2 + 1
	}
	
	public static void main(String[] args) {
		sort();
	}
}
