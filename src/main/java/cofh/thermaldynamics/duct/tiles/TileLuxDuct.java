package cofh.thermaldynamics.duct.tiles;

import cofh.thermaldynamics.duct.Duct;
import cofh.thermaldynamics.duct.TDDucts;
import cofh.thermaldynamics.duct.light.DuctUnitLight;

public class TileLuxDuct extends TileGridSingle {

	public TileLuxDuct() {

		super(DuctToken.LIGHT, TDDucts.lightDuct);
	}

	@Override
	protected DuctUnit createDuctUnit(DuctToken token, Duct ductType) {

		return new DuctUnitLight(this, ductType);
	}
}
