package androidx.fragment.app;

import android.animation.Animator;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.collection.Y;
import androidx.compose.foundation.C0936h;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.fragment.app.strictmode.GetRetainInstanceUsageViolation;
import androidx.fragment.app.strictmode.GetTargetFragmentRequestCodeUsageViolation;
import androidx.fragment.app.strictmode.GetTargetFragmentUsageViolation;
import androidx.fragment.app.strictmode.SetRetainInstanceUsageViolation;
import androidx.fragment.app.strictmode.SetTargetFragmentUsageViolation;
import androidx.fragment.app.strictmode.SetUserVisibleHintViolation;
import androidx.lifecycle.AbstractC1382z;
import androidx.lifecycle.C1378v;
import androidx.lifecycle.InterfaceC1369l;
import androidx.lifecycle.InterfaceC1376t;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC1376t, c0, InterfaceC1369l, p248u2.e {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    k mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;
    y mChildFragmentManager;
    ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    a0.c mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    y mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    AbstractC1352q<?> mHost;
    boolean mInDynamicContainer;
    boolean mInLayout;
    boolean mIsCreated;
    private Boolean mIsPrimaryNavigationFragment;
    LayoutInflater mLayoutInflater;
    C1378v mLifecycleRegistry;
    Lifecycle.State mMaxState;
    boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList<l> mOnPreAttachedListeners;
    Fragment mParentFragment;
    boolean mPerformedCreateView;
    Runnable mPostponedDurationRunnable;
    Handler mPostponedHandler;
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    private final l mSavedStateAttachListener;
    p248u2.d mSavedStateRegistryController;
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    int mState;
    String mTag;
    Fragment mTarget;
    int mTargetRequestCode;
    String mTargetWho;
    boolean mTransitioning;
    boolean mUserVisibleHint;
    View mView;
    Q mViewLifecycleOwner;
    androidx.lifecycle.C<InterfaceC1376t> mViewLifecycleOwnerLiveData;
    String mWho;

    public static class InstantiationException extends RuntimeException {
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    public class a<I> extends p063f.c<I> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AtomicReference f17435a;

        public a(AtomicReference atomicReference) {
            this.f17435a = atomicReference;
        }

        @Override // p063f.c
        public final void a(Object obj) {
            p063f.c cVar = (p063f.c) this.f17435a.get();
            if (cVar == null) {
                throw new IllegalStateException("Operation cannot be started before fragment is in created state");
            }
            cVar.a(obj);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Fragment.this.startPostponedEnterTransition();
        }
    }

    public class c extends l {
        public c() {
        }

        @Override // androidx.fragment.app.Fragment.l
        public final void a() {
            Fragment fragment = Fragment.this;
            fragment.mSavedStateRegistryController.a();
            androidx.lifecycle.N.b(fragment);
            Bundle bundle = fragment.mSavedFragmentState;
            fragment.mSavedStateRegistryController.b(bundle != null ? bundle.getBundle("registryState") : null);
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Fragment.this.callStartTransitionListener(false);
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SpecialEffectsController f17439b;

        public e(SpecialEffectsController specialEffectsController) {
            this.f17439b = specialEffectsController;
        }

        @Override // java.lang.Runnable
        public final void run() {
            SpecialEffectsController specialEffectsController = this.f17439b;
            if (specialEffectsController.f17535b.isEmpty()) {
                return;
            }
            specialEffectsController.e();
        }
    }

    public class f extends AbstractC1349n {
        public f() {
        }

        @Override // androidx.fragment.app.AbstractC1349n
        public final View b(int i10) {
            Fragment fragment = Fragment.this;
            View view = fragment.mView;
            if (view != null) {
                return view.findViewById(i10);
            }
            throw new IllegalStateException("Fragment " + fragment + " does not have a view");
        }

        @Override // androidx.fragment.app.AbstractC1349n
        public final boolean c() {
            return Fragment.this.mView != null;
        }
    }

    public class g implements androidx.lifecycle.r {
        public g() {
        }

        @Override // androidx.lifecycle.r
        public final void h(InterfaceC1376t interfaceC1376t, Lifecycle.Event event) {
            View view;
            if (event != Lifecycle.Event.ON_STOP || (view = Fragment.this.mView) == null) {
                return;
            }
            view.cancelPendingInputEvents();
        }
    }

    public class h implements p185p.a<Void, androidx.activity.result.a> {
        public h() {
        }

        @Override // p185p.a
        public final Object a() {
            Fragment fragment = Fragment.this;
            Object obj = fragment.mHost;
            return obj instanceof p063f.g ? ((p063f.g) obj).getActivityResultRegistry() : fragment.requireActivity().getActivityResultRegistry();
        }
    }

    public class i implements p185p.a<Void, androidx.activity.result.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.activity.result.a f17443a;

        public i(androidx.activity.result.a aVar) {
            this.f17443a = aVar;
        }

        @Override // p185p.a
        public final Object a() {
            return this.f17443a;
        }
    }

    public class j extends l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p185p.a f17444a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AtomicReference f17445b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p076g.a f17446c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p063f.b f17447d;

        public j(p185p.a aVar, AtomicReference atomicReference, p076g.a aVar2, p063f.b bVar) {
            this.f17444a = aVar;
            this.f17445b = atomicReference;
            this.f17446c = aVar2;
            this.f17447d = bVar;
        }

        @Override // androidx.fragment.app.Fragment.l
        public final void a() {
            Fragment fragment = Fragment.this;
            this.f17445b.set(((androidx.activity.result.a) this.f17444a.a()).c(fragment.generateActivityResultKey(), fragment, this.f17446c, this.f17447d));
        }
    }

    public static class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f17449a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f17450b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f17451c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f17452d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f17453e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f17454f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ArrayList<String> f17455g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public ArrayList<String> f17456h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Object f17457i;
        public Object j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f17458k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Object f17459l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Object f17460m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Object f17461n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Boolean f17462o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Boolean f17463p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public androidx.core.app.I f17464q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public androidx.core.app.I f17465r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public float f17466s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public View f17467t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public boolean f17468u;
    }

    public static abstract class l {
        public abstract void a();
    }

    public static class m implements Parcelable {
        public static final Parcelable.Creator<m> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Bundle f17469b;

        public class a implements Parcelable.ClassLoaderCreator<m> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new m(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new m[i10];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final m createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new m(parcel, classLoader);
            }
        }

        public m(Parcel parcel, ClassLoader classLoader) {
            Bundle bundle = parcel.readBundle();
            this.f17469b = bundle;
            if (classLoader == null || bundle == null) {
                return;
            }
            bundle.setClassLoader(classLoader);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeBundle(this.f17469b);
        }
    }

    public Fragment() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new z();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new b();
        this.mMaxState = Lifecycle.State.f17753f;
        this.mViewLifecycleOwnerLiveData = new androidx.lifecycle.C<>();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList<>();
        this.mSavedStateAttachListener = new c();
        initLifecycle();
    }

    private k ensureAnimationInfo() {
        if (this.mAnimationInfo == null) {
            k kVar = new k();
            kVar.f17457i = null;
            Object obj = USE_DEFAULT_TRANSITION;
            kVar.j = obj;
            kVar.f17458k = null;
            kVar.f17459l = obj;
            kVar.f17460m = null;
            kVar.f17461n = obj;
            kVar.f17464q = null;
            kVar.f17465r = null;
            kVar.f17466s = 1.0f;
            kVar.f17467t = null;
            this.mAnimationInfo = kVar;
        }
        return this.mAnimationInfo;
    }

    private int getMinimumMaxLifecycleState() {
        Lifecycle.State state = this.mMaxState;
        return (state == Lifecycle.State.f17750c || this.mParentFragment == null) ? state.ordinal() : Math.min(state.ordinal(), this.mParentFragment.getMinimumMaxLifecycleState());
    }

    private void initLifecycle() {
        this.mLifecycleRegistry = new C1378v(this);
        this.mSavedStateRegistryController = new p248u2.d(new p273w2.b(this, new io.intercom.android.sdk.ui.preview.ui.c(this, 1)));
        this.mDefaultFactory = null;
        if (this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            return;
        }
        registerOnPreAttachListener(this.mSavedStateAttachListener);
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$performCreateView$0() {
        Q q10 = this.mViewLifecycleOwner;
        q10.f17531g.b(this.mSavedViewRegistryState);
        this.mSavedViewRegistryState = null;
    }

    private <I, O> p063f.c<I> prepareCallInternal(p076g.a<I, O> aVar, p185p.a<Void, androidx.activity.result.a> aVar2, p063f.b<O> bVar) {
        if (this.mState > 1) {
            throw new IllegalStateException(C0936h.c("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
        }
        AtomicReference atomicReference = new AtomicReference();
        registerOnPreAttachListener(new j(aVar2, atomicReference, aVar, bVar));
        return new a(atomicReference);
    }

    private void registerOnPreAttachListener(l lVar) {
        if (this.mState >= 0) {
            lVar.a();
        } else {
            this.mOnPreAttachedListeners.add(lVar);
        }
    }

    private void restoreViewState() {
        if (Log.isLoggable("FragmentManager", 3)) {
            toString();
        }
        if (this.mView != null) {
            Bundle bundle = this.mSavedFragmentState;
            restoreViewState(bundle != null ? bundle.getBundle("savedInstanceState") : null);
        }
        this.mSavedFragmentState = null;
    }

    public void callStartTransitionListener(boolean z10) {
        ViewGroup viewGroup;
        y yVar;
        k kVar = this.mAnimationInfo;
        if (kVar != null) {
            kVar.f17468u = false;
        }
        if (this.mView == null || (viewGroup = this.mContainer) == null || (yVar = this.mFragmentManager) == null) {
            return;
        }
        SpecialEffectsController specialEffectsControllerI = SpecialEffectsController.i(viewGroup, yVar);
        specialEffectsControllerI.k();
        if (z10) {
            this.mHost.f17633d.post(new e(specialEffectsControllerI));
        } else {
            specialEffectsControllerI.e();
        }
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
            this.mPostponedHandler = null;
        }
    }

    public AbstractC1349n createFragmentContainer() {
        return new f();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        Fragment targetFragment = getTargetFragment(false);
        if (targetFragment != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(targetFragment);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            p053e1.a.a(this).b(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        this.mChildFragmentManager.v(androidx.compose.ui.text.font.s.b(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public Activity e() {
        return getActivity();
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public Fragment findFragmentByWho(String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.f17676c.c(str);
    }

    public String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    public final ActivityC1347l getActivity() {
        AbstractC1352q<?> abstractC1352q = this.mHost;
        if (abstractC1352q == null) {
            return null;
        }
        return abstractC1352q.f17631b;
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        k kVar = this.mAnimationInfo;
        if (kVar == null || (bool = kVar.f17463p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        k kVar = this.mAnimationInfo;
        if (kVar == null || (bool = kVar.f17462o) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public View getAnimatingAway() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        kVar.getClass();
        return null;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final y getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException(C0936h.c("Fragment ", this, " has not been attached yet."));
    }

    public Context getContext() {
        AbstractC1352q<?> abstractC1352q = this.mHost;
        if (abstractC1352q == null) {
            return null;
        }
        return abstractC1352q.f17632c;
    }

    @Override // androidx.lifecycle.InterfaceC1369l
    public p014b1.a getDefaultViewModelCreationExtras() {
        Object obj;
        Application application;
        Context applicationContext = requireContext().getApplicationContext();
        while (true) {
            obj = null;
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && Log.isLoggable("FragmentManager", 3)) {
            Objects.toString(requireContext().getApplicationContext());
        }
        p014b1.d dVar = new p014b1.d(obj);
        LinkedHashMap linkedHashMap = dVar.f20497a;
        if (application != null) {
            linkedHashMap.put(a0.a.f17798d, application);
        }
        linkedHashMap.put(androidx.lifecycle.N.f17760a, this);
        linkedHashMap.put(androidx.lifecycle.N.f17761b, this);
        if (getArguments() != null) {
            linkedHashMap.put(androidx.lifecycle.N.f17762c, getArguments());
        }
        return dVar;
    }

    @Override // androidx.lifecycle.InterfaceC1369l
    public a0.c getDefaultViewModelProviderFactory() {
        Application application;
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.mDefaultFactory == null) {
            Context applicationContext = requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && Log.isLoggable("FragmentManager", 3)) {
                Objects.toString(requireContext().getApplicationContext());
            }
            this.mDefaultFactory = new androidx.lifecycle.S(application, this, getArguments());
        }
        return this.mDefaultFactory;
    }

    public int getEnterAnim() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.f17450b;
    }

    public Object getEnterTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f17457i;
    }

    public androidx.core.app.I getEnterTransitionCallback() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f17464q;
    }

    public int getExitAnim() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.f17451c;
    }

    public Object getExitTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f17458k;
    }

    public androidx.core.app.I getExitTransitionCallback() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f17465r;
    }

    public View getFocusedView() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f17467t;
    }

    @Deprecated
    public final y getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        AbstractC1352q<?> abstractC1352q = this.mHost;
        if (abstractC1352q == null) {
            return null;
        }
        return abstractC1352q.e();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    @Override // androidx.lifecycle.InterfaceC1376t
    public Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Deprecated
    public p053e1.a getLoaderManager() {
        return p053e1.a.a(this);
    }

    public int getNextTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.f17454f;
    }

    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    public final y getParentFragmentManager() {
        y yVar = this.mFragmentManager;
        if (yVar != null) {
            return yVar;
        }
        throw new IllegalStateException(C0936h.c("Fragment ", this, " not associated with a fragment manager."));
    }

    public boolean getPopDirection() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return false;
        }
        return kVar.f17449a;
    }

    public int getPopEnterAnim() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.f17452d;
    }

    public int getPopExitAnim() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.f17453e;
    }

    public float getPostOnViewCreatedAlpha() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 1.0f;
        }
        return kVar.f17466s;
    }

    public Object getReenterTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        Object obj = kVar.f17459l;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        FragmentStrictMode.a aVar = FragmentStrictMode.f17641a;
        FragmentStrictMode.b(new GetRetainInstanceUsageViolation(this, "Attempting to get retain instance for fragment " + this));
        FragmentStrictMode.a(this).f17651a.contains(FragmentStrictMode.Flag.f17645e);
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        Object obj = kVar.j;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @Override // p248u2.e
    public final p248u2.c getSavedStateRegistry() {
        return this.mSavedStateRegistryController.f47417b;
    }

    public Object getSharedElementEnterTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f17460m;
    }

    public Object getSharedElementReturnTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        Object obj = kVar.f17461n;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    public ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        k kVar = this.mAnimationInfo;
        return (kVar == null || (arrayList = kVar.f17455g) == null) ? new ArrayList<>() : arrayList;
    }

    public ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        k kVar = this.mAnimationInfo;
        return (kVar == null || (arrayList = kVar.f17456h) == null) ? new ArrayList<>() : arrayList;
    }

    public final String getString(int i10) {
        return getResources().getString(i10);
    }

    public final String getTag() {
        return this.mTag;
    }

    @Deprecated
    public final Fragment getTargetFragment() {
        return getTargetFragment(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        FragmentStrictMode.a aVar = FragmentStrictMode.f17641a;
        FragmentStrictMode.b(new GetTargetFragmentRequestCodeUsageViolation(this, "Attempting to get target request code from fragment " + this));
        FragmentStrictMode.a(this).f17651a.contains(FragmentStrictMode.Flag.f17647g);
        return this.mTargetRequestCode;
    }

    public final CharSequence getText(int i10) {
        return getResources().getText(i10);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public InterfaceC1376t getViewLifecycleOwner() {
        Q q10 = this.mViewLifecycleOwner;
        if (q10 != null) {
            return q10;
        }
        throw new IllegalStateException(C0936h.c("Can't access the Fragment View's LifecycleOwner for ", this, " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
    }

    public AbstractC1382z<InterfaceC1376t> getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // androidx.lifecycle.c0
    public b0 getViewModelStore() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        int minimumMaxLifecycleState = getMinimumMaxLifecycleState();
        Lifecycle.State state = Lifecycle.State.f17749b;
        if (minimumMaxLifecycleState == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap<String, b0> map = this.mFragmentManager.f17672P.f17382c;
        b0 b0Var = map.get(this.mWho);
        if (b0Var != null) {
            return b0Var;
        }
        b0 b0Var2 = new b0();
        map.put(this.mWho, b0Var2);
        return b0Var2;
    }

    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void initState() {
        initLifecycle();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new z();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        if (!this.mHidden) {
            y yVar = this.mFragmentManager;
            if (yVar == null) {
                return false;
            }
            Fragment fragment = this.mParentFragment;
            yVar.getClass();
            if (!(fragment == null ? false : fragment.isHidden())) {
                return false;
            }
        }
        return true;
    }

    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        if (this.mMenuVisible) {
            if (this.mFragmentManager == null) {
                return true;
            }
            Fragment fragment = this.mParentFragment;
            if (fragment == null ? true : fragment.isMenuVisible()) {
                return true;
            }
        }
        return false;
    }

    public boolean isPostponed() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return false;
        }
        return kVar.f17468u;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        y yVar = this.mFragmentManager;
        if (yVar == null) {
            return false;
        }
        return yVar.f17665I || yVar.f17666J;
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.Q();
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (Log.isLoggable("FragmentManager", 2)) {
            toString();
            Objects.toString(intent);
        }
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        AbstractC1352q<?> abstractC1352q = this.mHost;
        ActivityC1347l activityC1347l = abstractC1352q == null ? null : abstractC1352q.f17631b;
        if (activityC1347l != null) {
            this.mCalled = false;
            onAttach((Activity) activityC1347l);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState();
        y yVar = this.mChildFragmentManager;
        if (yVar.f17695w >= 1) {
            return;
        }
        yVar.f17665I = false;
        yVar.f17666J = false;
        yVar.f17672P.f17385f = false;
        yVar.u(1);
    }

    public Animation onCreateAnimation(int i10, boolean z10, int i11) {
        return null;
    }

    public Animator onCreateAnimator(int i10, boolean z10, int i11) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10 = this.mContentLayoutId;
        if (i10 != 0) {
            return layoutInflater.inflate(i10, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        AbstractC1352q<?> abstractC1352q = this.mHost;
        ActivityC1347l activityC1347l = abstractC1352q == null ? null : abstractC1352q.f17631b;
        if (activityC1347l != null) {
            this.mCalled = false;
            onInflate((Activity) activityC1347l, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.mCalled = true;
    }

    @Deprecated
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.Q();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (!this.mCalled) {
            throw new SuperNotCalledException(C0936h.c("Fragment ", this, " did not call through to super.onActivityCreated()"));
        }
        restoreViewState();
        y yVar = this.mChildFragmentManager;
        yVar.f17665I = false;
        yVar.f17666J = false;
        yVar.f17672P.f17385f = false;
        yVar.u(4);
    }

    public void performAttach() {
        Iterator<l> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.b(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach((Context) this.mHost.f17632c);
        if (!this.mCalled) {
            throw new SuperNotCalledException(C0936h.c("Fragment ", this, " did not call through to super.onAttach()"));
        }
        Iterator<C> it2 = this.mFragmentManager.f17689q.iterator();
        while (it2.hasNext()) {
            it2.next().a(this);
        }
        y yVar = this.mChildFragmentManager;
        yVar.f17665I = false;
        yVar.f17666J = false;
        yVar.f17672P.f17385f = false;
        yVar.u(0);
    }

    public void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    public boolean performContextItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.j(menuItem);
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.Q();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.a(new g());
        onCreate(bundle);
        this.mIsCreated = true;
        if (!this.mCalled) {
            throw new SuperNotCalledException(C0936h.c("Fragment ", this, " did not call through to super.onCreate()"));
        }
        this.mLifecycleRegistry.f(Lifecycle.Event.ON_CREATE);
    }

    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z10 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z10 = true;
        }
        return z10 | this.mChildFragmentManager.k(menu, menuInflater);
    }

    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.Q();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new Q(this, getViewModelStore(), new T5.h(2, this));
        View viewOnCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = viewOnCreateView;
        if (viewOnCreateView == null) {
            if (this.mViewLifecycleOwner.f17530f != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.mViewLifecycleOwner = null;
            return;
        }
        this.mViewLifecycleOwner.b();
        if (Log.isLoggable("FragmentManager", 3)) {
            Objects.toString(this.mView);
            toString();
        }
        P3.d.u(this.mView, this.mViewLifecycleOwner);
        kotlin.jvm.internal.h.h(this.mView, this.mViewLifecycleOwner);
        I2.e.p(this.mView, this.mViewLifecycleOwner);
        this.mViewLifecycleOwnerLiveData.j(this.mViewLifecycleOwner);
    }

    public void performDestroy() {
        this.mChildFragmentManager.l();
        this.mLifecycleRegistry.f(Lifecycle.Event.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (!this.mCalled) {
            throw new SuperNotCalledException(C0936h.c("Fragment ", this, " did not call through to super.onDestroy()"));
        }
    }

    public void performDestroyView() {
        this.mChildFragmentManager.u(1);
        if (this.mView != null) {
            Q q10 = this.mViewLifecycleOwner;
            q10.b();
            if (q10.f17530f.f17828d.compareTo(Lifecycle.State.f17751d) >= 0) {
                this.mViewLifecycleOwner.a(Lifecycle.Event.ON_DESTROY);
            }
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (!this.mCalled) {
            throw new SuperNotCalledException(C0936h.c("Fragment ", this, " did not call through to super.onDestroyView()"));
        }
        Y<e1.b.a> y10 = p053e1.a.a(this).f34711b.f34713a;
        int iF = y10.f();
        for (int i10 = 0; i10 < iF; i10++) {
            y10.g(i10).getClass();
        }
        this.mPerformedCreateView = false;
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (!this.mCalled) {
            throw new SuperNotCalledException(C0936h.c("Fragment ", this, " did not call through to super.onDetach()"));
        }
        y yVar = this.mChildFragmentManager;
        if (yVar.f17667K) {
            return;
        }
        yVar.l();
        this.mChildFragmentManager = new z();
    }

    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = layoutInflaterOnGetLayoutInflater;
        return layoutInflaterOnGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
    }

    public void performMultiWindowModeChanged(boolean z10) {
        onMultiWindowModeChanged(z10);
    }

    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.p(menuItem);
    }

    public void performOptionsMenuClosed(Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.q(menu);
    }

    public void performPause() {
        this.mChildFragmentManager.u(5);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(Lifecycle.Event.ON_PAUSE);
        }
        this.mLifecycleRegistry.f(Lifecycle.Event.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            throw new SuperNotCalledException(C0936h.c("Fragment ", this, " did not call through to super.onPause()"));
        }
    }

    public void performPictureInPictureModeChanged(boolean z10) {
        onPictureInPictureModeChanged(z10);
    }

    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean z10 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z10 = true;
        }
        return z10 | this.mChildFragmentManager.t(menu);
    }

    public void performPrimaryNavigationFragmentChanged() {
        this.mFragmentManager.getClass();
        boolean zO = y.O(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != zO) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(zO);
            onPrimaryNavigationFragmentChanged(zO);
            y yVar = this.mChildFragmentManager;
            yVar.g0();
            yVar.r(yVar.f17657A);
        }
    }

    public void performResume() {
        this.mChildFragmentManager.Q();
        this.mChildFragmentManager.z(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (!this.mCalled) {
            throw new SuperNotCalledException(C0936h.c("Fragment ", this, " did not call through to super.onResume()"));
        }
        C1378v c1378v = this.mLifecycleRegistry;
        Lifecycle.Event event = Lifecycle.Event.ON_RESUME;
        c1378v.f(event);
        if (this.mView != null) {
            this.mViewLifecycleOwner.f17530f.f(event);
        }
        y yVar = this.mChildFragmentManager;
        yVar.f17665I = false;
        yVar.f17666J = false;
        yVar.f17672P.f17385f = false;
        yVar.u(7);
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
    }

    public void performStart() {
        this.mChildFragmentManager.Q();
        this.mChildFragmentManager.z(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (!this.mCalled) {
            throw new SuperNotCalledException(C0936h.c("Fragment ", this, " did not call through to super.onStart()"));
        }
        C1378v c1378v = this.mLifecycleRegistry;
        Lifecycle.Event event = Lifecycle.Event.ON_START;
        c1378v.f(event);
        if (this.mView != null) {
            this.mViewLifecycleOwner.f17530f.f(event);
        }
        y yVar = this.mChildFragmentManager;
        yVar.f17665I = false;
        yVar.f17666J = false;
        yVar.f17672P.f17385f = false;
        yVar.u(5);
    }

    public void performStop() {
        y yVar = this.mChildFragmentManager;
        yVar.f17666J = true;
        yVar.f17672P.f17385f = true;
        yVar.u(4);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(Lifecycle.Event.ON_STOP);
        }
        this.mLifecycleRegistry.f(Lifecycle.Event.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            throw new SuperNotCalledException(C0936h.c("Fragment ", this, " did not call through to super.onStop()"));
        }
    }

    public void performViewCreated() {
        Bundle bundle = this.mSavedFragmentState;
        onViewCreated(this.mView, bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.mChildFragmentManager.u(2);
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().f17468u = true;
    }

    public final <I, O> p063f.c<I> registerForActivityResult(p076g.a<I, O> aVar, p063f.b<O> bVar) {
        return prepareCallInternal(aVar, new h(), bVar);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(String[] permissions, int i10) throws Exception {
        if (this.mHost == null) {
            throw new IllegalStateException(C0936h.c("Fragment ", this, " not attached to Activity"));
        }
        y parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.f17662F == null) {
            parentFragmentManager.f17696x.getClass();
            kotlin.jvm.internal.i.e(permissions, "permissions");
        } else {
            parentFragmentManager.f17663G.addLast(new y.n(this.mWho, i10));
            parentFragmentManager.f17662F.a(permissions);
        }
    }

    public final ActivityC1347l requireActivity() {
        ActivityC1347l activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException(C0936h.c("Fragment ", this, " not attached to an activity."));
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException(C0936h.c("Fragment ", this, " does not have any arguments."));
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException(C0936h.c("Fragment ", this, " not attached to a context."));
    }

    @Deprecated
    public final y requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException(C0936h.c("Fragment ", this, " not attached to a host."));
    }

    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new IllegalStateException(C0936h.c("Fragment ", this, " is not attached to any Fragment or host"));
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(C0936h.c("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public void restoreChildFragmentState() {
        Bundle bundle;
        Bundle bundle2 = this.mSavedFragmentState;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.mChildFragmentManager.X(bundle);
        y yVar = this.mChildFragmentManager;
        yVar.f17665I = false;
        yVar.f17666J = false;
        yVar.f17672P.f17385f = false;
        yVar.u(1);
    }

    public void setAllowEnterTransitionOverlap(boolean z10) {
        ensureAnimationInfo().f17463p = Boolean.valueOf(z10);
    }

    public void setAllowReturnTransitionOverlap(boolean z10) {
        ensureAnimationInfo().f17462o = Boolean.valueOf(z10);
    }

    public void setAnimations(int i10, int i11, int i12, int i13) {
        if (this.mAnimationInfo == null && i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return;
        }
        ensureAnimationInfo().f17450b = i10;
        ensureAnimationInfo().f17451c = i11;
        ensureAnimationInfo().f17452d = i12;
        ensureAnimationInfo().f17453e = i13;
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public void setEnterSharedElementCallback(androidx.core.app.I i10) {
        ensureAnimationInfo().f17464q = i10;
    }

    public void setEnterTransition(Object obj) {
        ensureAnimationInfo().f17457i = obj;
    }

    public void setExitSharedElementCallback(androidx.core.app.I i10) {
        ensureAnimationInfo().f17465r = i10;
    }

    public void setExitTransition(Object obj) {
        ensureAnimationInfo().f17458k = obj;
    }

    public void setFocusedView(View view) {
        ensureAnimationInfo().f17467t = view;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z10) {
        if (this.mHasMenu != z10) {
            this.mHasMenu = z10;
            if (!isAdded() || isHidden()) {
                return;
            }
            this.mHost.h();
        }
    }

    public void setInitialSavedState(m mVar) {
        Bundle bundle;
        if (this.mFragmentManager != null) {
            throw new IllegalStateException("Fragment already added");
        }
        if (mVar == null || (bundle = mVar.f17469b) == null) {
            bundle = null;
        }
        this.mSavedFragmentState = bundle;
    }

    public void setMenuVisibility(boolean z10) {
        if (this.mMenuVisible != z10) {
            this.mMenuVisible = z10;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.h();
            }
        }
    }

    public void setNextTransition(int i10) {
        if (this.mAnimationInfo == null && i10 == 0) {
            return;
        }
        ensureAnimationInfo();
        this.mAnimationInfo.f17454f = i10;
    }

    public void setPopDirection(boolean z10) {
        if (this.mAnimationInfo == null) {
            return;
        }
        ensureAnimationInfo().f17449a = z10;
    }

    public void setPostOnViewCreatedAlpha(float f10) {
        ensureAnimationInfo().f17466s = f10;
    }

    public void setReenterTransition(Object obj) {
        ensureAnimationInfo().f17459l = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z10) {
        FragmentStrictMode.a aVar = FragmentStrictMode.f17641a;
        FragmentStrictMode.b(new SetRetainInstanceUsageViolation(this, "Attempting to set retain instance for fragment " + this));
        FragmentStrictMode.a(this).f17651a.contains(FragmentStrictMode.Flag.f17645e);
        this.mRetainInstance = z10;
        y yVar = this.mFragmentManager;
        if (yVar == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z10) {
            yVar.f17672P.b(this);
        } else {
            yVar.f17672P.e(this);
        }
    }

    public void setReturnTransition(Object obj) {
        ensureAnimationInfo().j = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        ensureAnimationInfo().f17460m = obj;
    }

    public void setSharedElementNames(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        ensureAnimationInfo();
        k kVar = this.mAnimationInfo;
        kVar.f17455g = arrayList;
        kVar.f17456h = arrayList2;
    }

    public void setSharedElementReturnTransition(Object obj) {
        ensureAnimationInfo().f17461n = obj;
    }

    @Deprecated
    public void setTargetFragment(Fragment fragment, int i10) {
        if (fragment != null) {
            FragmentStrictMode.a aVar = FragmentStrictMode.f17641a;
            FragmentStrictMode.b(new SetTargetFragmentUsageViolation(this, fragment, i10));
            FragmentStrictMode.a(this).f17651a.contains(FragmentStrictMode.Flag.f17647g);
        }
        y yVar = this.mFragmentManager;
        y yVar2 = fragment != null ? fragment.mFragmentManager : null;
        if (yVar != null && yVar2 != null && yVar != yVar2) {
            throw new IllegalArgumentException(C0936h.c("Fragment ", fragment, " must share the same FragmentManager to be set as a target fragment"));
        }
        for (Fragment targetFragment = fragment; targetFragment != null; targetFragment = targetFragment.getTargetFragment(false)) {
            if (targetFragment.equals(this)) {
                throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
            }
        }
        if (fragment == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager == null || fragment.mFragmentManager == null) {
            this.mTargetWho = null;
            this.mTarget = fragment;
        } else {
            this.mTargetWho = fragment.mWho;
            this.mTarget = null;
        }
        this.mTargetRequestCode = i10;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z10) {
        FragmentStrictMode.a aVar = FragmentStrictMode.f17641a;
        FragmentStrictMode.b(new SetUserVisibleHintViolation(this, z10));
        FragmentStrictMode.a(this).f17651a.contains(FragmentStrictMode.Flag.f17646f);
        boolean z11 = false;
        if (!this.mUserVisibleHint && z10 && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            y yVar = this.mFragmentManager;
            G g10 = yVar.g(this);
            Fragment fragment = g10.f17476c;
            if (fragment.mDeferStart) {
                if (yVar.f17675b) {
                    yVar.f17668L = true;
                } else {
                    fragment.mDeferStart = false;
                    g10.i();
                }
            }
        }
        this.mUserVisibleHint = z10;
        if (this.mState < 5 && !z10) {
            z11 = true;
        }
        this.mDeferStart = z11;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z10);
        }
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        AbstractC1352q<?> abstractC1352q = this.mHost;
        if (abstractC1352q != null) {
            return abstractC1352q.g(str);
        }
        return false;
    }

    public void startActivity(Intent intent) {
        startActivity(intent, null);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i10) throws Exception {
        startActivityForResult(intent, i10, null);
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intent, int i10, Intent intent2, int i11, int i12, int i13, Bundle bundle) throws Exception {
        Intent intent3;
        if (this.mHost == null) {
            throw new IllegalStateException(C0936h.c("Fragment ", this, " not attached to Activity"));
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            toString();
            Objects.toString(intent);
            Objects.toString(intent2);
            Objects.toString(bundle);
        }
        y parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.f17661E == null) {
            AbstractC1352q<?> abstractC1352q = parentFragmentManager.f17696x;
            abstractC1352q.getClass();
            kotlin.jvm.internal.i.e(intent, "intent");
            if (i10 != -1) {
                throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
            }
            ActivityC1347l activityC1347l = abstractC1352q.f17631b;
            if (activityC1347l == null) {
                throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
            }
            activityC1347l.startIntentSenderForResult(intent, i10, intent2, i11, i12, i13, bundle);
            return;
        }
        if (bundle != null) {
            if (intent2 == null) {
                intent3 = new Intent();
                intent3.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            } else {
                intent3 = intent2;
            }
            if (Log.isLoggable("FragmentManager", 2)) {
                bundle.toString();
                intent3.toString();
                Objects.toString(this);
            }
            intent3.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        } else {
            intent3 = intent2;
        }
        kotlin.jvm.internal.i.e(intent, "intentSender");
        p063f.h hVar = new p063f.h(intent, intent3, i11, i12);
        parentFragmentManager.f17663G.addLast(new y.n(this.mWho, i10));
        if (Log.isLoggable("FragmentManager", 2)) {
            toString();
        }
        parentFragmentManager.f17661E.a(hVar);
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !ensureAnimationInfo().f17468u) {
            return;
        }
        if (this.mHost == null) {
            ensureAnimationInfo().f17468u = false;
        } else if (Looper.myLooper() != this.mHost.f17633d.getLooper()) {
            this.mHost.f17633d.postAtFrontOfQueue(new d());
        } else {
            callStartTransitionListener(true);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} (");
        sb2.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb2.append(" tag=");
            sb2.append(this.mTag);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }

    private Fragment getTargetFragment(boolean z10) {
        String str;
        if (z10) {
            FragmentStrictMode.a aVar = FragmentStrictMode.f17641a;
            FragmentStrictMode.b(new GetTargetFragmentUsageViolation(this, "Attempting to get target fragment from fragment " + this));
            FragmentStrictMode.a(this).f17651a.contains(FragmentStrictMode.Flag.f17647g);
        }
        Fragment fragment = this.mTarget;
        if (fragment != null) {
            return fragment;
        }
        y yVar = this.mFragmentManager;
        if (yVar == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return yVar.f17676c.b(str);
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str, Bundle bundle) {
        try {
            Fragment fragmentNewInstance = C1351p.b(context.getClassLoader(), str).getConstructor(null).newInstance(null);
            if (bundle != null) {
                bundle.setClassLoader(fragmentNewInstance.getClass().getClassLoader());
                fragmentNewInstance.setArguments(bundle);
            }
            return fragmentNewInstance;
        } catch (IllegalAccessException e10) {
            throw new InstantiationException(androidx.compose.foundation.gestures.d.b("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e10);
        } catch (java.lang.InstantiationException e11) {
            throw new InstantiationException(androidx.compose.foundation.gestures.d.b("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e11);
        } catch (NoSuchMethodException e12) {
            throw new InstantiationException(androidx.compose.foundation.gestures.d.b("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e12);
        } catch (InvocationTargetException e13) {
            throw new InstantiationException(androidx.compose.foundation.gestures.d.b("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e13);
        }
    }

    public final String getString(int i10, Object... objArr) {
        return getResources().getString(i10, objArr);
    }

    public final void postponeEnterTransition(long j10, TimeUnit timeUnit) {
        ensureAnimationInfo().f17468u = true;
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
        }
        y yVar = this.mFragmentManager;
        if (yVar != null) {
            this.mPostponedHandler = yVar.f17696x.f17633d;
        } else {
            this.mPostponedHandler = new Handler(Looper.getMainLooper());
        }
        this.mPostponedHandler.removeCallbacks(this.mPostponedDurationRunnable);
        this.mPostponedHandler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j10));
    }

    public final <I, O> p063f.c<I> registerForActivityResult(p076g.a<I, O> aVar, androidx.activity.result.a aVar2, p063f.b<O> bVar) {
        return prepareCallInternal(aVar, new i(aVar2), bVar);
    }

    public void startActivity(Intent intent, Bundle bundle) {
        AbstractC1352q<?> abstractC1352q = this.mHost;
        if (abstractC1352q == null) {
            throw new IllegalStateException(C0936h.c("Fragment ", this, " not attached to Activity"));
        }
        kotlin.jvm.internal.i.e(intent, "intent");
        abstractC1352q.f17632c.startActivity(intent, bundle);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i10, Bundle bundle) throws Exception {
        if (this.mHost == null) {
            throw new IllegalStateException(C0936h.c("Fragment ", this, " not attached to Activity"));
        }
        y parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.f17660D != null) {
            parentFragmentManager.f17663G.addLast(new y.n(this.mWho, i10));
            if (bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            parentFragmentManager.f17660D.a(intent);
            return;
        }
        AbstractC1352q<?> abstractC1352q = parentFragmentManager.f17696x;
        abstractC1352q.getClass();
        kotlin.jvm.internal.i.e(intent, "intent");
        if (i10 != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        abstractC1352q.f17632c.startActivity(intent, bundle);
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        AbstractC1352q<?> abstractC1352q = this.mHost;
        if (abstractC1352q != null) {
            LayoutInflater layoutInflaterF = abstractC1352q.f();
            layoutInflaterF.setFactory2(this.mChildFragmentManager.f17679f);
            return layoutInflaterF;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (this.mCalled) {
            if (this.mView != null) {
                this.mViewLifecycleOwner.a(Lifecycle.Event.ON_CREATE);
                return;
            }
            return;
        }
        throw new SuperNotCalledException(C0936h.c("Fragment ", this, " did not call through to super.onViewStateRestored()"));
    }

    public Fragment(int i10) {
        this();
        this.mContentLayoutId = i10;
    }

    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    public void onHiddenChanged(boolean z10) {
    }

    public void onMultiWindowModeChanged(boolean z10) {
    }

    @Deprecated
    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPictureInPictureModeChanged(boolean z10) {
    }

    @Deprecated
    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z10) {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    @Deprecated
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
    }
}
