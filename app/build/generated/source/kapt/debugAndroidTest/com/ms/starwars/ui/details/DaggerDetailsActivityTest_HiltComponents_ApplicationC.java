package com.ms.starwars.ui.details;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.ms.data.api.ApiService;
import com.ms.domain.models.Character;
import com.ms.domain.models.Film;
import com.ms.domain.models.Planet;
import com.ms.domain.models.Specie;
import com.ms.domain.repository.CharacterDetailsDataSource;
import com.ms.domain.repository.CharacterSearchDataSource;
import com.ms.domain.usecase.BaseUseCase;
import com.ms.starwars.BaseApplication;
import com.ms.starwars.di.module.DataSourceModule;
import com.ms.starwars.di.module.DataSourceModule_ProvideCharacterDetailsRepoFactory;
import com.ms.starwars.di.module.DataSourceModule_ProvideCharacterSearchRepoFactory;
import com.ms.starwars.di.module.FakeUrlProviderModule;
import com.ms.starwars.di.module.FakeUrlProviderModule_ProvideUrlFactory;
import com.ms.starwars.di.module.NetworkModule;
import com.ms.starwars.di.module.NetworkModule_BaseApiServiceFactory;
import com.ms.starwars.di.module.NetworkModule_BaseOkHttpClientFactory;
import com.ms.starwars.di.module.NetworkModule_BaseRetrofitFactory;
import com.ms.starwars.di.module.NetworkModule_OkHttpLoggingInterceptorFactory;
import com.ms.starwars.di.module.UseCaseModule;
import com.ms.starwars.di.module.UseCaseModule_ProvideFilmUseCaseFactory;
import com.ms.starwars.di.module.UseCaseModule_ProvidePlanetUseCaseFactory;
import com.ms.starwars.di.module.UseCaseModule_ProvideSearchUseCaseFactory;
import com.ms.starwars.di.module.UseCaseModule_ProvideSpecieUseCaseFactory;
import com.ms.starwars.ui.adapters.FilmAdapter;
import com.ms.starwars.ui.adapters.SearchedCharacterAdapter;
import com.ms.starwars.ui.adapters.SpeciesAdapter;
import com.ms.starwars.ui.home.HomeActivity;
import com.ms.starwars.ui.home.HomeActivity_MembersInjector;
import com.ms.starwars.ui.home.HomeViewModel_AssistedFactory;
import com.ms.starwars.ui.home.HomeViewModel_AssistedFactory_Factory;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.MemoizedSentinel;
import dagger.internal.Preconditions;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;
import javax.inject.Provider;
import kotlinx.coroutines.flow.Flow;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerDetailsActivityTest_HiltComponents_ApplicationC extends DetailsActivityTest_HiltComponents.ApplicationC {
  private final ApplicationContextModule applicationContextModule;

  private volatile Object httpLoggingInterceptor = new MemoizedSentinel();

  private volatile Object okHttpClient = new MemoizedSentinel();

  private volatile Object namedString = new MemoizedSentinel();

  private volatile Object retrofit = new MemoizedSentinel();

  private volatile Object apiService = new MemoizedSentinel();

  private volatile Object characterDetailsDataSource = new MemoizedSentinel();

  private volatile Object baseUseCaseOfStringAndFlowOfListOfSpecie = new MemoizedSentinel();

  private volatile Provider<BaseUseCase<String, Flow<List<Specie>>>> provideSpecieUseCaseProvider;

  private volatile Object baseUseCaseOfStringAndFlowOfPlanet = new MemoizedSentinel();

  private volatile Provider<BaseUseCase<String, Flow<Planet>>> providePlanetUseCaseProvider;

  private volatile Object baseUseCaseOfStringAndFlowOfListOfFilm = new MemoizedSentinel();

  private volatile Provider<BaseUseCase<String, Flow<List<Film>>>> provideFilmUseCaseProvider;

  private volatile Object characterSearchDataSource = new MemoizedSentinel();

  private volatile Object baseUseCaseOfStringAndFlowOfListOfCharacter = new MemoizedSentinel();

  private volatile Provider<BaseUseCase<String, Flow<List<Character>>>> provideSearchUseCaseProvider;

  private DaggerDetailsActivityTest_HiltComponents_ApplicationC(
      ApplicationContextModule applicationContextModuleParam) {
    this.applicationContextModule = applicationContextModuleParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  private HttpLoggingInterceptor getHttpLoggingInterceptor() {
    Object local = httpLoggingInterceptor;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = httpLoggingInterceptor;
        if (local instanceof MemoizedSentinel) {
          local = NetworkModule_OkHttpLoggingInterceptorFactory.okHttpLoggingInterceptor();
          httpLoggingInterceptor = DoubleCheck.reentrantCheck(httpLoggingInterceptor, local);
        }
      }
    }
    return (HttpLoggingInterceptor) local;
  }

  private OkHttpClient getOkHttpClient() {
    Object local = okHttpClient;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = okHttpClient;
        if (local instanceof MemoizedSentinel) {
          local = NetworkModule_BaseOkHttpClientFactory.baseOkHttpClient(getHttpLoggingInterceptor());
          okHttpClient = DoubleCheck.reentrantCheck(okHttpClient, local);
        }
      }
    }
    return (OkHttpClient) local;
  }

  private String getNamedString() {
    Object local = namedString;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = namedString;
        if (local instanceof MemoizedSentinel) {
          local = FakeUrlProviderModule_ProvideUrlFactory.provideUrl();
          namedString = DoubleCheck.reentrantCheck(namedString, local);
        }
      }
    }
    return (String) local;
  }

  private Retrofit getRetrofit() {
    Object local = retrofit;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = retrofit;
        if (local instanceof MemoizedSentinel) {
          local = NetworkModule_BaseRetrofitFactory.baseRetrofit(getOkHttpClient(), getNamedString());
          retrofit = DoubleCheck.reentrantCheck(retrofit, local);
        }
      }
    }
    return (Retrofit) local;
  }

  private ApiService getApiService() {
    Object local = apiService;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = apiService;
        if (local instanceof MemoizedSentinel) {
          local = NetworkModule_BaseApiServiceFactory.baseApiService(getRetrofit());
          apiService = DoubleCheck.reentrantCheck(apiService, local);
        }
      }
    }
    return (ApiService) local;
  }

  private CharacterDetailsDataSource getCharacterDetailsDataSource() {
    Object local = characterDetailsDataSource;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = characterDetailsDataSource;
        if (local instanceof MemoizedSentinel) {
          local = DataSourceModule_ProvideCharacterDetailsRepoFactory.provideCharacterDetailsRepo(getApiService());
          characterDetailsDataSource = DoubleCheck.reentrantCheck(characterDetailsDataSource, local);
        }
      }
    }
    return (CharacterDetailsDataSource) local;
  }

  private BaseUseCase<String, Flow<List<Specie>>> getBaseUseCaseOfStringAndFlowOfListOfSpecie() {
    Object local = baseUseCaseOfStringAndFlowOfListOfSpecie;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = baseUseCaseOfStringAndFlowOfListOfSpecie;
        if (local instanceof MemoizedSentinel) {
          local = UseCaseModule_ProvideSpecieUseCaseFactory.provideSpecieUseCase(getCharacterDetailsDataSource());
          baseUseCaseOfStringAndFlowOfListOfSpecie = DoubleCheck.reentrantCheck(baseUseCaseOfStringAndFlowOfListOfSpecie, local);
        }
      }
    }
    return (BaseUseCase<String, Flow<List<Specie>>>) local;
  }

  private Provider<BaseUseCase<String, Flow<List<Specie>>>> getBaseUseCaseOfStringAndFlowOfListOfSpecieProvider(
      ) {
    Object local = provideSpecieUseCaseProvider;
    if (local == null) {
      local = new SwitchingProvider<>(0);
      provideSpecieUseCaseProvider = (Provider<BaseUseCase<String, Flow<List<Specie>>>>) local;
    }
    return (Provider<BaseUseCase<String, Flow<List<Specie>>>>) local;
  }

  private BaseUseCase<String, Flow<Planet>> getBaseUseCaseOfStringAndFlowOfPlanet() {
    Object local = baseUseCaseOfStringAndFlowOfPlanet;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = baseUseCaseOfStringAndFlowOfPlanet;
        if (local instanceof MemoizedSentinel) {
          local = UseCaseModule_ProvidePlanetUseCaseFactory.providePlanetUseCase(getCharacterDetailsDataSource());
          baseUseCaseOfStringAndFlowOfPlanet = DoubleCheck.reentrantCheck(baseUseCaseOfStringAndFlowOfPlanet, local);
        }
      }
    }
    return (BaseUseCase<String, Flow<Planet>>) local;
  }

  private Provider<BaseUseCase<String, Flow<Planet>>> getBaseUseCaseOfStringAndFlowOfPlanetProvider(
      ) {
    Object local = providePlanetUseCaseProvider;
    if (local == null) {
      local = new SwitchingProvider<>(1);
      providePlanetUseCaseProvider = (Provider<BaseUseCase<String, Flow<Planet>>>) local;
    }
    return (Provider<BaseUseCase<String, Flow<Planet>>>) local;
  }

  private BaseUseCase<String, Flow<List<Film>>> getBaseUseCaseOfStringAndFlowOfListOfFilm() {
    Object local = baseUseCaseOfStringAndFlowOfListOfFilm;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = baseUseCaseOfStringAndFlowOfListOfFilm;
        if (local instanceof MemoizedSentinel) {
          local = UseCaseModule_ProvideFilmUseCaseFactory.provideFilmUseCase(getCharacterDetailsDataSource());
          baseUseCaseOfStringAndFlowOfListOfFilm = DoubleCheck.reentrantCheck(baseUseCaseOfStringAndFlowOfListOfFilm, local);
        }
      }
    }
    return (BaseUseCase<String, Flow<List<Film>>>) local;
  }

  private Provider<BaseUseCase<String, Flow<List<Film>>>> getBaseUseCaseOfStringAndFlowOfListOfFilmProvider(
      ) {
    Object local = provideFilmUseCaseProvider;
    if (local == null) {
      local = new SwitchingProvider<>(2);
      provideFilmUseCaseProvider = (Provider<BaseUseCase<String, Flow<List<Film>>>>) local;
    }
    return (Provider<BaseUseCase<String, Flow<List<Film>>>>) local;
  }

  private CharacterSearchDataSource getCharacterSearchDataSource() {
    Object local = characterSearchDataSource;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = characterSearchDataSource;
        if (local instanceof MemoizedSentinel) {
          local = DataSourceModule_ProvideCharacterSearchRepoFactory.provideCharacterSearchRepo(getApiService());
          characterSearchDataSource = DoubleCheck.reentrantCheck(characterSearchDataSource, local);
        }
      }
    }
    return (CharacterSearchDataSource) local;
  }

  private BaseUseCase<String, Flow<List<Character>>> getBaseUseCaseOfStringAndFlowOfListOfCharacter(
      ) {
    Object local = baseUseCaseOfStringAndFlowOfListOfCharacter;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = baseUseCaseOfStringAndFlowOfListOfCharacter;
        if (local instanceof MemoizedSentinel) {
          local = UseCaseModule_ProvideSearchUseCaseFactory.provideSearchUseCase(getCharacterSearchDataSource());
          baseUseCaseOfStringAndFlowOfListOfCharacter = DoubleCheck.reentrantCheck(baseUseCaseOfStringAndFlowOfListOfCharacter, local);
        }
      }
    }
    return (BaseUseCase<String, Flow<List<Character>>>) local;
  }

  private Provider<BaseUseCase<String, Flow<List<Character>>>> getBaseUseCaseOfStringAndFlowOfListOfCharacterProvider(
      ) {
    Object local = provideSearchUseCaseProvider;
    if (local == null) {
      local = new SwitchingProvider<>(3);
      provideSearchUseCaseProvider = (Provider<BaseUseCase<String, Flow<List<Character>>>>) local;
    }
    return (Provider<BaseUseCase<String, Flow<List<Character>>>>) local;
  }

  @Override
  public void injectBaseApplication(BaseApplication arg0) {
  }

  @Override
  public void injectTest(DetailsActivityTest detailsActivityTest) {
  }

  @Override
  public ActivityRetainedComponentBuilder retainedComponentBuilder() {
    return new ActivityRetainedCBuilder();
  }

  @Override
  public ServiceComponentBuilder serviceComponentBuilder() {
    return new ServiceCBuilder();
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder dataSourceModule(DataSourceModule dataSourceModule) {
      Preconditions.checkNotNull(dataSourceModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder fakeUrlProviderModule(FakeUrlProviderModule fakeUrlProviderModule) {
      Preconditions.checkNotNull(fakeUrlProviderModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder networkModule(NetworkModule networkModule) {
      Preconditions.checkNotNull(networkModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder useCaseModule(UseCaseModule useCaseModule) {
      Preconditions.checkNotNull(useCaseModule);
      return this;
    }

    public DetailsActivityTest_HiltComponents.ApplicationC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new DaggerDetailsActivityTest_HiltComponents_ApplicationC(applicationContextModule);
    }
  }

  private final class ActivityRetainedCBuilder implements DetailsActivityTest_HiltComponents.ActivityRetainedC.Builder {
    @Override
    public DetailsActivityTest_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl();
    }
  }

  private final class ActivityRetainedCImpl extends DetailsActivityTest_HiltComponents.ActivityRetainedC {
    private ActivityRetainedCImpl() {

    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder();
    }

    private final class ActivityCBuilder implements DetailsActivityTest_HiltComponents.ActivityC.Builder {
      private Activity activity;

      @Override
      public ActivityCBuilder activity(Activity activity) {
        this.activity = Preconditions.checkNotNull(activity);
        return this;
      }

      @Override
      public DetailsActivityTest_HiltComponents.ActivityC build() {
        Preconditions.checkBuilderRequirement(activity, Activity.class);
        return new ActivityCImpl(activity);
      }
    }

    private final class ActivityCImpl extends DetailsActivityTest_HiltComponents.ActivityC {
      private final Activity activity;

      private volatile Provider<DetailsViewModel_AssistedFactory> detailsViewModel_AssistedFactoryProvider;

      private volatile Provider<HomeViewModel_AssistedFactory> homeViewModel_AssistedFactoryProvider;

      private ActivityCImpl(Activity activityParam) {
        this.activity = activityParam;
      }

      private DetailsViewModel_AssistedFactory getDetailsViewModel_AssistedFactory() {
        return new DetailsViewModel_AssistedFactory(DaggerDetailsActivityTest_HiltComponents_ApplicationC.this.getBaseUseCaseOfStringAndFlowOfListOfSpecieProvider(), DaggerDetailsActivityTest_HiltComponents_ApplicationC.this.getBaseUseCaseOfStringAndFlowOfPlanetProvider(), DaggerDetailsActivityTest_HiltComponents_ApplicationC.this.getBaseUseCaseOfStringAndFlowOfListOfFilmProvider());
      }

      private Provider<DetailsViewModel_AssistedFactory> getDetailsViewModel_AssistedFactoryProvider(
          ) {
        Object local = detailsViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(0);
          detailsViewModel_AssistedFactoryProvider = (Provider<DetailsViewModel_AssistedFactory>) local;
        }
        return (Provider<DetailsViewModel_AssistedFactory>) local;
      }

      private HomeViewModel_AssistedFactory getHomeViewModel_AssistedFactory() {
        return HomeViewModel_AssistedFactory_Factory.newInstance(DaggerDetailsActivityTest_HiltComponents_ApplicationC.this.getBaseUseCaseOfStringAndFlowOfListOfCharacterProvider());
      }

      private Provider<HomeViewModel_AssistedFactory> getHomeViewModel_AssistedFactoryProvider() {
        Object local = homeViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(1);
          homeViewModel_AssistedFactoryProvider = (Provider<HomeViewModel_AssistedFactory>) local;
        }
        return (Provider<HomeViewModel_AssistedFactory>) local;
      }

      private Map<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>> getMapOfStringAndProviderOfViewModelAssistedFactoryOf(
          ) {
        return ImmutableMap.<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>>of("com.ms.starwars.ui.details.DetailsViewModel", (Provider) getDetailsViewModel_AssistedFactoryProvider(), "com.ms.starwars.ui.home.HomeViewModel", (Provider) getHomeViewModel_AssistedFactoryProvider());
      }

      private ViewModelProvider.Factory getProvideFactory() {
        return ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory.provideFactory(activity, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerDetailsActivityTest_HiltComponents_ApplicationC.this.applicationContextModule), getMapOfStringAndProviderOfViewModelAssistedFactoryOf());
      }

      @Override
      public void injectDetailsActivity(DetailsActivity arg0) {
        injectDetailsActivity2(arg0);
      }

      @Override
      public void injectHomeActivity(HomeActivity arg0) {
        injectHomeActivity2(arg0);
      }

      @Override
      public Set<ViewModelProvider.Factory> getActivityViewModelFactory() {
        return ImmutableSet.<ViewModelProvider.Factory>of(getProvideFactory());
      }

      @Override
      public FragmentComponentBuilder fragmentComponentBuilder() {
        return new FragmentCBuilder();
      }

      @Override
      public ViewComponentBuilder viewComponentBuilder() {
        return new ViewCBuilder();
      }

      @CanIgnoreReturnValue
      private DetailsActivity injectDetailsActivity2(DetailsActivity instance) {
        DetailsActivity_MembersInjector.injectSpeciesAdapter(instance, new SpeciesAdapter());
        DetailsActivity_MembersInjector.injectFilmAdapter(instance, new FilmAdapter());
        return instance;
      }

      @CanIgnoreReturnValue
      private HomeActivity injectHomeActivity2(HomeActivity instance) {
        HomeActivity_MembersInjector.injectSearchedCharacterAdapter(instance, new SearchedCharacterAdapter());
        return instance;
      }

      private final class FragmentCBuilder implements DetailsActivityTest_HiltComponents.FragmentC.Builder {
        private Fragment fragment;

        @Override
        public FragmentCBuilder fragment(Fragment fragment) {
          this.fragment = Preconditions.checkNotNull(fragment);
          return this;
        }

        @Override
        public DetailsActivityTest_HiltComponents.FragmentC build() {
          Preconditions.checkBuilderRequirement(fragment, Fragment.class);
          return new FragmentCImpl(fragment);
        }
      }

      private final class FragmentCImpl extends DetailsActivityTest_HiltComponents.FragmentC {
        private final Fragment fragment;

        private FragmentCImpl(Fragment fragmentParam) {
          this.fragment = fragmentParam;
        }

        private ViewModelProvider.Factory getProvideFactory() {
          return ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory.provideFactory(fragment, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerDetailsActivityTest_HiltComponents_ApplicationC.this.applicationContextModule), ActivityCImpl.this.getMapOfStringAndProviderOfViewModelAssistedFactoryOf());
        }

        @Override
        public Set<ViewModelProvider.Factory> getFragmentViewModelFactory() {
          return ImmutableSet.<ViewModelProvider.Factory>of(getProvideFactory());
        }

        @Override
        public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
          return new ViewWithFragmentCBuilder();
        }

        private final class ViewWithFragmentCBuilder implements DetailsActivityTest_HiltComponents.ViewWithFragmentC.Builder {
          private View view;

          @Override
          public ViewWithFragmentCBuilder view(View view) {
            this.view = Preconditions.checkNotNull(view);
            return this;
          }

          @Override
          public DetailsActivityTest_HiltComponents.ViewWithFragmentC build() {
            Preconditions.checkBuilderRequirement(view, View.class);
            return new ViewWithFragmentCImpl(view);
          }
        }

        private final class ViewWithFragmentCImpl extends DetailsActivityTest_HiltComponents.ViewWithFragmentC {
          private ViewWithFragmentCImpl(View view) {

          }
        }
      }

      private final class ViewCBuilder implements DetailsActivityTest_HiltComponents.ViewC.Builder {
        private View view;

        @Override
        public ViewCBuilder view(View view) {
          this.view = Preconditions.checkNotNull(view);
          return this;
        }

        @Override
        public DetailsActivityTest_HiltComponents.ViewC build() {
          Preconditions.checkBuilderRequirement(view, View.class);
          return new ViewCImpl(view);
        }
      }

      private final class ViewCImpl extends DetailsActivityTest_HiltComponents.ViewC {
        private ViewCImpl(View view) {

        }
      }

      private final class SwitchingProvider<T> implements Provider<T> {
        private final int id;

        SwitchingProvider(int id) {
          this.id = id;
        }

        @SuppressWarnings("unchecked")
        @Override
        public T get() {
          switch (id) {
            case 0: // com.ms.starwars.ui.details.DetailsViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getDetailsViewModel_AssistedFactory();

            case 1: // com.ms.starwars.ui.home.HomeViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getHomeViewModel_AssistedFactory();

            default: throw new AssertionError(id);
          }
        }
      }
    }
  }

  private final class ServiceCBuilder implements DetailsActivityTest_HiltComponents.ServiceC.Builder {
    private Service service;

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public DetailsActivityTest_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(service);
    }
  }

  private final class ServiceCImpl extends DetailsActivityTest_HiltComponents.ServiceC {
    private ServiceCImpl(Service service) {

    }
  }

  private final class SwitchingProvider<T> implements Provider<T> {
    private final int id;

    SwitchingProvider(int id) {
      this.id = id;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T get() {
      switch (id) {
        case 0: // com.ms.domain.usecase.BaseUseCase<java.lang.String,kotlinx.coroutines.flow.Flow<java.util.List<com.ms.domain.models.Specie>>> 
        return (T) DaggerDetailsActivityTest_HiltComponents_ApplicationC.this.getBaseUseCaseOfStringAndFlowOfListOfSpecie();

        case 1: // com.ms.domain.usecase.BaseUseCase<java.lang.String,kotlinx.coroutines.flow.Flow<com.ms.domain.models.Planet>> 
        return (T) DaggerDetailsActivityTest_HiltComponents_ApplicationC.this.getBaseUseCaseOfStringAndFlowOfPlanet();

        case 2: // com.ms.domain.usecase.BaseUseCase<java.lang.String,kotlinx.coroutines.flow.Flow<java.util.List<com.ms.domain.models.Film>>> 
        return (T) DaggerDetailsActivityTest_HiltComponents_ApplicationC.this.getBaseUseCaseOfStringAndFlowOfListOfFilm();

        case 3: // com.ms.domain.usecase.BaseUseCase<java.lang.String,kotlinx.coroutines.flow.Flow<java.util.List<com.ms.domain.models.Character>>> 
        return (T) DaggerDetailsActivityTest_HiltComponents_ApplicationC.this.getBaseUseCaseOfStringAndFlowOfListOfCharacter();

        default: throw new AssertionError(id);
      }
    }
  }
}
