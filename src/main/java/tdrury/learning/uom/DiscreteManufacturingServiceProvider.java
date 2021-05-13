package tdrury.learning.uom;

import tech.units.indriya.spi.AbstractServiceProvider;

import javax.annotation.Priority;
import javax.inject.Named;
import javax.measure.spi.SystemOfUnitsService;

@Named("DiscreteManufacturing")
@Priority(200)
public class DiscreteManufacturingServiceProvider extends AbstractServiceProvider {

    @Override
    public int getPriority() {
        return 200;
    }

    @Override
    public SystemOfUnitsService getSystemOfUnitsService() {
        return new DiscreteManufacturingSystemService();
    }

    @Override
    public String toString() {
        return DiscreteManufacturingServiceProvider.class.getSimpleName();
    }
}
