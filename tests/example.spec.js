const { test, expect } = require('@playwright/test');

test('Navegar a pestaña Movimientos', async ({ page }) => {
  await page.goto('http://localhost:8080/vista/Inventario.xhtml');

  await page.click('text=Movimientos');

  await expect(
      page.locator('text=Gestión de Carga y Descarga de Stock')
  ).toBeVisible();

  await expect(
      page.locator('text=Stock Actual')
  ).toBeVisible();

  await expect(
      page.getByRole('tabpanel', { name: 'Movimientos' }).getByText('Cantidad')
  ).toBeVisible();

  await expect(
      page.getByRole('tabpanel', { name: 'Movimientos' }).getByText('Acciones')
  ).toBeVisible();

});

test('Visualizar pestaña Inventario', async ({ page }) => {
  await page.goto('http://localhost:8080/vista/Inventario.xhtml');

  await expect(page.locator('text=Inventario')).toBeVisible();

  await expect(
      page.locator('input[placeholder="Ingrese su nombre o ID..."]')
  ).toBeVisible();

});

test('Buscar producto en inventario', async ({ page }) => {
  await page.goto('http://localhost:8080/vista/Inventario.xhtml');

  const busqueda = page.locator(
      'input[placeholder="Ingrese su nombre o ID..."]'
  );

  await busqueda.fill('producto');

  await page.locator('button').filter({ hasText: 'Buscar' }).first().click();

});

test('Navegar a Historial de movimientos', async ({ page }) => {
  await page.goto('http://localhost:8080/vista/Inventario.xhtml');

  await page.click('text=Historial de movimientos');

  await expect(
      page.locator('text=Historial de Movimientos y Reporte Mensual')
  ).toBeVisible();

  await expect(
      page.locator('text=TOTAL ENTRADAS:')
  ).toBeVisible();

  await expect(
      page.locator('text=TOTAL SALIDAS:')
  ).toBeVisible();

  await expect(
      page.locator('text=No hay movimientos registrados')
  ).toBeVisible();
});

test('Navegar a pestaña Usuarios', async ({ page }) => {
  await page.goto('http://localhost:8080/vista/Inventario.xhtml');

  await page.click('text=Usuarios');

  await expect(
      page.locator('text=ID Usuario')
  ).toBeVisible();

  await expect(
      page.locator('text=Rol de usuario')
  ).toBeVisible();

  await expect(
      page.getByRole('tabpanel', {name:'Usuarios'}).getByText('juan')
  ).toBeVisible();

  await expect(
      page.getByRole('tabpanel', {name:'Usuarios'}).getByText('ADMINISTRADOR')
  ).toBeVisible();
});

