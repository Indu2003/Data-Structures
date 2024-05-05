public class MergeSortedArrays {
        public static void main(String[] args) {
            int[] arr1 = { 1, 3, 5, 7 };
            int[] arr2 = { 2, 4, 6, 8 };
            
            int[] mergedArr = mergeArrays(arr1, arr2);
            
            System.out.println("Merged and sorted array: ");
            for (int num : mergedArr) {
                System.out.print(num + " ");
            }
        }
    
        public static int[] mergeArrays(int[] arr1, int[] arr2) {
            int len1 = arr1.length;
            int len2 = arr2.length;
            int[] mergedArr = new int[len1 + len2];
    
            int i = 0, j = 0, k = 0;
    
            while (i < len1 && j < len2) {
                if (arr1[i] <= arr2[j]) {
                    mergedArr[k++] = arr1[i++];
                } else {
                    mergedArr[k++] = arr2[j++];
                }
            }
    
            while (i < len1) {
                mergedArr[k++] = arr1[i++];
            }
    
            while (j < len2) {
                mergedArr[k++] = arr2[j++];
            }
    
            return mergedArr;
        }
    }
    

    //java code to find the height of a tree 
