object Shop extends App{
  val orange = new Fruit(name = "Orange", code = "001", normalPrice = 0.80)
  val apple = new Fruit(name = "Apple", code = "002", normalPrice = 0.50)
  val loaf = new Bread(name = "Bread", code = "003", normalPrice = 1.00)
  val bun = new Bread(name = "Bun", code = "004", normalPrice = 0.50)

  val test = new CashRegister(currentTotal = 0.00, offers = List())
  println(test.scan(orange).scan(apple).scan(loaf).scan(bun).currentTotal)
}
