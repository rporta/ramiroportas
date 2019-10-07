// Ejercicio 1 A 

/**
 * [AlgoritmoEjercicio1A description] : Dada una oracion, separar por espacios y devolver la cadena mas larga
 * @param String $oracion [description] : Una cadena que represente una oracion
 */
const AlgoritmoEjercicio1A = (oracion) => {
	let out = oracion.split(" ").sort((a, b) => {
		return b.length - a.length;
	});
	return out[0];
};

try {
	var salida = AlgoritmoEjercicio1A("El veloz murciélago hindú comía feliz cardillo y kiwi");
	console.log(salida); // debe devolver: murciélago
} catch (e) {
	console.log(JSON.stringify(e));
}