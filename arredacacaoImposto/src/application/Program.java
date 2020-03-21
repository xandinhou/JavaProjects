package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;
public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Contribuinte> list = new ArrayList<>();
		
		System.out.print("Numero de Contribuintes: ");
		int quantity = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0 ; i < quantity; i++) {
			System.out.printf("Dados Do Contribuinte #%d\n",i+1);
			System.out.print("Pessoa Fisica ou Juridica (f/j)? ");
			char op = sc.next().charAt(0);
			sc.nextLine();
			if(op == 'f') {
				System.out.print("Nome: ");
				String name = sc.nextLine();
				System.out.print("Renda Anual: ");
				double rendaAnual = sc.nextDouble();
				System.out.print("Gastos Com Saude: ");
				double gastoSaude = sc.nextDouble();
				sc.hasNextLine();
				list.add(new PessoaFisica(name, rendaAnual, gastoSaude));
			}
			if(op == 'j') {
				System.out.print("Nome Da Empresa: ");
				String name = sc.nextLine();
				System.out.print("Renda Anual: ");
				double rendaAnual = sc.nextDouble();
				System.out.print("Numero De Funcionarios");
				int numeroFun = sc.nextInt();
				sc.hasNextLine();
				list.add(new PessoaJuridica(name, rendaAnual, numeroFun));	
			}
		}
		double sum = 0;
		for(Contribuinte obj : list) {
			System.out.println(obj);
			sum += obj.impostos();
		}
		
		System.out.println();
		System.out.printf("TOTAL = $%.2f",sum);
		
		sc.close();
	}

}
