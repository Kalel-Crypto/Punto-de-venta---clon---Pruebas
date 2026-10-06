const { test, expect } = require('@playwright/test');

test('Navegación entre pestañas de Inventario y Movimientos', async ({ page }) => {
  await page.goto('http://localhost:8080/vista/Inventario.xhtml');

  await page.click('text=Movimientos');

  await expect(page.locator('text=Gestión de Carga y Descarga de Stock')).toBeVisible();

  await page.click('text=Inventario');
  await expect(page.locator('text=Ingrese su nombre o ID...')).toBeVisible();
});
