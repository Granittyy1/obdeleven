package androidx.activity;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.core.app.C1277b;
import androidx.core.app.E;
import androidx.core.app.G;
import androidx.core.view.C1302q;
import androidx.core.view.InterfaceC1299n;
import androidx.core.view.InterfaceC1303s;
import androidx.lifecycle.C1378v;
import androidx.lifecycle.InterfaceC1369l;
import androidx.lifecycle.InterfaceC1376t;
import androidx.lifecycle.J;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.N;
import androidx.lifecycle.S;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import com.voltasit.obdeleven.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: ComponentActivity.kt */
/* JADX INFO: loaded from: classes.dex */
public class ComponentActivity extends androidx.core.app.k implements c0, InterfaceC1369l, p248u2.e, C, p063f.g, p186p0.c, p186p0.d, androidx.core.app.D, E, InterfaceC1299n {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private static final c Companion = new c();
    private b0 _viewModelStore;
    private final androidx.activity.result.a activityResultRegistry;
    private int contentLayoutId;
    private final p051e.a contextAwareHelper;
    private final p293xa.g defaultViewModelProviderFactory$delegate;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;
    private final p293xa.g fullyDrawnReporter$delegate;
    private final C1302q menuHostHelper;
    private final AtomicInteger nextLocalRequestCode;
    private final p293xa.g onBackPressedDispatcher$delegate;
    private final CopyOnWriteArrayList<A0.a<Configuration>> onConfigurationChangedListeners;
    private final CopyOnWriteArrayList<A0.a<androidx.core.app.m>> onMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<A0.a<Intent>> onNewIntentListeners;
    private final CopyOnWriteArrayList<A0.a<G>> onPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<A0.a<Integer>> onTrimMemoryListeners;
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;
    private final e reportFullyDrawnExecutor;
    private final p248u2.d savedStateRegistryController;

    /* JADX INFO: compiled from: ComponentActivity.kt */
    public static final class a implements androidx.lifecycle.r {
        public a() {
        }

        @Override // androidx.lifecycle.r
        public final void h(InterfaceC1376t interfaceC1376t, Lifecycle.Event event) {
            ComponentActivity componentActivity = ComponentActivity.this;
            componentActivity.ensureViewModelStore();
            componentActivity.getLifecycle().c(this);
        }
    }

    /* JADX INFO: compiled from: ComponentActivity.kt */
    public static final class b {
        public static OnBackInvokedDispatcher a(ComponentActivity activity) {
            kotlin.jvm.internal.i.e(activity, "activity");
            OnBackInvokedDispatcher onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
            kotlin.jvm.internal.i.d(onBackInvokedDispatcher, "activity.getOnBackInvokedDispatcher()");
            return onBackInvokedDispatcher;
        }
    }

    /* JADX INFO: compiled from: ComponentActivity.kt */
    public static final class c {
    }

