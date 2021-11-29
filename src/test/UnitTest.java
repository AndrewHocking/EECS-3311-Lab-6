package test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import model.ValueToConvert;
import view.FeetConversionArea;
import view.MetresConversionArea;

public class UnitTest {
	@Test
    public void whenChangingPCLNewsAgencyState_thenONewsChannelNotified() {

		ValueToConvert observable = new ValueToConvert();
       
		FeetConversionArea observer2 = new FeetConversionArea();
        MetresConversionArea observer = new MetresConversionArea();
        observable.addPropertyChangeListener(observer);
        observable.addPropertyChangeListener(observer2);
        observable.setCM(165);
        assertEquals(observer.getText(), 0.01 * 165 + " m");
        assertEquals(observer2.getText(), 0.0328 * 165 + " ft");

    }
}
