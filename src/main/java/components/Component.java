
package components;

import mediator.Mediator;

/**
 *
 * @author Andrea Erazo
 */
public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}
