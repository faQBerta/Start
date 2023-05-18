Algoritmo Ejercicio_Integrador_1
	Definir matriz, gen Como Caracter
	Definir n Como Entero
	
	checkGEN(gen)
	
	checkDIM(gen,n)
	
	Dimension matriz[n,n]
	
	armarMAT(gen,n,matriz)
	
	checkMAT(matriz,n)
	
FinAlgoritmo

SubProceso checkGEN(gen Por Referencia)
	Escribir "El gen a revisar es: " Sin Saltar
	gen="ACDDCADBCDABDBBA" //EL GEN DEBE INGRESARSE AQUI
	Escribir gen
	Escribir ""
FinSubProceso

SubProceso checkDIM(gen,n Por Referencia)
	Si Longitud(gen)<>9 Y Longitud(gen)<>16 Y Longitud(gen)<>1369 Entonces
		Escribir "No cumple con los requisitos para ser del GenZ."
	SiNo n=Longitud(gen)^(1/2)
	FinSi
FinSubProceso

SubProceso armarMAT(gen,n,matriz)
	Definir i,j Como Entero
	Para i=0 Hasta n-1 Hacer
		Para j=0 Hasta n-1 Hacer
			matriz[i,j]=Subcadena(gen,(i*n)+j,(i*n)+j)
		FinPara
	FinPara
	Escribir "Matriz: "
	Para i=0 Hasta n-1 Hacer
		Para j=0 Hasta n-1 Hacer
			Escribir "[" matriz[i,j] "]" Sin Saltar
		FinPara
		Escribir ""
	FinPara
	Escribir ""
FinSubProceso

SubProceso checkMAT(matriz,n)
	Definir i,j Como Entero
	Definir check,check2 Como Logico
	check=Falso
	check2=Verdadero
	
	Para i=0 Hasta n-1 Hacer
		Para j=0 Hasta n-1 Hacer
			Si matriz[i,j]="A" O matriz[i,j]="B" O matriz[i,j]="C" O matriz[i,j]="D" Entonces
				check=Verdadero
			SiNo
				check2=Falso
			FinSi
		FinPara
	FinPara
	
	Si check2=Falso Entonces
		check=Falso
	FinSi

	Si check=Verdadero Entonces
	Para i=0 Hasta n-1 Hacer
		Para j=0 Hasta n-1 Hacer
			Si i=j Entonces
				Si matriz[0,0]<>matriz[i,j] Entonces
					check=Falso
				FinSi
			FinSi
		FinPara
	FinPara	
	FinSi
	Si check=Verdadero Entonces
	Para i=0 Hasta n-2 Hacer
		Para j=0 Hasta n-2 Hacer 
			Si i+j=n-1 Entonces
				Si matriz[i,j]=matriz[i+1,j-1] Entonces
					check=Verdadero
				SiNo
					check=Falso
				FinSi
			FinSi
		FinPara
	FinPara
	FinSi
	Si check=Verdadero Entonces
		Escribir "Este gen es valido como gen Z."
	SiNo
		Escribir "No cumple las condiciones para validarse como gen Z."
	FinSi
FinSubProceso

	