package chapter4;

import java.util.Scanner;

public class Ex4_29 {

	public static void main(String[] args) {
		System.out.println("Enter the Year and the day of the date: ");
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		int day = input.nextInt();
		
		//finish the loop and display the calendar
		for (int month = 1;month <= 12;month++){
			//1 3 5 7 8 10 12 has 31 days
			if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 ||
					month == 10 || month == 12){
				for(int j = 1;j <= 31;j++){
					
					if( j == 1){
						System.out.println(" ");
						if(month == 1){
						System.out.println("           January "+year);
						}
						
						else if(month == 3){
							System.out.println("           	March "+year);
						}
						
						else if(month == 5){
							System.out.println("           May "+year);
						}
						else if(month == 7){
							System.out.println("           July "+year);
						}
						else if(month == 8){
							System.out.println("           August "+year);
						}
						else if(month == 10){
							System.out.println("           October "+year);
						}
						else if(month == 12){
							System.out.println("           December "+year);
						}
						System.out.println("------------------------------");
						System.out.println("Sun   Mon   Tue   Wed   Thu   Fri   Sat");
						if(day == 0){
						System.out.print(j);
						}
						else if(day == 1){
							System.out.print("      "+j);
						}
						else if(day == 2){
							System.out.print("            "+j);
						}
						else if(day == 3){
							System.out.print("                  "+j);
						}
						else if(day == 4){
							System.out.print("                        "+j);
						}
						else if(day == 5){
							System.out.print("                              "+j);
						}
						else if(day == 6){
							System.out.println("                                     "+j);
							day = 0;
							continue;
						}
						
								}
				else{
						
						if(day == 0){
						System.out.print(j);
						}
						else if(day == 1){
							System.out.print("      "+j);
						}
						else if(day == 2){
							System.out.print("     "+j);
						}
						else if(day == 3){
							System.out.print("     "+j);
						}
						else if(day == 4){
							System.out.print("     "+j);
						}
						else if(day == 5){
							System.out.print("     "+j);
						}
						else if(day == 6){
							System.out.println("   "+j);
							day = 0;
							continue;
						}						
					}
					day++;
				}
			}
			//2月份是闰年 判断29天还是28天
			else if(month == 2){
				if(year%400 ==0 && year%100 != 0 || year % 4 == 0 ){
					for(int j = 1; j <= 29;j++){
						
						if( j == 1){
							System.out.println(" ");
							System.out.println("           February "+year);
							System.out.println("------------------------------");
							System.out.println("Sun   Mon   Tue   Wed   Thu   Fri   Sat");
							if(day == 0){
								System.out.print(j);
								}
							if(day == 1){
								System.out.print("      "+j);
							}
							else if(day == 2){
								System.out.print("            "+j);
							}
							else if(day == 3){
								System.out.print("                  "+j);
							}
							else if(day == 4){
								System.out.print("                        "+j);
							}
							else if(day == 5){
								System.out.print("                              "+j);
							}
							else if(day == 6){
								System.out.println("                                    "+j);
											}
						}
						else{
							if(day == 0){
								System.out.print(j);
								}
							if(day == 1){
								System.out.print("      "+j);
							}
							else if(day == 2){
								System.out.print("      "+j);
							}
							else if(day == 3){
								System.out.print("      "+j);
							}
							else if(day == 4){
								System.out.print("      "+j);
							}
							else if(day == 5){
								System.out.print("      "+j);
							}
							else if(day == 6){
								System.out.println("      "+j);
								day = 0;
								continue;
											}
							}
						day++;
						
					}
					
				}
				else{
					for(int j = 1; j <= 28;j++){
						
						if( j == 1){
							System.out.println(" ");
							System.out.println("           February "+year);
							System.out.println("------------------------------");
							System.out.println("Sun   Mon   Tue   Wed   Thu   Fri   Sat");
							if(day == 0){
								System.out.print(j);
								}
								else if(day == 1){
									System.out.print("      "+j);
								}
								else if(day == 2){
									System.out.print("            "+j);
								}
								else if(day == 3){
									System.out.print("                  "+j);
								}
								else if(day == 4){
									System.out.print("                        "+j);
								}
								else if(day == 5){
									System.out.print("                              "+j);
								}
								else if(day == 6){
									System.out.println("                                    "+j);
								}
									}
						else{
							
							if(day == 0){
							System.out.print(j);
							}
							else if(day == 1){
								System.out.print("      "+j);
							}
							else if(day == 2){
								System.out.print("     "+j);
							}
							else if(day == 3){
								System.out.print("     "+j);
							}
							else if(day == 4){
								System.out.print("     "+j);
							}
							else if(day == 5){
								System.out.print("     "+j);
							}
							else if(day == 6){
								System.out.println("   "+j);
								day = 0;
								continue;
							}
							
						}    
						day++;
					}
					
				}
			}
			//4,6,9,11月
			else{
				for(int j = 1;j <= 30;j++){
					
					//判断月份
				if(j == 1){
					System.out.println(" ");
					if(month == 4){
						System.out.println("           April "+year);
					}
					else if(month == 6){
						System.out.println("           June "+year);
					}
					else if(month == 9){
						System.out.println("           September "+year);
					}
					else if(month == 11){
						System.out.println("           November "+year);
					}
					System.out.println("------------------------------");
					System.out.println("Sun   Mon   Tue   Wed   Thu   Fri   Sat");
					if(day == 0){
						System.out.print(j);
						}
						else if(day == 1){
							System.out.print("      "+j);
						}
						else if(day == 2){
							System.out.print("            "+j);
						}
						else if(day == 3){
							System.out.print("                  "+j);
						}
						else if(day == 4){
							System.out.print("                        "+j);
						}
						else if(day == 5){
							System.out.print("                              "+j);
						}
						else if(day == 6){
							System.out.println("                                     "+j);
							day = 0;
						}
							}
				else{
					
					if(day == 0){
					System.out.print(j);
					}
					else if(day == 1){
						System.out.print("      "+j);
					}
					else if(day == 2){
						System.out.print("     "+j);
					}
					else if(day == 3){
						System.out.print("     "+j);
					}
					else if(day == 4){
						System.out.print("     "+j);
					}
					else if(day == 5){
						System.out.print("     "+j);
					}
					else if(day == 6){
						System.out.println("   "+j);
						day = 0;
						continue;
					}
					
				}
				day++;
				
											}	
				}
	
		}
			
	}
	}


