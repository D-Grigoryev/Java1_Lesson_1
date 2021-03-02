public class Employees {
   private String name;
   private String surname;
   private String middle_name;
   private String position;
   private String e_mail;
   private int ph_number;
   private int salary;
   private int Age;



   public Employees(String _name, String _surname, String _middle_name,
                    String _position, String _e_mail, int _ph_number, int _salary, int _Age) {
      name = _name;
      surname = _surname;
      middle_name = _middle_name;
      position = _position;
      e_mail = _e_mail;
      ph_number = _ph_number;
      salary = _salary;
      Age = _Age;

   }

   public void getInfo() {
      {
         System.out.println("Имя сотрудника: " + name);
         System.out.println("Фамилия сотрудника: " + surname);
         System.out.println("Отчество сотрудника: " + middle_name);
         System.out.println("Должность сотрудника: " + position);
         System.out.println("E-mail сотрудника: " + e_mail);
         System.out.println("Телефонный номер сотрудника: " + ph_number);
         System.out.println("Зарплата сотрудника: " + salary);
         System.out.println("Возраст сотрудника: " + Age);

      }
   }
   public static void main(String[] args) {

      Employees [] persArr = new Employees[5];
      persArr[0] = new Employees("Иван", "Иванов", "Иванович", "Программист", "ivanov@mail.ru", 23456,7000000, 31);
      persArr[1] = new Employees("Иванов", "Петр", "Иванович", "Менеджер", "ivanov1@mail.ru", 891854, 25000, 23);
      persArr[2] = new Employees("Петров", "Иван", "Васильевич", "Продавец", "petrov@mail.ru", 8825, 10000, 42);
      persArr[3] = new Employees("Захаров", "Дмитрий", "Иванович", "Эксперт", "zakharov@mail.ru", 447825, 35000, 33);
      persArr[4] = new Employees("Порошенко", "Александр", "Иванович", "Разнорабочий", "poroshenko@mail.ru", 65525, 15000, 45);

      for (Employees ar: persArr){
        if (ar.Age>40) {
           ar.getInfo();
           System.out.println("---------------------");
        }
     }
   }

}





