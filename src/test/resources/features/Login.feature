# language:es
@Login
Característica: Login
Como usuario cliente
Quiero logeame
Para realizar compra de productos

@Login_01 @Login_happy_path
Escenario: Loguear con usuario estandar
Dado abro la pagina de SauceDemo
Cuando ingreso usuario "standard_user"
E ingreso password "secret_sauce"
Y doy clic al boton login
Entonces muestra la pantalla productos


@Login_02 @Login_happy_path
Esquema del escenario: Loguear usuarios correctamente
Dado abro la pagina de SauceDemo
Cuando ingreso usuario "<usuario>"
E ingreso password "<password>"
Y doy clic al boton login
Entonces muestra la pantalla productos
Ejemplos:
|usuario								|password			|
|standard_user					|secret_sauce	|
|performance_glitch_user|secret_sauce	|
