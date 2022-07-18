import java.util.Calendar;
import java.text.DateFormat;
import java.util.Date;

public class Desafio_11{
	public static void main(String args[]){
		Calendar calendarioHoje = Calendar.getInstance();
		Calendar calendarioAntes = Calendar.getInstance();
		Calendar calendarioDepois = Calendar.getInstance();
		
		// informar dia e data atual
		System.out.println("Data atual");
		System.out.println(calendarioHoje.get(Calendar.YEAR)+"/" + calendarioHoje.get(Calendar.MONTH) + "/" + calendarioHoje.get(Calendar.DAY_OF_MONTH));
		
		//informa dia e data 10 dias antes 
		System.out.println("Data 10 dias antes");
		calendarioAntes.add(Calendar.DAY_OF_MONTH, -10);
		System.out.println(calendarioAntes.get(Calendar.YEAR)+"/" + calendarioAntes.get(Calendar.MONTH) + "/" + calendarioAntes.get(Calendar.DAY_OF_MONTH));

		//informa dia e data 10 dias depois
		calendarioDepois.add(Calendar.DAY_OF_MONTH, 10);
		System.out.println("Data daqui 10 dias");
		System.out.println(calendarioDepois.get(Calendar.YEAR)+"/" + calendarioDepois.get(Calendar.MONTH) + "/" + calendarioDepois.get(Calendar.DAY_OF_MONTH));
		
		
	}
}