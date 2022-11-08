public class Main {
    public static void main(String[] args) {

                double[] numbers = {6.7, -4.3, 4.8, 4.7, -8.6, -8.9, 6.2, 7.6, 8.6, 12.5, -13.4, 3.4, 13.4, 14.5, 15.3};

                double count = 0;

                int indexOfFirst = 0;

                boolean hook = false;

                for (double play : numbers) {
                    if (play < 0) {
                        hook = true;
                    } else if (play > 0 && hook) {
                        count = play;
                        indexOfFirst++;
                        System.out.println(play);

                    }
                }

                System.out.println("среднее арифметическое число:" + count / indexOfFirst);
                work();
            }

            //дз на сообразительность
            public static void work() {

                int[] arr = {5, -2, 8, 7, 1};
                int temp = 0;


                for (int i = 0; i < arr.length; i++) {
                    for (int j = i + 1; j < arr.length; j++) {
                        if (arr[i] > arr[j]) {
                            temp = arr[i];
                            arr[i] = arr[j];
                            arr[j] = temp;
                        }
                    }
                }  System.out.println("Сортировка: ");
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }
            }
        }


