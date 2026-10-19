package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.core.app.C1277b;
import androidx.core.view.InterfaceC1299n;
import androidx.core.view.InterfaceC1303s;
import androidx.lifecycle.C1378v;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: renamed from: androidx.fragment.app.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: FragmentActivity.java */
/* JADX INFO: loaded from: classes.dex */
public class ActivityC1347l extends ComponentActivity implements C1277b.e {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    final C1378v mFragmentLifecycleRegistry;
    final C1350o mFragments;
    boolean mResumed;
    boolean mStopped;

    /* JADX INFO: renamed from: androidx.fragment.app.l$a */
    /* JADX INFO: compiled from: FragmentActivity.java */
    public class a extends AbstractC1352q<ActivityC1347l> implements p186p0.c, p186p0.d, androidx.core.app.D, androidx.core.app.E, c0, androidx.activity.C, p063f.g, p248u2.e, C, InterfaceC1299n {
        public a() {
            super(ActivityC1347l.this);
        }

        @Override // androidx.fragment.app.C
        public final void a(Fragment fragment) {
            ActivityC1347l.this.onAttachFragment(fragment);
        }

        @Override // androidx.core.view.InterfaceC1299n
        public final void addMenuProvider(InterfaceC1303s interfaceC1303s) {
            ActivityC1347l.this.addMenuProvider(interfaceC1303s);
        }

        @Override // p186p0.c
        public final void addOnConfigurationChangedListener(A0.a<Configuration> aVar) {
            ActivityC1347l.this.addOnConfigurationChangedListener(aVar);
        }

        @Override // androidx.core.app.D
        public final void addOnMultiWindowModeChangedListener(A0.a<androidx.core.app.m> aVar) {
            ActivityC1347l.this.addOnMultiWindowModeChangedListener(aVar);
        }

        @Override // androidx.core.app.E
        public final void addOnPictureInPictureModeChangedListener(A0.a<androidx.core.app.G> aVar) {
            ActivityC1347l.this.addOnPictureInPictureModeChangedListener(aVar);
        }

        @Override // p186p0.d
        public final void addOnTrimMemoryListener(A0.a<Integer> aVar) {
            ActivityC1347l.this.addOnTrimMemoryListener(aVar);
        }

        @Override // androidx.fragment.app.AbstractC1349n
        public final View b(int i10) {
            return ActivityC1347l.this.findViewById(i10);
        }

        @Override // androidx.fragment.app.AbstractC1349n
        public final boolean c() {
            Window window = ActivityC1347l.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.fragment.app.AbstractC1352q
        public final void d(PrintWriter printWriter, String[] strArr) {
            ActivityC1347l.this.dump("  ", null, printWriter, strArr);
        }

        @Override // androidx.fragment.app.AbstractC1352q
        public final ActivityC1347l e() {
            return ActivityC1347l.this;
        }

        @Override // androidx.fragment.app.AbstractC1352q
        public final LayoutInflater f() {
            ActivityC1347l activityC1347l = ActivityC1347l.this;
            return activityC1347l.getLayoutInflater().cloneInContext(activityC1347l);
        }

        @Override // androidx.fragment.app.AbstractC1352q
        public final boolean g(String str) {
            return C1277b.e(ActivityC1347l.this, str);
        }

        @Override // p063f.g
        public final androidx.activity.result.a getActivityResultRegistry() {
            return ActivityC1347l.this.getActivityResultRegistry();
        }

        @Override // androidx.lifecycle.InterfaceC1376t
        public final Lifecycle getLifecycle() {
            return ActivityC1347l.this.mFragmentLifecycleRegistry;
        }

        @Override // androidx.activity.C
        public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
            return ActivityC1347l.this.getOnBackPressedDispatcher();
        }

        @Override // p248u2.e
        public final p248u2.c getSavedStateRegistry() {
            return ActivityC1347l.this.getSavedStateRegistry();
        }

