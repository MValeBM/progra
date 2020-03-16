#include <stdio.h>
#include <stdlib.h>
#include <string.h> 
#include <time.h>
#include <windows.h>

//BASADOS EN CODIGO ASCII
//Constantes para construir las cartas
int s=177;	//Textura
int t=188;	//Liena curva inferior derecha
int u=200;	//Linea curva inferior izquierda
int w=201;	//Linea curva superior izquierda
int x=186;	//Linea recta vertical
int y=205;	//Linea recta horizontal
int z=187;	//Linea curva superior derecha

int n;

void menu()
{
	//Armamos el menu principal del Juego.
	printf("\n\n __________________________________________");
	printf("\n|                                          |");
	printf("\n|    BIENVENIDO AL JUEGO DE LA MEMORIA     |");
	printf("\n|__________________________________________|");
	printf("\n|                                          |");
	printf("\n|    1 .  INICIAR                          |");
	printf("\n|__________________________________________|");
	printf("\n|                                          |");
	printf("\n|    2 .  NIVEL                            |");
	printf("\n|__________________________________________|");
	printf("\n|                                          |");
	printf("\n|    3 . (o cualquier tecla) SALIR         |");
	printf("\n|__________________________________________|");
}

void niveles()
{
	//Armamos el menu de niveles.
	printf("\n\n\t ______________");
	printf("\n\t|              |");
	printf("\n\t| DIFICULTADES |");
	printf("\n\t|______________|");
	printf("\n\t|              |");
	printf("\n\t| [1]  2 x 2   |");
	printf("\n\t|______________|");
	printf("\n\t|              |");
	printf("\n\t| [2]  2 x 3   |");
	printf("\n\t|______________|");
	printf("\n\t|              |");
	printf("\n\t| [3]  3 x 3   |");
	printf("\n\t|______________|");
}

