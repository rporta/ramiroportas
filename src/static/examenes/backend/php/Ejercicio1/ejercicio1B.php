<?
// Ejercicio 1 B 

/**
 * [AlgoritmoEjercicio1B description] : Dado una lista de enteros, devolver una lista con los mismos elementos ordenados de menor a mayor
 * @param Array $entero [description] : Una listado de enteros
 */
function AlgoritmoEjercicio1B($entero)
{
	$isUsort = usort($entero, function($a, $b) {
		return $a - $b;
	});
	return $isUsort ? $entero : "fail"; 
}

try {
	$salida = call_user_func("AlgoritmoEjercicio1B", [1, 20, 54, 33, -15, 7]);
	print_r($salida); // debe devolver: [-15, 1, 7, 20, 33, 54]
} catch (Exception $e) {
	echo 'Excepción capturada: ',  $e->getMessage(), "\n";
}