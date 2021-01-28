package dagger.hilt.android.internal.testing;

import com.ms.starwars.ui.details.DetailsActivityTest;
import com.ms.starwars.ui.details.DetailsActivityTest_ComponentDataHolder;
import com.ms.starwars.ui.home.HomeActivityTest;
import com.ms.starwars.ui.home.HomeActivityTest_ComponentDataHolder;
import java.lang.Class;
import java.lang.Override;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("dagger.hilt.processor.internal.root.RootProcessor")
public final class TestComponentDataSupplierImpl extends TestComponentDataSupplier {
  private final Map<Class<?>, TestComponentData> testComponentDataMap = new HashMap<>(2);

  TestComponentDataSupplierImpl() {
    testComponentDataMap.put(DetailsActivityTest.class, DetailsActivityTest_ComponentDataHolder.get());
    testComponentDataMap.put(HomeActivityTest.class, HomeActivityTest_ComponentDataHolder.get());
  }

  @Override
  protected Map<Class<?>, TestComponentData> get() {
    return testComponentDataMap;
  }
}
