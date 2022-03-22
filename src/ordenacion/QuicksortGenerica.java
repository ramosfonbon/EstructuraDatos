package ordenacion;

public class QuicksortGenerica<T extends Comparable<T>> {

  public void quickSort(T arr[], int left, int right) {
    int index = partition(arr, left, right);
    if (left < index - 1) {
      quickSort(arr, left, index - 1);
    }
    if (index < right) {
      quickSort(arr, index, right);
    }
  }

  private int partition(T arr[], int left, int right){
    int i = left, j = right;
    T tmp;
    T pivot = arr[(left + right) / 2];
    while (i <= j) {
      while (arr[i].compareTo(pivot) < 0) {  //arr[i] < pivot
        i++;
      }
      while (arr[j].compareTo(pivot) > 0) {  // arr[j] > pivot
        j--;
      }
      if (i <= j) {
        tmp = arr[i];     // intercambio de posiciones
        arr[i] = arr[j];  //
        arr[j] = tmp;     //
        i++;
        j--;
      }
    };
    return i;
  }

}

/*

n! = n*(n-1)!
5! = 120
5! = 5*(4)!       5*24
4! = 4*(3)!       4*(6)
3! = 3*(2)!       3*(2)
2! = 2*(1)!       2*(1)
1! = 1*(0)!       1*(1)
0! = 1

*/

