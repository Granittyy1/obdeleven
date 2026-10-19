package com.google.android.material.search;

import A8.p;
import M5.i;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.activity.C0845b;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.voltasit.obdeleven.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class SearchView extends FrameLayout implements CoordinatorLayout.b, M5.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SearchBar f27345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f27346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TransitionState f27347d;

    public static class Behavior extends CoordinatorLayout.c<SearchView> {
        public Behavior() {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            SearchView searchView = (SearchView) view;
            if (searchView.f27345b != null || !(view2 instanceof SearchBar)) {
                return false;
            }
            searchView.setupWithSearchBar((SearchBar) view2);
            return false;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class TransitionState {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final TransitionState f27348b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final TransitionState f27349c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final TransitionState f27350d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ TransitionState[] f27351e;

        static {
            TransitionState transitionState = new TransitionState("HIDING", 0);
            f27348b = transitionState;
            TransitionState transitionState2 = new TransitionState("HIDDEN", 1);
            f27349c = transitionState2;
            TransitionState transitionState3 = new TransitionState("SHOWING", 2);
            TransitionState transitionState4 = new TransitionState("SHOWN", 3);
            f27350d = transitionState4;
            f27351e = new TransitionState[]{transitionState, transitionState2, transitionState3, transitionState4};
        }

        public TransitionState() {
            throw null;
        }

        public static TransitionState valueOf(String str) {
            return (TransitionState) Enum.valueOf(TransitionState.class, str);
        }

        public static TransitionState[] values() {
            return (TransitionState[]) f27351e.clone();
        }
    }

    public static class a extends K0.a {
        public static final Parcelable.Creator<a> CREATOR = new C0274a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f27352d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f27353e;

        /* JADX INFO: renamed from: com.google.android.material.search.SearchView$a$a, reason: collision with other inner class name */
        public class C0274a implements Parcelable.ClassLoaderCreator<a> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final a createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new a(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new a[i10];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new a(parcel, null);
            }
        }

        public a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f27352d = parcel.readString();
            this.f27353e = parcel.readInt();
        }

        @Override // K0.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f27352d);
            parcel.writeInt(this.f27353e);
        }
    }

    public interface b {
        void a();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001b  */
    /* JADX WARN: Code duplicated, block: B:16:? A[RETURN, SYNTHETIC] */
    private Window getActivityWindow() {
        Activity activity;
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                activity = (Activity) context;
                if (activity == null) {
                    return null;
                }
                return activity.getWindow();
            }
        }
        activity = null;
        if (activity == null) {
            return null;
        }
        return activity.getWindow();
    }

    private float getOverlayElevation() {
        SearchBar searchBar = this.f27345b;
        return searchBar != null ? searchBar.getCompatElevation() : getResources().getDimension(R.dimen.m3_searchview_elevation);
    }

    private int getStatusBarHeight() {
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private void setStatusBarSpacerEnabledInternal(boolean z10) {
        throw null;
    }

    private void setUpHeaderLayout(int i10) {
        if (i10 == -1) {
            return;
        }
        LayoutInflater.from(getContext()).inflate(i10, (ViewGroup) null, false);
        throw null;
    }

    private void setUpStatusBarSpacer(int i10) {
        throw null;
    }

    @Override // M5.b
    public final void a(C0845b c0845b) {
        if (!e() && this.f27345b != null) {
            throw null;
        }
    }

    @Override // M5.b
    public final void b(C0845b c0845b) {
        if (!e() && this.f27345b != null && Build.VERSION.SDK_INT >= 34) {
            throw null;
        }
    }

    @Override // M5.b
    public final void c() {
        if (!e()) {
            throw null;
        }
    }

    @Override // M5.b
    public final void d() {
        if (!e() && this.f27345b != null && Build.VERSION.SDK_INT >= 34) {
            throw null;
        }
    }

    public final boolean e() {
        return this.f27347d.equals(TransitionState.f27349c) || this.f27347d.equals(TransitionState.f27348b);
    }

    public i getBackHelper() {
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<SearchView> getBehavior() {
        return new Behavior();
    }

    public TransitionState getCurrentTransitionState() {
        return this.f27347d;
    }

    public int getDefaultNavigationIconResource() {
        return R.drawable.ic_arrow_back_black_24;
    }

    public EditText getEditText() {
        return null;
    }

    public CharSequence getHint() {
        throw null;
    }

    public TextView getSearchPrefix() {
        return null;
    }

    public CharSequence getSearchPrefixText() {
        throw null;
    }

    public int getSoftInputMode() {
        return this.f27346c;
    }

    public Editable getText() {
        throw null;
    }

    public Toolbar getToolbar() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        p.G(this);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        Window activityWindow = getActivityWindow();
        if (activityWindow != null) {
            this.f27346c = activityWindow.getAttributes().softInputMode;
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.f4135b);
        setText(aVar.f27352d);
        setVisible(aVar.f27353e == 0);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        if (super.onSaveInstanceState() == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        Editable text = getText();
        if (text != null) {
            text.toString();
        }
        throw null;
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        setUpBackgroundViewElevationOverlay(f10);
    }

    public void setHint(CharSequence charSequence) {
        throw null;
    }

    public void setModalForAccessibility(boolean z10) {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        if (z10) {
            new HashMap(viewGroup.getChildCount());
        }
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            if (viewGroup.getChildAt(i10) != this) {
                throw null;
            }
        }
    }

    public void setOnMenuItemClickListener(Toolbar.h hVar) {
        throw null;
    }

    public void setSearchPrefixText(CharSequence charSequence) {
        throw null;
    }

    public void setStatusBarSpacerEnabled(boolean z10) {
        setStatusBarSpacerEnabledInternal(z10);
    }

    public void setText(CharSequence charSequence) {
        throw null;
    }

    public void setToolbarTouchscreenBlocksFocus(boolean z10) {
        throw null;
    }

    public void setTransitionState(TransitionState transitionState) {
        if (this.f27347d.equals(transitionState)) {
            return;
        }
        if (transitionState == TransitionState.f27350d) {
            setModalForAccessibility(true);
        } else if (transitionState == TransitionState.f27349c) {
            setModalForAccessibility(false);
        }
        this.f27347d = transitionState;
        Iterator it = new LinkedHashSet((Collection) null).iterator();
        while (it.hasNext()) {
            ((b) it.next()).a();
        }
    }

    public void setVisible(boolean z10) {
        throw null;
    }

    public void setupWithSearchBar(SearchBar searchBar) {
        this.f27345b = searchBar;
        throw null;
    }

    public void setHint(int i10) {
        throw null;
    }

    public void setText(int i10) {
        throw null;
    }

    private void setUpBackgroundViewElevationOverlay(float f10) {
    }

    public void setAnimatedNavigationIcon(boolean z10) {
    }

    public void setAutoShowKeyboard(boolean z10) {
    }

    public void setMenuItemsAnimated(boolean z10) {
    }

    public void setUseWindowInsetsController(boolean z10) {
    }
}
