package tdrury.learning.uom;

import tdrury.learning.uom.quantity.Piece;
import tech.units.indriya.AbstractUnit;
import tech.units.indriya.unit.BaseUnit;
import tech.units.indriya.unit.UnitDimension;
import tech.units.indriya.unit.Units;

import javax.measure.Quantity;
import javax.measure.Unit;
import javax.measure.quantity.AmountOfSubstance;

public class DiscreteManufacturingUnits extends Units {

    private DiscreteManufacturingUnits() {
    }

    private static final DiscreteManufacturingUnits INSTANCE = new DiscreteManufacturingUnits();

    public static DiscreteManufacturingUnits getInstance() {
        return INSTANCE;
    }


    public static final Unit<AmountOfSubstance> PIECE = addUnit(new BaseUnit<>("PCS", "Pieces", UnitDimension.AMOUNT_OF_SUBSTANCE), Piece.class);


    private static <U extends AbstractUnit<?>> U addUnit(U unit, Class<? extends Quantity<?>> type) {
        INSTANCE.units.add(unit);
        INSTANCE.quantityToUnit.put(type, unit);
        return unit;
    }
}
