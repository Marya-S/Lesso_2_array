public class task_1 {
    //Добавление класса математика
    //class Math{
        public static void main(String[] args) {
            int SumRezI = 0;
            double SumRezD = 0;
            int MinI;
            int MaxI;
            double MinD;
            double MaxD;
            int MultI = 1;
            double MultD = 1;
            //Заполнение массивов
            int tArray[] = new int [10];
            int i;
            for(i=0; i<10; i = i+1)
                tArray[i]= i+1;
            double dArray[] = new double [10];
            for(i=0; i<10; i = i+1)
                dArray[i]= 2.0 + i;



        //Выпоплнение математических операций
            MaxI=MinI = tArray[0];
            MaxD = MinD = dArray[0];

            for(i=0; i<10; i= i+1) {
                //Сумма
                SumRezI += tArray[i];
                SumRezD += dArray[i];

                //Минимум и максимум
                if(tArray[i]<MinI) MinI = tArray[i];
                if (tArray[i]>MaxI) MaxI = tArray[i];
                if (dArray[i]<MinD) MinD = dArray[i];
                if(dArray[i] > MaxD) MaxD = dArray[i];

                //Умножение
                MultI += tArray[i];
                MultD += dArray[i];
            }

            System.out.println("Сумма:" + SumRezI + " " + SumRezD);
            System.out.println("Минимум:" + MinI + " ," + MinD + " Максимум: " + MaxI + " ," + MaxD );
            System.out.println("Умножение:" + MultI + " ," + MultD);

            }




   // }


}
