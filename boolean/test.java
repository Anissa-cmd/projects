
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean isHotOutside = true;
		boolean isWeekday = false;
		boolean hasMoneyInPocket = true;
		
		System.out.println(isHotOutside);
		System.out.println(isWeekday);
		System.out.println(hasMoneyInPocket);
		
		double costOfMilk = 5.00;
		double moneyInWallet = 20.22;
		int thirstLevel = 6;
		
		System.out.println(costOfMilk);
		System.out.println(moneyInWallet);
		System.out.println(thirstLevel);
		
		boolean shouldByIcecream = isHotOutside && hasMoneyInPocket;
		boolean willGoSwimming = isHotOutside && !isWeekday;
		boolean isAGoodDay = isHotOutside || (hasMoneyInPocket && !isWeekday);
		boolean willBuyMilk = isHotOutside && (thirstLevel >= 3 && moneyInWallet >= 2 * costOfMilk);
		
		System.out.println(shouldByIcecream);
		System.out.println(willGoSwimming);
		System.out.println(isAGoodDay);
		System.out.println(willBuyMilk);
		
		
		
	}

}