        @Override // androidx.lifecycle.c0
        public final b0 getViewModelStore() {
            return ActivityC1347l.this.getViewModelStore();
        }

        @Override // androidx.fragment.app.AbstractC1352q
        public final void h() {
            ActivityC1347l.this.invalidateMenu();
        }

        @Override // androidx.core.view.InterfaceC1299n
        public final void removeMenuProvider(InterfaceC1303s interfaceC1303s) {
            ActivityC1347l.this.removeMenuProvider(interfaceC1303s);
        }

        @Override // p186p0.c
        public final void removeOnConfigurationChangedListener(A0.a<Configuration> aVar) {
            ActivityC1347l.this.removeOnConfigurationChangedListener(aVar);
        }

        @Override // androidx.core.app.D
        public final void removeOnMultiWindowModeChangedListener(A0.a<androidx.core.app.m> aVar) {
            ActivityC1347l.this.removeOnMultiWindowModeChangedListener(aVar);
        }

        @Override // androidx.core.app.E
        public final void removeOnPictureInPictureModeChangedListener(A0.a<androidx.core.app.G> aVar) {
            ActivityC1347l.this.removeOnPictureInPictureModeChangedListener(aVar);
        }

        @Override // p186p0.d
        public final void removeOnTrimMemoryListener(A0.a<Integer> aVar) {
            ActivityC1347l.this.removeOnTrimMemoryListener(aVar);
        }
    }

    public ActivityC1347l() {
        this.mFragments = new C1350o(new a());
        this.mFragmentLifecycleRegistry = new C1378v(this);
        this.mStopped = true;
        init();
    }

