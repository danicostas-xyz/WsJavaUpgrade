package junit;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ PruebaJugador.class, PruebaSoldado.class })
public class AllTests {

}
