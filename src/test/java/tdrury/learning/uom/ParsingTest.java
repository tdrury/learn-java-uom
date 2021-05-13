package tdrury.learning.uom;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tech.units.indriya.format.SimpleQuantityFormat;
import tech.units.indriya.unit.Units;

import javax.measure.Quantity;
import javax.measure.format.MeasurementParseException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ParsingTest {

    @Test
    public void parse_givenMinutesString_thenReturnQuantity() {
        // when
        Quantity<?> quantity = SimpleQuantityFormat.getInstance().parse("10 min");
        // then
        assertThat(quantity.getValue().intValue(), is(10));
        assertThat(quantity.getUnit(), is(Units.MINUTE));
    }

    @Test
    public void parse_givenMassString_thenReturnQuantity() {
        // when
        Quantity<?> quantity = SimpleQuantityFormat.getInstance().parse("3.3 kg");
        // then
        assertThat(quantity.getValue().doubleValue(), is(3.3));
        assertThat(quantity.getUnit(), is(Units.KILOGRAM));
    }

    @Test
    public void parse_givenMassStringUpperCase_thenReturnQuantity() {
        Assertions.assertThrows(MeasurementParseException.class,
            () -> SimpleQuantityFormat.getInstance().parse("3.3 KG"));
    }

}
