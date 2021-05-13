package tdrury.learning.uom;

import tech.units.indriya.spi.AbstractSystemOfUnitsService;

import javax.measure.spi.SystemOfUnits;
import java.util.Collection;

public class DiscreteManufacturingSystemService extends AbstractSystemOfUnitsService {

    public DiscreteManufacturingSystemService() {
        souMap.put(DiscreteManufacturingUnits.getInstance().getName(), DiscreteManufacturingUnits.getInstance());
    }

    public Collection<SystemOfUnits> getAvailableSystemsOfUnits() {
        return souMap.values();
    }

    @Override
    public SystemOfUnits getSystemOfUnits() {
        return getSystemOfUnits(DiscreteManufacturingUnits.getInstance().getName());
    }

    @Override
    public SystemOfUnits getSystemOfUnits(String name) {
        return souMap.get(name);
    }
}
