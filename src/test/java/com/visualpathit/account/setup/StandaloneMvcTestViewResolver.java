package com.visualpathit.account.setup;

import org.springframework.web.servlet.view.AbstractUrlBasedView;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

public class StandaloneMvcTestViewResolver extends InternalResourceViewResolver {

<<<<<<< HEAD
=======
<<<<<<< HEAD
    public StandaloneMvcTestViewResolver() {
        super();
    }

    @Override
    protected AbstractUrlBasedView buildView(final String viewName) throws Exception {
        final InternalResourceView view = (InternalResourceView) super.buildView(viewName);
        // prevent checking for circular view paths
        view.setPreventDispatchLoop(false);
        return view;
    }
=======
>>>>>>> a53f6c76848e2a3a1cc8af878ad2e32e5c2ff85a
	public StandaloneMvcTestViewResolver() {
		super();
	}

	@Override
	protected AbstractUrlBasedView buildView(final String viewName) throws Exception {
		final InternalResourceView view = (InternalResourceView) super.buildView(viewName);
		// prevent checking for circular view paths
		view.setPreventDispatchLoop(false);
		return view;
	}
<<<<<<< HEAD
=======
>>>>>>> 79694ff (Initial commit for terraform-project)
>>>>>>> a53f6c76848e2a3a1cc8af878ad2e32e5c2ff85a
}
