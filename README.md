# Taller Repaso Semana13

## Problemática

* Se debe realizar un análisis del proyecto denominado **EjercicioRepaso**

* La idea es generar una solución para poder generar una Billetera de Pagos, que pertenece a una Persona. La Billetera de Pagos debe poder recibir pagos de muchas entidades, sin que eso perjudique su funcionamiento. Por ejemplo, puede recibir pago de Agua Potable, Luz Eléctrica, Pagos Prediales, Pago Telefonos convencionales; y se puede incorporar más tipo de pagos en el futuro.

* Se cree que los paquete003 y paquete004 pueden ser mejorados analizando conceptos como: **Herencia, Polimorfismo, Open/closed principle (Principio abierto/cerrado)**. Si luego de su análisis decide dejar la solución como está, sustente las razones.

* Existen clases que no se usan, analice si las puede incorporar en alguna clase como atributos.

* Analice la **visibilidad** recomendada de los atributos de las clases.

* Cuando se ejecute la clase Principal del **paquete005**, debe presentar un reporte general de la Billetera de Pagos. Considerar que el objeto de Billetera de Pagos debe permitir pagos para:
```
    PagoAguaPotable aguaCasa;
    PagoAguaPotable aguaComercio;
    PagoLuzElectrica luzCasa;
    PagoLuzElectrica luzComercio;
    PagoPredial casa1;
    PagoPredial casa2;
    PagoTelefonoConvencional telefonoCasa;
    PagoTelefonoConvencional telefonoFinca;
```
* Cuando se ejecute la clase Principal del **paquete006**, debe presentar un reporte general de la Billetera de Pagos. Considerar que los objetos para usar en la billetera, se debe generar en función de las información de las clases **DatosAgua, DatosLuz, DatosPropiedades, DatosTelefono**
