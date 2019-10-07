<?
// Ejercicio 1 A 

/**
 * [AlgoritmoEjercicio1A description] : Dada una oracion, separar por espacios y devolver la cadena mas larga
 * @param String $oracion [description] : Una cadena que represente una oracion
 */
function AlgoritmoEjercicio1A($oracion)
{
	$oracion = explode(" ", $oracion);
	$isUsort = usort($oracion, function($a, $b) {
		return strlen($b) - strlen($a);
	});
	return $isUsort ? $oracion[0] : "fail"; 
}

try {
	$salida = call_user_func("AlgoritmoEjercicio1A", "El veloz murciélago hindú comía feliz cardillo y kiwi");
	echo $salida; // debe devolver: murciélago
} catch (Exception $e) {
	echo 'Excepción capturada: ',  $e->getMessage(), "\n";
}