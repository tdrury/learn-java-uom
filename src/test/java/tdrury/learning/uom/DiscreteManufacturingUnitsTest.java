package tdrury.learning.uom;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import tech.units.indriya.format.SimpleQuantityFormat;

import javax.measure.Quantity;
import javax.measure.Unit;
import javax.measure.spi.SystemOfUnits;
import java.util.Set;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

@Slf4j
class DiscreteManufacturingUnitsTest {

    DiscreteManufacturingSystemService dmss = new DiscreteManufacturingSystemService();

    @Test
    void test1() {
        SystemOfUnits systemOfUnits = dmss.getSystemOfUnits();
        Set<? extends Unit<?>> sou = systemOfUnits.getUnits();
        for (Unit u : sou) {
            log.info("sou={}", u);
        }
        assertThat(sou, contains(DiscreteManufacturingUnits.PIECE));
    }

    @Test
    void pieces() {
        // given
        Quantity<?> quantity = SimpleQuantityFormat.getInstance().parse("10 PCS");
        // then
        assertThat(quantity.getValue().intValue(), is(10));
        assertThat(quantity.getUnit(), is(DiscreteManufacturingUnits.PIECE));
    }
}