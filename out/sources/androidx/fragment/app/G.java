package androidx.fragment.app;

import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.foundation.C0936h;
import androidx.core.view.Z;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.fragment.app.strictmode.WrongFragmentContainerViolation;
import androidx.fragment.app.strictmode.WrongNestedHierarchyViolation;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.c0;
import com.voltasit.obdeleven.R;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: FragmentStateManager.java */
/* JADX INFO: loaded from: classes.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1353s f17474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final H f17475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Fragment f17476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f17477d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f17478e = -1;

    public G(C1353s c1353s, H h8, Fragment fragment) {
        this.f17474a = c1353s;
        this.f17475b = h8;
        this.f17476c = fragment;
    }

    public final void a() {
        Fragment fragment;
        View view;
        View view2;
        int iIndexOfChild = -1;
        Fragment fragment2 = this.f17476c;
        View view3 = fragment2.mContainer;
        while (true) {
            fragment = null;
            if (view3 == null) {
                break;
            }
            Object tag = view3.getTag(R.id.fragment_container_view_tag);
            Fragment fragment3 = tag instanceof Fragment ? (Fragment) tag : null;
            if (fragment3 != null) {
                fragment = fragment3;
                break;
            } else {
                Object parent = view3.getParent();
                view3 = parent instanceof View ? (View) parent : null;
            }
        }
        Fragment parentFragment = fragment2.getParentFragment();
        if (fragment != null && !fragment.equals(parentFragment)) {
            int i10 = fragment2.mContainerId;
            FragmentStrictMode.a aVar = FragmentStrictMode.f17641a;
            FragmentStrictMode.b(new WrongNestedHierarchyViolation(fragment2, fragment, i10));
            FragmentStrictMode.a(fragment2).f17651a.contains(FragmentStrictMode.Flag.f17644d);
        }
        H h8 = this.f17475b;
        h8.getClass();
        ViewGroup viewGroup = fragment2.mContainer;
        if (viewGroup != null) {
            ArrayList<Fragment> arrayList = h8.f17480a;
            int iIndexOf = arrayList.indexOf(fragment2);
            for (int i11 = iIndexOf - 1; i11 >= 0; i11--) {
                Fragment fragment4 = arrayList.get(i11);
                if (fragment4.mContainer == viewGroup && (view2 = fragment4.mView) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                }
            }
            while (true) {
                iIndexOf++;
                if (iIndexOf >= arrayList.size()) {
                    break;
                }
                Fragment fragment5 = arrayList.get(iIndexOf);
                if (fragment5.mContainer == viewGroup && (view = fragment5.mView) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view);
                    break;
                }
            }
        }
        fragment2.mContainer.addView(fragment2.mView, iIndexOfChild);
    }

    public final void b() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        Fragment fragment = this.f17476c;
        if (zIsLoggable) {
            Objects.toString(fragment);
        }
        Fragment fragment2 = fragment.mTarget;
        G g10 = null;
        H h8 = this.f17475b;
        if (fragment2 != null) {
            G g11 = h8.f17481b.get(fragment2.mWho);
            if (g11 == null) {
                throw new IllegalStateException("Fragment " + fragment + " declared target fragment " + fragment.mTarget + " that does not belong to this FragmentManager!");
            }
            fragment.mTargetWho = fragment.mTarget.mWho;
            fragment.mTarget = null;
            g10 = g11;
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (g10 = h8.f17481b.get(str)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(fragment);
                sb2.append(" declared target fragment ");
                throw new IllegalStateException(Q8.d.a(sb2, fragment.mTargetWho, " that does not belong to this FragmentManager!"));
            }
        }
        if (g10 != null) {
            g10.i();
        }
        y yVar = fragment.mFragmentManager;
        fragment.mHost = yVar.f17696x;
        fragment.mParentFragment = yVar.f17698z;
        C1353s c1353s = this.f17474a;
        c1353s.g(fragment, false);
        fragment.performAttach();
        c1353s.b(fragment, false);
    }

    public final int c() {
        Fragment fragment = this.f17476c;
        if (fragment.mFragmentManager == null) {
            return fragment.mState;
        }
        int iMin = this.f17478e;
        int iOrdinal = fragment.mMaxState.ordinal();
        if (iOrdinal == 1) {
            iMin = Math.min(iMin, 0);
        } else if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 5);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        if (fragment.mFromLayout) {
            if (fragment.mInLayout) {
                iMin = Math.max(this.f17478e, 2);
                View view = fragment.mView;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f17478e < 4 ? Math.min(iMin, fragment.mState) : Math.min(iMin, 1);
            }
        }
        if (fragment.mInDynamicContainer && fragment.mContainer == null) {
            iMin = Math.min(iMin, 4);
        }
        if (!fragment.mAdded) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = fragment.mContainer;
        SpecialEffectsController.Operation.LifecycleImpact lifecycleImpact = null;
        if (viewGroup != null) {
            SpecialEffectsController specialEffectsControllerI = SpecialEffectsController.i(viewGroup, fragment.getParentFragmentManager());
            specialEffectsControllerI.getClass();
            SpecialEffectsController.Operation operationF = specialEffectsControllerI.f(fragment);
            SpecialEffectsController.Operation.LifecycleImpact lifecycleImpact2 = operationF != null ? operationF.f17541b : null;
            SpecialEffectsController.Operation operationG = specialEffectsControllerI.g(fragment);
            lifecycleImpact = operationG != null ? operationG.f17541b : null;
            int i10 = lifecycleImpact2 == null ? -1 : SpecialEffectsController.c.f17562a[lifecycleImpact2.ordinal()];
            if (i10 != -1 && i10 != 1) {
                lifecycleImpact = lifecycleImpact2;
            }
        }
        if (lifecycleImpact == SpecialEffectsController.Operation.LifecycleImpact.f17551c) {
            iMin = Math.min(iMin, 6);
        } else if (lifecycleImpact == SpecialEffectsController.Operation.LifecycleImpact.f17552d) {
            iMin = Math.max(iMin, 3);
        } else if (fragment.mRemoving) {
            iMin = fragment.isInBackStack() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (fragment.mDeferStart && fragment.mState < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (fragment.mTransitioning) {
            iMin = Math.max(iMin, 3);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(fragment);
        }
        return iMin;
    }

    public final void d() {
        String resourceName;
        Fragment fragment = this.f17476c;
        if (fragment.mFromLayout) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Objects.toString(fragment);
        }
        Bundle bundle = fragment.mSavedFragmentState;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterPerformGetLayoutInflater = fragment.performGetLayoutInflater(bundle2);
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i10 = fragment.mContainerId;
            if (i10 != 0) {
                if (i10 == -1) {
                    throw new IllegalArgumentException(C0936h.c("Cannot create fragment ", fragment, " for a container view with no id"));
                }
                viewGroup = (ViewGroup) fragment.mFragmentManager.f17697y.b(i10);
                if (viewGroup == null) {
                    if (!fragment.mRestored && !fragment.mInDynamicContainer) {
                        try {
                            resourceName = fragment.getResources().getResourceName(fragment.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(fragment.mContainerId) + " (" + resourceName + ") for fragment " + fragment);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    FragmentStrictMode.a aVar = FragmentStrictMode.f17641a;
                    FragmentStrictMode.b(new WrongFragmentContainerViolation(fragment, viewGroup));
                    FragmentStrictMode.a(fragment).f17651a.contains(FragmentStrictMode.Flag.f17648h);
                }
            }
        }
        fragment.mContainer = viewGroup;
        fragment.performCreateView(layoutInflaterPerformGetLayoutInflater, viewGroup, bundle2);
        if (fragment.mView != null) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Objects.toString(fragment);
            }
            fragment.mView.setSaveFromParentEnabled(false);
            fragment.mView.setTag(R.id.fragment_container_view_tag, fragment);
            if (viewGroup != null) {
                a();
            }
            if (fragment.mHidden) {
                fragment.mView.setVisibility(8);
            }
            if (fragment.mView.isAttachedToWindow()) {
                View view = fragment.mView;
                WeakHashMap<View, Z> weakHashMap = androidx.core.view.O.f16859a;
                androidx.core.view.O.c.c(view);
            } else {
                View view2 = fragment.mView;
                view2.addOnAttachStateChangeListener(new a(view2));
            }
            fragment.performViewCreated();
            this.f17474a.m(fragment, fragment.mView, bundle2, false);
            int visibility = fragment.mView.getVisibility();
            fragment.setPostOnViewCreatedAlpha(fragment.mView.getAlpha());
            if (fragment.mContainer != null && visibility == 0) {
                View viewFindFocus = fragment.mView.findFocus();
                if (viewFindFocus != null) {
                    fragment.setFocusedView(viewFindFocus);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        viewFindFocus.toString();
                        Objects.toString(fragment);
                    }
                }
                fragment.mView.setAlpha(0.0f);
            }
        }
        fragment.mState = 2;
    }

    public final void e() {
        Fragment fragmentB;
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        Fragment fragment = this.f17476c;
        if (zIsLoggable) {
            Objects.toString(fragment);
        }
        boolean zIsChangingConfigurations = true;
        boolean z10 = fragment.mRemoving && !fragment.isInBackStack();
        H h8 = this.f17475b;
        if (z10 && !fragment.mBeingSaved) {
            h8.i(null, fragment.mWho);
        }
        if (!z10) {
            B b10 = h8.f17483d;
            if (!((b10.f17380a.containsKey(fragment.mWho) && b10.f17383d) ? b10.f17384e : true)) {
                String str = fragment.mTargetWho;
                if (str != null && (fragmentB = h8.b(str)) != null && fragmentB.mRetainInstance) {
                    fragment.mTarget = fragmentB;
                }
                fragment.mState = 0;
                return;
            }
        }
        AbstractC1352q<?> abstractC1352q = fragment.mHost;
        if (abstractC1352q instanceof c0) {
            zIsChangingConfigurations = h8.f17483d.f17384e;
        } else {
            ActivityC1347l activityC1347l = abstractC1352q.f17632c;
            if (activityC1347l != null) {
                zIsChangingConfigurations = true ^ activityC1347l.isChangingConfigurations();
            }
        }
        if ((z10 && !fragment.mBeingSaved) || zIsChangingConfigurations) {
            B b11 = h8.f17483d;
            b11.getClass();
            if (Log.isLoggable("FragmentManager", 3)) {
                Objects.toString(fragment);
            }
            b11.d(fragment.mWho, false);
        }
        fragment.performDestroy();
        this.f17474a.d(fragment, false);
        for (G g10 : h8.d()) {
            if (g10 != null) {
                String str2 = fragment.mWho;
                Fragment fragment2 = g10.f17476c;
                if (str2.equals(fragment2.mTargetWho)) {
                    fragment2.mTarget = fragment;
                    fragment2.mTargetWho = null;
                }
            }
        }
        String str3 = fragment.mTargetWho;
        if (str3 != null) {
            fragment.mTarget = h8.b(str3);
        }
        h8.h(this);
    }

    public final void f() {
        View view;
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        Fragment fragment = this.f17476c;
        if (zIsLoggable) {
            Objects.toString(fragment);
        }
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        fragment.performDestroyView();
        this.f17474a.n(fragment, false);
        fragment.mContainer = null;
        fragment.mView = null;
        fragment.mViewLifecycleOwner = null;
        fragment.mViewLifecycleOwnerLiveData.j(null);
        fragment.mInLayout = false;
    }

    public final void g() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        Fragment fragment = this.f17476c;
        if (zIsLoggable) {
            Objects.toString(fragment);
        }
        fragment.performDetach();
        this.f17474a.e(fragment, false);
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if (!fragment.mRemoving || fragment.isInBackStack()) {
            B b10 = this.f17475b.f17483d;
            boolean z10 = true;
            if (b10.f17380a.containsKey(fragment.mWho) && b10.f17383d) {
                z10 = b10.f17384e;
            }
            if (!z10) {
                return;
            }
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Objects.toString(fragment);
        }
        fragment.initState();
    }

    public final void h() {
        Fragment fragment = this.f17476c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Objects.toString(fragment);
            }
            Bundle bundle = fragment.mSavedFragmentState;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            fragment.performCreateView(fragment.performGetLayoutInflater(bundle2), null, bundle2);
            View view = fragment.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                fragment.mView.setTag(R.id.fragment_container_view_tag, fragment);
                if (fragment.mHidden) {
                    fragment.mView.setVisibility(8);
                }
                fragment.performViewCreated();
                this.f17474a.m(fragment, fragment.mView, bundle2, false);
                fragment.mState = 2;
            }
        }
    }

    public final void i() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        boolean z10 = this.f17477d;
        Fragment fragment = this.f17476c;
        if (z10) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Objects.toString(fragment);
                return;
            }
            return;
        }
        try {
            this.f17477d = true;
            boolean z11 = false;
            while (true) {
                int iC = c();
                int i10 = fragment.mState;
                SpecialEffectsController.Operation.State state = SpecialEffectsController.Operation.State.f17555c;
                SpecialEffectsController.Operation.State state2 = SpecialEffectsController.Operation.State.f17556d;
                H h8 = this.f17475b;
                if (iC == i10) {
                    if (!z11 && i10 == -1 && fragment.mRemoving && !fragment.isInBackStack() && !fragment.mBeingSaved) {
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Objects.toString(fragment);
                        }
                        B b10 = h8.f17483d;
                        b10.getClass();
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Objects.toString(fragment);
                        }
                        b10.d(fragment.mWho, true);
                        h8.h(this);
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Objects.toString(fragment);
                        }
                        fragment.initState();
                    }
                    if (fragment.mHiddenChanged) {
                        if (fragment.mView != null && (viewGroup = fragment.mContainer) != null) {
                            SpecialEffectsController specialEffectsControllerI = SpecialEffectsController.i(viewGroup, fragment.getParentFragmentManager());
                            boolean z12 = fragment.mHidden;
                            SpecialEffectsController.Operation.LifecycleImpact lifecycleImpact = SpecialEffectsController.Operation.LifecycleImpact.f17550b;
                            if (z12) {
                                specialEffectsControllerI.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Objects.toString(fragment);
                                }
                                specialEffectsControllerI.d(state2, lifecycleImpact, this);
                            } else {
                                specialEffectsControllerI.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Objects.toString(fragment);
                                }
                                specialEffectsControllerI.d(state, lifecycleImpact, this);
                            }
                        }
                        y yVar = fragment.mFragmentManager;
                        if (yVar != null && fragment.mAdded && y.M(fragment)) {
                            yVar.f17664H = true;
                        }
                        fragment.mHiddenChanged = false;
                        fragment.onHiddenChanged(fragment.mHidden);
                        fragment.mChildFragmentManager.o();
                    }
                    this.f17477d = false;
                    return;
                }
                C1353s c1353s = this.f17474a;
                if (iC > i10) {
                    switch (i10 + 1) {
                        case 0:
                            b();
                            break;
                        case 1:
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Objects.toString(fragment);
                            }
                            Bundle bundle = fragment.mSavedFragmentState;
                            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
                            if (!fragment.mIsCreated) {
                                c1353s.h(fragment, false);
                                fragment.performCreate(bundle2);
                                c1353s.c(fragment, false);
                            } else {
                                fragment.mState = 1;
                                fragment.restoreChildFragmentState();
                            }
                            break;
                        case 2:
                            h();
                            d();
                            break;
                        case 3:
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Objects.toString(fragment);
                            }
                            Bundle bundle3 = fragment.mSavedFragmentState;
                            fragment.performActivityCreated(bundle3 != null ? bundle3.getBundle("savedInstanceState") : null);
                            c1353s.a(fragment, false);
                            break;
                        case 4:
                            if (fragment.mView != null && (viewGroup3 = fragment.mContainer) != null) {
                                SpecialEffectsController specialEffectsControllerI2 = SpecialEffectsController.i(viewGroup3, fragment.getParentFragmentManager());
                                int visibility = fragment.mView.getVisibility();
                                if (visibility != 0) {
                                    if (visibility == 4) {
                                        state = SpecialEffectsController.Operation.State.f17557e;
                                    } else {
                                        if (visibility != 8) {
                                            throw new IllegalArgumentException("Unknown visibility " + visibility);
                                        }
                                        state = state2;
                                    }
                                }
                                specialEffectsControllerI2.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Objects.toString(fragment);
                                }
                                specialEffectsControllerI2.d(state, SpecialEffectsController.Operation.LifecycleImpact.f17551c, this);
                            }
                            fragment.mState = 4;
                            break;
                        case 5:
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Objects.toString(fragment);
                            }
                            fragment.performStart();
                            c1353s.k(fragment, false);
                            break;
                        case 6:
                            fragment.mState = 6;
                            break;
                        case 7:
                            k();
                            break;
                    }
                } else {
                    switch (i10 - 1) {
                        case -1:
                            g();
                            break;
                        case 0:
                            if (fragment.mBeingSaved) {
                                if (h8.f17482c.get(fragment.mWho) == null) {
                                    h8.i(l(), fragment.mWho);
                                }
                            }
                            e();
                            break;
                        case 1:
                            f();
                            fragment.mState = 1;
                            break;
                        case 2:
                            fragment.mInLayout = false;
                            fragment.mState = 2;
                            break;
                        case 3:
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Objects.toString(fragment);
                            }
                            if (fragment.mBeingSaved) {
                                h8.i(l(), fragment.mWho);
                            } else if (fragment.mView != null && fragment.mSavedViewState == null) {
                                m();
                            }
                            if (fragment.mView != null && (viewGroup2 = fragment.mContainer) != null) {
                                SpecialEffectsController specialEffectsControllerI3 = SpecialEffectsController.i(viewGroup2, fragment.getParentFragmentManager());
                                specialEffectsControllerI3.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Objects.toString(fragment);
                                }
                                specialEffectsControllerI3.d(SpecialEffectsController.Operation.State.f17554b, SpecialEffectsController.Operation.LifecycleImpact.f17552d, this);
                            }
                            fragment.mState = 3;
                            break;
                        case 4:
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Objects.toString(fragment);
                            }
                            fragment.performStop();
                            c1353s.l(fragment, false);
                            break;
                        case 5:
                            fragment.mState = 5;
                            break;
                        case 6:
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Objects.toString(fragment);
                            }
                            fragment.performPause();
                            c1353s.f(fragment, false);
                            break;
                    }
                }
                z11 = true;
            }
        } catch (Throwable th) {
            this.f17477d = false;
            throw th;
        }
    }

    public final void j(ClassLoader classLoader) {
        Fragment fragment = this.f17476c;
        Bundle bundle = fragment.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (fragment.mSavedFragmentState.getBundle("savedInstanceState") == null) {
            fragment.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
        }
        try {
            fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("viewState");
            fragment.mSavedViewRegistryState = fragment.mSavedFragmentState.getBundle("viewRegistryState");
            F f10 = (F) fragment.mSavedFragmentState.getParcelable("state");
            if (f10 != null) {
                fragment.mTargetWho = f10.f17432n;
                fragment.mTargetRequestCode = f10.f17433o;
                Boolean bool = fragment.mSavedUserVisibleHint;
                if (bool != null) {
                    fragment.mUserVisibleHint = bool.booleanValue();
                    fragment.mSavedUserVisibleHint = null;
                } else {
                    fragment.mUserVisibleHint = f10.f17434p;
                }
            }
            if (fragment.mUserVisibleHint) {
                return;
            }
            fragment.mDeferStart = true;
        } catch (BadParcelableException e10) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + fragment, e10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002d  */
    public final void k() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        Fragment fragment = this.f17476c;
        if (zIsLoggable) {
            Objects.toString(fragment);
        }
        View focusedView = fragment.getFocusedView();
        if (focusedView != null) {
            if (focusedView == fragment.mView) {
                focusedView.requestFocus();
                if (Log.isLoggable("FragmentManager", 2)) {
                    focusedView.toString();
                    Objects.toString(fragment);
                    Objects.toString(fragment.mView.findFocus());
                }
            } else {
                ViewParent parent = focusedView.getParent();
                while (true) {
                    if (parent != null) {
                        if (parent == fragment.mView) {
                            break;
                        } else {
                            parent = parent.getParent();
                        }
                    }
                }
                focusedView.requestFocus();
                if (Log.isLoggable("FragmentManager", 2)) {
                    focusedView.toString();
                    Objects.toString(fragment);
                    Objects.toString(fragment.mView.findFocus());
                }
            }
        }
        fragment.setFocusedView(null);
        fragment.performResume();
        this.f17474a.i(fragment, false);
        this.f17475b.i(null, fragment.mWho);
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    public final Bundle l() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        Fragment fragment = this.f17476c;
        if (fragment.mState == -1 && (bundle = fragment.mSavedFragmentState) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new F(fragment));
        if (fragment.mState > 0) {
            Bundle bundle3 = new Bundle();
            fragment.performSaveInstanceState(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f17474a.j(fragment, bundle3, false);
            Bundle bundle4 = new Bundle();
            fragment.mSavedStateRegistryController.c(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle bundleY = fragment.mChildFragmentManager.Y();
            if (!bundleY.isEmpty()) {
                bundle2.putBundle("childFragmentManager", bundleY);
            }
            if (fragment.mView != null) {
                m();
            }
            SparseArray<Parcelable> sparseArray = fragment.mSavedViewState;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = fragment.mSavedViewRegistryState;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = fragment.mArguments;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public final void m() {
        Fragment fragment = this.f17476c;
        if (fragment.mView == null) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(fragment);
            Objects.toString(fragment.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        fragment.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            fragment.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        fragment.mViewLifecycleOwner.f17531g.c(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        fragment.mSavedViewRegistryState = bundle;
    }

    public G(C1353s c1353s, H h8, ClassLoader classLoader, C1351p c1351p, Bundle bundle) {
        this.f17474a = c1353s;
        this.f17475b = h8;
        F f10 = (F) bundle.getParcelable("state");
        Fragment fragmentInstantiate = Fragment.instantiate(y.this.f17696x.f17632c, f10.f17421b, null);
        fragmentInstantiate.mWho = f10.f17422c;
        fragmentInstantiate.mFromLayout = f10.f17423d;
        fragmentInstantiate.mInDynamicContainer = f10.f17424e;
        fragmentInstantiate.mRestored = true;
        fragmentInstantiate.mFragmentId = f10.f17425f;
        fragmentInstantiate.mContainerId = f10.f17426g;
        fragmentInstantiate.mTag = f10.f17427h;
        fragmentInstantiate.mRetainInstance = f10.f17428i;
        fragmentInstantiate.mRemoving = f10.j;
        fragmentInstantiate.mDetached = f10.f17429k;
        fragmentInstantiate.mHidden = f10.f17430l;
        fragmentInstantiate.mMaxState = Lifecycle.State.values()[f10.f17431m];
        fragmentInstantiate.mTargetWho = f10.f17432n;
        fragmentInstantiate.mTargetRequestCode = f10.f17433o;
        fragmentInstantiate.mUserVisibleHint = f10.f17434p;
        this.f17476c = fragmentInstantiate;
        fragmentInstantiate.mSavedFragmentState = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        fragmentInstantiate.setArguments(bundle2);
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(fragmentInstantiate);
        }
    }

    /* JADX INFO: compiled from: FragmentStateManager.java */
    public class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f17479b;

        public a(View view) {
            this.f17479b = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            View view2 = this.f17479b;
            view2.removeOnAttachStateChangeListener(this);
            WeakHashMap<View, Z> weakHashMap = androidx.core.view.O.f16859a;
            androidx.core.view.O.c.c(view2);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    public G(C1353s c1353s, H h8, Fragment fragment, Bundle bundle) {
        this.f17474a = c1353s;
        this.f17475b = h8;
        this.f17476c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        fragment.mSavedFragmentState = bundle;
        fragment.mArguments = bundle.getBundle("arguments");
    }
}