void nivel_3()
{
	//Desarrollamos el Nivel 3
	int i;
	//Definimos una matriz base para construir los 9 emoticones de este nivel:
	int nivel01[3][9]= {{94,79,94,120,95,120,43,95,43},{61,95,61,62,95,60,39,111,39},{174,95,175,80,95,45,167,126,167}};
	//Cada emoticon se realiza con 3 caracteres.
	//matriz 3(filas)x9(columnas) = 9(emoticones)x3(caracteres por emoticon)
	printf("\n                                          ");
	printf("\n   BIENVENIDO AL NIVEL :  3               ");
	printf("\n _______________________________\n");
	printf("\n\n\t\t\t\tTienes 10 segundos para memorizar");
	printf("\n");
	
	for(i=0;i<3;i++)
	{
		int j=0;
		//Lineas superiores de las cartas:
		printf("\n\t\t%c%c%c%c%c%c%c \t\t%c%c%c%c%c%c%c \t\t%c%c%c%c%c%c%c  ",w,y,y,y,y,y,z,w,y,y,y,y,y,z,w,y,y,y,y,y,z);
		//Partes de las lineas laterales de las cartas:
		printf("\n\t\t%c     %c \t\t%c     %c \t\t%c     %c ",x,x,x,x,x,x);
		//Partes de las lineas laterales de las cartas y los emoticones:
		printf("\n\t\t%c(%c%c%c)%c \t\t%c(%c%c%c)%c \t\t%c(%c%c%c)%c ",x,nivel01[i][j],nivel01[i][j+1],nivel01[i][j+2],x,
			x,nivel01[i][j+3],nivel01[i][j+4],nivel01[i][j+5],x,x,nivel01[i][j+6],nivel01[i][j+7],nivel01[i][j+8],x);
		//Partes de las lineas laterales de las cartas:
		printf("\n\t\t%c     %c \t\t%c     %c \t\t%c     %c ",x,x,x,x,x,x);
		//Lineas inferiores de las cartas:
		printf("\n\t\t%c%c%c%c%c%c%c \t\t%c%c%c%c%c%c%c \t\t%c%c%c%c%c%c%c ",u,y,y,y,y,y,t,u,y,y,y,y,y,t,u,y,y,y,y,y,t);
		
		printf("\n");
		printf("\n");
	}
	
	Sleep(10000);
	system("cls");
	
	//Despues de 10 segundos, ocultamos las cartas enumerandolas
	printf("\n\n");
	printf("\n\t\t %c%c%c%c%c \t\t\t %c%c%c%c%c \t\t\t %c%c%c%c%c",s,s,s,s,s,s,s,s,s,s,s,s,s,s,s);
	printf("\n\t\t %c%c%c%c%c \t\t\t %c%c%c%c%c \t\t\t %c%c%c%c%c",s,s,s,s,s,s,s,s,s,s,s,s,s,s,s);
	printf("\n\t\t %c%c1%c%c \t\t\t %c%c2%c%c \t\t\t %c%c3%c%c",s,s,s,s,s,s,s,s,s,s,s,s);
	printf("\n\t\t %c%c%c%c%c \t\t\t %c%c%c%c%c \t\t\t %c%c%c%c%c",s,s,s,s,s,s,s,s,s,s,s,s,s,s,s);
	printf("\n\t\t %c%c%c%c%c \t\t\t %c%c%c%c%c \t\t\t %c%c%c%c%c",s,s,s,s,s,s,s,s,s,s,s,s,s,s,s);
	printf("\n\n");
	printf("\n\t\t %c%c%c%c%c \t\t\t %c%c%c%c%c \t\t\t %c%c%c%c%c",s,s,s,s,s,s,s,s,s,s,s,s,s,s,s);
	printf("\n\t\t %c%c%c%c%c \t\t\t %c%c%c%c%c \t\t\t %c%c%c%c%c",s,s,s,s,s,s,s,s,s,s,s,s,s,s,s);
	printf("\n\t\t %c%c4%c%c \t\t\t %c%c5%c%c \t\t\t %c%c6%c%c",s,s,s,s,s,s,s,s,s,s,s,s);
	printf("\n\t\t %c%c%c%c%c \t\t\t %c%c%c%c%c \t\t\t %c%c%c%c%c",s,s,s,s,s,s,s,s,s,s,s,s,s,s,s);
	printf("\n\t\t %c%c%c%c%c \t\t\t %c%c%c%c%c \t\t\t %c%c%c%c%c",s,s,s,s,s,s,s,s,s,s,s,s,s,s,s);
	printf("\n\n");
	printf("\n\t\t %c%c%c%c%c \t\t\t %c%c%c%c%c \t\t\t %c%c%c%c%c",s,s,s,s,s,s,s,s,s,s,s,s,s,s,s);
	printf("\n\t\t %c%c%c%c%c \t\t\t %c%c%c%c%c \t\t\t %c%c%c%c%c",s,s,s,s,s,s,s,s,s,s,s,s,s,s,s);
	printf("\n\t\t %c%c7%c%c \t\t\t %c%c8%c%c \t\t\t %c%c9%c%c",s,s,s,s,s,s,s,s,s,s,s,s);
	printf("\n\t\t %c%c%c%c%c \t\t\t %c%c%c%c%c \t\t\t %c%c%c%c%c",s,s,s,s,s,s,s,s,s,s,s,s,s,s,s);
	printf("\n\t\t %c%c%c%c%c \t\t\t %c%c%c%c%c \t\t\t %c%c%c%c%c",s,s,s,s,s,s,s,s,s,s,s,s,s,s,s);
	printf("\n");
	
	//Preguntamos el numero de carta que coincida con una en especifico.
	printf("\n\n\t\t%c En que Carta se encuentra el Emoji: (%c%c%c) ?: ",168,167,126,167);
	scanf("%i",&n);
	
	//Mediante el numero ingresado jugamos con diferentes desenlaces.
	if(n==9)
	{
		printf("\n\t%cGANASTE! FELICIDADES A USTED Y A SUS ALUMNOS QUE SERAN APROBADOS.\n",173);
		Sleep(7000);
		system("cls");
		
	}
	else if (n >= 1 && n <= 9 && n != 9)
	{
		printf("\n\t\t\t%cCARTA INCORRECTA! Que mala memoria.\n", 173);
		Sleep(2000);
		system("cls");
		
	}
	else
		{
			printf("\n\t\t\t\t%cCARTA INEXISTENTE!\n",173);
			Sleep(2000);
			system("cls");
		}
}

