class CashRegister(val currentTotal : Double, offers : List[StockItem => Double]) {

  def scan (item : StockItem) : CashRegister = {

    new CashRegister(currentTotal + item.normalPrice,offers)
  }

}
