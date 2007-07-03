/**
 * 
 */
package ar.com.fdvs.dj.core.layout;

import net.sf.jasperreports.engine.design.JRDesignBand;
import net.sf.jasperreports.engine.design.JRDesignElement;

/**
 * @author msimone
 * 
 */
public abstract class HorizontalBandAlignment {

	public static final HorizontalBandAlignment RIGHT = new HorizontalBandAlignment() {
		public void align(int totalWidth, int offset, JRDesignBand band, JRDesignElement element) {
			int width = totalWidth - element.getWidth() - offset;
			element.setX(width);
			band.addElement(element);
		}
	};

	public static final HorizontalBandAlignment LEFT = new HorizontalBandAlignment() {
		public void align(int totalWidth, int offset, JRDesignBand band, JRDesignElement element) {
			element.setX(element.getX() + offset);
			band.addElement(element);
		}
	};

	public static final HorizontalBandAlignment CENTER = new HorizontalBandAlignment() {
		public void align(int totalWidth, int offset, JRDesignBand band, JRDesignElement element) {
		}
	};

	public abstract void align(int totalWidth, int offset, JRDesignBand band, JRDesignElement element);

}