void nivel_2()
{
	//Desarrollamos el Nivel 2
	int i,j;
	//Definimos una matriz base para construir los 6 emoticones de este nivel:
	int nivel01[2][9]= {{174,95,175,80,95,45,43,95,43},{61,95,61,120,95,120,39,111,39}};
	//Cada emoticon se realiza con 3 caracteres.
	//matriz 2(filas)x9(columnas) = 6(emoticones)x3(caracteres por emoticon)
	printf("\n                                          ");
	printf("\n   BIENVENIDO AL NIVEL :  2               ");
	printf("\n _______________________________\n");
	printf("\n\n\n\t\t\t\tTienes 7 segundos para memorizar");
	printf("\n");
	
	//Con la siguiente estructura armamos las cartas, que contienen distintos emoticones.
	for(i=0;i<2;i++)
	{
		j=0;
		//Lineas superiores de las cartas:
		printf("\n\t\t%c%c%c%c%c%c%c \t\t%c%c%c%c%c%c%c \t\t%c%c%c%c%c%c%c  ",w,y,y,y,y,y,z,w,y,y,y,y,y,z,w,y,y,y,y,y,z);
		//Partes de las lineas laterales de las cartas:
		printf("\n\t\t%c     %c \t\t%c     %c \t\t%c     %c ",x,x,x,x,x,x);
		//Partes de las lineas laterales de las cartas y los emoticones:
		printf("\n\t\t%c(%c%c%c)%c \t\t%c(%c%c%c)%c \t\t%c(%c%c%c)%c ",x,nivel01[i][j],nivel01[i][j+1],nivel01[i][j+2],x,
			x,nivel01[i][j+3],nivel01[i][j+4],nivel01[i][j+5],x,x,nivel01[i][j+6],nivel01[i][j+7],nivel01[i][j+8],x);
		//Partes de las lineas laterales de las cartas:
		printf("\n\t\t%c     %c \t\t%c     %c \t\t%c     %c ",x,x,x,x,x,x);
		//Lineas inferiores de las cartas:
		printf("\n\t\t%c%c%c%c%c%c%c \t\t%c%c%c%c%c%c%c \t\t%c%c%c%c%c%c%c ",u,y,y,y,y,y,t,u,y,y,y,y,y,t,u,y,y,y,y,y,t);
		
		printf("\n");
		printf("\n");
	}
	
	Sleep(7000);
	system("cls");
	
	//Despues de 7 segundos, ocultamos las cartas enumerandolas
	printf("\n\n");
	printf("\n\t\t %c%c%c%c%c \t\t\t %c%c%c%c%c \t\t\t %c%c%c%c%c",s,s,s,s,s,s,s,s,s,s,s,s,s,s,s);
	printf("\n\t\t %c%c%c%c%c \t\t\t %c%c%c%c%c \t\t\t %c%c%c%c%c",s,s,s,s,s,s,s,s,s,s,s,s,s,s,s);
	printf("\n\t\t %c%c1%c%c \t\t\t %c%c2%c%c \t\t\t %c%c3%c%c",s,s,s,s,s,s,s,s,s,s,s,s);
	printf("\n\t\t %c%c%c%c%c \t\t\t %c%c%c%c%c \t\t\t %c%c%c%c%c",s,s,s,s,s,s,s,s,s,s,s,s,s,s,s);
	printf("\n\t\t %c%c%c%c%c \t\t\t %c%c%c%c%c \t\t\t %c%c%c%c%c",s,s,s,s,s,s,s,s,s,s,s,s,s,s,s);
	printf("\n\n");
	printf("\n\t\t %c%c%c%c%c \t\t\t %c%c%c%c%c \t\t\t %c%c%c%c%c",s,s,s,s,s,s,s,s,s,s,s,s,s,s,s);
	printf("\n\t\t %c%c%c%c%c \t\t\t %c%c%c%c%c \t\t\t %c%c%c%c%c",s,s,s,s,s,s,s,s,s,s,s,s,s,s,s);
	printf("\n\t\t %c%c4%c%c \t\t\t %c%c5%c%c \t\t\t %c%c6%c%c",s,s,s,s,s,s,s,s,s,s,s,s);
	printf("\n\t\t %c%c%c%c%c \t\t\t %c%c%c%c%c \t\t\t %c%c%c%c%c",s,s,s,s,s,s,s,s,s,s,s,s,s,s,s);
	printf("\n\t\t %c%c%c%c%c \t\t\t %c%c%c%c%c \t\t\t %c%c%c%c%c",s,s,s,s,s,s,s,s,s,s,s,s,s,s,s);
	printf("\n");
	
	//Preguntamos el numero de carta que coincida con una en especifico.
	printf("\n\n\t\t%c En que Carta se encuentra el Emoji: (%c%c%c) ?: ",168,80,95,45);
	scanf("%i",&n);
	
	//Mediante el numero ingresado jugamos con diferentes desenlaces.
	if(n==2)
	{
		printf("\n\t\t\t%cBIEN AHI! Avanzas al siguiente nivel.",173);
		Sleep(2000);
		system("cls");
		nivel_3();
	}
	else if (n >= 1 && n <= 6 && n != 2)
	{
		printf("\n\t\t%cCARTA INCORRECTA! Que mala memoria.\n", 173);
		Sleep(2000);
		system("cls");
		
	}
	else
		{
			printf("\n\t\t\t%cCARTA INEXISTENTE!\n",173);
			Sleep(2000);
			system("cls");
		}
}

