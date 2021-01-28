package com.ms.starwars.ui.details;

import androidx.test.core.app.ApplicationProvider;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.testing.TestComponentData;
import dagger.hilt.android.internal.testing.TestInjector;
import dagger.hilt.internal.GeneratedComponentManager;
import java.lang.SuppressWarnings;
import java.util.Collections;
import javax.annotation.Generated;

@Generated("dagger.hilt.processor.internal.root.RootProcessor")
public final class DetailsActivityTest_ComponentDataHolder {
  private DetailsActivityTest_ComponentDataHolder() {
  }

  public static TestComponentData get() {
    return new TestComponentData(false, testInstance -> injectInternal((DetailsActivityTest) testInstance), Collections.emptySet(), Collections.emptySet(), (modules, testInstance, autoAddModuleEnabled) -> DaggerDetailsActivityTest_HiltComponents_ApplicationC.builder()
        .applicationContextModule(new ApplicationContextModule(ApplicationProvider.getApplicationContext()))
        .build());
  }

  @SuppressWarnings("unchecked")
  private static void injectInternal(DetailsActivityTest testInstance) {
    ((TestInjector<DetailsActivityTest>) ((GeneratedComponentManager) ApplicationProvider.getApplicationContext()).generatedComponent()).injectTest(testInstance);
  }
}
