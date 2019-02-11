class CashRegister(val currentTotal : Double, offers : List[StockItem => Double]) {

  def scan(item : StockItem) : CashRegister = {
   val discountedPrice = (for(singleOffer <- offers) yield singleOffer(item)).min
    new CashRegister(currentTotal + discountedPrice, offers)
  }

}
