
import java.util.Scanner; 

public class ShoppingCart implements IBiletBilgileri {

	public Biletler biletTuru;
	public String alýnanBilet;
	
	public enum	Biletler
    {
        Opera (300),
        Sinema (30),
        Bungee (100);
        public int donus;
        Biletler(int test)
        {
            this.donus=test;
        }
        public int Donus()
        {
            return donus;
        }
    }
	
		
	public static void main(String []args) {
		
		ShoppingCart bilet = new ShoppingCart();
		bilet.getBiletTuru();
		System.out.println(bilet);
		
	}


	@Override
	public Biletler getBiletTuru() {
		System.out.println("Lütfen satýn almak istediðiniz bileti giriniz.(Opera,Sinema,Bungee)");
		do{
			Scanner al = new Scanner(System.in);
			String alýnanBilet = al.nextLine();
			if (alýnanBilet.equals("Opera")){
				biletTuru=ShoppingCart.Biletler.Opera;

			}
			else if(alýnanBilet.equals("Sinema")){
				biletTuru=ShoppingCart.Biletler.Sinema;
			}
			else if(alýnanBilet.equals("Bungee")){
				biletTuru=ShoppingCart.Biletler.Bungee;
			}
			else{
				break;
			}
		}while(alýnanBilet!="Çýk");
		return biletTuru;
	}


	@Override
	public String getBiletFiyat() {
		// TODO Auto-generated method stub
		return null;
	}
}
	