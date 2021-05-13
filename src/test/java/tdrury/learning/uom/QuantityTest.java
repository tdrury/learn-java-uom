package tdrury.learning.uom;

import org.junit.jupiter.api.Test;
import tech.units.indriya.quantity.Quantities;
import tech.units.indriya.unit.Units;

import javax.measure.Quantity;
import javax.measure.quantity.Speed;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class QuantityTest {

    @Test
    public void test1() {
        Quantity<Speed> C = Quantities.getQuantity(1079252849, Units.KILOMETRE_PER_HOUR);
        assertThat(C.getValue(), is(1079252849));
        assertThat(C.getUnit(), is(Units.KILOMETRE_PER_HOUR));
    }
}
