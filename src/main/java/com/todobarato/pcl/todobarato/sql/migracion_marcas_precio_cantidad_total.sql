-- Ejecutar una sola vez sobre una base existente que aún no tenga estas columnas.
ALTER TABLE `marcas`
  ADD COLUMN `precio` decimal(12,2) NOT NULL DEFAULT 0.00,
  ADD COLUMN `cantidad` int(11) NOT NULL DEFAULT 0,
  ADD COLUMN `total` decimal(12,2) NOT NULL DEFAULT 0.00;

-- El total se mantiene como precio por cantidad.
UPDATE `marcas`
SET `total` = `precio` * `cantidad`;