    private void init() {
        getSavedStateRegistry().c(LIFECYCLE_TAG, new u2.c.b() { // from class: androidx.fragment.app.h
            @Override // u2.c.b
            public final Bundle a() {
                return this.f17617a.lambda$init$0();
            }
        });
        addOnConfigurationChangedListener(new A0.a() { // from class: androidx.fragment.app.i
            @Override // A0.a
            public final void a(Object obj) {
                this.f17618a.lambda$init$1((Configuration) obj);
            }
        });
        addOnNewIntentListener(new A0.a() { // from class: androidx.fragment.app.j
            @Override // A0.a
            public final void a(Object obj) {
                this.f17619a.lambda$init$2((Intent) obj);
            }
        });
        addOnContextAvailableListener(new p051e.b() { // from class: androidx.fragment.app.k
            @Override // p051e.b
            public final void a(ComponentActivity componentActivity) {
                this.f17620a.lambda$init$3(componentActivity);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle lambda$init$0() {
        markFragmentsCreated();
        this.mFragmentLifecycleRegistry.f(Lifecycle.Event.ON_STOP);
        return new Bundle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$1(Configuration configuration) {
        this.mFragments.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$2(Intent intent) {
        this.mFragments.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$init$3(Context context) {
        a aVar = this.mFragments.f17629a;
        aVar.f17634e.b(aVar, aVar, null);
    }

    private static boolean markState(y yVar, Lifecycle.State state) {
        boolean zMarkState = false;
        for (Fragment fragment : yVar.f17676c.f()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    zMarkState |= markState(fragment.getChildFragmentManager(), state);
                }
                Q q10 = fragment.mViewLifecycleOwner;
                if (q10 != null) {
                    q10.b();
                    if (q10.f17530f.f17828d.a(Lifecycle.State.f17752e)) {
                        fragment.mViewLifecycleOwner.f17530f.h(state);
                        zMarkState = true;
                    }
                }
                if (fragment.mLifecycleRegistry.f17828d.a(Lifecycle.State.f17752e)) {
                    fragment.mLifecycleRegistry.h(state);
                    zMarkState = true;
                }
            }
        }
        return zMarkState;
    }

    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.f17629a.f17634e.f17679f.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.mCreated);
            printWriter.print(" mResumed=");
            printWriter.print(this.mResumed);
            printWriter.print(" mStopped=");
            printWriter.print(this.mStopped);
            if (getApplication() != null) {
                p053e1.a.a(this).b(str2, printWriter);
            }
            this.mFragments.f17629a.f17634e.v(str, fileDescriptor, printWriter, strArr);
        }
    }

    public y getSupportFragmentManager() {
        return this.mFragments.f17629a.f17634e;
    }

    @Deprecated
    public p053e1.a getSupportLoaderManager() {
        return p053e1.a.a(this);
    }

    public void markFragmentsCreated() {
        while (markState(getSupportFragmentManager(), Lifecycle.State.f17751d)) {
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        this.mFragments.a();
        super.onActivityResult(i10, i11, intent);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.k, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.f(Lifecycle.Event.ON_CREATE);
        z zVar = this.mFragments.f17629a.f17634e;
        zVar.f17665I = false;
        zVar.f17666J = false;
        zVar.f17672P.f17385f = false;
        zVar.u(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.f17629a.f17634e.l();
        this.mFragmentLifecycleRegistry.f(Lifecycle.Event.ON_DESTROY);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 6) {
            return this.mFragments.f17629a.f17634e.j(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.f17629a.f17634e.u(5);
        this.mFragmentLifecycleRegistry.f(Lifecycle.Event.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        this.mFragments.a();
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.a();
        super.onResume();
        this.mResumed = true;
        this.mFragments.f17629a.f17634e.z(true);
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.f(Lifecycle.Event.ON_RESUME);
        z zVar = this.mFragments.f17629a.f17634e;
        zVar.f17665I = false;
        zVar.f17666J = false;
        zVar.f17672P.f17385f = false;
        zVar.u(7);
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.a();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            z zVar = this.mFragments.f17629a.f17634e;
            zVar.f17665I = false;
            zVar.f17666J = false;
            zVar.f17672P.f17385f = false;
            zVar.u(4);
        }
        this.mFragments.f17629a.f17634e.z(true);
        this.mFragmentLifecycleRegistry.f(Lifecycle.Event.ON_START);
        z zVar2 = this.mFragments.f17629a.f17634e;
        zVar2.f17665I = false;
        zVar2.f17666J = false;
        zVar2.f17672P.f17385f = false;
        zVar2.u(5);
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.a();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        z zVar = this.mFragments.f17629a.f17634e;
        zVar.f17666J = true;
        zVar.f17672P.f17385f = true;
        zVar.u(4);
        this.mFragmentLifecycleRegistry.f(Lifecycle.Event.ON_STOP);
    }

    public void setEnterSharedElementCallback(androidx.core.app.I i10) {
        C1277b.a.c(this, i10 != null ? new C1277b.f(i10) : null);
    }

    public void setExitSharedElementCallback(androidx.core.app.I i10) {
        C1277b.a.d(this, i10 != null ? new C1277b.f(i10) : null);
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i10, Bundle bundle) throws Exception {
        if (i10 == -1) {
            startActivityForResult(intent, -1, bundle);
        } else {
            fragment.startActivityForResult(intent, i10, bundle);
        }
    }

    @Deprecated
    public void startIntentSenderFromFragment(Fragment fragment, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws Exception {
        if (i10 == -1) {
            startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
        } else {
            fragment.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        C1277b.a.a(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateMenu();
    }

    public void supportPostponeEnterTransition() {
        C1277b.a.b(this);
    }

    public void supportStartPostponedEnterTransition() {
        C1277b.a.e(this);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i10) throws Exception {
        startActivityFromFragment(fragment, intent, i10, (Bundle) null);
    }

    public ActivityC1347l(int i10) {
        super(i10);
        this.mFragments = new C1350o(new a());
        this.mFragmentLifecycleRegistry = new C1378v(this);
        this.mStopped = true;
        init();
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    @Override // androidx.core.app.C1277b.e
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i10) {
    }
}
