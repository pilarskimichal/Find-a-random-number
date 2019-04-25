package My;

import java.util.Scanner;

public class Zadanie7_znajdz_liczbe_losowa 
{
	
	public static void main(String[] args)
	{
	Scanner input = new Scanner(System.in);
	long number = Math.round(Math.random()*1000);
	int choice;
	long luck;
	long prompt;
	int n=1;
	int m=0;
	int o=10; //iloúÊ podpowiedzi
	int dev2=0; //podzielnosc przez 2
	int dev3=0; //podzielnosc przez 3
	int dev4=0; //podzielnosc przez 4
	int dev5=0; //podzielnosc przez 5
	long less =0;
	long more =1000;
	System.out.println(" ______________________________________________________________________________________");
	System.out.println("|Wylosowano liczbÍ losowπ z przedzia≥u (0-1000), sprÛbuj zgadnπÊ jaka to liczba.       |");
	System.out.println("|                                                                                      |");
	System.out.println("|DostÍpne polecenia:                                                                   |");
	System.out.println("|0 - SprawdziÊ, czy liczba jest mniejsza (<) niø wpisana przez Ciebie na klawiaturze.  |");
	System.out.println("|1 - SprawdziÊ, czy liczba jest wiÍksza (>) niø wpisana przez Ciebie na klawiaturze.   |");
	System.out.println("|2 - ZapytaÊ czy wylosowana liczba jest podzielna przez 2 (bez reszty).                |");
	System.out.println("|3 - ZapytaÊ czy wylosowana liczba jest podzielna przez 3 (bez reszty).                |");
	System.out.println("|4 - ZapytaÊ czy wylosowana liczba jest podzielna przez 4 (bez reszty).                |");
	System.out.println("|5 - ZapytaÊ czy wylosowana liczba jest podzielna przez 5 (bez reszty).                |");
	System.out.println("|6 - CHC  JUØ ODPOWIEDZIE∆                                                             |");
	System.out.println("|                                                                                      |");
	System.out.println("|Inf: Moøesz uzyskaÊ ≥πcznie " + o + " podpowiedzi.                                           |");
	System.out.println("|______________________________________________________________________________________|");
	System.out.println();
	//System.out.println(number);

				do {
					System.out.println("Podpowiedü numer " + n + ".");
					System.out.print("Co chcesz z niπ zrobiÊ?             -> ");
					choice = input.nextInt();
					
					if (choice <0 || choice >6)
					{
						System.out.println("     B£•D: Podaj ponownie swÛj wybÛr ale od 0 do 6.");
						n++;
					}
					else 
					{
						switch (choice) 
							{
							case 0:
								System.out.print("Czy liczba jest mniejsza (<) niø:   -> ");
								prompt = input.nextLong();
								if(prompt>number)
								{
									System.out.println("PODPOWIEDè:");
									System.out.println("           Tak.          X<" + prompt + ",         X jest w przedziale: <" + less + "-" + prompt + ">.");
									more = prompt;
									m++;
								}
								else
								{
									System.out.println("PODPOWIEDè:");
									System.out.println("           Nie.         X>" + prompt + ",         X jest w przedziale: <" + prompt + "-" + more + ">.");
									less = prompt;
									m++;
								}
								break;
								
							case 1:
								System.out.print("Czy liczba jest wiÍksza (>) niø:   -> ");
								prompt = input.nextLong();
								if(prompt<number)
								{
									System.out.println("PODPOWIEDè:");
									System.out.println("           Tak.          X>" + prompt + ",         X jest w przedziale: <" + prompt + "-" + more + ">.");
									less = prompt;
									m++;
								}
								else
								{
									System.out.println("PODPOWIEDè:");
									System.out.println("           Nie.         X<" + prompt + ",         X jest w przedziale: <" + less + "-" + prompt + ">.");
									more = prompt;
									m++;
								}
								break;
								
							case 2:
								if(number%2==0)
								{
									System.out.println("PODPOWIEDè:");
									System.out.println("           Tak.         LICZBA PODZIELNA PRZEZ 2,         X jest w przedziale: <" + less + "-" + more + ">.");
									m++;
									dev2=1;
								}
								else
								{
									System.out.println("PODPOWIEDè:");
									System.out.println("           Nie.         LICZBA NIEPODZIELNA PRZEZ 2,         X jest w przedziale: <" + less + "-" + more + ">.");
									m++;
									dev2=2;
								}
								break;
								
							case 3:
								if(number%3==0)
								{
									System.out.println("PODPOWIEDè:");
									System.out.println("           Tak.         LICZBA PODZIELNA PRZEZ 3,         X jest w przedziale: <" + less + "-" + more + ">.");
									m++;
									dev3=1;
								}
								else
								{
									System.out.println("PODPOWIEDè:");
									System.out.println("           Nie.         LICZBA NIEPODZIELNA PRZEZ 3,         X jest w przedziale: <" + less + "-" + more + ">.");
									m++;
									dev3=2;
								}
								break;
								
							case 4:
								if(number%4==0)
								{
									System.out.println("PODPOWIEDè:");
									System.out.println("           Tak.         LICZBA PODZIELNA PRZEZ 4,         X jest w przedziale: <" + less + "-" + more + ">.");
									m++;
									dev4=1;
								}
								else
								{
									System.out.println("PODPOWIEDè:");
									System.out.println("           Nie.         LICZBA NIEPODZIELNA PRZEZ 4,         X jest w przedziale: <" + less + "-" + more + ">.");
									m++;
									dev4=2;
								}
								break;
								
							case 5:
								if(number%5==0)
								{
									System.out.println("PODPOWIEDè:");
									System.out.println("           Tak.         LICZBA PODZIELNA PRZEZ 5,         X jest w przedziale: <" + less + "-" + more + ">.");
									m++;
									dev5=1;
								}
								else
								{
									System.out.println("PODPOWIEDè:");
									System.out.println("           Nie.         LICZBA NIEPODZIELNA PRZEZ 5,         X jest w przedziale: <" + less + "-" + more + ">.");
									m++;
									dev5=2;
								}
								break;
								
							default:
							{
								n=o;
							}
								break;
							}
						n++;
					
					}
			
					
					System.out.println();
				} while (n<o+1);
				
				System.out.println();
				System.out.println("________________________________________________");
				System.out.println("Wykorzystanych podpowiedzi:         -> " + (m) + "/" + o);	
				System.out.println();
				System.out.println("UZYSKANE PODPOWIEDZI:");
				System.out.println("     X jest w przedziale:           -> <" + less + "-" + more + ">");
				if (dev2==1)
				{
					System.out.println("     X jest podzielne przez 2");
				}
				else if ( dev2==2)
				{
					System.out.println("     X jest niepodzielne przez 2");
				}
				if (dev3==1)
				{
					System.out.println("     X jest podzielne przez 3");
				}
				else if ( dev3==2)
				{
					System.out.println("     X jest niepodzielne przez 3");
				}
				if (dev4==1)
				{
					System.out.println("     X jest podzielne przez 4");
				}
				else if ( dev4==2)
				{
					System.out.println("     X jest niepodzielne przez 4");
				}
				if (dev5==1)
				{
					System.out.println("     X jest podzielne przez 5");
				}
				else if ( dev5==2)
				{
					System.out.println("     X jest niepodzielne przez 5");
				}
				
				System.out.print("STRZELAJ!                           -> ");
				luck = input.nextLong();
				
				if (luck==number)
				{
			
					System.out.println("|     BRAWO!!, chodzi≥o o " + number + "    |");
				}
				else
				{
					System.out.println("|     PUD£O!!, chodzi≥o o " + number + "    |");
				}

	}

}
