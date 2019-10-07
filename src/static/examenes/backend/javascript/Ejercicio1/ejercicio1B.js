// Ejercicio 1 B

/**
 * [AlgoritmoEjercicio1B description] : Dado una lista de enteros, devolver una lista con los mismos elementos ordenados de menor a mayor
 * @param Array $entero [description] : Una listado de enteros
 */
const AlgoritmoEjercicio1B = (entero) => {
	let out;
	out = entero.sort((a, b) => {
		return a - b;
	});
	return out;
};

try {
	var salida = AlgoritmoEjercicio1B([-15, 1, 7, 20, 33, 54]);
	console.log(salida); // debe devolver: [-15, 1, 7, 20, 33, 54]
} catch (e) {
	console.log(JSON.stringify(e));
}