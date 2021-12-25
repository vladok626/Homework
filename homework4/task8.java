/*Напишите программу «Шифр Цезаря», которая зашифровывает 
введенный текст. Используете кодовую таблицу символов. При запуске 
программы в консоль необходимо вывести сообщение: «Введите текст для 
шифрования», после ввода текста, появляется сообщение: «Введите ключ». 
После того как введены все данные, необходимо вывести преобразованную 
строку с сообщением «Текст после преобразования : ». Далее необходимо 
задать вопрос пользователю: «Выполнить обратное преобразование? (y/n)», 
если пользователь вводит «y», тогда выполнить обратное преобразование. 
Если пользователь вводит «n», того программа выводит сообщение «До 
свидания!». Если пользователь вводит что-то другое, отличное от «y» или «n», 
то программа ему выводит сообщение: «Введите корректный ответ»*/

package homework4;

import java.util.Scanner;

public class task8 {
	
	public static void main(String[] args) {
		Scanner id = new Scanner(System.in);
        System.out.print("Введите текст для шифрования: ");
        String text = id.nextLine();
        System.out.print("Введите ключ: ");
        int shift = id.nextInt();
        String encryptStr = getEncryptString(text, shift);
        System.out.print("Текст после преобразования :" + "\"" + encryptStr + "\"");
        System.out.print("\nВыполнить обратное преобразование? (y/n)");
        boolean value = false;
        while (!value) {
            String reply = id.next();
            if (reply.toLowerCase().equals("y")) {
                String decryptStr = getDecryptString(encryptStr, shift);
                System.out.println(decryptStr);
                value = true;
            }
            else if (reply.toLowerCase().equals("n")) {
                System.out.println("До свидания!");
                value = true;
            }

            else {
                System.out.println("Введите корректный ответ: ");
                value = false;
            }
        }
	}
		 
	 public static String getEncryptString(String encryptString, int shift) {
		
		 char[] ArrayChar = encryptString.toCharArray(); 
		 long[] ArrayInt = new long[ArrayChar.length]; 
		 char[] ArrayCharNew = new char[ArrayChar.length]; 
		 
		 for (int i = 0; i< ArrayChar.length; i++)
		 {
		 ArrayInt[i] = ArrayChar[i] + shift; 
		 ArrayCharNew[i] = (char)ArrayInt[i]; 
		 }
		 encryptString = new String (ArrayCharNew); 
		 return encryptString; 
		 
	 }
	 
	 public static String getDecryptString(String encryptString, int shift) {
			
		 char[] ArrayChar = encryptString.toCharArray(); 
		 long[] ArrayInt = new long[ArrayChar.length]; 
		 char[] ArrayCharNew = new char[ArrayChar.length]; 
		 
		 for (int i = 0; i< ArrayChar.length; i++)
		 {
		 ArrayInt[i] = ArrayChar[i] - shift; 
		 ArrayCharNew[i] = (char)ArrayInt[i]; 
		 }
		 encryptString = new String (ArrayCharNew); 
		 return encryptString; 
		 
	 }
}