    /* JADX INFO: compiled from: ComponentActivity.kt */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f8172a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public b0 f8173b;
    }

    /* JADX INFO: compiled from: ComponentActivity.kt */
    public interface e extends Executor {
        void k();

        void o0(View view);
    }

    /* JADX INFO: compiled from: ComponentActivity.kt */
    public final class f implements e, ViewTreeObserver.OnDrawListener, Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f8174b = SystemClock.uptimeMillis() + ((long) 10000);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Runnable f8175c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f8176d;

        public f() {
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            kotlin.jvm.internal.i.e(runnable, "runnable");
            this.f8175c = runnable;
            View decorView = ComponentActivity.this.getWindow().getDecorView();
            kotlin.jvm.internal.i.d(decorView, "window.decorView");
            if (!this.f8176d) {
                decorView.postOnAnimation(new j(0, this));
            } else if (kotlin.jvm.internal.i.a(Looper.myLooper(), Looper.getMainLooper())) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        @Override // androidx.activity.ComponentActivity.e
        public final void k() {
            ComponentActivity componentActivity = ComponentActivity.this;
            componentActivity.getWindow().getDecorView().removeCallbacks(this);
            componentActivity.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // androidx.activity.ComponentActivity.e
        public final void o0(View view) {
            if (this.f8176d) {
                return;
            }
            this.f8176d = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public final void onDraw() {
            boolean z10;
            Runnable runnable = this.f8175c;
            if (runnable == null) {
                if (SystemClock.uptimeMillis() > this.f8174b) {
                    this.f8176d = false;
                    ComponentActivity.this.getWindow().getDecorView().post(this);
                    return;
                }
                return;
            }
            runnable.run();
            this.f8175c = null;
            x fullyDrawnReporter = ComponentActivity.this.getFullyDrawnReporter();
            synchronized (fullyDrawnReporter.f8267b) {
                z10 = fullyDrawnReporter.f8268c;
            }
            if (z10) {
                this.f8176d = false;
                ComponentActivity.this.getWindow().getDecorView().post(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }
    }

    /* JADX INFO: compiled from: ComponentActivity.kt */
    public static final class g extends androidx.activity.result.a {
        public g() {
        }

        @Override // androidx.activity.result.a
        public final void b(final int i10, p076g.a contract, Object obj) {
            Bundle bundle;
            kotlin.jvm.internal.i.e(contract, "contract");
            ComponentActivity componentActivity = ComponentActivity.this;
            final p076g.a.C0368a synchronousResult = contract.getSynchronousResult(componentActivity, obj);
            if (synchronousResult != null) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: androidx.activity.k
                    /* JADX WARN: Type inference incomplete: some casts might be missing */
                    @Override // java.lang.Runnable
                    public final void run() {
                        Serializable serializable = synchronousResult.f35080a;
                        ComponentActivity.g gVar = this.f8236b;
                        String str = (String) gVar.f8255a.get(Integer.valueOf(i10));
                        if (str == null) {
                            return;
                        }
                        androidx.activity.result.a.C0114a c0114a = (androidx.activity.result.a.C0114a) gVar.f8259e.get(str);
                        if ((c0114a != null ? c0114a.f8262a : null) == null) {
                            gVar.f8261g.remove(str);
                            gVar.f8260f.put(str, serializable);
                            return;
                        }
                        p063f.b<O> bVar = c0114a.f8262a;
                        kotlin.jvm.internal.i.c(bVar, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
                        if (gVar.f8258d.remove(str)) {
                            bVar.b((O) serializable);
                        }
                    }
                });
                return;
            }
            Intent intentCreateIntent = contract.createIntent(componentActivity, obj);
            if (intentCreateIntent.getExtras() != null) {
                Bundle extras = intentCreateIntent.getExtras();
                kotlin.jvm.internal.i.b(extras);
                if (extras.getClassLoader() == null) {
                    intentCreateIntent.setExtrasClassLoader(componentActivity.getClassLoader());
                }
            }
            if (intentCreateIntent.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                Bundle bundleExtra = intentCreateIntent.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                intentCreateIntent.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                bundle = bundleExtra;
            } else {
                bundle = null;
            }
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentCreateIntent.getAction())) {
                String[] stringArrayExtra = intentCreateIntent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                C1277b.d(componentActivity, stringArrayExtra, i10);
                return;
            }
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentCreateIntent.getAction())) {
                componentActivity.startActivityForResult(intentCreateIntent, i10, bundle);
                return;
            }
            p063f.h hVar = (p063f.h) intentCreateIntent.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                kotlin.jvm.internal.i.b(hVar);
                componentActivity.startIntentSenderForResult(hVar.f34898b, i10, hVar.f34899c, hVar.f34900d, hVar.f34901e, 0, bundle);
            } catch (IntentSender.SendIntentException e10) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: androidx.activity.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f8239b.a(i10, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", e10));
                    }
                });
            }
        }
    }

    public ComponentActivity() {
        this.contextAwareHelper = new p051e.a();
        this.menuHostHelper = new C1302q(new RunnableC0847d(0, this));
        p248u2.d dVar = new p248u2.d(new p273w2.b(this, new io.intercom.android.sdk.ui.preview.ui.c(this, 1)));
        this.savedStateRegistryController = dVar;
        this.reportFullyDrawnExecutor = createFullyDrawnExecutor();
        this.fullyDrawnReporter$delegate = kotlin.a.a(new Ia.a<x>() { // from class: androidx.activity.ComponentActivity$fullyDrawnReporter$2
            {
                super(0);
            }

            @Override // Ia.a
            public final x invoke() {
                ComponentActivity.e eVar = this.this$0.reportFullyDrawnExecutor;
                final ComponentActivity componentActivity = this.this$0;
                return new x(eVar, new Ia.a<p293xa.r>() { // from class: androidx.activity.ComponentActivity$fullyDrawnReporter$2.1
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final p293xa.r invoke() {
                        componentActivity.reportFullyDrawn();
                        return p293xa.r.f47939a;
                    }
                });
            }
        });
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new g();
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        getLifecycle().a(new androidx.activity.e(0, this));
        getLifecycle().a(new androidx.lifecycle.r() { // from class: androidx.activity.f
            @Override // androidx.lifecycle.r
            public final void h(InterfaceC1376t interfaceC1376t, Lifecycle.Event event) {
                ComponentActivity._init_$lambda$3(this.f8229b, interfaceC1376t, event);
            }
        });
        getLifecycle().a(new a());
        dVar.a();
        N.b(this);
        getSavedStateRegistry().c(ACTIVITY_RESULT_TAG, new u2.c.b() { // from class: androidx.activity.g
            @Override // u2.c.b
            public final Bundle a() {
                return ComponentActivity._init_$lambda$4(this.f8230a);
            }
        });
        addOnContextAvailableListener(new p051e.b() { // from class: androidx.activity.h
            @Override // p051e.b
            public final void a(ComponentActivity componentActivity) {
                ComponentActivity._init_$lambda$5(this.f8231a, componentActivity);
            }
        });
        this.defaultViewModelProviderFactory$delegate = kotlin.a.a(new Ia.a<S>() { // from class: androidx.activity.ComponentActivity$defaultViewModelProviderFactory$2
            {
                super(0);
            }

            @Override // Ia.a
            public final S invoke() {
                Application application = this.this$0.getApplication();
                ComponentActivity componentActivity = this.this$0;
                return new S(application, componentActivity, componentActivity.getIntent() != null ? this.this$0.getIntent().getExtras() : null);
            }
        });
        this.onBackPressedDispatcher$delegate = kotlin.a.a(new Ia.a<OnBackPressedDispatcher>() { // from class: androidx.activity.ComponentActivity$onBackPressedDispatcher$2
            {
                super(0);
            }

            @Override // Ia.a
            public final OnBackPressedDispatcher invoke() {
                OnBackPressedDispatcher onBackPressedDispatcher = new OnBackPressedDispatcher(new m(0, this.this$0));
                ComponentActivity componentActivity = this.this$0;
                if (Build.VERSION.SDK_INT >= 33) {
                    if (kotlin.jvm.internal.i.a(Looper.myLooper(), Looper.getMainLooper())) {
                        componentActivity.addObserverForBackInvoker(onBackPressedDispatcher);
                    } else {
                        new Handler(Looper.getMainLooper()).post(new n(componentActivity, 0, onBackPressedDispatcher));
                    }
                }
                return onBackPressedDispatcher;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(ComponentActivity componentActivity, InterfaceC1376t interfaceC1376t, Lifecycle.Event event) {
        Window window;
        View viewPeekDecorView;
        kotlin.jvm.internal.i.e(interfaceC1376t, "<anonymous parameter 0>");
        kotlin.jvm.internal.i.e(event, "event");
        if (event != Lifecycle.Event.ON_STOP || (window = componentActivity.getWindow()) == null || (viewPeekDecorView = window.peekDecorView()) == null) {
            return;
        }
        viewPeekDecorView.cancelPendingInputEvents();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$3(ComponentActivity componentActivity, InterfaceC1376t interfaceC1376t, Lifecycle.Event event) {
        kotlin.jvm.internal.i.e(interfaceC1376t, "<anonymous parameter 0>");
        kotlin.jvm.internal.i.e(event, "event");
        if (event == Lifecycle.Event.ON_DESTROY) {
            componentActivity.contextAwareHelper.f34706b = null;
            if (!componentActivity.isChangingConfigurations()) {
                componentActivity.getViewModelStore().a();
            }
            componentActivity.reportFullyDrawnExecutor.k();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle _init_$lambda$4(ComponentActivity componentActivity) {
        Bundle bundle = new Bundle();
        androidx.activity.result.a aVar = componentActivity.activityResultRegistry;
        aVar.getClass();
        LinkedHashMap linkedHashMap = aVar.f8256b;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(aVar.f8258d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(aVar.f8261g));
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$5(ComponentActivity componentActivity, Context it) {
        kotlin.jvm.internal.i.e(it, "it");
        Bundle bundleA = componentActivity.getSavedStateRegistry().a(ACTIVITY_RESULT_TAG);
        if (bundleA != null) {
            androidx.activity.result.a aVar = componentActivity.activityResultRegistry;
            aVar.getClass();
            ArrayList<Integer> integerArrayList = bundleA.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                aVar.f8258d.addAll(stringArrayList2);
            }
            Bundle bundle = bundleA.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            Bundle bundle2 = aVar.f8261g;
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            int size = stringArrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                String str = stringArrayList.get(i10);
                LinkedHashMap linkedHashMap = aVar.f8256b;
                boolean zContainsKey = linkedHashMap.containsKey(str);
                LinkedHashMap linkedHashMap2 = aVar.f8255a;
                if (zContainsKey) {
                    Integer num = (Integer) linkedHashMap.remove(str);
                    if (!bundle2.containsKey(str)) {
                        kotlin.jvm.internal.o.c(linkedHashMap2).remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i10);
                kotlin.jvm.internal.i.d(num2, "rcs[i]");
                int iIntValue = num2.intValue();
                String str2 = stringArrayList.get(i10);
                kotlin.jvm.internal.i.d(str2, "keys[i]");
                String str3 = str2;
                linkedHashMap2.put(Integer.valueOf(iIntValue), str3);
                linkedHashMap.put(str3, Integer.valueOf(iIntValue));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addObserverForBackInvoker(final OnBackPressedDispatcher onBackPressedDispatcher) {
        getLifecycle().a(new androidx.lifecycle.r(this) { // from class: androidx.activity.i

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ComponentActivity f8233c;

            {
                this.f8233c = this;
            }

            @Override // androidx.lifecycle.r
            public final void h(InterfaceC1376t interfaceC1376t, Lifecycle.Event event) {
                ComponentActivity.addObserverForBackInvoker$lambda$7(onBackPressedDispatcher, this.f8233c, interfaceC1376t, event);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addObserverForBackInvoker$lambda$7(OnBackPressedDispatcher onBackPressedDispatcher, ComponentActivity componentActivity, InterfaceC1376t interfaceC1376t, Lifecycle.Event event) {
        kotlin.jvm.internal.i.e(interfaceC1376t, "<anonymous parameter 0>");
        kotlin.jvm.internal.i.e(event, "event");
        if (event == Lifecycle.Event.ON_CREATE) {
            onBackPressedDispatcher.f8187e = b.a(componentActivity);
            onBackPressedDispatcher.d(onBackPressedDispatcher.f8189g);
        }
    }

    private final e createFullyDrawnExecutor() {
        return new f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ensureViewModelStore() {
        if (this._viewModelStore == null) {
            d dVar = (d) getLastNonConfigurationInstance();
            if (dVar != null) {
                this._viewModelStore = dVar.f8173b;
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new b0();
            }
        }
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        e eVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.i.d(decorView, "window.decorView");
        eVar.o0(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.core.view.InterfaceC1299n
    public void addMenuProvider(InterfaceC1303s provider) {
        kotlin.jvm.internal.i.e(provider, "provider");
        C1302q c1302q = this.menuHostHelper;
        c1302q.f16984b.add(provider);
        c1302q.f16983a.run();
    }

    @Override // p186p0.c
    public final void addOnConfigurationChangedListener(A0.a<Configuration> listener) {
        kotlin.jvm.internal.i.e(listener, "listener");
        this.onConfigurationChangedListeners.add(listener);
    }

    public final void addOnContextAvailableListener(p051e.b listener) {
        kotlin.jvm.internal.i.e(listener, "listener");
        p051e.a aVar = this.contextAwareHelper;
        aVar.getClass();
        ComponentActivity componentActivity = aVar.f34706b;
        if (componentActivity != null) {
            listener.a(componentActivity);
        }
        aVar.f34705a.add(listener);
    }

    @Override // androidx.core.app.D
    public final void addOnMultiWindowModeChangedListener(A0.a<androidx.core.app.m> listener) {
        kotlin.jvm.internal.i.e(listener, "listener");
        this.onMultiWindowModeChangedListeners.add(listener);
    }

    public final void addOnNewIntentListener(A0.a<Intent> listener) {
        kotlin.jvm.internal.i.e(listener, "listener");
        this.onNewIntentListeners.add(listener);
    }

    @Override // androidx.core.app.E
    public final void addOnPictureInPictureModeChangedListener(A0.a<G> listener) {
        kotlin.jvm.internal.i.e(listener, "listener");
        this.onPictureInPictureModeChangedListeners.add(listener);
    }

    @Override // p186p0.d
    public final void addOnTrimMemoryListener(A0.a<Integer> listener) {
        kotlin.jvm.internal.i.e(listener, "listener");
        this.onTrimMemoryListeners.add(listener);
    }

    public final void addOnUserLeaveHintListener(Runnable listener) {
        kotlin.jvm.internal.i.e(listener, "listener");
        this.onUserLeaveHintListeners.add(listener);
    }

    @Override // p063f.g
    public final androidx.activity.result.a getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    @Override // androidx.lifecycle.InterfaceC1369l
    public p014b1.a getDefaultViewModelCreationExtras() {
        p014b1.d dVar = new p014b1.d((Object) null);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = dVar.f20497a;
        if (application != null) {
            a0.a.C0183a c0183a = a0.a.f17798d;
            Application application2 = getApplication();
            kotlin.jvm.internal.i.d(application2, "application");
            linkedHashMap.put(c0183a, application2);
        }
        linkedHashMap.put(N.f17760a, this);
        linkedHashMap.put(N.f17761b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(N.f17762c, extras);
        }
        return dVar;
    }

    @Override // androidx.lifecycle.InterfaceC1369l
    public a0.c getDefaultViewModelProviderFactory() {
        return (a0.c) this.defaultViewModelProviderFactory$delegate.getValue();
    }

    public x getFullyDrawnReporter() {
        return (x) this.fullyDrawnReporter$delegate.getValue();
    }

    @p293xa.d
    public Object getLastCustomNonConfigurationInstance() {
        d dVar = (d) getLastNonConfigurationInstance();
        if (dVar != null) {
            return dVar.f8172a;
        }
        return null;
    }

    @Override // androidx.core.app.k, androidx.lifecycle.InterfaceC1376t
    public Lifecycle getLifecycle() {
        return super.getLifecycle();
    }

    @Override // androidx.activity.C
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return (OnBackPressedDispatcher) this.onBackPressedDispatcher$delegate.getValue();
    }

    @Override // p248u2.e
    public final p248u2.c getSavedStateRegistry() {
        return this.savedStateRegistryController.f47417b;
    }

    @Override // androidx.lifecycle.c0
    public b0 getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        ensureViewModelStore();
        b0 b0Var = this._viewModelStore;
        kotlin.jvm.internal.i.b(b0Var);
        return b0Var;
    }

    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.i.d(decorView, "window.decorView");
        P3.d.u(decorView, this);
        View decorView2 = getWindow().getDecorView();
        kotlin.jvm.internal.i.d(decorView2, "window.decorView");
        kotlin.jvm.internal.h.h(decorView2, this);
        View decorView3 = getWindow().getDecorView();
        kotlin.jvm.internal.i.d(decorView3, "window.decorView");
        I2.e.p(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        kotlin.jvm.internal.i.d(decorView4, "window.decorView");
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        kotlin.jvm.internal.i.d(decorView5, "window.decorView");
        decorView5.setTag(R.id.report_drawn, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    @p293xa.d
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (this.activityResultRegistry.a(i10, i11, intent)) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // android.app.Activity
    @p293xa.d
    public void onBackPressed() {
        getOnBackPressedDispatcher().c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        kotlin.jvm.internal.i.e(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Iterator<A0.a<Configuration>> it = this.onConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().a(newConfig);
        }
    }

    @Override // androidx.core.app.k, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.savedStateRegistryController.b(bundle);
        p051e.a aVar = this.contextAwareHelper;
        aVar.getClass();
        aVar.f34706b = this;
        Iterator it = aVar.f34705a.iterator();
        while (it.hasNext()) {
            ((p051e.b) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i10 = J.f17740c;
        J.a.b(this);
        int i11 = this.contentLayoutId;
        if (i11 != 0) {
            setContentView(i11);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i10, Menu menu) {
        kotlin.jvm.internal.i.e(menu, "menu");
        if (i10 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i10, menu);
        C1302q c1302q = this.menuHostHelper;
        MenuInflater menuInflater = getMenuInflater();
        Iterator<InterfaceC1303s> it = c1302q.f16984b.iterator();
        while (it.hasNext()) {
            it.next().c(menu, menuInflater);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem item) {
        kotlin.jvm.internal.i.e(item, "item");
        boolean z10 = true;
        if (super.onMenuItemSelected(i10, item)) {
            return true;
        }
        if (i10 != 0) {
            return false;
        }
        Iterator<InterfaceC1303s> it = this.menuHostHelper.f16984b.iterator();
        while (it.hasNext()) {
            if (it.next().a(item)) {
                return z10;
            }
        }
        z10 = false;
        return z10;
    }

    @Override // android.app.Activity
    @p293xa.d
    public void onMultiWindowModeChanged(boolean z10) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<A0.a<androidx.core.app.m>> it = this.onMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().a(new androidx.core.app.m(z10));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        kotlin.jvm.internal.i.e(intent, "intent");
        super.onNewIntent(intent);
        Iterator<A0.a<Intent>> it = this.onNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().a(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        kotlin.jvm.internal.i.e(menu, "menu");
        Iterator<InterfaceC1303s> it = this.menuHostHelper.f16984b.iterator();
        while (it.hasNext()) {
            it.next().b(menu);
        }
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    @p293xa.d
    public void onPictureInPictureModeChanged(boolean z10) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<A0.a<G>> it = this.onPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().a(new G(z10));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i10, View view, Menu menu) {
        kotlin.jvm.internal.i.e(menu, "menu");
        if (i10 != 0) {
            return true;
        }
        super.onPreparePanel(i10, view, menu);
        Iterator<InterfaceC1303s> it = this.menuHostHelper.f16984b.iterator();
        while (it.hasNext()) {
            it.next().d(menu);
        }
        return true;
    }

    @Override // android.app.Activity
    @p293xa.d
    public void onRequestPermissionsResult(int i10, String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.i.e(permissions, "permissions");
        kotlin.jvm.internal.i.e(grantResults, "grantResults");
        if (this.activityResultRegistry.a(i10, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", permissions).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", grantResults))) {
            return;
        }
        super.onRequestPermissionsResult(i10, permissions, grantResults);
    }

    @p293xa.d
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        d dVar;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        b0 b0Var = this._viewModelStore;
        if (b0Var == null && (dVar = (d) getLastNonConfigurationInstance()) != null) {
            b0Var = dVar.f8173b;
        }
        if (b0Var == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        d dVar2 = new d();
        dVar2.f8172a = objOnRetainCustomNonConfigurationInstance;
        dVar2.f8173b = b0Var;
        return dVar2;
    }

    @Override // androidx.core.app.k, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.i.e(outState, "outState");
        if (getLifecycle() instanceof C1378v) {
            Lifecycle lifecycle = getLifecycle();
            kotlin.jvm.internal.i.c(lifecycle, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            ((C1378v) lifecycle).h(Lifecycle.State.f17751d);
        }
        super.onSaveInstanceState(outState);
        this.savedStateRegistryController.c(outState);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        Iterator<A0.a<Integer>> it = this.onTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().a(Integer.valueOf(i10));
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public Context peekAvailableContext() {
        return this.contextAwareHelper.f34706b;
    }

    public final <I, O> p063f.c<I> registerForActivityResult(p076g.a<I, O> contract, androidx.activity.result.a registry, p063f.b<O> callback) {
        kotlin.jvm.internal.i.e(contract, "contract");
        kotlin.jvm.internal.i.e(registry, "registry");
        kotlin.jvm.internal.i.e(callback, "callback");
        return registry.c("activity_rq#" + this.nextLocalRequestCode.getAndIncrement(), this, contract, callback);
    }

    @Override // androidx.core.view.InterfaceC1299n
    public void removeMenuProvider(InterfaceC1303s provider) {
        kotlin.jvm.internal.i.e(provider, "provider");
        this.menuHostHelper.c(provider);
    }

    @Override // p186p0.c
    public final void removeOnConfigurationChangedListener(A0.a<Configuration> listener) {
        kotlin.jvm.internal.i.e(listener, "listener");
        this.onConfigurationChangedListeners.remove(listener);
    }

    public final void removeOnContextAvailableListener(p051e.b listener) {
        kotlin.jvm.internal.i.e(listener, "listener");
        p051e.a aVar = this.contextAwareHelper;
        aVar.getClass();
        aVar.f34705a.remove(listener);
    }

    @Override // androidx.core.app.D
    public final void removeOnMultiWindowModeChangedListener(A0.a<androidx.core.app.m> listener) {
        kotlin.jvm.internal.i.e(listener, "listener");
        this.onMultiWindowModeChangedListeners.remove(listener);
    }

    public final void removeOnNewIntentListener(A0.a<Intent> listener) {
        kotlin.jvm.internal.i.e(listener, "listener");
        this.onNewIntentListeners.remove(listener);
    }

    @Override // androidx.core.app.E
    public final void removeOnPictureInPictureModeChangedListener(A0.a<G> listener) {
        kotlin.jvm.internal.i.e(listener, "listener");
        this.onPictureInPictureModeChangedListeners.remove(listener);
    }

    @Override // p186p0.d
    public final void removeOnTrimMemoryListener(A0.a<Integer> listener) {
        kotlin.jvm.internal.i.e(listener, "listener");
        this.onTrimMemoryListeners.remove(listener);
    }

    public final void removeOnUserLeaveHintListener(Runnable listener) {
        kotlin.jvm.internal.i.e(listener, "listener");
        this.onUserLeaveHintListeners.remove(listener);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (C2.b.a()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            getFullyDrawnReporter().a();
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i10) {
        initializeViewTreeOwners();
        e eVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.i.d(decorView, "window.decorView");
        eVar.o0(decorView);
        super.setContentView(i10);
    }

    @Override // android.app.Activity
    @p293xa.d
    public void startActivityForResult(Intent intent, int i10) {
        kotlin.jvm.internal.i.e(intent, "intent");
        super.startActivityForResult(intent, i10);
    }

    @Override // android.app.Activity
    @p293xa.d
    public void startIntentSenderForResult(IntentSender intent, int i10, Intent intent2, int i11, int i12, int i13) throws IntentSender.SendIntentException {
        kotlin.jvm.internal.i.e(intent, "intent");
        super.startIntentSenderForResult(intent, i10, intent2, i11, i12, i13);
    }

    @Override // android.app.Activity
    @p293xa.d
    public void startActivityForResult(Intent intent, int i10, Bundle bundle) {
        kotlin.jvm.internal.i.e(intent, "intent");
        super.startActivityForResult(intent, i10, bundle);
    }

    @Override // android.app.Activity
    @p293xa.d
    public void startIntentSenderForResult(IntentSender intent, int i10, Intent intent2, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        kotlin.jvm.internal.i.e(intent, "intent");
        super.startIntentSenderForResult(intent, i10, intent2, i11, i12, i13, bundle);
    }

    public final <I, O> p063f.c<I> registerForActivityResult(p076g.a<I, O> contract, p063f.b<O> callback) {
        kotlin.jvm.internal.i.e(contract, "contract");
        kotlin.jvm.internal.i.e(callback, "callback");
        return registerForActivityResult(contract, this.activityResultRegistry, callback);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z10, Configuration newConfig) {
        kotlin.jvm.internal.i.e(newConfig, "newConfig");
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z10, newConfig);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<A0.a<androidx.core.app.m>> it = this.onMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().a(new androidx.core.app.m(z10));
            }
        } catch (Throwable th) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z10, Configuration newConfig) {
        kotlin.jvm.internal.i.e(newConfig, "newConfig");
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z10, newConfig);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<A0.a<G>> it = this.onPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().a(new G(z10));
            }
        } catch (Throwable th) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        e eVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.i.d(decorView, "window.decorView");
        eVar.o0(decorView);
        super.setContentView(view);
    }

    public void addMenuProvider(InterfaceC1303s provider, InterfaceC1376t owner) {
        kotlin.jvm.internal.i.e(provider, "provider");
        kotlin.jvm.internal.i.e(owner, "owner");
        this.menuHostHelper.a(provider, owner);
    }

    public void addMenuProvider(InterfaceC1303s provider, InterfaceC1376t owner, Lifecycle.State state) {
        kotlin.jvm.internal.i.e(provider, "provider");
        kotlin.jvm.internal.i.e(owner, "owner");
        kotlin.jvm.internal.i.e(state, "state");
        this.menuHostHelper.b(provider, owner, state);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        e eVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.i.d(decorView, "window.decorView");
        eVar.o0(decorView);
        super.setContentView(view, layoutParams);
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }

    private static /* synthetic */ void getSavedStateRegistryController$annotations() {
    }

    public ComponentActivity(int i10) {
        this();
        this.contentLayoutId = i10;
    }
}
