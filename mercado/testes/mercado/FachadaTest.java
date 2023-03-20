package mercado;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.GregorianCalendar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FachadaTest {
	Fachada fachada;
	@BeforeEach
	void preparaSistema() {
		this.fachada = new Fachada();
	}
	
	@Test
	void testAddProdIdInedito() {
		assertTrue(this.fachada.addProd(0, "batata", "empório", 2.10));
	}
	
	@Test
	void testAddProdIdRepitido() {
		this.fachada.addProd(0, "batata", "empório", 2.10);
		assertFalse(this.fachada.addProd(0, "batata", "empório", 2.10));
	}
	
	@Test
	void testAddLoteProdutoExistente() {
		this.fachada.addProd(10, "batata", "empório", 2.10);
		assertTrue(this.fachada.addLote(10, 200, "12/03/2023"));
	}
	
	@Test
	void testAddLoteProdutoInexistente() {
		assertFalse(this.fachada.addLote(10, 200, "12/03/2023"));
	}
}