void nivel_1()
{	
	//Desarrollamos el Nivel 1
	int n;
	int i,j;
	//Definimos una matriz base para construir los 4 emoticones de este nivel:
	int nivel01[2][6]= {{174,95,175,61,95,61},{120,95,120,80,95,45}};
	//Cada emoticon se realiza con 3 caracteres.
	//matriz 2(filas)x6(columnas) = 4(emoticones)x3(caracteres por emoticon)
	printf("\n                                          ");
	printf("\n   BIENVENIDO AL NIVEL :  1               ");
	printf("\n _______________________________\n");
	
	printf("\n\n\t\tTienes 5 segundos para memorizar");
	printf("\n");
	
	//Con la siguiente estructura armamos las cartas, que contienen distintos emoticones.
	for(i=0;i<2;i++)
	{
		j=0;
		//Lineas superiores de las cartas:
		printf("\n\t\t%c%c%c%c%c%c%c \t\t%c%c%c%c%c%c%c  ",w,y,y,y,y,y,z,w,y,y,y,y,y,z);
		//Partes de las lineas laterales de las cartas:
		printf("\n\t\t%c     %c \t\t%c     %c ",x,x,x,x);
		//Partes de las lineas laterales de las cartas y los emoticones:
		printf("\n\t\t%c(%c%c%c)%c \t\t%c(%c%c%c)%c ",x,nivel01[i][j],nivel01[i][j+1],nivel01[i][j+2],x,x,nivel01[i][j+3],nivel01[i][j+4],nivel01[i][j+5],x);
		//Partes de las lineas laterales de las cartas:
		printf("\n\t\t%c     %c \t\t%c     %c ",x,x,x,x);
		//Lineas inferiores de las cartas:
		printf("\n\t\t%c%c%c%c%c%c%c \t\t%c%c%c%c%c%c%c ",u,y,y,y,y,y,t,u,y,y,y,y,y,t);
		
		printf("\n");
		printf("\n");
	}
	
	Sleep(5000);
	system("cls");
	
	//Despues de 5 segundos, ocultamos las cartas enumerandolas
	printf("\n\n");
	printf("\n\t %c%c%c%c%c \t\t\t %c%c%c%c%c",s,s,s,s,s,s,s,s,s,s);
	printf("\n\t %c%c%c%c%c \t\t\t %c%c%c%c%c",s,s,s,s,s,s,s,s,s,s);
	printf("\n\t %c%c1%c%c \t\t\t %c%c2%c%c",s,s,s,s,s,s,s,s);
	printf("\n\t %c%c%c%c%c \t\t\t %c%c%c%c%c",s,s,s,s,s,s,s,s,s,s);
	printf("\n\t %c%c%c%c%c \t\t\t %c%c%c%c%c",s,s,s,s,s,s,s,s,s,s);
	printf("\n\n");
	printf("\n\t %c%c%c%c%c \t\t\t %c%c%c%c%c",s,s,s,s,s,s,s,s,s,s);
	printf("\n\t %c%c%c%c%c \t\t\t %c%c%c%c%c",s,s,s,s,s,s,s,s,s,s);
	printf("\n\t %c%c3%c%c \t\t\t %c%c4%c%c",s,s,s,s,s,s,s,s);
	printf("\n\t %c%c%c%c%c \t\t\t %c%c%c%c%c",s,s,s,s,s,s,s,s,s,s);
	printf("\n\t %c%c%c%c%c \t\t\t %c%c%c%c%c",s,s,s,s,s,s,s,s,s,s);
	printf("\n");
	
	//Preguntamos el numero de carta que coincida con una en especifico.
	printf("\n\n%cEn que Carta se encuentra el Emoji: (%c%c%c) ?: ",168,120,95,120);
	scanf("%i",&n);
	
	//Mediante el numero ingresado jugamos con diferentes desenlaces.
	if(n==3)
	{
		printf("\n%cBIEN AHI! Avanzas al siguiente nivel.",173);
		Sleep(2000);
		system("cls");
		nivel_2();
	}
	else if (n == 1 || n == 2 || n == 4)
	{
		printf("\n%cCARTA INCORRECTA! Que mala memoria.\n",173);
		Sleep(2000);
		system("cls");
	}
	else
		{
			printf("\n%cCARTA INEXISTENTE!\n",173);
			Sleep(2000);
			system("cls");
		}
}

