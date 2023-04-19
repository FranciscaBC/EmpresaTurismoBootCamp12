# Actividad Java POO para Desafío Bootcamp


Aplicación que representa una empresa de turismo (MVC):

• Menú con opciones:
1.	Ingresar Medio de Alojamiento (almacena un objeto de tipo Carpa/Cabaña/Hotel en la colección, siempre que no exista, es decir solo se puede asociar un cliente por medio de alojamiento.)
2.	Mostrar medios de alojamiento (muestra datos de todos los objetos almacenados)
3.	Datos de un cliente X (si existe, muestra donde está alojado y todos los datos asociados)
4.	Total adicional
5.	Total bono descuento
6.	Cantidad medios de alojamiento X
7.	Valor a cancelar por un cliente X (el cliente debe existir)
8.	Aplicar incremento del valor base (donde corresponda)     				
9.	Salir. 

Métodos realizados:

•	subtotal: devolverá el subtotal a cancelar el cual será cantidad de noches por el valorBaseNoche      
•	adicional: devolverá el valor adicional, que corresponde al 30% del subtotal si es Fumador y con desayuno.					      
•	bonoDescuento: devolverá el valor a descontar sabiendo que es un 25% del subTotal si el tipo de temporada es baja o es de un 12.5% si el tipo Temporada es media. 						      
•	valorACancelar: devolverá el valor a cancelar, el cual al subtotal se le debe descontar el bono y sumar el adicional, donde corresponda.
	• incrementaValorBase: aumenta el valor base en un 18% si la capacidad de la cabaña es superior a 5.

sdf


