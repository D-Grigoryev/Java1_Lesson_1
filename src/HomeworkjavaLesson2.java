public class HomeworkjavaLesson2 {
    /*Задания ко второму уроку */

          public static void main(String[] args) {

            int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
            int[] NewMaxMin = {1, 2, 4, 7, 9, 0};
            int [] Check = {1, 2, 1, 1, 1, 2};
            int [] ChangePos = {3, 1, 5, 6, 7, 10};
            int N = 7;

        }

        public static void arrReplace(int arr[])  //Задча №1
        {

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == 1)
                    arr[j] = 0;
                else if (arr[j] == 0)
                    arr[j] = 1;
            }
        }

        public static void arrFill() { //Задача №2
            int[] arr1 = new int[8];
            for (int i = 0, j = 0; j < arr1.length; j++, i += 3) {
                arr1[j] = i;
                          }
                    }

        public static void arrMulti() { //Задча №3
            int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            for (int j = 0; j < arr2.length; j++) {
                if (arr2[j] < 6) {
                    arr2[j] *= 2;
                }
                           }
                  }

        public static void SquareArray() { //Задча №4
            int[][] Square = new int[4][4];
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (i == j) {
                        Square[i][j] += 1;
                    } else if (i == 0 && j == 3 || i == 1 && j == 2 || i == 2 && j == 1 || i == 3 && j == 0) {
                        Square[i][j] += 1;
                    }
                                    }
                         }
        }

        public static void MinMax(int[] NewMaxMin) { //Задча №5

            int min=NewMaxMin[0];
            int max=NewMaxMin[0];;
            for (int i = 0; i < NewMaxMin.length; i++)
            {
                if (min>NewMaxMin[i])
                {
                    min = NewMaxMin[i];
                }
                else if (max<NewMaxMin[i])
                {
                    max = NewMaxMin[i];
                }
            }
          }
        public static boolean checkBalance (int Check[]) //Задча №6
        {
            int temp = 0;
            int sumElem = 0;
            int Firstsum = 0;
            int Lastsum = 0;
            int Leftsum = 0;
            for (int i = 0; i < Check.length; i++)
            {
                sumElem +=1;
            }
            temp = sumElem;
            sumElem /= 2;

            for (int i = 0; i < sumElem; i++)
            {
                Firstsum = Firstsum + Check[i];

            }
            Lastsum = temp - sumElem;
            for (int i = Lastsum; i < temp; i++)
            {
                Leftsum = Leftsum + Check[i];
            }
            if (Firstsum == Leftsum) {

                return true;
            }
            else
            {
                return false;
            }

        }
        static public int ChangePosition (int  ChangePos [], int N) //Задча №7
        {
            if (N > 0)
            {
                for (int i = 0; i < N; i++ )
                {
                    int tmp = ChangePos [ChangePos.length - 1];
                    for (int j = ChangePos.length -1; j > 0; j--)
                    {
                        ChangePos [j] = ChangePos [j-1];
                    }
                    ChangePos [0] = tmp;
                }

            }
            else if (N < 0)
            {
                for (int i = 0; i < N * (-1); i++)
                {
                    int tmp = ChangePos [0];
                    for ( int j = 0; j < ChangePos.length - 1; j++)
                    {
                        ChangePos [j] = ChangePos[j + 1] = tmp;
                    }
                }
            }

            for ( int i: ChangePos) {
                            }
            return 0;
        }
    }
    