int main(int argc, char *argv[]) 
{
	int a;
	int level;
	
	//Llamamos al Menu
	menu();
	printf("\n\n Elija una opci%cn: ",162);
	scanf("%i",&a);
	system("cls");
	
	//Mediante el Switch manejamos las diferentes opciones. 			
	switch(a)
	{
	case 1://Llamamos al Primer Nivel para que inicie desde el principio.	
		nivel_1(); 
		break;
	case 2: //Llamamos al Menu de Niveles para que el usuario elija.
		niveles();	
		printf("\n\n %c Que Nivel Desea Jugar ?: ", 168);
		scanf("%d",&level);
		system("cls");
		
		//Dependiendo del nivel seleccionado, llamamos al correspondiente.
		if(level==1)
		{nivel_1();}
		
		else if(level==2)
		{nivel_2();}
		
		else if(level==3)
		{nivel_3();}
		
		else 
			printf("\n\tNo existe ese Nivel.");
		printf("\n\t_____________________\n");
		Sleep(2000);
		system("cls");
		break;
	case 3: //Dejamos un mensaje de despedida y terminamos la ejecucucion.
		printf("\n\t¡HASTA LA PROXIMA!");
		printf("\n\t___________________\n");
		return 0;
		break;
		
	default: //
		printf("\n\tNo existe esa Opci%cn.",162);
		printf("\n\t______________________\n");
		
		break;
	}
	return 0;
}


