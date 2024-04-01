public class Task3 {
          //Определить:
        //1. Сумму всех элементов массива
        //2. ПРоизведение всех элементов массива
        //3. Сумму квадратов всех элементов массива
       //4. Сумма шести первых элементов массива
        public static void main(String[] args) {
            int[] elem = new int[12];
            int a = 1;
            int Summa=0;
            int Proiz = 1;
            int SumKvadrata=0;
            int Kvadrat1;
            int Sum6elem=0;
            for (int i = 0; i < elem.length; i++) {
                elem[i] = a;
                System.out.print(elem[i] + " ");
                Summa=Summ (Summa,elem[i]);// Сумму всех элементов массива
                Proiz = Proiz(Proiz,elem[i]);//ПРоизведение всех элементов массива
                Kvadrat1=Kvadrat(elem[i]);// Квадрат элемента
                SumKvadrata=Summ(SumKvadrata,Kvadrat1);// Сумма квадратов
                if (i<6)
                {Sum6elem=Summ(Sum6elem, elem[i]);}//Сумма шести первых элементов
                a++;
            }
            System.out.println("\nСумма элементов равна=" + Summa);
            System.out.println("Произведение элементов равно=" + Proiz);
            System.out.println("Сумма квадратов всех элементов равна=" + SumKvadrata);
            System.out.println("Сумма шести первых элементов равна=" + Sum6elem);
        }
        public static int Summ (int Sum, int a){
            return Sum + a;
        }
        public static int Proiz (int Proiz, int a){
            return Proiz * a;
        }
        public static int Kvadrat (int a){
            return a*a;
       }
}

