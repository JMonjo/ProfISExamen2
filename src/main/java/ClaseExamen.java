import java.util.ArrayList;
import java.util.List;

public class ClaseExamen 
{
	public static List<Integer> primos (int n) throws Exception
    {
		if (n<=1){
			throw new Exception();
		}
		List<Integer> primos = new ArrayList<Integer>();
		int contador = 2;
		while (n>1) {
			if (contador == n) {
				primos.add(contador);
				n = n / contador;
				contador = 2;
			} else if (n % contador == 0){
				primos.add(contador);
				n = n / contador;
				contador = 2;
			}else {
				contador++;
			}
		}
		return primos;
    }
}
