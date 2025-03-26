package com.visualpathit.account.setup;

import org.springframework.web.servlet.view.AbstractUrlBasedView;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

public class StandaloneMvcTestViewResolver extends InternalResourceViewResolver {

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
>>>>>>> 79694ff (Initial commit for terraform-project)
}
