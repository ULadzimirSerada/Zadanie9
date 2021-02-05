public class Zadanie9{
	 public static void main(String[] args) {
/*Задание 9
Изменить пример с суммой чисел таким образом, чтобы рассчитывалась не сумма, а
произведение, т.е. факториал числа.*/
                double averageSum = 1;
                double sum = 1;
                int n = 1;
                int x = (int)(Math.random()*20);
                while(x!=0) {
                    sum *= x;
                    n++;
                    x = (int) (Math.random() * 20);
                }
                if(n!=0){
                    averageSum = sum / n;
                } else {
                    averageSum=0;
                }
                System.out.println("среднее:" + averageSum);
            }
	
}
