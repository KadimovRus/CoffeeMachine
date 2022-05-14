package machine;

public enum ChoiceCoffee {
   ESPRESSO("1", 250, 0, 16, 4),
   LATTE("2", 350, 75, 20, 7),
   CAPPUCCINO("3", 200, 100, 12, 6),
   NO_COFFEE("back", 0, 0, 0, 0);

   final String option;
   final int water;
   final int milk;
   final int beans;
   final int money;

   ChoiceCoffee(String option, int water, int milk, int beans, int money) {
      this.option = option;
      this.water = water;
      this.milk = milk;
      this.beans = beans;
      this.money = money;
   }

   public static ChoiceCoffee findByValue(String val) {
      for (ChoiceCoffee option: values()) {
         if (val.equals(option.option)) {
            return option;
         }
      }
      return null;
   }
}
