Dada una lista de productos con su stock actual y una lista de productos y sus ventas de las últimas 72h (en € totales) se requiere devolver una lista de productos ordenados de mayor a menor.
La ordenación será en función de las ventas y el stock, con un valor de ponderación configurable (por ejemplo, 25% de peso a las ventas y 75% de peso al stock disponible)

Ejemplo:

50% de peso para las ventas, 50% de peso para el stock.

Producto 1 -> 50.000€ vendidos, 100.000 en stock.
Producto 2 -> 100.000€ vendidos, 400.000 en stock.
Producto 3 -> 100.000€ vendidos, 200.000 en stock.
Producto 4 -> 75.000€ vendidos, 300.000 en stock.

Resultado: [2, 4, 3, 1]

