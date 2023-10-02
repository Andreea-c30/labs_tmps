
package prototype;

public class CloneFactory {

	    public IPrescriptionPrototype getClone(IPrescriptionPrototype sample) {

	        return sample.clone();

	    }
	}