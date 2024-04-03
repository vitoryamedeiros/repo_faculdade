#include <stdio.h>

int main()
{
	// -------- PRIMITIVE TYPES -------- //
	
	//int number -- 4 bytes
		int age = 19;
		
	//char (characther) -- 1 byte
		char arroba = "@";
	
	//float number -- 4 byte (6 casas decimais)
		float cash = 1839.32;
	
	//double number -- 8 byte (15 casas decimais)
		double probability = 0.00001;
		
	// -------- DERIVATIVE TYPES -------- //
	
		// >>>>> ARRAY
	
			// 4 bytes * 7 positions = 28 bytes
				int sofa_days[7] = {19,20,21,22,23,24,25};
				
			// 3 bytes * 10 positions = 30 bytes
				char todo[3][10] = {
				"Code the app",
				"Clean the bedroom",
				"Eat chinese food at the dinner"
			};
				
			// 15 + 4 + 4 = 23 bytes
			
				//Atribuindo as variaveis
				struct canal
				{
				char name[15];
				int subscribe;
				float mediaLikes;
			};	
				//Atribuindo os valores 
				struct canal VTM = {"Vitorya Medeiros", 10000, 59.32};
	
	// -------- MODIFICADORES EM C -------- //		
		// >>>>>> SHORT	-- USADO PARA NUMEROS COMUNS
		// >>>>>> LONG -- USADO PARA NUMEROS ATE 14 BILHOES
		// >>>>>> SIGNED -- 
		// >>>>>> UNSIGNED -- APENAS NUMEROS POSITIVOS ATE 65536

	return 0;
}












