package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.BaseInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.collection.C0891t;
import androidx.collection.X;
import androidx.core.view.C1286a;
import androidx.core.view.C1305u;
import androidx.core.view.InterfaceC1304t;
import androidx.core.view.Z;
import com.braze.Constants;
import com.braze.support.BrazeLogger;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements InterfaceC1304t {

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public static boolean f19574R0 = false;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public static boolean f19575S0 = false;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public static final int[] f19576T0 = {R.attr.nestedScrollingEnabled};

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public static final float f19577U0 = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public static final boolean f19578V0 = true;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    public static final boolean f19579W0 = true;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public static final boolean f19580X0 = true;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    public static final Class<?>[] f19581Y0;

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    public static final c f19582Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public static final y f19583a1;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f19584A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public ArrayList f19585A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f19586B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public boolean f19587B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f19588C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public boolean f19589C0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final AccessibilityManager f19590D;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public final j f19591D0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public ArrayList f19592E;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public boolean f19593E0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f19594F;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public K f19595F0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f19596G;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public final int[] f19597G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f19598H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public C1305u f19599H0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f19600I;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public final int[] f19601I0;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public h f19602J;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public final int[] f19603J0;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public EdgeEffect f19604K;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public final int[] f19605K0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public EdgeEffect f19606L;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public final ArrayList f19607L0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public EdgeEffect f19608M;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public final RunnableC1435b f19609M0;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public EdgeEffect f19610N;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public boolean f19611N0;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public i f19612O;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public int f19613O0;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public int f19614P;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public int f19615P0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f19616Q;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public final d f19617Q0;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public VelocityTracker f19618R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public int f19619S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public int f19620T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public int f19621U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public int f19622V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public int f19623W;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f19624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f19625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s f19626d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public v f19627e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C1436a f19628f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1442g f19629g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Q f19630h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f19631i;
    public final RunnableC1434a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Rect f19632k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Rect f19633l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final RectF f19634m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Adapter f19635n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public l f19636o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public t f19637p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public o f19638p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f19639q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f19640q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList<k> f19641r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f19642r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayList<p> f19643s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final float f19644s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public p f19645t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final float f19646t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f19647u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f19648u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f19649v;
    public final A v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f19650w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public RunnableC1453s f19651w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f19652x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final RunnableC1453s.b f19653x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f19654y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final x f19655y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f19656z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public q f19657z0;

    public class A implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f19658b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f19659c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public OverScroller f19660d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Interpolator f19661e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f19662f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f19663g;

        public A() {
            c cVar = RecyclerView.f19582Z0;
            this.f19661e = cVar;
            this.f19662f = false;
            this.f19663g = false;
            this.f19660d = new OverScroller(RecyclerView.this.getContext(), cVar);
        }

        public final void a(int i10, int i11) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.setScrollState(2);
            this.f19659c = 0;
            this.f19658b = 0;
            Interpolator interpolator = this.f19661e;
            c cVar = RecyclerView.f19582Z0;
            if (interpolator != cVar) {
                this.f19661e = cVar;
                this.f19660d = new OverScroller(recyclerView.getContext(), cVar);
            }
            this.f19660d.fling(0, 0, i10, i11, Integer.MIN_VALUE, BrazeLogger.SUPPRESS, Integer.MIN_VALUE, BrazeLogger.SUPPRESS);
            b();
        }

        public final void b() {
            if (this.f19662f) {
                this.f19663g = true;
                return;
            }
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.removeCallbacks(this);
            WeakHashMap<View, Z> weakHashMap = androidx.core.view.O.f16859a;
            recyclerView.postOnAnimation(this);
        }

        public final void c(int i10, int i11, int i12, BaseInterpolator baseInterpolator) {
            RecyclerView recyclerView = RecyclerView.this;
            if (i12 == Integer.MIN_VALUE) {
                int iAbs = Math.abs(i10);
                int iAbs2 = Math.abs(i11);
                boolean z10 = iAbs > iAbs2;
                int width = z10 ? recyclerView.getWidth() : recyclerView.getHeight();
                if (!z10) {
                    iAbs = iAbs2;
                }
                i12 = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
            }
            int i13 = i12;
            Interpolator interpolator = baseInterpolator;
            if (baseInterpolator == null) {
                interpolator = RecyclerView.f19582Z0;
            }
            if (this.f19661e != interpolator) {
                this.f19661e = interpolator;
                this.f19660d = new OverScroller(recyclerView.getContext(), interpolator);
            }
            this.f19659c = 0;
            this.f19658b = 0;
            recyclerView.setScrollState(2);
            this.f19660d.startScroll(0, 0, i10, i11, i13);
            b();
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f19636o == null) {
                recyclerView.removeCallbacks(this);
                this.f19660d.abortAnimation();
                return;
            }
            this.f19663g = false;
            this.f19662f = true;
            recyclerView.p();
            OverScroller overScroller = this.f19660d;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i15 = currX - this.f19658b;
                int i16 = currY - this.f19659c;
                this.f19658b = currX;
                this.f19659c = currY;
                int iO = RecyclerView.o(i15, recyclerView.f19604K, recyclerView.f19608M, recyclerView.getWidth());
                int iO2 = RecyclerView.o(i16, recyclerView.f19606L, recyclerView.f19610N, recyclerView.getHeight());
                int[] iArr = recyclerView.f19605K0;
                iArr[0] = 0;
                iArr[1] = 0;
                boolean zV = recyclerView.v(iO, iO2, 1, iArr, null);
                int[] iArr2 = recyclerView.f19605K0;
                if (zV) {
                    iO -= iArr2[0];
                    iO2 -= iArr2[1];
                }
                if (recyclerView.getOverScrollMode() != 2) {
                    recyclerView.n(iO, iO2);
                }
                if (recyclerView.f19635n != null) {
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    recyclerView.i0(iO, iO2, iArr2);
                    int i17 = iArr2[0];
                    int i18 = iArr2[1];
                    int i19 = iO - i17;
                    int i20 = iO2 - i18;
                    androidx.recyclerview.widget.z zVar = recyclerView.f19636o.f19685e;
                    if (zVar != null && !zVar.f19725d && zVar.f19726e) {
                        int iB = recyclerView.f19655y0.b();
                        if (iB == 0) {
                            zVar.d();
                        } else if (zVar.f19722a >= iB) {
                            zVar.f19722a = iB - 1;
                            zVar.b(i17, i18);
                        } else {
                            zVar.b(i17, i18);
                        }
                    }
                    i13 = i17;
                    i10 = i19;
                    i11 = i20;
                    i12 = i18;
                } else {
                    i10 = iO;
                    i11 = iO2;
                    i12 = 0;
                    i13 = 0;
                }
                if (!recyclerView.f19641r.isEmpty()) {
                    recyclerView.invalidate();
                }
                int[] iArr3 = recyclerView.f19605K0;
                iArr3[0] = 0;
                iArr3[1] = 0;
                int i21 = i12;
                recyclerView.w(i13, i12, i10, i11, null, 1, iArr3);
                int i22 = i10 - iArr2[0];
                int i23 = i11 - iArr2[1];
                if (i13 != 0 || i21 != 0) {
                    recyclerView.x(i13, i21);
                }
                if (!recyclerView.awakenScrollBars()) {
                    recyclerView.invalidate();
                }
                boolean z10 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i22 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i23 != 0));
                androidx.recyclerview.widget.z zVar2 = recyclerView.f19636o.f19685e;
                if ((zVar2 == null || !zVar2.f19725d) && z10) {
                    if (recyclerView.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        if (i22 < 0) {
                            i14 = -currVelocity;
                        } else {
                            i14 = i22 > 0 ? currVelocity : 0;
                        }
                        if (i23 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i23 <= 0) {
                            currVelocity = 0;
                        }
                        if (i14 < 0) {
                            recyclerView.z();
                            if (recyclerView.f19604K.isFinished()) {
                                recyclerView.f19604K.onAbsorb(-i14);
                            }
                        } else if (i14 > 0) {
                            recyclerView.A();
                            if (recyclerView.f19608M.isFinished()) {
                                recyclerView.f19608M.onAbsorb(i14);
                            }
                        }
                        if (currVelocity < 0) {
                            recyclerView.B();
                            if (recyclerView.f19606L.isFinished()) {
                                recyclerView.f19606L.onAbsorb(-currVelocity);
                            }
                        } else if (currVelocity > 0) {
                            recyclerView.y();
                            if (recyclerView.f19610N.isFinished()) {
                                recyclerView.f19610N.onAbsorb(currVelocity);
                            }
                        }
                        if (i14 != 0 || currVelocity != 0) {
                            WeakHashMap<View, Z> weakHashMap = androidx.core.view.O.f16859a;
                            recyclerView.postInvalidateOnAnimation();
                        }
                    }
                    if (RecyclerView.f19580X0) {
                        RunnableC1453s.b bVar = recyclerView.f19653x0;
                        int[] iArr4 = bVar.f19981c;
                        if (iArr4 != null) {
                            Arrays.fill(iArr4, -1);
                        }
                        bVar.f19982d = 0;
                    }
                } else {
                    b();
                    RunnableC1453s runnableC1453s = recyclerView.f19651w0;
                    if (runnableC1453s != null) {
                        runnableC1453s.a(i13, i21, recyclerView);
                    }
                }
            }
            androidx.recyclerview.widget.z zVar3 = recyclerView.f19636o.f19685e;
            if (zVar3 != null && zVar3.f19725d) {
                zVar3.b(0, 0);
            }
            this.f19662f = false;
            if (!this.f19663g) {
                recyclerView.setScrollState(0);
                recyclerView.p0(1);
            } else {
                recyclerView.removeCallbacks(this);
                WeakHashMap<View, Z> weakHashMap2 = androidx.core.view.O.f16859a;
                recyclerView.postOnAnimation(this);
            }
        }
    }

    public static abstract class B {
        static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        static final int FLAG_BOUND = 1;
        static final int FLAG_IGNORE = 128;
        static final int FLAG_INVALID = 4;
        static final int FLAG_MOVED = 2048;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_RETURNED_FROM_SCRAP = 32;
        static final int FLAG_TMP_DETACHED = 256;
        static final int FLAG_UPDATE = 2;
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.emptyList();
        static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
        public final View itemView;
        Adapter<? extends B> mBindingAdapter;
        int mFlags;
        WeakReference<RecyclerView> mNestedRecyclerView;
        RecyclerView mOwnerRecyclerView;
        int mPosition = -1;
        int mOldPosition = -1;
        long mItemId = -1;
        int mItemViewType = -1;
        int mPreLayoutPosition = -1;
        B mShadowedHolder = null;
        B mShadowingHolder = null;
        List<Object> mPayloads = null;
        List<Object> mUnmodifiedPayloads = null;
        private int mIsRecyclableCount = 0;
        s mScrapContainer = null;
        boolean mInChangeScrap = false;
        private int mWasImportantForAccessibilityBeforeHidden = 0;
        int mPendingAccessibilityState = -1;

        public B(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.itemView = view;
        }

        private void createPayloadsIfNeeded() {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
        }

        public void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(FLAG_ADAPTER_FULLUPDATE);
            } else if ((FLAG_ADAPTER_FULLUPDATE & this.mFlags) == 0) {
                createPayloadsIfNeeded();
                this.mPayloads.add(obj);
            }
        }

        public void addFlags(int i10) {
            this.mFlags = i10 | this.mFlags;
        }

        public void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        public void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        public void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        public void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        public boolean doesTransientStatePreventRecycling() {
            if ((this.mFlags & 16) == 0) {
                View view = this.itemView;
                WeakHashMap<View, Z> weakHashMap = androidx.core.view.O.f16859a;
                if (view.hasTransientState()) {
                    return true;
                }
            }
            return false;
        }

        public void flagRemovedAndOffsetPosition(int i10, int i11, boolean z10) {
            addFlags(8);
            offsetPosition(i11, z10);
            this.mPosition = i10;
        }

        public final int getAbsoluteAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.K(this);
        }

        @Deprecated
        public final int getAdapterPosition() {
            return getBindingAdapterPosition();
        }

        public final Adapter<? extends B> getBindingAdapter() {
            return this.mBindingAdapter;
        }

        public final int getBindingAdapterPosition() {
            RecyclerView recyclerView;
            Adapter adapter;
            int iK;
            if (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (adapter = recyclerView.getAdapter()) == null || (iK = this.mOwnerRecyclerView.K(this)) == -1) {
                return -1;
            }
            return adapter.findRelativeAdapterPositionIn(this.mBindingAdapter, this, iK);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            int i10 = this.mPreLayoutPosition;
            return i10 == -1 ? this.mPosition : i10;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        @Deprecated
        public final int getPosition() {
            int i10 = this.mPreLayoutPosition;
            return i10 == -1 ? this.mPosition : i10;
        }

        public List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & FLAG_ADAPTER_FULLUPDATE) != 0) {
                return FULLUPDATE_PAYLOADS;
            }
            List<Object> list = this.mPayloads;
            return (list == null || list.size() == 0) ? FULLUPDATE_PAYLOADS : this.mUnmodifiedPayloads;
        }

        public boolean hasAnyOfTheFlags(int i10) {
            return (i10 & this.mFlags) != 0;
        }

        public boolean isAdapterPositionUnknown() {
            return (this.mFlags & FLAG_ADAPTER_POSITION_UNKNOWN) != 0 || isInvalid();
        }

        public boolean isAttachedToTransitionOverlay() {
            return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
        }

        public boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        public boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        public final boolean isRecyclable() {
            if ((this.mFlags & 16) == 0) {
                View view = this.itemView;
                WeakHashMap<View, Z> weakHashMap = androidx.core.view.O.f16859a;
                if (!view.hasTransientState()) {
                    return true;
                }
            }
            return false;
        }

        public boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        public boolean isScrap() {
            return this.mScrapContainer != null;
        }

        public boolean isTmpDetached() {
            return (this.mFlags & FLAG_TMP_DETACHED) != 0;
        }

        public boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }

        public boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        public void offsetPosition(int i10, boolean z10) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z10) {
                this.mPreLayoutPosition += i10;
            }
            this.mPosition += i10;
            if (this.itemView.getLayoutParams() != null) {
                ((m) this.itemView.getLayoutParams()).f19703c = true;
            }
        }

        public void onEnteredHiddenState(RecyclerView recyclerView) {
            int i10 = this.mPendingAccessibilityState;
            if (i10 != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i10;
            } else {
                View view = this.itemView;
                WeakHashMap<View, Z> weakHashMap = androidx.core.view.O.f16859a;
                this.mWasImportantForAccessibilityBeforeHidden = view.getImportantForAccessibility();
            }
            if (recyclerView.R()) {
                this.mPendingAccessibilityState = 4;
                recyclerView.f19607L0.add(this);
            } else {
                View view2 = this.itemView;
                WeakHashMap<View, Z> weakHashMap2 = androidx.core.view.O.f16859a;
                view2.setImportantForAccessibility(4);
            }
        }

        public void onLeftHiddenState(RecyclerView recyclerView) {
            int i10 = this.mWasImportantForAccessibilityBeforeHidden;
            if (recyclerView.R()) {
                this.mPendingAccessibilityState = i10;
                recyclerView.f19607L0.add(this);
            } else {
                View view = this.itemView;
                WeakHashMap<View, Z> weakHashMap = androidx.core.view.O.f16859a;
                view.setImportantForAccessibility(i10);
            }
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        public void resetInternal() {
            if (RecyclerView.f19574R0 && isTmpDetached()) {
                throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
            }
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1L;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.l(this);
        }

        public void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        public void setFlags(int i10, int i11) {
            this.mFlags = (i10 & i11) | (this.mFlags & (~i11));
        }

        public final void setIsRecyclable(boolean z10) {
            int i10 = this.mIsRecyclableCount;
            int i11 = z10 ? i10 - 1 : i10 + 1;
            this.mIsRecyclableCount = i11;
            if (i11 < 0) {
                this.mIsRecyclableCount = 0;
                if (RecyclerView.f19574R0) {
                    throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                }
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else if (!z10 && i11 == 1) {
                this.mFlags |= 16;
            } else if (z10 && i11 == 0) {
                this.mFlags &= -17;
            }
            if (RecyclerView.f19575S0) {
                toString();
            }
        }

        public void setScrapContainer(s sVar, boolean z10) {
            this.mScrapContainer = sVar;
            this.mInChangeScrap = z10;
        }

        public boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        public boolean shouldIgnore() {
            return (this.mFlags & FLAG_IGNORE) != 0;
        }

        public void stopIgnoring() {
            this.mFlags &= -129;
        }

        public String toString() {
            StringBuilder sbF = C4.b.f(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
            sbF.append(Integer.toHexString(hashCode()));
            sbF.append(" position=");
            sbF.append(this.mPosition);
            sbF.append(" id=");
            sbF.append(this.mItemId);
            sbF.append(", oldPos=");
            sbF.append(this.mOldPosition);
            sbF.append(", pLpos:");
            sbF.append(this.mPreLayoutPosition);
            StringBuilder sb2 = new StringBuilder(sbF.toString());
            if (isScrap()) {
                sb2.append(" scrap ");
                sb2.append(this.mInChangeScrap ? "[changeScrap]" : "[attachedScrap]");
            }
            if (isInvalid()) {
                sb2.append(" invalid");
            }
            if (!isBound()) {
                sb2.append(" unbound");
            }
            if (needsUpdate()) {
                sb2.append(" update");
            }
            if (isRemoved()) {
                sb2.append(" removed");
            }
            if (shouldIgnore()) {
                sb2.append(" ignored");
            }
            if (isTmpDetached()) {
                sb2.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                sb2.append(" not recyclable(" + this.mIsRecyclableCount + ")");
            }
            if (isAdapterPositionUnknown()) {
                sb2.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb2.append(" no parent");
            }
            sb2.append("}");
            return sb2.toString();
        }

        public void unScrap() {
            this.mScrapContainer.l(this);
        }

        public boolean wasReturnedFromScrap() {
            return (this.mFlags & 32) != 0;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$a, reason: case insensitive filesystem */
    public class RunnableC1434a implements Runnable {
        public RunnableC1434a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.f19650w || recyclerView.isLayoutRequested()) {
                return;
            }
            if (!recyclerView.f19647u) {
                recyclerView.requestLayout();
            } else if (recyclerView.f19656z) {
                recyclerView.f19654y = true;
            } else {
                recyclerView.p();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$b, reason: case insensitive filesystem */
    public class RunnableC1435b implements Runnable {
        public RunnableC1435b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            RecyclerView recyclerView = RecyclerView.this;
            i iVar = recyclerView.f19612O;
            if (iVar != null) {
                iVar.l();
            }
            recyclerView.f19593E0 = false;
        }
    }

    public class c implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    public class d {
        public d() {
        }
    }

    public static class e extends Observable<f> {
        public final boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public final void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((f) ((Observable) this).mObservers.get(size)).a();
            }
        }

        public final void c(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((f) ((Observable) this).mObservers.get(size)).e(i10, i11);
            }
        }

        public final void d(int i10, int i11, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((f) ((Observable) this).mObservers.get(size)).c(i10, i11, obj);
            }
        }

        public final void e(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((f) ((Observable) this).mObservers.get(size)).d(i10, i11);
            }
        }

        public final void f(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((f) ((Observable) this).mObservers.get(size)).f(i10, i11);
            }
        }

        public final void g() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((f) ((Observable) this).mObservers.get(size)).g();
            }
        }
    }

    public interface g {
    }

    public static class h {
    }

    public static abstract class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public j f19672a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList<a> f19673b = new ArrayList<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f19674c = 120;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f19675d = 120;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f19676e = 250;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f19677f = 250;

        public interface a {
            void a();
        }

        public static class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f19678a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f19679b;

            public final void a(B b10) {
                View view = b10.itemView;
                this.f19678a = view.getLeft();
                this.f19679b = view.getTop();
                view.getRight();
                view.getBottom();
            }
        }

        public static void e(B b10) {
            int i10 = b10.mFlags;
            if (!b10.isInvalid() && (i10 & 4) == 0) {
                b10.getOldPosition();
                b10.getAbsoluteAdapterPosition();
            }
        }

        public abstract boolean a(B b10, b bVar, b bVar2);

        public abstract boolean b(B b10, B b11, b bVar, b bVar2);

        public abstract boolean c(B b10, b bVar, b bVar2);

        public abstract boolean d(B b10, b bVar, b bVar2);

        public abstract boolean f(B b10);

        public boolean g(B b10, List<Object> list) {
            return f(b10);
        }

        /* JADX WARN: Code duplicated, block: B:32:0x0066  */
        /* JADX WARN: Code duplicated, block: B:34:0x0076  */
        public final void h(B b10) {
            j jVar = this.f19672a;
            if (jVar != null) {
                boolean z10 = true;
                b10.setIsRecyclable(true);
                if (b10.mShadowedHolder != null && b10.mShadowingHolder == null) {
                    b10.mShadowedHolder = null;
                }
                b10.mShadowingHolder = null;
                if (b10.shouldBeKeptAsChild()) {
                    return;
                }
                View view = b10.itemView;
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.n0();
                C1442g c1442g = recyclerView.f19629g;
                C1442g.a aVar = c1442g.f19845b;
                I i10 = c1442g.f19844a;
                int i11 = c1442g.f19847d;
                if (i11 != 1) {
                    if (i11 == 2) {
                        throw new IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
                    }
                    try {
                        c1442g.f19847d = 2;
                        int iIndexOfChild = i10.f19511a.indexOfChild(view);
                        if (iIndexOfChild == -1) {
                            c1442g.j(view);
                        } else if (aVar.d(iIndexOfChild)) {
                            aVar.f(iIndexOfChild);
                            c1442g.j(view);
                            i10.a(iIndexOfChild);
                        } else {
                            c1442g.f19847d = 0;
                        }
                        c1442g.f19847d = 0;
                        if (z10) {
                            B bN = RecyclerView.N(view);
                            s sVar = recyclerView.f19626d;
                            sVar.l(bN);
                            sVar.i(bN);
                            if (RecyclerView.f19575S0) {
                                Objects.toString(view);
                                recyclerView.toString();
                            }
                        }
                        recyclerView.o0(!z10);
                        if (z10 && b10.isTmpDetached()) {
                            recyclerView.removeDetachedView(b10.itemView, false);
                            return;
                        }
                    } catch (Throwable th) {
                        c1442g.f19847d = 0;
                        throw th;
                    }
                }
                if (c1442g.f19848e != view) {
                    throw new IllegalStateException("Cannot call removeViewIfHidden within removeView(At) for a different view");
                }
                z10 = false;
                if (z10) {
                    B bN2 = RecyclerView.N(view);
                    s sVar2 = recyclerView.f19626d;
                    sVar2.l(bN2);
                    sVar2.i(bN2);
                    if (RecyclerView.f19575S0) {
                        Objects.toString(view);
                        recyclerView.toString();
                    }
                }
                recyclerView.o0(!z10);
                if (z10) {
                }
            }
        }

        public abstract void i(B b10);

        public abstract void j();

        public abstract boolean k();

        public abstract void l();
    }

    public class j {
        public j() {
        }
    }

    public static abstract class k {
        @Deprecated
        public void getItemOffsets(Rect rect, int i10, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        @Deprecated
        public void onDraw(Canvas canvas, RecyclerView recyclerView) {
        }

        @Deprecated
        public void onDrawOver(Canvas canvas, RecyclerView recyclerView) {
        }

        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, x xVar) {
            getItemOffsets(rect, ((m) view.getLayoutParams()).f19701a.getLayoutPosition(), recyclerView);
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerView, x xVar) {
            onDraw(canvas, recyclerView);
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, x xVar) {
            onDrawOver(canvas, recyclerView);
        }
    }

    public interface n {
        void b(View view);
    }

    public static abstract class o {
    }

    public interface p {
        void a(MotionEvent motionEvent);

        boolean c(RecyclerView recyclerView, MotionEvent motionEvent);

        void d(boolean z10);
    }

    public static class r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public SparseArray<a> f19705a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f19706b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Set<Adapter<?>> f19707c;

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ArrayList<B> f19708a = new ArrayList<>();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f19709b = 5;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public long f19710c = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public long f19711d = 0;
        }

        public final a a(int i10) {
            SparseArray<a> sparseArray = this.f19705a;
            a aVar = sparseArray.get(i10);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            sparseArray.put(i10, aVar2);
            return aVar2;
        }
    }

    public final class s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList<B> f19712a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList<B> f19713b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList<B> f19714c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<B> f19715d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f19716e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f19717f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public r f19718g;

        public s() {
            ArrayList<B> arrayList = new ArrayList<>();
            this.f19712a = arrayList;
            this.f19713b = null;
            this.f19714c = new ArrayList<>();
            this.f19715d = Collections.unmodifiableList(arrayList);
            this.f19716e = 2;
            this.f19717f = 2;
        }

        public final void a(B b10, boolean z10) {
            RecyclerView.l(b10);
            View view = b10.itemView;
            RecyclerView recyclerView = RecyclerView.this;
            K k10 = recyclerView.f19595F0;
            if (k10 != null) {
                K.a aVar = k10.f19514b;
                androidx.core.view.O.n(view, aVar != null ? (C1286a) aVar.f19516b.remove(view) : null);
            }
            if (z10) {
                t tVar = recyclerView.f19637p;
                if (tVar != null) {
                    tVar.a();
                }
                ArrayList arrayList = recyclerView.f19639q;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((t) arrayList.get(i10)).a();
                }
                Adapter adapter = recyclerView.f19635n;
                if (adapter != null) {
                    adapter.onViewRecycled(b10);
                }
                if (recyclerView.f19655y0 != null) {
                    recyclerView.f19630h.d(b10);
                }
                if (RecyclerView.f19575S0) {
                    Objects.toString(b10);
                }
            }
            b10.mBindingAdapter = null;
            b10.mOwnerRecyclerView = null;
            r rVarC = c();
            rVarC.getClass();
            int itemViewType = b10.getItemViewType();
            ArrayList<B> arrayList2 = rVarC.a(itemViewType).f19708a;
            if (rVarC.f19705a.get(itemViewType).f19709b <= arrayList2.size()) {
                p241t7.b.a(b10.itemView);
            } else {
                if (RecyclerView.f19574R0 && arrayList2.contains(b10)) {
                    throw new IllegalArgumentException("this scrap item already exists");
                }
                b10.resetInternal();
                arrayList2.add(b10);
            }
        }

        public final int b(int i10) {
            RecyclerView recyclerView = RecyclerView.this;
            if (i10 >= 0 && i10 < recyclerView.f19655y0.b()) {
                return !recyclerView.f19655y0.f19742g ? i10 : recyclerView.f19628f.f(i10, 0);
            }
            StringBuilder sbE = A8.f.e(i10, "invalid position ", ". State item count is ");
            sbE.append(recyclerView.f19655y0.b());
            sbE.append(recyclerView.C());
            throw new IndexOutOfBoundsException(sbE.toString());
        }

        public final r c() {
            if (this.f19718g == null) {
                r rVar = new r();
                rVar.f19705a = new SparseArray<>();
                rVar.f19706b = 0;
                rVar.f19707c = Collections.newSetFromMap(new IdentityHashMap());
                this.f19718g = rVar;
                d();
            }
            return this.f19718g;
        }

        public final void d() {
            RecyclerView recyclerView;
            Adapter<?> adapter;
            r rVar = this.f19718g;
            if (rVar == null || (adapter = (recyclerView = RecyclerView.this).f19635n) == null || !recyclerView.f19647u) {
                return;
            }
            rVar.f19707c.add(adapter);
        }

        public final void e(Adapter<?> adapter, boolean z10) {
            r rVar = this.f19718g;
            if (rVar == null) {
                return;
            }
            Set<Adapter<?>> set = rVar.f19707c;
            set.remove(adapter);
            if (set.size() != 0 || z10) {
                return;
            }
            int i10 = 0;
            while (true) {
                SparseArray<r.a> sparseArray = rVar.f19705a;
                if (i10 >= sparseArray.size()) {
                    return;
                }
                ArrayList<B> arrayList = sparseArray.get(sparseArray.keyAt(i10)).f19708a;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    p241t7.b.a(arrayList.get(i11).itemView);
                }
                i10++;
            }
        }

        public final void f() {
            ArrayList<B> arrayList = this.f19714c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                g(size);
            }
            arrayList.clear();
            if (RecyclerView.f19580X0) {
                RunnableC1453s.b bVar = RecyclerView.this.f19653x0;
                int[] iArr = bVar.f19981c;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                bVar.f19982d = 0;
            }
        }

        public final void g(int i10) {
            boolean z10 = RecyclerView.f19574R0;
            ArrayList<B> arrayList = this.f19714c;
            B b10 = arrayList.get(i10);
            if (RecyclerView.f19575S0) {
                Objects.toString(b10);
            }
            a(b10, true);
            arrayList.remove(i10);
        }

        public final void h(View view) {
            B bN = RecyclerView.N(view);
            boolean zIsTmpDetached = bN.isTmpDetached();
            RecyclerView recyclerView = RecyclerView.this;
            if (zIsTmpDetached) {
                recyclerView.removeDetachedView(view, false);
            }
            if (bN.isScrap()) {
                bN.unScrap();
            } else if (bN.wasReturnedFromScrap()) {
                bN.clearReturnedFromScrapFlag();
            }
            i(bN);
            if (recyclerView.f19612O == null || bN.isRecyclable()) {
                return;
            }
            recyclerView.f19612O.i(bN);
        }

        /* JADX WARN: Code duplicated, block: B:54:0x00a5  */
        /* JADX WARN: Code duplicated, block: B:56:0x00b3  */
        /* JADX WARN: Code duplicated, block: B:58:0x00ba  */
        /* JADX WARN: Code duplicated, block: B:61:0x00c3 A[LOOP:2: B:57:0x00b8->B:61:0x00c3, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:87:0x00c6 A[EDGE_INSN: B:87:0x00c6->B:62:0x00c6 BREAK  A[LOOP:1: B:53:0x00a3->B:60:0x00c0], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:88:0x00c6 A[EDGE_INSN: B:88:0x00c6->B:62:0x00c6 BREAK  A[LOOP:1: B:53:0x00a3->B:60:0x00c0, LOOP_LABEL: LOOP:1: B:53:0x00a3->B:60:0x00c0], SYNTHETIC] */
        public final void i(B b10) {
            boolean z10;
            int i10;
            int i11;
            RunnableC1453s.b bVar;
            int i12;
            int i13;
            boolean zIsScrap = b10.isScrap();
            boolean z11 = false;
            boolean z12 = true;
            RecyclerView recyclerView = RecyclerView.this;
            if (zIsScrap || b10.itemView.getParent() != null) {
                StringBuilder sb2 = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
                sb2.append(b10.isScrap());
                sb2.append(" isAttached:");
                sb2.append(b10.itemView.getParent() != null);
                sb2.append(recyclerView.C());
                throw new IllegalArgumentException(sb2.toString());
            }
            if (b10.isTmpDetached()) {
                StringBuilder sb3 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
                sb3.append(b10);
                throw new IllegalArgumentException(androidx.compose.animation.k.a(recyclerView, sb3));
            }
            if (b10.shouldIgnore()) {
                throw new IllegalArgumentException(androidx.compose.animation.k.a(recyclerView, new StringBuilder("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.")));
            }
            boolean zDoesTransientStatePreventRecycling = b10.doesTransientStatePreventRecycling();
            Adapter adapter = recyclerView.f19635n;
            boolean z13 = adapter != null && zDoesTransientStatePreventRecycling && adapter.onFailedToRecycleView(b10);
            boolean z14 = RecyclerView.f19574R0;
            ArrayList<B> arrayList = this.f19714c;
            if (z14 && arrayList.contains(b10)) {
                StringBuilder sb4 = new StringBuilder("cached view received recycle internal? ");
                sb4.append(b10);
                throw new IllegalArgumentException(androidx.compose.animation.k.a(recyclerView, sb4));
            }
            if (z13 || b10.isRecyclable()) {
                if (this.f19717f <= 0 || b10.hasAnyOfTheFlags(526)) {
                    z10 = false;
                } else {
                    int size = arrayList.size();
                    if (size >= this.f19717f && size > 0) {
                        g(0);
                        size--;
                    }
                    if (RecyclerView.f19580X0 && size > 0) {
                        RunnableC1453s.b bVar2 = recyclerView.f19653x0;
                        int i14 = b10.mPosition;
                        if (bVar2.f19981c != null) {
                            int i15 = bVar2.f19982d * 2;
                            int i16 = 0;
                            while (true) {
                                if (i16 >= i15) {
                                    i10 = size - 1;
                                    loop1: while (i10 >= 0) {
                                        i11 = arrayList.get(i10).mPosition;
                                        bVar = recyclerView.f19653x0;
                                        if (bVar.f19981c != null) {
                                            break;
                                        }
                                        i12 = bVar.f19982d * 2;
                                        i13 = 0;
                                        while (true) {
                                            if (i13 < i12) {
                                                break loop1;
                                            } else if (bVar.f19981c[i13] == i11) {
                                                break;
                                            } else {
                                                i13 += 2;
                                            }
                                        }
                                        i10--;
                                    }
                                    size = i10 + 1;
                                } else if (bVar2.f19981c[i16] != i14) {
                                    i16 += 2;
                                }
                            }
                        } else {
                            i10 = size - 1;
                            loop1: while (i10 >= 0) {
                                i11 = arrayList.get(i10).mPosition;
                                bVar = recyclerView.f19653x0;
                                if (bVar.f19981c != null) {
                                    break;
                                    break;
                                }
                                i12 = bVar.f19982d * 2;
                                i13 = 0;
                                while (true) {
                                    if (i13 < i12) {
                                        break loop1;
                                        break loop1;
                                    } else if (bVar.f19981c[i13] == i11) {
                                        break;
                                    } else {
                                        i13 += 2;
                                    }
                                }
                                i10--;
                            }
                            size = i10 + 1;
                        }
                    }
                    arrayList.add(size, b10);
                    z10 = true;
                }
                if (z10) {
                    z12 = false;
                } else {
                    a(b10, true);
                }
                z11 = z10;
            } else {
                if (RecyclerView.f19575S0) {
                    recyclerView.C();
                }
                z12 = false;
            }
            recyclerView.f19630h.d(b10);
            if (z11 || z12 || !zDoesTransientStatePreventRecycling) {
                return;
            }
            p241t7.b.a(b10.itemView);
            b10.mBindingAdapter = null;
            b10.mOwnerRecyclerView = null;
        }

        public final void j(View view) {
            i iVar;
            B bN = RecyclerView.N(view);
            boolean zHasAnyOfTheFlags = bN.hasAnyOfTheFlags(12);
            RecyclerView recyclerView = RecyclerView.this;
            if (!zHasAnyOfTheFlags && bN.isUpdated() && (iVar = recyclerView.f19612O) != null && !iVar.g(bN, bN.getUnmodifiedPayloads())) {
                if (this.f19713b == null) {
                    this.f19713b = new ArrayList<>();
                }
                bN.setScrapContainer(this, true);
                this.f19713b.add(bN);
                return;
            }
            if (bN.isInvalid() && !bN.isRemoved() && !recyclerView.f19635n.hasStableIds()) {
                throw new IllegalArgumentException(androidx.compose.animation.k.a(recyclerView, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
            }
            bN.setScrapContainer(this, false);
            this.f19712a.add(bN);
        }

        /* JADX WARN: Code duplicated, block: B:186:0x0320 A[EDGE_INSN: B:186:0x0320->B:187:0x0321 BREAK  A[LOOP:6: B:181:0x0309->B:185:0x031e]] */
        /* JADX WARN: Code duplicated, block: B:292:0x04d4  */
        /* JADX WARN: Code duplicated, block: B:293:0x04e0  */
        /* JADX WARN: Code duplicated, block: B:295:0x04e6  */
        /* JADX WARN: Code duplicated, block: B:296:0x04f2  */
        /* JADX WARN: Code duplicated, block: B:301:0x04fb  */
        /* JADX WARN: Code duplicated, block: B:35:0x0081 A[EDGE_INSN: B:35:0x0081->B:36:0x0082 BREAK  A[LOOP:0: B:14:0x0027->B:20:0x0041]] */
        /* JADX WARN: Code duplicated, block: B:74:0x0118  */
        public final B k(int i10, long j) {
            boolean z10;
            B bCreateViewHolder;
            boolean z11;
            boolean z12;
            ViewGroup.LayoutParams layoutParams;
            m mVar;
            RecyclerView recyclerViewI;
            B bRemove;
            B b10;
            View view;
            int iB;
            boolean z13;
            int size;
            int iF;
            RecyclerView recyclerView = RecyclerView.this;
            if (i10 < 0 || i10 >= recyclerView.f19655y0.b()) {
                StringBuilder sbA = B6.a.a("Invalid item position ", "(", "). Item count:", i10, i10);
                sbA.append(recyclerView.f19655y0.b());
                sbA.append(recyclerView.C());
                throw new IndexOutOfBoundsException(sbA.toString());
            }
            x xVar = recyclerView.f19655y0;
            if (xVar.f19742g) {
                ArrayList<B> arrayList = this.f19713b;
                if (arrayList != null && (size = arrayList.size()) != 0) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= size) {
                            if (recyclerView.f19635n.hasStableIds() && (iF = recyclerView.f19628f.f(i10, 0)) > 0 && iF < recyclerView.f19635n.getItemCount()) {
                                long itemId = recyclerView.f19635n.getItemId(iF);
                                int i12 = 0;
                                while (true) {
                                    if (i12 >= size) {
                                        bCreateViewHolder = null;
                                        break;
                                    }
                                    B b11 = this.f19713b.get(i12);
                                    if (!b11.wasReturnedFromScrap() && b11.getItemId() == itemId) {
                                        b11.addFlags(32);
                                        bCreateViewHolder = b11;
                                        break;
                                    }
                                    i12++;
                                }
                            } else {
                                bCreateViewHolder = null;
                                break;
                            }
                        } else {
                            bCreateViewHolder = this.f19713b.get(i11);
                            if (!bCreateViewHolder.wasReturnedFromScrap() && bCreateViewHolder.getLayoutPosition() == i10) {
                                bCreateViewHolder.addFlags(32);
                                break;
                            }
                            i11++;
                        }
                    }
                } else {
                    bCreateViewHolder = null;
                    break;
                }
                z10 = bCreateViewHolder != null;
            } else {
                z10 = false;
                bCreateViewHolder = null;
            }
            ArrayList<B> arrayList2 = this.f19714c;
            ArrayList<B> arrayList3 = this.f19712a;
            if (bCreateViewHolder == null) {
                int size2 = arrayList3.size();
                int i13 = 0;
                while (true) {
                    if (i13 >= size2) {
                        ArrayList arrayList4 = recyclerView.f19629g.f19846c;
                        int size3 = arrayList4.size();
                        int i14 = 0;
                        while (true) {
                            if (i14 >= size3) {
                                view = null;
                                break;
                            }
                            view = (View) arrayList4.get(i14);
                            B bN = RecyclerView.N(view);
                            if (bN.getLayoutPosition() == i10 && !bN.isInvalid() && !bN.isRemoved()) {
                                break;
                            }
                            i14++;
                        }
                        if (view == null) {
                            int size4 = arrayList2.size();
                            int i15 = 0;
                            while (true) {
                                if (i15 >= size4) {
                                    bCreateViewHolder = null;
                                    break;
                                }
                                B b12 = arrayList2.get(i15);
                                if (!b12.isInvalid() && b12.getLayoutPosition() == i10 && !b12.isAttachedToTransitionOverlay()) {
                                    arrayList2.remove(i15);
                                    if (RecyclerView.f19575S0) {
                                        b12.toString();
                                    }
                                    bCreateViewHolder = b12;
                                    break;
                                }
                                i15++;
                            }
                        } else {
                            B bN2 = RecyclerView.N(view);
                            C1442g c1442g = recyclerView.f19629g;
                            int iIndexOfChild = c1442g.f19844a.f19511a.indexOfChild(view);
                            if (iIndexOfChild < 0) {
                                throw new IllegalArgumentException("view is not a child, cannot hide " + view);
                            }
                            C1442g.a aVar = c1442g.f19845b;
                            if (!aVar.d(iIndexOfChild)) {
                                throw new RuntimeException("trying to unhide a view that was not hidden" + view);
                            }
                            aVar.a(iIndexOfChild);
                            c1442g.j(view);
                            C1442g c1442g2 = recyclerView.f19629g;
                            int iIndexOfChild2 = c1442g2.f19844a.f19511a.indexOfChild(view);
                            if (iIndexOfChild2 == -1) {
                                iB = -1;
                            } else {
                                C1442g.a aVar2 = c1442g2.f19845b;
                                if (aVar2.d(iIndexOfChild2)) {
                                    iB = -1;
                                } else {
                                    iB = iIndexOfChild2 - aVar2.b(iIndexOfChild2);
                                }
                            }
                            if (iB == -1) {
                                StringBuilder sb2 = new StringBuilder("layout index should not be -1 after unhiding a view:");
                                sb2.append(bN2);
                                throw new IllegalStateException(androidx.compose.animation.k.a(recyclerView, sb2));
                            }
                            recyclerView.f19629g.c(iB);
                            j(view);
                            bN2.addFlags(8224);
                            bCreateViewHolder = bN2;
                            break;
                        }
                    } else {
                        B b13 = arrayList3.get(i13);
                        if (!b13.wasReturnedFromScrap() && b13.getLayoutPosition() == i10 && !b13.isInvalid() && (xVar.f19742g || !b13.isRemoved())) {
                            b13.addFlags(32);
                            bCreateViewHolder = b13;
                            break;
                        }
                        i13++;
                    }
                }
                if (bCreateViewHolder != null) {
                    if (!bCreateViewHolder.isRemoved()) {
                        int i16 = bCreateViewHolder.mPosition;
                        if (i16 < 0 || i16 >= recyclerView.f19635n.getItemCount()) {
                            StringBuilder sb3 = new StringBuilder("Inconsistency detected. Invalid view holder adapter position");
                            sb3.append(bCreateViewHolder);
                            throw new IndexOutOfBoundsException(androidx.compose.animation.k.a(recyclerView, sb3));
                        }
                        z13 = (xVar.f19742g || recyclerView.f19635n.getItemViewType(bCreateViewHolder.mPosition) == bCreateViewHolder.getItemViewType()) && (!recyclerView.f19635n.hasStableIds() || bCreateViewHolder.getItemId() == recyclerView.f19635n.getItemId(bCreateViewHolder.mPosition));
                    } else {
                        if (RecyclerView.f19574R0 && !xVar.f19742g) {
                            throw new IllegalStateException(androidx.compose.animation.k.a(recyclerView, new StringBuilder("should not receive a removed view unless it is pre layout")));
                        }
                        z13 = xVar.f19742g;
                    }
                    if (z13) {
                        z10 = true;
                    } else {
                        bCreateViewHolder.addFlags(4);
                        if (bCreateViewHolder.isScrap()) {
                            recyclerView.removeDetachedView(bCreateViewHolder.itemView, false);
                            bCreateViewHolder.unScrap();
                        } else if (bCreateViewHolder.wasReturnedFromScrap()) {
                            bCreateViewHolder.clearReturnedFromScrapFlag();
                        }
                        i(bCreateViewHolder);
                        bCreateViewHolder = null;
                    }
                }
            }
            if (bCreateViewHolder == null) {
                int iF2 = recyclerView.f19628f.f(i10, 0);
                if (iF2 < 0 || iF2 >= recyclerView.f19635n.getItemCount()) {
                    StringBuilder sbA2 = B6.a.a("Inconsistency detected. Invalid item position ", "(offset:", ").state:", i10, iF2);
                    sbA2.append(xVar.b());
                    sbA2.append(recyclerView.C());
                    throw new IndexOutOfBoundsException(sbA2.toString());
                }
                int itemViewType = recyclerView.f19635n.getItemViewType(iF2);
                if (recyclerView.f19635n.hasStableIds()) {
                    long itemId2 = recyclerView.f19635n.getItemId(iF2);
                    int size5 = arrayList3.size() - 1;
                    while (true) {
                        if (size5 < 0) {
                            int size6 = arrayList2.size() - 1;
                            while (true) {
                                if (size6 >= 0) {
                                    B b14 = arrayList2.get(size6);
                                    if (b14.getItemId() != itemId2 || b14.isAttachedToTransitionOverlay()) {
                                        size6--;
                                    } else {
                                        if (itemViewType == b14.getItemViewType()) {
                                            arrayList2.remove(size6);
                                            b10 = b14;
                                            break;
                                        }
                                        g(size6);
                                    }
                                }
                                b10 = null;
                                break;
                            }
                        }
                        b10 = arrayList3.get(size5);
                        if (b10.getItemId() == itemId2 && !b10.wasReturnedFromScrap()) {
                            if (itemViewType == b10.getItemViewType()) {
                                b10.addFlags(32);
                                if (!b10.isRemoved() || xVar.f19742g) {
                                    break;
                                    break;
                                }
                                b10.setFlags(2, 14);
                                break;
                            }
                            arrayList3.remove(size5);
                            recyclerView.removeDetachedView(b10.itemView, false);
                            B bN3 = RecyclerView.N(b10.itemView);
                            bN3.mScrapContainer = null;
                            bN3.mInChangeScrap = false;
                            bN3.clearReturnedFromScrapFlag();
                            i(bN3);
                        }
                        size5--;
                    }
                    if (b10 != null) {
                        b10.mPosition = iF2;
                        z10 = true;
                    }
                    bCreateViewHolder = b10;
                }
                if (bCreateViewHolder == null) {
                    boolean z14 = RecyclerView.f19574R0;
                    r.a aVar3 = c().f19705a.get(itemViewType);
                    if (aVar3 == null) {
                        bRemove = null;
                        break;
                    }
                    ArrayList<B> arrayList5 = aVar3.f19708a;
                    if (!arrayList5.isEmpty()) {
                        int size7 = arrayList5.size() - 1;
                        while (true) {
                            if (size7 < 0) {
                                bRemove = null;
                                break;
                            }
                            if (!arrayList5.get(size7).isAttachedToTransitionOverlay()) {
                                bRemove = arrayList5.remove(size7);
                                break;
                            }
                            size7--;
                        }
                    } else {
                        bRemove = null;
                        break;
                    }
                    if (bRemove != null) {
                        bRemove.resetInternal();
                        boolean z15 = RecyclerView.f19574R0;
                    }
                    bCreateViewHolder = bRemove;
                }
                if (bCreateViewHolder == null) {
                    long nanoTime = recyclerView.getNanoTime();
                    if (j != Long.MAX_VALUE) {
                        long j10 = this.f19718g.a(itemViewType).f19710c;
                        if (!(j10 == 0 || j10 + nanoTime < j)) {
                            return null;
                        }
                    }
                    bCreateViewHolder = recyclerView.f19635n.createViewHolder(recyclerView, itemViewType);
                    if (RecyclerView.f19580X0 && (recyclerViewI = RecyclerView.I(bCreateViewHolder.itemView)) != null) {
                        bCreateViewHolder.mNestedRecyclerView = new WeakReference<>(recyclerViewI);
                    }
                    long nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                    r.a aVarA = this.f19718g.a(itemViewType);
                    long j11 = aVarA.f19710c;
                    if (j11 != 0) {
                        nanoTime2 = (nanoTime2 / 4) + ((j11 / 4) * 3);
                    }
                    aVarA.f19710c = nanoTime2;
                }
            }
            if (z10 && !xVar.f19742g && bCreateViewHolder.hasAnyOfTheFlags(8192)) {
                bCreateViewHolder.setFlags(0, 8192);
                if (xVar.j) {
                    i.e(bCreateViewHolder);
                    i iVar = recyclerView.f19612O;
                    bCreateViewHolder.getUnmodifiedPayloads();
                    iVar.getClass();
                    i.b bVar = new i.b();
                    bVar.a(bCreateViewHolder);
                    recyclerView.b0(bCreateViewHolder, bVar);
                }
            }
            if (!xVar.f19742g || !bCreateViewHolder.isBound()) {
                if (!bCreateViewHolder.isBound() || bCreateViewHolder.needsUpdate() || bCreateViewHolder.isInvalid()) {
                    if (RecyclerView.f19574R0 && bCreateViewHolder.isRemoved()) {
                        StringBuilder sb4 = new StringBuilder("Removed holder should be bound and it should come here only in pre-layout. Holder: ");
                        sb4.append(bCreateViewHolder);
                        throw new IllegalStateException(androidx.compose.animation.k.a(recyclerView, sb4));
                    }
                    int iF3 = recyclerView.f19628f.f(i10, 0);
                    C1286a c1286a = null;
                    bCreateViewHolder.mBindingAdapter = null;
                    bCreateViewHolder.mOwnerRecyclerView = recyclerView;
                    int itemViewType2 = bCreateViewHolder.getItemViewType();
                    long nanoTime3 = recyclerView.getNanoTime();
                    if (j != Long.MAX_VALUE) {
                        long j12 = this.f19718g.a(itemViewType2).f19711d;
                        if (j12 == 0 || j12 + nanoTime3 < j) {
                        }
                    }
                    if (bCreateViewHolder.isTmpDetached()) {
                        recyclerView.attachViewToParent(bCreateViewHolder.itemView, recyclerView.getChildCount(), bCreateViewHolder.itemView.getLayoutParams());
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    recyclerView.f19635n.bindViewHolder(bCreateViewHolder, iF3);
                    if (z11) {
                        recyclerView.detachViewFromParent(bCreateViewHolder.itemView);
                    }
                    long nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
                    r.a aVarA2 = this.f19718g.a(bCreateViewHolder.getItemViewType());
                    long j13 = aVarA2.f19711d;
                    if (j13 != 0) {
                        nanoTime4 = (nanoTime4 / 4) + ((j13 / 4) * 3);
                    }
                    aVarA2.f19711d = nanoTime4;
                    AccessibilityManager accessibilityManager = recyclerView.f19590D;
                    if (accessibilityManager != null && accessibilityManager.isEnabled()) {
                        View view2 = bCreateViewHolder.itemView;
                        WeakHashMap<View, Z> weakHashMap = androidx.core.view.O.f16859a;
                        if (view2.getImportantForAccessibility() == 0) {
                            view2.setImportantForAccessibility(1);
                        }
                        K k10 = recyclerView.f19595F0;
                        if (k10 != null) {
                            K.a aVar4 = k10.f19514b;
                            if (aVar4 != null) {
                                View.AccessibilityDelegate accessibilityDelegateD = androidx.core.view.O.d(view2);
                                if (accessibilityDelegateD != null) {
                                    c1286a = accessibilityDelegateD instanceof C1286a.C0173a ? ((C1286a.C0173a) accessibilityDelegateD).f16888a : new C1286a(accessibilityDelegateD);
                                }
                                if (c1286a != null && c1286a != aVar4) {
                                    aVar4.f19516b.put(view2, c1286a);
                                }
                            }
                            androidx.core.view.O.n(view2, aVar4);
                        }
                    }
                    if (xVar.f19742g) {
                        bCreateViewHolder.mPreLayoutPosition = i10;
                    }
                    z12 = true;
                }
                layoutParams = bCreateViewHolder.itemView.getLayoutParams();
                if (layoutParams == null) {
                    mVar = (m) recyclerView.generateDefaultLayoutParams();
                    bCreateViewHolder.itemView.setLayoutParams(mVar);
                } else if (recyclerView.checkLayoutParams(layoutParams)) {
                    mVar = (m) layoutParams;
                } else {
                    mVar = (m) recyclerView.generateLayoutParams(layoutParams);
                    bCreateViewHolder.itemView.setLayoutParams(mVar);
                }
                mVar.f19701a = bCreateViewHolder;
                mVar.f19704d = !z10 && z12;
                return bCreateViewHolder;
            }
            bCreateViewHolder.mPreLayoutPosition = i10;
            z12 = false;
            layoutParams = bCreateViewHolder.itemView.getLayoutParams();
            if (layoutParams == null) {
                mVar = (m) recyclerView.generateDefaultLayoutParams();
                bCreateViewHolder.itemView.setLayoutParams(mVar);
            } else if (recyclerView.checkLayoutParams(layoutParams)) {
                mVar = (m) recyclerView.generateLayoutParams(layoutParams);
                bCreateViewHolder.itemView.setLayoutParams(mVar);
            } else {
                mVar = (m) layoutParams;
            }
            mVar.f19701a = bCreateViewHolder;
            mVar.f19704d = !z10 && z12;
            return bCreateViewHolder;
        }

        public final void l(B b10) {
            if (b10.mInChangeScrap) {
                this.f19713b.remove(b10);
            } else {
                this.f19712a.remove(b10);
            }
            b10.mScrapContainer = null;
            b10.mInChangeScrap = false;
            b10.clearReturnedFromScrapFlag();
        }

        public final void m() {
            l lVar = RecyclerView.this.f19636o;
            this.f19717f = this.f19716e + (lVar != null ? lVar.j : 0);
            ArrayList<B> arrayList = this.f19714c;
            for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f19717f; size--) {
                g(size);
            }
        }
    }

    public interface t {
        void a();
    }

    public class u extends f {
        public u() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final void a() {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.k(null);
            recyclerView.f19655y0.f19741f = true;
            recyclerView.a0(true);
            if (recyclerView.f19628f.g()) {
                return;
            }
            recyclerView.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final void c(int i10, int i11, Object obj) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.k(null);
            C1436a c1436a = recyclerView.f19628f;
            if (i11 < 1) {
                c1436a.getClass();
                return;
            }
            ArrayList<C1436a.C0200a> arrayList = c1436a.f19808b;
            arrayList.add(c1436a.h(obj, 4, i10, i11));
            c1436a.f19812f |= 4;
            if (arrayList.size() == 1) {
                h();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final void d(int i10, int i11) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.k(null);
            C1436a c1436a = recyclerView.f19628f;
            if (i11 < 1) {
                c1436a.getClass();
                return;
            }
            ArrayList<C1436a.C0200a> arrayList = c1436a.f19808b;
            arrayList.add(c1436a.h(null, 1, i10, i11));
            c1436a.f19812f |= 1;
            if (arrayList.size() == 1) {
                h();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final void e(int i10, int i11) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.k(null);
            C1436a c1436a = recyclerView.f19628f;
            c1436a.getClass();
            if (i10 == i11) {
                return;
            }
            ArrayList<C1436a.C0200a> arrayList = c1436a.f19808b;
            arrayList.add(c1436a.h(null, 8, i10, i11));
            c1436a.f19812f |= 8;
            if (arrayList.size() == 1) {
                h();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final void f(int i10, int i11) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.k(null);
            C1436a c1436a = recyclerView.f19628f;
            if (i11 < 1) {
                c1436a.getClass();
                return;
            }
            ArrayList<C1436a.C0200a> arrayList = c1436a.f19808b;
            arrayList.add(c1436a.h(null, 2, i10, i11));
            c1436a.f19812f |= 2;
            if (arrayList.size() == 1) {
                h();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final void g() {
            Adapter adapter;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f19627e == null || (adapter = recyclerView.f19635n) == null || !adapter.canRestoreState()) {
                return;
            }
            recyclerView.requestLayout();
        }

        public final void h() {
            boolean z10 = RecyclerView.f19579W0;
            RecyclerView recyclerView = RecyclerView.this;
            if (z10 && recyclerView.f19649v && recyclerView.f19647u) {
                WeakHashMap<View, Z> weakHashMap = androidx.core.view.O.f16859a;
                recyclerView.postOnAnimation(recyclerView.j);
            } else {
                recyclerView.f19588C = true;
                recyclerView.requestLayout();
            }
        }
    }

    public static class v extends K0.a {
        public static final Parcelable.Creator<v> CREATOR = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Parcelable f19721d;

        public class a implements Parcelable.ClassLoaderCreator<v> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final v createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new v(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new v[i10];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new v(parcel, null);
            }
        }

        public v(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f19721d = parcel.readParcelable(classLoader == null ? l.class.getClassLoader() : classLoader);
        }

        @Override // K0.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeParcelable(this.f19721d, 0);
        }
    }

    public static abstract class w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f19722a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public RecyclerView f19723b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public l f19724c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f19725d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f19726e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public View f19727f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final a f19728g;

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f19729a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f19730b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f19731c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f19732d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public BaseInterpolator f19733e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public boolean f19734f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public int f19735g;

            public final void a(RecyclerView recyclerView) {
                int i10 = this.f19732d;
                if (i10 >= 0) {
                    this.f19732d = -1;
                    recyclerView.S(i10);
                    this.f19734f = false;
                    return;
                }
                if (!this.f19734f) {
                    this.f19735g = 0;
                    return;
                }
                BaseInterpolator baseInterpolator = this.f19733e;
                if (baseInterpolator != null && this.f19731c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                int i11 = this.f19731c;
                if (i11 < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
                recyclerView.v0.c(this.f19729a, this.f19730b, i11, baseInterpolator);
                int i12 = this.f19735g + 1;
                this.f19735g = i12;
                if (i12 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f19734f = false;
            }
        }

        public interface b {
            PointF a(int i10);
        }

        public w() {
            a aVar = new a();
            aVar.f19732d = -1;
            aVar.f19734f = false;
            aVar.f19735g = 0;
            aVar.f19729a = 0;
            aVar.f19730b = 0;
            aVar.f19731c = Integer.MIN_VALUE;
            aVar.f19733e = null;
            this.f19728g = aVar;
        }

        public PointF a(int i10) {
            Object obj = this.f19724c;
            if (obj instanceof b) {
                return ((b) obj).a(i10);
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:50:0x00fb  */
        public final void b(int i10, int i11) {
            PointF pointFA;
            RecyclerView recyclerView = this.f19723b;
            if (this.f19722a == -1 || recyclerView == null) {
                d();
            }
            if (this.f19725d && this.f19727f == null && this.f19724c != null && (pointFA = a(this.f19722a)) != null) {
                float f10 = pointFA.x;
                if (f10 != 0.0f || pointFA.y != 0.0f) {
                    recyclerView.i0((int) Math.signum(f10), (int) Math.signum(pointFA.y), null);
                }
            }
            this.f19725d = false;
            View view = this.f19727f;
            a aVar = this.f19728g;
            if (view != null) {
                this.f19723b.getClass();
                B bN = RecyclerView.N(view);
                if ((bN != null ? bN.getLayoutPosition() : -1) == this.f19722a) {
                    View view2 = this.f19727f;
                    x xVar = recyclerView.f19655y0;
                    c(view2, aVar);
                    aVar.a(recyclerView);
                    d();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f19727f = null;
                }
            }
            if (this.f19726e) {
                x xVar2 = recyclerView.f19655y0;
                androidx.recyclerview.widget.z zVar = (androidx.recyclerview.widget.z) this;
                if (zVar.f19723b.f19636o.x() == 0) {
                    zVar.d();
                } else {
                    int i12 = zVar.f20054n;
                    int i13 = i12 - i10;
                    if (i12 * i13 <= 0) {
                        i13 = 0;
                    }
                    zVar.f20054n = i13;
                    int i14 = zVar.f20055o;
                    int i15 = i14 - i11;
                    if (i14 * i15 <= 0) {
                        i15 = 0;
                    }
                    zVar.f20055o = i15;
                    if (i13 == 0 && i15 == 0) {
                        PointF pointFA2 = zVar.a(zVar.f19722a);
                        if (pointFA2 != null) {
                            float f11 = pointFA2.x;
                            if (f11 == 0.0f && pointFA2.y == 0.0f) {
                                aVar.f19732d = zVar.f19722a;
                                zVar.d();
                            } else {
                                float f12 = pointFA2.y;
                                float fSqrt = (float) Math.sqrt((f12 * f12) + (f11 * f11));
                                float f13 = pointFA2.x / fSqrt;
                                pointFA2.x = f13;
                                float f14 = pointFA2.y / fSqrt;
                                pointFA2.y = f14;
                                zVar.j = pointFA2;
                                zVar.f20054n = (int) (f13 * 10000.0f);
                                zVar.f20055o = (int) (f14 * 10000.0f);
                                int i16 = zVar.i(10000);
                                int i17 = (int) (zVar.f20054n * 1.2f);
                                int i18 = (int) (zVar.f20055o * 1.2f);
                                LinearInterpolator linearInterpolator = zVar.f20049h;
                                aVar.f19729a = i17;
                                aVar.f19730b = i18;
                                aVar.f19731c = (int) (i16 * 1.2f);
                                aVar.f19733e = linearInterpolator;
                                aVar.f19734f = true;
                            }
                        } else {
                            aVar.f19732d = zVar.f19722a;
                            zVar.d();
                        }
                    }
                }
                boolean z10 = aVar.f19732d >= 0;
                aVar.a(recyclerView);
                if (z10 && this.f19726e) {
                    this.f19725d = true;
                    recyclerView.v0.b();
                }
            }
        }

        public abstract void c(View view, a aVar);

        public final void d() {
            if (this.f19726e) {
                this.f19726e = false;
                androidx.recyclerview.widget.z zVar = (androidx.recyclerview.widget.z) this;
                zVar.f20055o = 0;
                zVar.f20054n = 0;
                zVar.j = null;
                this.f19723b.f19655y0.f19736a = -1;
                this.f19727f = null;
                this.f19722a = -1;
                this.f19725d = false;
                l lVar = this.f19724c;
                if (lVar.f19685e == this) {
                    lVar.f19685e = null;
                }
                this.f19724c = null;
                this.f19723b = null;
            }
        }
    }

    public static class x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f19736a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f19737b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f19738c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f19739d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f19740e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f19741f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f19742g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f19743h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f19744i;
        public boolean j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f19745k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f19746l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public long f19747m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f19748n;

        public final void a(int i10) {
            if ((this.f19739d & i10) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.f19739d));
        }

        public final int b() {
            return this.f19742g ? this.f19737b - this.f19738c : this.f19740e;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("State{mTargetPosition=");
            sb2.append(this.f19736a);
            sb2.append(", mData=null, mItemCount=");
            sb2.append(this.f19740e);
            sb2.append(", mIsMeasuring=");
            sb2.append(this.f19744i);
            sb2.append(", mPreviousLayoutItemCount=");
            sb2.append(this.f19737b);
            sb2.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            sb2.append(this.f19738c);
            sb2.append(", mStructureChanged=");
            sb2.append(this.f19741f);
            sb2.append(", mInPreLayout=");
            sb2.append(this.f19742g);
            sb2.append(", mRunSimpleAnimations=");
            sb2.append(this.j);
            sb2.append(", mRunPredictiveAnimations=");
            return Z3.o.d(sb2, this.f19745k, '}');
        }
    }

    public static class y extends h {
    }

    public static abstract class z {
    }

    static {
        Class cls = Integer.TYPE;
        f19581Y0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f19582Z0 = new c();
        f19583a1 = new y();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.voltasit.obdeleven.R.attr.recyclerViewStyle);
    }

    public static RecyclerView I(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            RecyclerView recyclerViewI = I(viewGroup.getChildAt(i10));
            if (recyclerViewI != null) {
                return recyclerViewI;
            }
        }
        return null;
    }

    public static B N(View view) {
        if (view == null) {
            return null;
        }
        return ((m) view.getLayoutParams()).f19701a;
    }

    public static void O(Rect rect, View view) {
        m mVar = (m) view.getLayoutParams();
        Rect rect2 = mVar.f19702b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) mVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) mVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) mVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) mVar).bottomMargin);
    }

    private C1305u getScrollingChildHelper() {
        if (this.f19599H0 == null) {
            this.f19599H0 = new C1305u(this);
        }
        return this.f19599H0;
    }

    public static void l(B b10) {
        WeakReference<RecyclerView> weakReference = b10.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == b10.itemView) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            b10.mNestedRecyclerView = null;
        }
    }

    public static int o(int i10, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i11) {
        if (i10 > 0 && edgeEffect != null && H0.d.a(edgeEffect) != 0.0f) {
            int iRound = Math.round(H0.d.b(edgeEffect, ((-i10) * 4.0f) / i11, 0.5f) * ((-i11) / 4.0f));
            if (iRound != i10) {
                edgeEffect.finish();
            }
            return i10 - iRound;
        }
        if (i10 >= 0 || edgeEffect2 == null || H0.d.a(edgeEffect2) == 0.0f) {
            return i10;
        }
        float f10 = i11;
        int iRound2 = Math.round(H0.d.b(edgeEffect2, (i10 * 4.0f) / f10, 0.5f) * (f10 / 4.0f));
        if (iRound2 != i10) {
            edgeEffect2.finish();
        }
        return i10 - iRound2;
    }

    public static void setDebugAssertionsEnabled(boolean z10) {
        f19574R0 = z10;
    }

    public static void setVerboseLoggingEnabled(boolean z10) {
        f19575S0 = z10;
    }

    public final void A() {
        if (this.f19608M != null) {
            return;
        }
        ((y) this.f19602J).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f19608M = edgeEffect;
        if (this.f19631i) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void B() {
        if (this.f19606L != null) {
            return;
        }
        ((y) this.f19602J).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f19606L = edgeEffect;
        if (this.f19631i) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String C() {
        return " " + super.toString() + ", adapter:" + this.f19635n + ", layout:" + this.f19636o + ", context:" + getContext();
    }

    public final void D(x xVar) {
        if (getScrollState() != 2) {
            xVar.getClass();
            return;
        }
        OverScroller overScroller = this.v0.f19660d;
        overScroller.getFinalX();
        overScroller.getCurrX();
        xVar.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public final View E(float f10, float f11) {
        for (int iE = this.f19629g.e() - 1; iE >= 0; iE--) {
            View viewD = this.f19629g.d(iE);
            float translationX = viewD.getTranslationX();
            float translationY = viewD.getTranslationY();
            if (f10 >= viewD.getLeft() + translationX && f10 <= viewD.getRight() + translationX && f11 >= viewD.getTop() + translationY && f11 <= viewD.getBottom() + translationY) {
                return viewD;
            }
        }
        return null;
    }

    public final View F(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public final boolean G(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList<p> arrayList = this.f19643s;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            p pVar = arrayList.get(i10);
            if (pVar.c(this, motionEvent) && action != 3) {
                this.f19645t = pVar;
                return true;
            }
        }
        return false;
    }

    public final void H(int[] iArr) {
        int iE = this.f19629g.e();
        if (iE == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i10 = BrazeLogger.SUPPRESS;
        int i11 = Integer.MIN_VALUE;
        for (int i12 = 0; i12 < iE; i12++) {
            B bN = N(this.f19629g.d(i12));
            if (!bN.shouldIgnore()) {
                int layoutPosition = bN.getLayoutPosition();
                if (layoutPosition < i10) {
                    i10 = layoutPosition;
                }
                if (layoutPosition > i11) {
                    i11 = layoutPosition;
                }
            }
        }
        iArr[0] = i10;
        iArr[1] = i11;
    }

    public final B J(int i10) {
        B b10 = null;
        if (this.f19594F) {
            return null;
        }
        int iH = this.f19629g.h();
        for (int i11 = 0; i11 < iH; i11++) {
            B bN = N(this.f19629g.g(i11));
            if (bN != null && !bN.isRemoved() && K(bN) == i10) {
                C1442g c1442g = this.f19629g;
                if (!c1442g.f19846c.contains(bN.itemView)) {
                    return bN;
                }
                b10 = bN;
            }
        }
        return b10;
    }

    public final int K(B b10) {
        if (b10.hasAnyOfTheFlags(524) || !b10.isBound()) {
            return -1;
        }
        C1436a c1436a = this.f19628f;
        int i10 = b10.mPosition;
        ArrayList<C1436a.C0200a> arrayList = c1436a.f19808b;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            C1436a.C0200a c0200a = arrayList.get(i11);
            int i12 = c0200a.f19813a;
            if (i12 != 1) {
                if (i12 == 2) {
                    int i13 = c0200a.f19814b;
                    if (i13 <= i10) {
                        int i14 = c0200a.f19816d;
                        if (i13 + i14 > i10) {
                            return -1;
                        }
                        i10 -= i14;
                    } else {
                        continue;
                    }
                } else if (i12 == 8) {
                    int i15 = c0200a.f19814b;
                    if (i15 == i10) {
                        i10 = c0200a.f19816d;
                    } else {
                        if (i15 < i10) {
                            i10--;
                        }
                        if (c0200a.f19816d <= i10) {
                            i10++;
                        }
                    }
                }
            } else if (c0200a.f19814b <= i10) {
                i10 += c0200a.f19816d;
            }
        }
        return i10;
    }

    public final long L(B b10) {
        return this.f19635n.hasStableIds() ? b10.getItemId() : b10.mPosition;
    }

    public final B M(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return N(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final Rect P(View view) {
        m mVar = (m) view.getLayoutParams();
        boolean z10 = mVar.f19703c;
        Rect rect = mVar.f19702b;
        if (!z10) {
            return rect;
        }
        x xVar = this.f19655y0;
        if (xVar.f19742g && (mVar.f19701a.isUpdated() || mVar.f19701a.isInvalid())) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList<k> arrayList = this.f19641r;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Rect rect2 = this.f19632k;
            rect2.set(0, 0, 0, 0);
            arrayList.get(i10).getItemOffsets(rect2, view, this, xVar);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        mVar.f19703c = false;
        return rect;
    }

    public final boolean Q() {
        return !this.f19650w || this.f19594F || this.f19628f.g();
    }

    public final boolean R() {
        return this.f19598H > 0;
    }

    public final void S(int i10) {
        if (this.f19636o == null) {
            return;
        }
        setScrollState(2);
        this.f19636o.t0(i10);
        awakenScrollBars();
    }

    public final void T() {
        int iH = this.f19629g.h();
        for (int i10 = 0; i10 < iH; i10++) {
            ((m) this.f19629g.g(i10).getLayoutParams()).f19703c = true;
        }
        ArrayList<B> arrayList = this.f19626d.f19714c;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            m mVar = (m) arrayList.get(i11).itemView.getLayoutParams();
            if (mVar != null) {
                mVar.f19703c = true;
            }
        }
    }

    public final void U(int i10, int i11, boolean z10) {
        int i12 = i10 + i11;
        int iH = this.f19629g.h();
        for (int i13 = 0; i13 < iH; i13++) {
            B bN = N(this.f19629g.g(i13));
            if (bN != null && !bN.shouldIgnore()) {
                int i14 = bN.mPosition;
                x xVar = this.f19655y0;
                if (i14 >= i12) {
                    if (f19575S0) {
                        bN.toString();
                    }
                    bN.offsetPosition(-i11, z10);
                    xVar.f19741f = true;
                } else if (i14 >= i10) {
                    if (f19575S0) {
                        bN.toString();
                    }
                    bN.flagRemovedAndOffsetPosition(i10 - 1, -i11, z10);
                    xVar.f19741f = true;
                }
            }
        }
        s sVar = this.f19626d;
        ArrayList<B> arrayList = sVar.f19714c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            B b10 = arrayList.get(size);
            if (b10 != null) {
                int i15 = b10.mPosition;
                if (i15 >= i12) {
                    if (f19575S0) {
                        b10.toString();
                    }
                    b10.offsetPosition(-i11, z10);
                } else if (i15 >= i10) {
                    b10.addFlags(8);
                    sVar.g(size);
                }
            }
        }
        requestLayout();
    }

    public final void V() {
        this.f19598H++;
    }

    public final void W(boolean z10) {
        int i10;
        AccessibilityManager accessibilityManager;
        int i11 = this.f19598H - 1;
        this.f19598H = i11;
        if (i11 < 1) {
            if (f19574R0 && i11 < 0) {
                throw new IllegalStateException(androidx.compose.animation.k.a(this, new StringBuilder("layout or scroll counter cannot go below zero.Some calls are not matching")));
            }
            this.f19598H = 0;
            if (z10) {
                int i12 = this.f19586B;
                this.f19586B = 0;
                if (i12 != 0 && (accessibilityManager = this.f19590D) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    accessibilityEventObtain.setContentChangeTypes(i12);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                ArrayList arrayList = this.f19607L0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    B b10 = (B) arrayList.get(size);
                    if (b10.itemView.getParent() == this && !b10.shouldIgnore() && (i10 = b10.mPendingAccessibilityState) != -1) {
                        View view = b10.itemView;
                        WeakHashMap<View, Z> weakHashMap = androidx.core.view.O.f16859a;
                        view.setImportantForAccessibility(i10);
                        b10.mPendingAccessibilityState = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void X(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f19616Q) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f19616Q = motionEvent.getPointerId(i10);
            int x10 = (int) (motionEvent.getX(i10) + 0.5f);
            this.f19621U = x10;
            this.f19619S = x10;
            int y10 = (int) (motionEvent.getY(i10) + 0.5f);
            this.f19622V = y10;
            this.f19620T = y10;
        }
    }

    public final void Y() {
        if (this.f19593E0 || !this.f19647u) {
            return;
        }
        WeakHashMap<View, Z> weakHashMap = androidx.core.view.O.f16859a;
        postOnAnimation(this.f19609M0);
        this.f19593E0 = true;
    }

    public final void Z() {
        boolean z10;
        boolean z11 = false;
        if (this.f19594F) {
            C1436a c1436a = this.f19628f;
            c1436a.k(c1436a.f19808b);
            c1436a.k(c1436a.f19809c);
            c1436a.f19812f = 0;
            if (this.f19596G) {
                this.f19636o.d0();
            }
        }
        if (this.f19612O == null || !this.f19636o.F0()) {
            this.f19628f.c();
        } else {
            this.f19628f.j();
        }
        boolean z12 = this.f19587B0 || this.f19589C0;
        boolean z13 = this.f19650w && this.f19612O != null && ((z10 = this.f19594F) || z12 || this.f19636o.f19686f) && (!z10 || this.f19635n.hasStableIds());
        x xVar = this.f19655y0;
        xVar.j = z13;
        if (z13 && z12 && !this.f19594F && this.f19612O != null && this.f19636o.F0()) {
            z11 = true;
        }
        xVar.f19745k = z11;
    }

    public final void a0(boolean z10) {
        this.f19596G = z10 | this.f19596G;
        this.f19594F = true;
        int iH = this.f19629g.h();
        for (int i10 = 0; i10 < iH; i10++) {
            B bN = N(this.f19629g.g(i10));
            if (bN != null && !bN.shouldIgnore()) {
                bN.addFlags(6);
            }
        }
        T();
        s sVar = this.f19626d;
        ArrayList<B> arrayList = sVar.f19714c;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            B b10 = arrayList.get(i11);
            if (b10 != null) {
                b10.addFlags(6);
                b10.addChangePayload(null);
            }
        }
        Adapter adapter = RecyclerView.this.f19635n;
        if (adapter == null || !adapter.hasStableIds()) {
            sVar.f();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        l lVar = this.f19636o;
        if (lVar != null) {
            lVar.getClass();
        }
        super.addFocusables(arrayList, i10, i11);
    }

    public final void b0(B b10, i.b bVar) {
        b10.setFlags(0, 8192);
        boolean z10 = this.f19655y0.f19743h;
        Q q10 = this.f19630h;
        if (z10 && b10.isUpdated() && !b10.isRemoved() && !b10.shouldIgnore()) {
            q10.f19569b.e(b10, L(b10));
        }
        X<B, Q.a> x10 = q10.f19568a;
        Q.a aVarA = x10.get(b10);
        if (aVarA == null) {
            aVarA = Q.a.a();
            x10.put(b10, aVarA);
        }
        aVarA.f19572b = bVar;
        aVarA.f19571a |= 4;
    }

    public final int c0(float f10, int i10) {
        float height = f10 / getHeight();
        float width = i10 / getWidth();
        EdgeEffect edgeEffect = this.f19604K;
        float f11 = 0.0f;
        if (edgeEffect == null || H0.d.a(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f19608M;
            if (edgeEffect2 != null && H0.d.a(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.f19608M.onRelease();
                } else {
                    float fB = H0.d.b(this.f19608M, width, height);
                    if (H0.d.a(this.f19608M) == 0.0f) {
                        this.f19608M.onRelease();
                    }
                    f11 = fB;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.f19604K.onRelease();
            } else {
                float f12 = -H0.d.b(this.f19604K, -width, 1.0f - height);
                if (H0.d.a(this.f19604K) == 0.0f) {
                    this.f19604K.onRelease();
                }
                f11 = f12;
            }
            invalidate();
        }
        return Math.round(f11 * getWidth());
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof m) && this.f19636o.h((m) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        l lVar = this.f19636o;
        if (lVar != null && lVar.f()) {
            return this.f19636o.l(this.f19655y0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        l lVar = this.f19636o;
        if (lVar != null && lVar.f()) {
            return this.f19636o.m(this.f19655y0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        l lVar = this.f19636o;
        if (lVar != null && lVar.f()) {
            return this.f19636o.n(this.f19655y0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        l lVar = this.f19636o;
        if (lVar != null && lVar.g()) {
            return this.f19636o.o(this.f19655y0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        l lVar = this.f19636o;
        if (lVar != null && lVar.g()) {
            return this.f19636o.p(this.f19655y0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        l lVar = this.f19636o;
        if (lVar != null && lVar.g()) {
            return this.f19636o.q(this.f19655y0);
        }
        return 0;
    }

    public final int d0(float f10, int i10) {
        float width = f10 / getWidth();
        float height = i10 / getHeight();
        EdgeEffect edgeEffect = this.f19606L;
        float f11 = 0.0f;
        if (edgeEffect == null || H0.d.a(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f19610N;
            if (edgeEffect2 != null && H0.d.a(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.f19610N.onRelease();
                } else {
                    float fB = H0.d.b(this.f19610N, height, 1.0f - width);
                    if (H0.d.a(this.f19610N) == 0.0f) {
                        this.f19610N.onRelease();
                    }
                    f11 = fB;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.f19606L.onRelease();
            } else {
                float f12 = -H0.d.b(this.f19606L, -height, width);
                if (H0.d.a(this.f19606L) == 0.0f) {
                    this.f19606L.onRelease();
                }
                f11 = f12;
            }
            invalidate();
        }
        return Math.round(f11 * getHeight());
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return getScrollingChildHelper().a(f10, f11, z10);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f10, float f11) {
        return getScrollingChildHelper().b(f10, f11);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, i11, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return getScrollingChildHelper().d(i10, i11, i12, i13, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z10;
        super.draw(canvas);
        ArrayList<k> arrayList = this.f19641r;
        int size = arrayList.size();
        boolean z11 = false;
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.get(i10).onDrawOver(canvas, this, this.f19655y0);
        }
        EdgeEffect edgeEffect = this.f19604K;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z10 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.f19631i ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f19604K;
            z10 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.f19606L;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f19631i) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f19606L;
            z10 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.f19608M;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f19631i ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f19608M;
            z10 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.f19610N;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f19631i) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f19610N;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z11 = true;
            }
            z10 |= z11;
            canvas.restoreToCount(iSave4);
        }
        if ((z10 || this.f19612O == null || arrayList.size() <= 0 || !this.f19612O.k()) ? z10 : true) {
            WeakHashMap<View, Z> weakHashMap = androidx.core.view.O.f16859a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    public final void e0(k kVar) {
        l lVar = this.f19636o;
        if (lVar != null) {
            lVar.d("Cannot remove item decoration during a scroll  or layout");
        }
        ArrayList<k> arrayList = this.f19641r;
        arrayList.remove(kVar);
        if (arrayList.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        T();
        requestLayout();
    }

    public final void f0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f19632k;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof m) {
            m mVar = (m) layoutParams;
            if (!mVar.f19703c) {
                int i10 = rect.left;
                Rect rect2 = mVar.f19702b;
                rect.left = i10 - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.f19636o.q0(this, view, this.f19632k, !this.f19650w, view2 == null);
    }

    /* JADX WARN: Code duplicated, block: B:136:0x0190  */
    /* JADX WARN: Code duplicated, block: B:24:0x004c  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i10) {
        View viewX;
        int i11;
        byte b10;
        boolean z10;
        this.f19636o.getClass();
        boolean z11 = true;
        boolean z12 = (this.f19635n == null || this.f19636o == null || R() || this.f19656z) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        x xVar = this.f19655y0;
        s sVar = this.f19626d;
        if (z12 && (i10 == 2 || i10 == 1)) {
            if (this.f19636o.g()) {
                if (focusFinder.findNextFocus(this, view, i10 == 2 ? 130 : 33) == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            if (!z10 && this.f19636o.f()) {
                z10 = focusFinder.findNextFocus(this, view, (this.f19636o.G() == 1) ^ (i10 == 2) ? 66 : 17) == null;
            }
            if (z10) {
                p();
                if (F(view) == null) {
                    return null;
                }
                n0();
                this.f19636o.X(view, i10, sVar, xVar);
                o0(false);
            }
            viewX = focusFinder.findNextFocus(this, view, i10);
        } else {
            View viewFindNextFocus = focusFinder.findNextFocus(this, view, i10);
            if (viewFindNextFocus == null && z12) {
                p();
                if (F(view) == null) {
                    return null;
                }
                n0();
                viewX = this.f19636o.X(view, i10, sVar, xVar);
                o0(false);
            } else {
                viewX = viewFindNextFocus;
            }
        }
        if (viewX != null && !viewX.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i10);
            }
            f0(viewX, null);
            return view;
        }
        if (viewX == null || viewX == this || viewX == view) {
            z11 = false;
        } else if (F(viewX) == null) {
            z11 = false;
        } else if (view != null && F(view) != null) {
            int width = view.getWidth();
            int height = view.getHeight();
            Rect rect = this.f19632k;
            rect.set(0, 0, width, height);
            int width2 = viewX.getWidth();
            int height2 = viewX.getHeight();
            Rect rect2 = this.f19633l;
            rect2.set(0, 0, width2, height2);
            offsetDescendantRectToMyCoords(view, rect);
            offsetDescendantRectToMyCoords(viewX, rect2);
            int i12 = this.f19636o.G() == 1 ? -1 : 1;
            int i13 = rect.left;
            int i14 = rect2.left;
            if ((i13 < i14 || rect.right <= i14) && rect.right < rect2.right) {
                i11 = 1;
            } else {
                int i15 = rect.right;
                int i16 = rect2.right;
                i11 = ((i15 > i16 || i13 >= i16) && i13 > i14) ? -1 : 0;
            }
            int i17 = rect.top;
            int i18 = rect2.top;
            if ((i17 < i18 || rect.bottom <= i18) && rect.bottom < rect2.bottom) {
                b10 = 1;
            } else {
                int i19 = rect.bottom;
                int i20 = rect2.bottom;
                b10 = ((i19 > i20 || i17 >= i20) && i17 > i18) ? (byte) -1 : (byte) 0;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 17) {
                        if (i10 != 33) {
                            if (i10 != 66) {
                                if (i10 != 130) {
                                    StringBuilder sb2 = new StringBuilder("Invalid direction: ");
                                    sb2.append(i10);
                                    throw new IllegalArgumentException(androidx.compose.animation.k.a(this, sb2));
                                }
                                if (b10 <= 0) {
                                    z11 = false;
                                }
                            } else if (i11 <= 0) {
                                z11 = false;
                            }
                        } else if (b10 >= 0) {
                            z11 = false;
                        }
                    } else if (i11 >= 0) {
                        z11 = false;
                    }
                } else if (b10 <= 0 && (b10 != 0 || i11 * i12 <= 0)) {
                    z11 = false;
                }
            } else if (b10 >= 0 && (b10 != 0 || i11 * i12 >= 0)) {
                z11 = false;
            }
        }
        return z11 ? viewX : super.focusSearch(view, i10);
    }

    public final void g0() {
        VelocityTracker velocityTracker = this.f19618R;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean zIsFinished = false;
        p0(0);
        EdgeEffect edgeEffect = this.f19604K;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.f19604K.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f19606L;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.f19606L.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f19608M;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.f19608M.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f19610N;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.f19610N.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap<View, Z> weakHashMap = androidx.core.view.O.f16859a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        l lVar = this.f19636o;
        if (lVar != null) {
            return lVar.t();
        }
        throw new IllegalStateException(androidx.compose.animation.k.a(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        l lVar = this.f19636o;
        if (lVar != null) {
            return lVar.u(getContext(), attributeSet);
        }
        throw new IllegalStateException(androidx.compose.animation.k.a(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public Adapter getAdapter() {
        return this.f19635n;
    }

    @Override // android.view.View
    public int getBaseline() {
        l lVar = this.f19636o;
        if (lVar == null) {
            return super.getBaseline();
        }
        lVar.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i10, int i11) {
        return super.getChildDrawingOrder(i10, i11);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f19631i;
    }

    public K getCompatAccessibilityDelegate() {
        return this.f19595F0;
    }

    public h getEdgeEffectFactory() {
        return this.f19602J;
    }

    public i getItemAnimator() {
        return this.f19612O;
    }

    public int getItemDecorationCount() {
        return this.f19641r.size();
    }

    public l getLayoutManager() {
        return this.f19636o;
    }

    public int getMaxFlingVelocity() {
        return this.f19642r0;
    }

    public int getMinFlingVelocity() {
        return this.f19640q0;
    }

    public long getNanoTime() {
        if (f19580X0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public o getOnFlingListener() {
        return this.f19638p0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f19648u0;
    }

    public r getRecycledViewPool() {
        return this.f19626d.c();
    }

    public int getScrollState() {
        return this.f19614P;
    }

    public final void h(B b10) {
        View view = b10.itemView;
        boolean z10 = view.getParent() == this;
        this.f19626d.l(M(view));
        if (b10.isTmpDetached()) {
            this.f19629g.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z10) {
            this.f19629g.a(view, -1, true);
            return;
        }
        C1442g c1442g = this.f19629g;
        int iIndexOfChild = c1442g.f19844a.f19511a.indexOfChild(view);
        if (iIndexOfChild >= 0) {
            c1442g.f19845b.h(iIndexOfChild);
            c1442g.i(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:36:0x0107 A[DONT_INVERT, PHI: r4
      0x0107: PHI (r4v10 boolean) = (r4v8 boolean), (r4v11 boolean) binds: [B:34:0x00ee, B:32:0x00ea] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x0109  */
    /* JADX WARN: Code duplicated, block: B:41:0x0111  */
    public final boolean h0(int i10, int i11, MotionEvent motionEvent, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z10;
        p();
        Adapter adapter = this.f19635n;
        int[] iArr = this.f19605K0;
        if (adapter != null) {
            iArr[0] = 0;
            iArr[1] = 0;
            i0(i10, i11, iArr);
            int i17 = iArr[0];
            int i18 = iArr[1];
            i13 = i17;
            i14 = i18;
            i15 = i10 - i17;
            i16 = i11 - i18;
        } else {
            i13 = 0;
            i14 = 0;
            i15 = 0;
            i16 = 0;
        }
        if (!this.f19641r.isEmpty()) {
            invalidate();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        w(i13, i14, i15, i16, this.f19601I0, i12, iArr);
        int i19 = iArr[0];
        int i20 = i15 - i19;
        int i21 = iArr[1];
        int i22 = i16 - i21;
        boolean z11 = (i19 == 0 && i21 == 0) ? false : true;
        int i23 = this.f19621U;
        int[] iArr2 = this.f19601I0;
        int i24 = iArr2[0];
        this.f19621U = i23 - i24;
        int i25 = this.f19622V;
        int i26 = iArr2[1];
        this.f19622V = i25 - i26;
        int[] iArr3 = this.f19603J0;
        iArr3[0] = iArr3[0] + i24;
        iArr3[1] = iArr3[1] + i26;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && (motionEvent.getSource() & 8194) != 8194) {
                float x10 = motionEvent.getX();
                float f10 = i20;
                float y10 = motionEvent.getY();
                float f11 = i22;
                if (f10 < 0.0f) {
                    z();
                    H0.d.b(this.f19604K, (-f10) / getWidth(), 1.0f - (y10 / getHeight()));
                } else {
                    if (f10 > 0.0f) {
                        A();
                        H0.d.b(this.f19608M, f10 / getWidth(), y10 / getHeight());
                    } else {
                        z10 = false;
                    }
                    if (f11 < 0.0f) {
                        B();
                        H0.d.b(this.f19606L, (-f11) / getHeight(), x10 / getWidth());
                    } else if (f11 > 0.0f) {
                        y();
                        H0.d.b(this.f19610N, f11 / getHeight(), 1.0f - (x10 / getWidth()));
                    } else if (z10 || f10 != 0.0f || f11 != 0.0f) {
                        WeakHashMap<View, Z> weakHashMap = androidx.core.view.O.f16859a;
                        postInvalidateOnAnimation();
                    }
                    z10 = true;
                    if (z10) {
                        WeakHashMap<View, Z> weakHashMap2 = androidx.core.view.O.f16859a;
                        postInvalidateOnAnimation();
                    } else {
                        WeakHashMap<View, Z> weakHashMap3 = androidx.core.view.O.f16859a;
                        postInvalidateOnAnimation();
                    }
                }
                z10 = true;
                if (f11 < 0.0f) {
                    B();
                    H0.d.b(this.f19606L, (-f11) / getHeight(), x10 / getWidth());
                } else if (f11 > 0.0f) {
                    y();
                    H0.d.b(this.f19610N, f11 / getHeight(), 1.0f - (x10 / getWidth()));
                } else if (z10) {
                    WeakHashMap<View, Z> weakHashMap4 = androidx.core.view.O.f16859a;
                    postInvalidateOnAnimation();
                } else {
                    WeakHashMap<View, Z> weakHashMap5 = androidx.core.view.O.f16859a;
                    postInvalidateOnAnimation();
                }
                z10 = true;
                if (z10) {
                    WeakHashMap<View, Z> weakHashMap6 = androidx.core.view.O.f16859a;
                    postInvalidateOnAnimation();
                } else {
                    WeakHashMap<View, Z> weakHashMap7 = androidx.core.view.O.f16859a;
                    postInvalidateOnAnimation();
                }
            }
            n(i10, i11);
        }
        if (i13 != 0 || i14 != 0) {
            x(i13, i14);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z11 && i13 == 0 && i14 == 0) ? false : true;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final void i(k kVar) {
        l lVar = this.f19636o;
        if (lVar != null) {
            lVar.d("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList<k> arrayList = this.f19641r;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(kVar);
        T();
        requestLayout();
    }

    public final void i0(int i10, int i11, int[] iArr) {
        B b10;
        C1442g c1442g = this.f19629g;
        n0();
        V();
        int i12 = p271w0.j.f47686a;
        Trace.beginSection("RV Scroll");
        x xVar = this.f19655y0;
        D(xVar);
        s sVar = this.f19626d;
        int iS0 = i10 != 0 ? this.f19636o.s0(i10, sVar, xVar) : 0;
        int iU0 = i11 != 0 ? this.f19636o.u0(i11, sVar, xVar) : 0;
        Trace.endSection();
        int iE = c1442g.e();
        for (int i13 = 0; i13 < iE; i13++) {
            View viewD = c1442g.d(i13);
            B bM = M(viewD);
            if (bM != null && (b10 = bM.mShadowingHolder) != null) {
                View view = b10.itemView;
                int left = viewD.getLeft();
                int top = viewD.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        W(true);
        o0(false);
        if (iArr != null) {
            iArr[0] = iS0;
            iArr[1] = iU0;
        }
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f19647u;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f19656z;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f16991d;
    }

    public final void j(q qVar) {
        if (this.f19585A0 == null) {
            this.f19585A0 = new ArrayList();
        }
        this.f19585A0.add(qVar);
    }

    public final void j0(int i10) {
        androidx.recyclerview.widget.z zVar;
        if (this.f19656z) {
            return;
        }
        setScrollState(0);
        A a10 = this.v0;
        RecyclerView.this.removeCallbacks(a10);
        a10.f19660d.abortAnimation();
        l lVar = this.f19636o;
        if (lVar != null && (zVar = lVar.f19685e) != null) {
            zVar.d();
        }
        l lVar2 = this.f19636o;
        if (lVar2 == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            lVar2.t0(i10);
            awakenScrollBars();
        }
    }

    public final void k(String str) {
        if (R()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException(androidx.compose.animation.k.a(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
        }
        if (this.f19600I > 0) {
            new IllegalStateException(androidx.compose.animation.k.a(this, new StringBuilder("")));
        }
    }

    public final boolean k0(EdgeEffect edgeEffect, int i10, int i11) {
        if (i10 > 0) {
            return true;
        }
        float fA = H0.d.a(edgeEffect) * i11;
        float fAbs = Math.abs(-i10) * 0.35f;
        float f10 = this.f19624b * 0.015f;
        double dLog = Math.log(fAbs / f10);
        double d10 = f19577U0;
        return ((float) (Math.exp((d10 / (d10 - 1.0d)) * dLog) * ((double) f10))) < fA;
    }

    public final void l0(int i10, int i11, boolean z10) {
        l lVar = this.f19636o;
        if (lVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f19656z) {
            return;
        }
        if (!lVar.f()) {
            i10 = 0;
        }
        if (!this.f19636o.g()) {
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        if (z10) {
            int i12 = i10 != 0 ? 1 : 0;
            if (i11 != 0) {
                i12 |= 2;
            }
            getScrollingChildHelper().g(i12, 1);
        }
        this.v0.c(i10, i11, Integer.MIN_VALUE, null);
    }

    public final void m() {
        int iH = this.f19629g.h();
        for (int i10 = 0; i10 < iH; i10++) {
            B bN = N(this.f19629g.g(i10));
            if (!bN.shouldIgnore()) {
                bN.clearOldPosition();
            }
        }
        s sVar = this.f19626d;
        ArrayList<B> arrayList = sVar.f19714c;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.get(i11).clearOldPosition();
        }
        ArrayList<B> arrayList2 = sVar.f19712a;
        int size2 = arrayList2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            arrayList2.get(i12).clearOldPosition();
        }
        ArrayList<B> arrayList3 = sVar.f19713b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i13 = 0; i13 < size3; i13++) {
                sVar.f19713b.get(i13).clearOldPosition();
            }
        }
    }

    public final void m0(int i10) {
        if (this.f19656z) {
            return;
        }
        l lVar = this.f19636o;
        if (lVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            lVar.D0(this, i10);
        }
    }

    public final void n(int i10, int i11) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f19604K;
        if (edgeEffect == null || edgeEffect.isFinished() || i10 <= 0) {
            zIsFinished = false;
        } else {
            this.f19604K.onRelease();
            zIsFinished = this.f19604K.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f19608M;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i10 < 0) {
            this.f19608M.onRelease();
            zIsFinished |= this.f19608M.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f19606L;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i11 > 0) {
            this.f19606L.onRelease();
            zIsFinished |= this.f19606L.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f19610N;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i11 < 0) {
            this.f19610N.onRelease();
            zIsFinished |= this.f19610N.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap<View, Z> weakHashMap = androidx.core.view.O.f16859a;
            postInvalidateOnAnimation();
        }
    }

    public final void n0() {
        int i10 = this.f19652x + 1;
        this.f19652x = i10;
        if (i10 != 1 || this.f19656z) {
            return;
        }
        this.f19654y = false;
    }

    public final void o0(boolean z10) {
        if (this.f19652x < 1) {
            if (f19574R0) {
                throw new IllegalStateException(androidx.compose.animation.k.a(this, new StringBuilder("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.")));
            }
            this.f19652x = 1;
        }
        if (!z10 && !this.f19656z) {
            this.f19654y = false;
        }
        if (this.f19652x == 1) {
            if (z10 && this.f19654y && !this.f19656z && this.f19636o != null && this.f19635n != null) {
                s();
            }
            if (!this.f19656z) {
                this.f19654y = false;
            }
        }
        this.f19652x--;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0058  */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        this.f19598H = 0;
        this.f19647u = true;
        this.f19650w = this.f19650w && !isLayoutRequested();
        this.f19626d.d();
        l lVar = this.f19636o;
        if (lVar != null) {
            lVar.f19687g = true;
            lVar.V(this);
        }
        this.f19593E0 = false;
        if (f19580X0) {
            ThreadLocal<RunnableC1453s> threadLocal = RunnableC1453s.f19973f;
            RunnableC1453s runnableC1453s = threadLocal.get();
            this.f19651w0 = runnableC1453s;
            if (runnableC1453s == null) {
                this.f19651w0 = new RunnableC1453s();
                WeakHashMap<View, Z> weakHashMap = androidx.core.view.O.f16859a;
                Display display = getDisplay();
                if (isInEditMode() || display == null) {
                    refreshRate = 60.0f;
                } else {
                    refreshRate = display.getRefreshRate();
                    if (refreshRate < 30.0f) {
                        refreshRate = 60.0f;
                    }
                }
                RunnableC1453s runnableC1453s2 = this.f19651w0;
                runnableC1453s2.f19977d = (long) (1.0E9f / refreshRate);
                threadLocal.set(runnableC1453s2);
            }
            RunnableC1453s runnableC1453s3 = this.f19651w0;
            runnableC1453s3.getClass();
            boolean z10 = f19574R0;
            ArrayList<RecyclerView> arrayList = runnableC1453s3.f19975b;
            if (z10 && arrayList.contains(this)) {
                throw new IllegalStateException("RecyclerView already present in worker list!");
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        s sVar;
        RunnableC1453s runnableC1453s;
        androidx.recyclerview.widget.z zVar;
        super.onDetachedFromWindow();
        i iVar = this.f19612O;
        if (iVar != null) {
            iVar.j();
        }
        int i10 = 0;
        setScrollState(0);
        A a10 = this.v0;
        RecyclerView.this.removeCallbacks(a10);
        a10.f19660d.abortAnimation();
        l lVar = this.f19636o;
        if (lVar != null && (zVar = lVar.f19685e) != null) {
            zVar.d();
        }
        this.f19647u = false;
        l lVar2 = this.f19636o;
        if (lVar2 != null) {
            lVar2.f19687g = false;
            lVar2.W(this);
        }
        this.f19607L0.clear();
        removeCallbacks(this.f19609M0);
        this.f19630h.getClass();
        while (Q.a.f19570d.a() != null) {
        }
        int i11 = 0;
        while (true) {
            sVar = this.f19626d;
            ArrayList<B> arrayList = sVar.f19714c;
            if (i11 >= arrayList.size()) {
                break;
            }
            p241t7.b.a(arrayList.get(i11).itemView);
            i11++;
        }
        sVar.e(RecyclerView.this.f19635n, false);
        while (i10 < getChildCount()) {
            int i12 = i10 + 1;
            View childAt = getChildAt(i10);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            ArrayList<J0.a> arrayList2 = p241t7.b.t(childAt).f3959a;
            for (int iR = kotlin.collections.l.r(arrayList2); -1 < iR; iR--) {
                arrayList2.get(iR).a();
            }
            i10 = i12;
        }
        if (!f19580X0 || (runnableC1453s = this.f19651w0) == null) {
            return;
        }
        boolean zRemove = runnableC1453s.f19975b.remove(this);
        if (f19574R0 && !zRemove) {
            throw new IllegalStateException("RecyclerView removal failed!");
        }
        this.f19651w0 = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList<k> arrayList = this.f19641r;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.get(i10).onDraw(canvas, this, this.f19655y0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0066  */
    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f10;
        float axisValue;
        if (this.f19636o != null && !this.f19656z && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f10 = this.f19636o.g() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.f19636o.f() ? motionEvent.getAxisValue(10) : 0.0f;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                float axisValue2 = motionEvent.getAxisValue(26);
                if (this.f19636o.g()) {
                    f10 = -axisValue2;
                } else if (this.f19636o.f()) {
                    axisValue = axisValue2;
                    f10 = 0.0f;
                } else {
                    f10 = 0.0f;
                    axisValue = 0.0f;
                }
            } else {
                f10 = 0.0f;
                axisValue = 0.0f;
            }
            if (f10 != 0.0f || axisValue != 0.0f) {
                int i10 = (int) (axisValue * this.f19644s0);
                int i11 = (int) (f10 * this.f19646t0);
                l lVar = this.f19636o;
                if (lVar == null) {
                    Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                } else if (!this.f19656z) {
                    int[] iArr = this.f19605K0;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    boolean zF = lVar.f();
                    boolean zG = this.f19636o.g();
                    int i12 = zG ? (zF ? 1 : 0) | 2 : zF ? 1 : 0;
                    float y10 = motionEvent.getY();
                    float x10 = motionEvent.getX();
                    int iC0 = i10 - c0(y10, i10);
                    int iD0 = i11 - d0(x10, i11);
                    getScrollingChildHelper().g(i12, 1);
                    if (v(zF ? iC0 : 0, zG ? iD0 : 0, 1, this.f19605K0, this.f19601I0)) {
                        iC0 -= iArr[0];
                        iD0 -= iArr[1];
                    }
                    h0(zF ? iC0 : 0, zG ? iD0 : 0, motionEvent, 1);
                    RunnableC1453s runnableC1453s = this.f19651w0;
                    if (runnableC1453s != null && (iC0 != 0 || iD0 != 0)) {
                        runnableC1453s.a(iC0, iD0, this);
                    }
                    p0(1);
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        if (this.f19656z) {
            return false;
        }
        this.f19645t = null;
        if (G(motionEvent)) {
            g0();
            setScrollState(0);
            return true;
        }
        l lVar = this.f19636o;
        if (lVar == null) {
            return false;
        }
        boolean zF = lVar.f();
        boolean zG = this.f19636o.g();
        if (this.f19618R == null) {
            this.f19618R = VelocityTracker.obtain();
        }
        this.f19618R.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f19584A) {
                this.f19584A = false;
            }
            this.f19616Q = motionEvent.getPointerId(0);
            int x10 = (int) (motionEvent.getX() + 0.5f);
            this.f19621U = x10;
            this.f19619S = x10;
            int y10 = (int) (motionEvent.getY() + 0.5f);
            this.f19622V = y10;
            this.f19620T = y10;
            EdgeEffect edgeEffect = this.f19604K;
            if (edgeEffect == null || H0.d.a(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
                z10 = false;
            } else {
                H0.d.b(this.f19604K, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                z10 = true;
            }
            EdgeEffect edgeEffect2 = this.f19608M;
            boolean z12 = z10;
            if (edgeEffect2 != null && H0.d.a(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
                z12 = z10;
                z12 = z10;
                H0.d.b(this.f19608M, 0.0f, motionEvent.getY() / getHeight());
                z12 = true;
            }
            z12 = z10;
            z12 = z10;
            z12 = z10;
            EdgeEffect edgeEffect3 = this.f19606L;
            boolean z13 = z12;
            if (edgeEffect3 != null && H0.d.a(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
                z13 = z12;
                z13 = z12;
                H0.d.b(this.f19606L, 0.0f, motionEvent.getX() / getWidth());
                z13 = true;
            }
            z13 = z12;
            z13 = z12;
            z13 = z12;
            EdgeEffect edgeEffect4 = this.f19610N;
            boolean z14 = z13;
            if (edgeEffect4 != null && H0.d.a(edgeEffect4) != 0.0f && !canScrollVertically(1)) {
                z14 = z13;
                z14 = z13;
                H0.d.b(this.f19610N, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
                z14 = true;
            }
            if (z14 || this.f19614P == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                p0(1);
            }
            int[] iArr = this.f19603J0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i10 = zF;
            if (zG) {
                i10 = (zF ? 1 : 0) | 2;
            }
            getScrollingChildHelper().g(i10, 0);
        } else if (actionMasked == 1) {
            this.f19618R.clear();
            p0(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f19616Q);
            if (iFindPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f19616Q + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x11 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y11 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.f19614P != 1) {
                int i11 = x11 - this.f19619S;
                int i12 = y11 - this.f19620T;
                if (!zF || Math.abs(i11) <= this.f19623W) {
                    z11 = false;
                } else {
                    this.f19621U = x11;
                    z11 = true;
                }
                if (zG && Math.abs(i12) > this.f19623W) {
                    this.f19622V = y11;
                    z11 = true;
                }
                if (z11) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            g0();
            setScrollState(0);
        } else if (actionMasked == 5) {
            this.f19616Q = motionEvent.getPointerId(actionIndex);
            int x12 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f19621U = x12;
            this.f19619S = x12;
            int y12 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f19622V = y12;
            this.f19620T = y12;
        } else if (actionMasked == 6) {
            X(motionEvent);
        }
        return this.f19614P == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = p271w0.j.f47686a;
        Trace.beginSection("RV OnLayout");
        s();
        Trace.endSection();
        this.f19650w = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        l lVar = this.f19636o;
        if (lVar == null) {
            q(i10, i11);
            return;
        }
        boolean zP = lVar.P();
        boolean z10 = false;
        x xVar = this.f19655y0;
        if (zP) {
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.f19636o.f19682b.q(i10, i11);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z10 = true;
            }
            this.f19611N0 = z10;
            if (z10 || this.f19635n == null) {
                return;
            }
            if (xVar.f19739d == 1) {
                t();
            }
            this.f19636o.w0(i10, i11);
            xVar.f19744i = true;
            u();
            this.f19636o.y0(i10, i11);
            if (this.f19636o.B0()) {
                this.f19636o.w0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                xVar.f19744i = true;
                u();
                this.f19636o.y0(i10, i11);
            }
            this.f19613O0 = getMeasuredWidth();
            this.f19615P0 = getMeasuredHeight();
            return;
        }
        if (this.f19649v) {
            this.f19636o.f19682b.q(i10, i11);
            return;
        }
        if (this.f19588C) {
            n0();
            V();
            Z();
            W(true);
            if (xVar.f19745k) {
                xVar.f19742g = true;
            } else {
                this.f19628f.c();
                xVar.f19742g = false;
            }
            this.f19588C = false;
            o0(false);
        } else if (xVar.f19745k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        Adapter adapter = this.f19635n;
        if (adapter != null) {
            xVar.f19740e = adapter.getItemCount();
        } else {
            xVar.f19740e = 0;
        }
        n0();
        this.f19636o.f19682b.q(i10, i11);
        o0(false);
        xVar.f19742g = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (R()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i10, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof v)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        v vVar = (v) parcelable;
        this.f19627e = vVar;
        super.onRestoreInstanceState(vVar.f4135b);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        v vVar = new v(super.onSaveInstanceState());
        v vVar2 = this.f19627e;
        if (vVar2 != null) {
            vVar.f19721d = vVar2.f19721d;
        } else {
            l lVar = this.f19636o;
            if (lVar != null) {
                vVar.f19721d = lVar.k0();
            } else {
                vVar.f19721d = null;
            }
        }
        return vVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 == i12 && i11 == i13) {
            return;
        }
        this.f19610N = null;
        this.f19606L = null;
        this.f19608M = null;
        this.f19604K = null;
    }

    /* JADX WARN: Code duplicated, block: B:142:0x025a  */
    /* JADX WARN: Code duplicated, block: B:160:0x029c  */
    /* JADX WARN: Code duplicated, block: B:200:0x0324  */
    /* JADX WARN: Code duplicated, block: B:262:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:264:0x03ed A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:265:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:57:0x00fe A[PHI: r0
      0x00fe: PHI (r0v60 int) = (r0v45 int), (r0v64 int) binds: [B:51:0x00e7, B:55:0x00fa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v6 */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zG;
        RecyclerView recyclerView;
        int i10;
        MotionEvent motionEvent2;
        int iMax;
        int i11;
        A a10;
        MotionEvent motionEvent3;
        int minFlingVelocity;
        boolean z10;
        F fE;
        int iL;
        PointF pointFA;
        A a11;
        int i12;
        RecyclerView recyclerView2;
        boolean z11;
        if (this.f19656z || this.f19584A) {
            return false;
        }
        p pVar = this.f19645t;
        if (pVar == null) {
            zG = motionEvent.getAction() == 0 ? false : G(motionEvent);
        } else {
            pVar.a(motionEvent);
            int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.f19645t = null;
            }
            zG = true;
        }
        if (zG) {
            g0();
            setScrollState(0);
            return true;
        }
        l lVar = this.f19636o;
        if (lVar == null) {
            return false;
        }
        boolean zF = lVar.f();
        boolean zG2 = this.f19636o.g();
        if (this.f19618R == null) {
            this.f19618R = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        int[] iArr = this.f19603J0;
        if (actionMasked == 0) {
            iArr[1] = 0;
            iArr[0] = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(iArr[0], iArr[1]);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f19616Q);
                    if (iFindPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f19616Q + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x10 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    int y10 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    int iMax2 = this.f19621U - x10;
                    int iMax3 = this.f19622V - y10;
                    if (this.f19614P != 1) {
                        if (zF) {
                            iMax2 = iMax2 > 0 ? Math.max(0, iMax2 - this.f19623W) : Math.min(0, iMax2 + this.f19623W);
                            if (iMax2 != 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                        } else {
                            z11 = false;
                        }
                        if (zG2) {
                            iMax3 = iMax3 > 0 ? Math.max(0, iMax3 - this.f19623W) : Math.min(0, iMax3 + this.f19623W);
                            if (iMax3 != 0) {
                                z11 = true;
                            }
                        }
                        if (z11) {
                            setScrollState(1);
                        }
                    }
                    if (this.f19614P == 1) {
                        int[] iArr2 = this.f19605K0;
                        iArr2[0] = 0;
                        iArr2[1] = 0;
                        int iC0 = iMax2 - c0(motionEvent.getY(), iMax2);
                        int iD0 = iMax3 - d0(motionEvent.getX(), iMax3);
                        boolean zV = v(zF ? iC0 : 0, zG2 ? iD0 : 0, 0, this.f19605K0, this.f19601I0);
                        int[] iArr3 = this.f19601I0;
                        if (zV) {
                            iC0 -= iArr2[0];
                            iD0 -= iArr2[1];
                            iArr[0] = iArr[0] + iArr3[0];
                            iArr[1] = iArr[1] + iArr3[1];
                            getParent().requestDisallowInterceptTouchEvent(true);
                        }
                        int i13 = iC0;
                        int i14 = iD0;
                        this.f19621U = x10 - iArr3[0];
                        this.f19622V = y10 - iArr3[1];
                        if (h0(zF ? i13 : 0, zG2 ? i14 : 0, motionEvent, 0)) {
                            getParent().requestDisallowInterceptTouchEvent(true);
                        }
                        RunnableC1453s runnableC1453s = this.f19651w0;
                        if (runnableC1453s != null && (i13 != 0 || i14 != 0)) {
                            runnableC1453s.a(i13, i14, this);
                        }
                    }
                } else if (actionMasked == 3) {
                    g0();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.f19616Q = motionEvent.getPointerId(actionIndex);
                    int x11 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.f19621U = x11;
                    this.f19619S = x11;
                    int y11 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.f19622V = y11;
                    this.f19620T = y11;
                } else if (actionMasked == 6) {
                    X(motionEvent);
                }
                recyclerView = this;
            } else {
                this.f19618R.addMovement(motionEventObtain);
                VelocityTracker velocityTracker = this.f19618R;
                int i15 = this.f19642r0;
                velocityTracker.computeCurrentVelocity(Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS, i15);
                float f10 = zF ? -this.f19618R.getXVelocity(this.f19616Q) : 0.0f;
                float f11 = zG2 ? -this.f19618R.getYVelocity(this.f19616Q) : 0.0f;
                if (f10 == 0.0f && f11 == 0.0f) {
                    recyclerView2 = this;
                    i12 = 0;
                    motionEvent3 = motionEventObtain;
                } else {
                    int i16 = (int) f10;
                    int iMax4 = (int) f11;
                    l lVar2 = this.f19636o;
                    if (lVar2 == null) {
                        Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                    } else {
                        if (!this.f19656z) {
                            int iF = lVar2.f();
                            boolean zG3 = this.f19636o.g();
                            int i17 = this.f19640q0;
                            if (iF == 0 || Math.abs(i16) < i17) {
                                i16 = 0;
                            }
                            if (!zG3 || Math.abs(iMax4) < i17) {
                                iMax4 = 0;
                            }
                            if (i16 != 0 || iMax4 != 0) {
                                if (i16 == 0) {
                                    iMax = 0;
                                } else {
                                    EdgeEffect edgeEffect = this.f19604K;
                                    if (edgeEffect == null || H0.d.a(edgeEffect) == 0.0f) {
                                        EdgeEffect edgeEffect2 = this.f19608M;
                                        if (edgeEffect2 == null || H0.d.a(edgeEffect2) == 0.0f) {
                                            iMax = 0;
                                        } else if (k0(this.f19608M, i16, getWidth())) {
                                            this.f19608M.onAbsorb(i16);
                                            i16 = 0;
                                        }
                                    } else {
                                        int i18 = -i16;
                                        if (k0(this.f19604K, i18, getWidth())) {
                                            this.f19604K.onAbsorb(i18);
                                            i16 = 0;
                                        }
                                    }
                                    iMax = i16;
                                    i16 = 0;
                                }
                                if (iMax4 == 0) {
                                    i11 = iMax4;
                                    iMax4 = 0;
                                } else {
                                    EdgeEffect edgeEffect3 = this.f19606L;
                                    if (edgeEffect3 == null || H0.d.a(edgeEffect3) == 0.0f) {
                                        EdgeEffect edgeEffect4 = this.f19610N;
                                        if (edgeEffect4 == null || H0.d.a(edgeEffect4) == 0.0f) {
                                            i11 = iMax4;
                                            iMax4 = 0;
                                        } else if (k0(this.f19610N, iMax4, getHeight())) {
                                            this.f19610N.onAbsorb(iMax4);
                                            iMax4 = 0;
                                        }
                                    } else {
                                        int i19 = -iMax4;
                                        if (k0(this.f19606L, i19, getHeight())) {
                                            this.f19606L.onAbsorb(i19);
                                            iMax4 = 0;
                                        }
                                    }
                                    i11 = 0;
                                }
                                A a12 = this.v0;
                                if (iMax != 0 || iMax4 != 0) {
                                    int i20 = -i15;
                                    iMax = Math.max(i20, Math.min(iMax, i15));
                                    iMax4 = Math.max(i20, Math.min(iMax4, i15));
                                    a12.a(iMax, iMax4);
                                }
                                if (i16 != 0 || i11 != 0) {
                                    float f12 = i16;
                                    float f13 = i11;
                                    if (!dispatchNestedPreFling(f12, f13)) {
                                        boolean z12 = iF != 0 || zG3;
                                        dispatchNestedFling(f12, f13, z12);
                                        o oVar = this.f19638p0;
                                        if (oVar != null) {
                                            N n10 = (N) oVar;
                                            l layoutManager = n10.f19556a.getLayoutManager();
                                            if (layoutManager == 0 || n10.f19556a.getAdapter() == null || ((Math.abs(i11) <= (minFlingVelocity = n10.f19556a.getMinFlingVelocity()) && Math.abs(i16) <= minFlingVelocity) || !((z10 = layoutManager instanceof w.b)))) {
                                                a10 = a12;
                                                motionEvent3 = motionEventObtain;
                                                if (z12) {
                                                    if (zG3) {
                                                        iF = (iF == true ? 1 : 0) | 2;
                                                    }
                                                    getScrollingChildHelper().g(iF, 1);
                                                    int i21 = -i15;
                                                    a10.a(Math.max(i21, Math.min(i16, i15)), Math.max(i21, Math.min(i11, i15)));
                                                }
                                            } else {
                                                H h8 = (H) n10;
                                                G g10 = !z10 ? null : new G(h8, h8.f19556a.getContext());
                                                if (g10 == null) {
                                                    a10 = a12;
                                                    motionEvent3 = motionEventObtain;
                                                } else {
                                                    int iF2 = layoutManager.F();
                                                    if (iF2 != 0) {
                                                        if (layoutManager.g()) {
                                                            fE = h8.f(layoutManager);
                                                        } else {
                                                            fE = layoutManager.f() ? h8.e(layoutManager) : null;
                                                        }
                                                        if (fE == null) {
                                                            a10 = a12;
                                                            motionEvent3 = motionEventObtain;
                                                        } else {
                                                            int iX = layoutManager.x();
                                                            motionEvent3 = motionEventObtain;
                                                            int i22 = Integer.MIN_VALUE;
                                                            int i23 = Integer.MAX_VALUE;
                                                            int i24 = 0;
                                                            View view = null;
                                                            View view2 = null;
                                                            while (i24 < iX) {
                                                                int i25 = iX;
                                                                View viewW = layoutManager.w(i24);
                                                                if (viewW == null) {
                                                                    a11 = a12;
                                                                } else {
                                                                    a11 = a12;
                                                                    int iC = H.c(viewW, fE);
                                                                    if (iC <= 0 && iC > i22) {
                                                                        view2 = viewW;
                                                                        i22 = iC;
                                                                    }
                                                                    if (iC >= 0 && iC < i23) {
                                                                        view = viewW;
                                                                        i23 = iC;
                                                                    }
                                                                }
                                                                i24++;
                                                                iX = i25;
                                                                a12 = a11;
                                                            }
                                                            a10 = a12;
                                                            boolean z13 = !layoutManager.f() ? i11 <= 0 : i16 <= 0;
                                                            if (z13 && view != null) {
                                                                iL = l.L(view);
                                                            } else if (z13 || view2 == null) {
                                                                if (z13) {
                                                                    view = view2;
                                                                }
                                                                if (view != null) {
                                                                    iL = ((z10 && (pointFA = ((w.b) layoutManager).a(layoutManager.F() - 1)) != null && ((pointFA.x > 0.0f ? 1 : (pointFA.x == 0.0f ? 0 : -1)) < 0 || (pointFA.y > 0.0f ? 1 : (pointFA.y == 0.0f ? 0 : -1)) < 0)) == z13 ? -1 : 1) + l.L(view);
                                                                    if (iL < 0 || iL >= iF2) {
                                                                    }
                                                                }
                                                            } else {
                                                                iL = l.L(view2);
                                                            }
                                                        }
                                                        iL = -1;
                                                    } else {
                                                        a10 = a12;
                                                        motionEvent3 = motionEventObtain;
                                                        iL = -1;
                                                    }
                                                    if (iL != -1) {
                                                        g10.f19722a = iL;
                                                        layoutManager.E0(g10);
                                                    }
                                                }
                                                if (z12) {
                                                    if (zG3) {
                                                        iF = (iF == true ? 1 : 0) | 2;
                                                    }
                                                    getScrollingChildHelper().g(iF, 1);
                                                    int i26 = -i15;
                                                    a10.a(Math.max(i26, Math.min(i16, i15)), Math.max(i26, Math.min(i11, i15)));
                                                }
                                            }
                                        } else {
                                            a10 = a12;
                                            motionEvent3 = motionEventObtain;
                                            if (z12) {
                                                if (zG3) {
                                                    iF = (iF == true ? 1 : 0) | 2;
                                                }
                                                getScrollingChildHelper().g(iF, 1);
                                                int i27 = -i15;
                                                a10.a(Math.max(i27, Math.min(i16, i15)), Math.max(i27, Math.min(i11, i15)));
                                            }
                                        }
                                    }
                                    i12 = 0;
                                    recyclerView2 = this;
                                } else if (iMax != 0 || iMax4 != 0) {
                                    motionEvent3 = motionEventObtain;
                                }
                            }
                        }
                        g0();
                        motionEvent2 = motionEvent3;
                    }
                    motionEvent3 = motionEventObtain;
                    i12 = 0;
                    recyclerView2 = this;
                }
                recyclerView2.setScrollState(i12);
                g0();
                motionEvent2 = motionEvent3;
            }
            motionEvent2.recycle();
            return true;
        }
        recyclerView = this;
        recyclerView.f19616Q = motionEvent.getPointerId(0);
        int x12 = (int) (motionEvent.getX() + 0.5f);
        recyclerView.f19621U = x12;
        recyclerView.f19619S = x12;
        int y12 = (int) (motionEvent.getY() + 0.5f);
        recyclerView.f19622V = y12;
        recyclerView.f19620T = y12;
        if (zG2) {
            i10 = zF;
            i10 = (zF ? 1 : 0) | 2;
        }
        i10 = zF;
        getScrollingChildHelper().g(i10, 0);
        motionEvent2 = motionEventObtain;
        recyclerView.f19618R.addMovement(motionEvent2);
        motionEvent2.recycle();
        return true;
    }

    public final void p() {
        C1442g c1442g = this.f19629g;
        C1436a c1436a = this.f19628f;
        if (!this.f19650w || this.f19594F) {
            int i10 = p271w0.j.f47686a;
            Trace.beginSection("RV FullInvalidate");
            s();
            Trace.endSection();
            return;
        }
        if (c1436a.g()) {
            int i11 = c1436a.f19812f;
            if ((i11 & 4) == 0 || (i11 & 11) != 0) {
                if (c1436a.g()) {
                    int i12 = p271w0.j.f47686a;
                    Trace.beginSection("RV FullInvalidate");
                    s();
                    Trace.endSection();
                    return;
                }
                return;
            }
            int i13 = p271w0.j.f47686a;
            Trace.beginSection("RV PartialInvalidate");
            n0();
            V();
            c1436a.j();
            if (!this.f19654y) {
                int iE = c1442g.e();
                for (int i14 = 0; i14 < iE; i14++) {
                    B bN = N(c1442g.d(i14));
                    if (bN != null && !bN.shouldIgnore() && bN.isUpdated()) {
                        s();
                    }
                }
                c1436a.b();
            }
            o0(true);
            W(true);
            Trace.endSection();
        }
    }

    public final void p0(int i10) {
        getScrollingChildHelper().h(i10);
    }

    public final void q(int i10, int i11) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap<View, Z> weakHashMap = androidx.core.view.O.f16859a;
        setMeasuredDimension(l.i(i10, paddingRight, getMinimumWidth()), l.i(i11, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public final void r(View view) {
        B bN = N(view);
        Adapter adapter = this.f19635n;
        if (adapter != null && bN != null) {
            adapter.onViewDetachedFromWindow(bN);
        }
        ArrayList arrayList = this.f19592E;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((n) this.f19592E.get(size)).b(view);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z10) {
        B bN = N(view);
        if (bN != null) {
            if (bN.isTmpDetached()) {
                bN.clearTmpDetachFlag();
            } else if (!bN.shouldIgnore()) {
                StringBuilder sb2 = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb2.append(bN);
                throw new IllegalArgumentException(androidx.compose.animation.k.a(this, sb2));
            }
        } else if (f19574R0) {
            StringBuilder sb3 = new StringBuilder("No ViewHolder found for child: ");
            sb3.append(view);
            throw new IllegalArgumentException(androidx.compose.animation.k.a(this, sb3));
        }
        view.clearAnimation();
        r(view);
        super.removeDetachedView(view, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        androidx.recyclerview.widget.z zVar = this.f19636o.f19685e;
        if ((zVar == null || !zVar.f19726e) && !R() && view2 != null) {
            f0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        return this.f19636o.q0(this, view, rect, z10, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        ArrayList<p> arrayList = this.f19643s;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.get(i10).d(z10);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f19652x != 0 || this.f19656z) {
            this.f19654y = true;
        } else {
            super.requestLayout();
        }
    }

    /* JADX WARN: Code duplicated, block: B:158:0x0341  */
    /* JADX WARN: Code duplicated, block: B:180:0x0393  */
    /* JADX WARN: Code duplicated, block: B:182:0x0396  */
    /* JADX WARN: Code duplicated, block: B:188:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:190:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:192:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:195:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:198:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:201:0x03d4 A[LOOP:4: B:194:0x03c0->B:201:0x03d4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:204:0x03df  */
    /* JADX WARN: Code duplicated, block: B:207:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:210:0x03f1 A[LOOP:5: B:203:0x03dd->B:210:0x03f1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:211:0x03f4 A[EDGE_INSN: B:211:0x03f4->B:212:0x03f5 BREAK  A[LOOP:5: B:203:0x03dd->B:210:0x03f1]] */
    /* JADX WARN: Code duplicated, block: B:213:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:256:0x03d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:257:0x03d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:258:0x03d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:259:0x03ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:260:0x03f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:261:0x03f4 A[SYNTHETIC] */
    public final void s() {
        B b10;
        View view;
        int i10;
        int iB;
        int i11;
        int iMin;
        B bJ;
        B bJ2;
        int i12;
        View viewFindViewById;
        if (this.f19635n == null) {
            return;
        }
        if (this.f19636o == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        x xVar = this.f19655y0;
        xVar.f19744i = false;
        int i13 = 1;
        boolean z10 = this.f19611N0 && !(this.f19613O0 == getWidth() && this.f19615P0 == getHeight());
        this.f19613O0 = 0;
        this.f19615P0 = 0;
        this.f19611N0 = false;
        if (xVar.f19739d == 1) {
            t();
            this.f19636o.v0(this);
            u();
        } else {
            C1436a c1436a = this.f19628f;
            if ((c1436a.f19809c.isEmpty() || c1436a.f19808b.isEmpty()) && !z10 && this.f19636o.f19693n == getWidth() && this.f19636o.f19694o == getHeight()) {
                this.f19636o.v0(this);
            } else {
                this.f19636o.v0(this);
                u();
            }
        }
        xVar.a(4);
        n0();
        V();
        xVar.f19739d = 1;
        boolean z11 = xVar.j;
        s sVar = this.f19626d;
        Q q10 = this.f19630h;
        if (z11) {
            int iE = this.f19629g.e() - 1;
            while (iE >= 0) {
                B bN = N(this.f19629g.d(iE));
                if (!bN.shouldIgnore()) {
                    long jL = L(bN);
                    this.f19612O.getClass();
                    i.b bVar = new i.b();
                    bVar.a(bN);
                    B b11 = q10.f19569b.b(jL);
                    if (b11 == null || b11.shouldIgnore()) {
                        q10.a(bN, bVar);
                    } else {
                        X<B, Q.a> x10 = q10.f19568a;
                        Q.a aVar = x10.get(b11);
                        int i14 = (aVar == null || (aVar.f19571a & i13) == 0) ? 0 : i13;
                        Q.a aVar2 = x10.get(bN);
                        int i15 = (aVar2 == null || (aVar2.f19571a & i13) == 0) ? 0 : i13;
                        if (i14 == 0 || b11 != bN) {
                            i.b bVarB = q10.b(b11, 4);
                            q10.a(bN, bVar);
                            i.b bVarB2 = q10.b(bN, 8);
                            if (bVarB == null) {
                                int iE2 = this.f19629g.e();
                                for (int i16 = 0; i16 < iE2; i16++) {
                                    B bN2 = N(this.f19629g.d(i16));
                                    if (bN2 != bN && L(bN2) == jL) {
                                        Adapter adapter = this.f19635n;
                                        if (adapter == null || !adapter.hasStableIds()) {
                                            StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                                            sb2.append(bN2);
                                            sb2.append(" \n View Holder 2:");
                                            sb2.append(bN);
                                            throw new IllegalStateException(androidx.compose.animation.k.a(this, sb2));
                                        }
                                        StringBuilder sb3 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                                        sb3.append(bN2);
                                        sb3.append(" \n View Holder 2:");
                                        sb3.append(bN);
                                        throw new IllegalStateException(androidx.compose.animation.k.a(this, sb3));
                                    }
                                }
                                Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + b11 + " cannot be found but it is necessary for " + bN + C());
                            } else {
                                b11.setIsRecyclable(false);
                                if (i14 != 0) {
                                    h(b11);
                                }
                                if (b11 != bN) {
                                    if (i15 != 0) {
                                        h(bN);
                                    }
                                    b11.mShadowedHolder = bN;
                                    h(b11);
                                    sVar.l(b11);
                                    bN.setIsRecyclable(false);
                                    bN.mShadowingHolder = b11;
                                }
                                if (this.f19612O.b(b11, bN, bVarB, bVarB2)) {
                                    Y();
                                }
                            }
                        } else {
                            q10.a(bN, bVar);
                        }
                    }
                }
                iE--;
                i13 = 1;
            }
            X<B, Q.a> x11 = q10.f19568a;
            for (int i17 = x11.f9139d - 1; i17 >= 0; i17--) {
                B bH = x11.h(i17);
                Q.a aVarK = x11.k(i17);
                int i18 = aVarK.f19571a;
                int i19 = i18 & 3;
                d dVar = this.f19617Q0;
                if (i19 == 3) {
                    RecyclerView recyclerView = RecyclerView.this;
                    recyclerView.f19636o.o0(bH.itemView, recyclerView.f19626d);
                } else if ((i18 & 1) != 0) {
                    i.b bVar2 = aVarK.f19572b;
                    if (bVar2 == null) {
                        RecyclerView recyclerView2 = RecyclerView.this;
                        recyclerView2.f19636o.o0(bH.itemView, recyclerView2.f19626d);
                    } else {
                        i.b bVar3 = aVarK.f19573c;
                        RecyclerView recyclerView3 = RecyclerView.this;
                        recyclerView3.f19626d.l(bH);
                        recyclerView3.h(bH);
                        bH.setIsRecyclable(false);
                        if (recyclerView3.f19612O.c(bH, bVar2, bVar3)) {
                            recyclerView3.Y();
                        }
                    }
                } else if ((i18 & 14) == 14) {
                    i.b bVar4 = aVarK.f19572b;
                    i.b bVar5 = aVarK.f19573c;
                    RecyclerView recyclerView4 = RecyclerView.this;
                    recyclerView4.getClass();
                    bH.setIsRecyclable(false);
                    if (recyclerView4.f19612O.a(bH, bVar4, bVar5)) {
                        recyclerView4.Y();
                    }
                } else if ((i18 & 12) == 12) {
                    i.b bVar6 = aVarK.f19572b;
                    i.b bVar7 = aVarK.f19573c;
                    dVar.getClass();
                    bH.setIsRecyclable(false);
                    RecyclerView recyclerView5 = RecyclerView.this;
                    if (recyclerView5.f19594F) {
                        if (recyclerView5.f19612O.b(bH, bH, bVar6, bVar7)) {
                            recyclerView5.Y();
                        }
                    } else if (recyclerView5.f19612O.d(bH, bVar6, bVar7)) {
                        recyclerView5.Y();
                    }
                } else if ((i18 & 4) != 0) {
                    i.b bVar8 = aVarK.f19572b;
                    RecyclerView recyclerView6 = RecyclerView.this;
                    recyclerView6.f19626d.l(bH);
                    recyclerView6.h(bH);
                    bH.setIsRecyclable(false);
                    if (recyclerView6.f19612O.c(bH, bVar8, null)) {
                        recyclerView6.Y();
                    }
                } else if ((i18 & 8) != 0) {
                    i.b bVar9 = aVarK.f19572b;
                    i.b bVar10 = aVarK.f19573c;
                    RecyclerView recyclerView7 = RecyclerView.this;
                    recyclerView7.getClass();
                    bH.setIsRecyclable(false);
                    if (recyclerView7.f19612O.a(bH, bVar9, bVar10)) {
                        recyclerView7.Y();
                    }
                }
                aVarK.f19571a = 0;
                aVarK.f19572b = null;
                aVarK.f19573c = null;
                Q.a.f19570d.b(aVarK);
            }
        }
        this.f19636o.n0(sVar);
        xVar.f19737b = xVar.f19740e;
        this.f19594F = false;
        this.f19596G = false;
        xVar.j = false;
        xVar.f19745k = false;
        this.f19636o.f19686f = false;
        ArrayList<B> arrayList = sVar.f19713b;
        if (arrayList != null) {
            arrayList.clear();
        }
        l lVar = this.f19636o;
        if (lVar.f19690k) {
            lVar.j = 0;
            lVar.f19690k = false;
            sVar.m();
        }
        this.f19636o.i0(xVar);
        W(true);
        o0(false);
        q10.f19568a.clear();
        q10.f19569b.a();
        int[] iArr = this.f19597G0;
        int i20 = iArr[0];
        int i21 = iArr[1];
        H(iArr);
        if (iArr[0] != i20 || iArr[1] != i21) {
            x(0, 0);
        }
        if (this.f19648u0 && this.f19635n != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (isFocused()) {
                if (xVar.f19747m == -1) {
                    b10 = null;
                } else {
                    b10 = null;
                }
                if (b10 == null) {
                    if (!this.f19629g.f19846c.contains(b10.itemView)) {
                        if (this.f19629g.e() <= 0) {
                            view = null;
                            break;
                        }
                        int i22 = xVar.f19746l;
                        if (i22 != -1) {
                        }
                        iB = xVar.b();
                        i11 = i10;
                        while (true) {
                            if (i11 < iB) {
                                bJ2 = J(i11);
                                if (bJ2 != null) {
                                    if (bJ2.itemView.hasFocusable()) {
                                        view = bJ2.itemView;
                                    } else {
                                        i11++;
                                    }
                                }
                            }
                            iMin = Math.min(iB, i10) - 1;
                            while (true) {
                                if (iMin >= 0) {
                                    bJ = J(iMin);
                                    if (bJ != null) {
                                        if (bJ.itemView.hasFocusable()) {
                                            view = bJ.itemView;
                                            break;
                                        }
                                        iMin--;
                                    }
                                }
                                view = null;
                                break;
                            }
                        }
                    } else {
                        if (this.f19629g.e() <= 0) {
                            view = null;
                            break;
                        }
                        int i23 = xVar.f19746l;
                        if (i23 != -1) {
                        }
                        iB = xVar.b();
                        i11 = i10;
                        while (true) {
                            if (i11 < iB) {
                                bJ2 = J(i11);
                                if (bJ2 != null) {
                                    if (bJ2.itemView.hasFocusable()) {
                                        view = bJ2.itemView;
                                    } else {
                                        i11++;
                                    }
                                }
                            }
                            iMin = Math.min(iB, i10) - 1;
                            while (true) {
                                if (iMin >= 0) {
                                    bJ = J(iMin);
                                    if (bJ != null) {
                                        if (bJ.itemView.hasFocusable()) {
                                            view = bJ.itemView;
                                            break;
                                        }
                                        iMin--;
                                    }
                                }
                                view = null;
                                break;
                            }
                        }
                    }
                } else {
                    if (this.f19629g.e() <= 0) {
                        view = null;
                        break;
                    }
                    int i24 = xVar.f19746l;
                    if (i24 != -1) {
                    }
                    iB = xVar.b();
                    i11 = i10;
                    while (true) {
                        if (i11 < iB) {
                            bJ2 = J(i11);
                            if (bJ2 != null) {
                                if (bJ2.itemView.hasFocusable()) {
                                    view = bJ2.itemView;
                                } else {
                                    i11++;
                                }
                            }
                        }
                        iMin = Math.min(iB, i10) - 1;
                        while (true) {
                            if (iMin >= 0) {
                                bJ = J(iMin);
                                if (bJ != null) {
                                    if (bJ.itemView.hasFocusable()) {
                                        view = bJ.itemView;
                                        break;
                                    }
                                    iMin--;
                                }
                            }
                            view = null;
                            break;
                        }
                    }
                }
                if (view != null) {
                    i12 = xVar.f19748n;
                    if (i12 != -1) {
                        view = viewFindViewById;
                    }
                    view.requestFocus();
                }
            } else if (this.f19629g.f19846c.contains(getFocusedChild())) {
                if (xVar.f19747m == -1 && this.f19635n.hasStableIds()) {
                    long j10 = xVar.f19747m;
                    Adapter adapter2 = this.f19635n;
                    if (adapter2 == null || !adapter2.hasStableIds()) {
                        b10 = null;
                    } else {
                        int iH = this.f19629g.h();
                        b10 = null;
                        for (int i25 = 0; i25 < iH; i25++) {
                            B bN3 = N(this.f19629g.g(i25));
                            if (bN3 != null && !bN3.isRemoved() && bN3.getItemId() == j10) {
                                if (!this.f19629g.f19846c.contains(bN3.itemView)) {
                                    b10 = bN3;
                                    break;
                                }
                                b10 = bN3;
                            }
                        }
                    }
                } else {
                    b10 = null;
                }
                if (b10 == null) {
                    if (this.f19629g.e() <= 0) {
                        view = null;
                        break;
                    }
                    int i26 = xVar.f19746l;
                    if (i26 != -1) {
                    }
                    iB = xVar.b();
                    i11 = i10;
                    while (true) {
                        if (i11 < iB) {
                            bJ2 = J(i11);
                            if (bJ2 != null) {
                                if (bJ2.itemView.hasFocusable()) {
                                    view = bJ2.itemView;
                                } else {
                                    i11++;
                                }
                            }
                        }
                        iMin = Math.min(iB, i10) - 1;
                        while (true) {
                            if (iMin >= 0) {
                                bJ = J(iMin);
                                if (bJ != null) {
                                    if (bJ.itemView.hasFocusable()) {
                                        view = bJ.itemView;
                                        break;
                                    }
                                    iMin--;
                                }
                            }
                            view = null;
                            break;
                        }
                    }
                } else if (!this.f19629g.f19846c.contains(b10.itemView) && b10.itemView.hasFocusable()) {
                    view = b10.itemView;
                } else {
                    if (this.f19629g.e() <= 0) {
                        view = null;
                        break;
                    }
                    int i27 = xVar.f19746l;
                    i10 = i27 != -1 ? i27 : 0;
                    iB = xVar.b();
                    i11 = i10;
                    while (true) {
                        if (i11 < iB) {
                            bJ2 = J(i11);
                            if (bJ2 != null) {
                                if (bJ2.itemView.hasFocusable()) {
                                    view = bJ2.itemView;
                                } else {
                                    i11++;
                                }
                            }
                        }
                        iMin = Math.min(iB, i10) - 1;
                        while (true) {
                            if (iMin >= 0) {
                                bJ = J(iMin);
                                if (bJ != null) {
                                    if (bJ.itemView.hasFocusable()) {
                                        view = bJ.itemView;
                                        break;
                                    }
                                    iMin--;
                                }
                            }
                            view = null;
                            break;
                        }
                    }
                }
                if (view != null) {
                    i12 = xVar.f19748n;
                    if (i12 != -1 && (viewFindViewById = view.findViewById(i12)) != null && viewFindViewById.isFocusable()) {
                        view = viewFindViewById;
                    }
                    view.requestFocus();
                }
            }
        }
        xVar.f19747m = -1L;
        xVar.f19746l = -1;
        xVar.f19748n = -1;
    }

    @Override // android.view.View
    public final void scrollBy(int i10, int i11) {
        l lVar = this.f19636o;
        if (lVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f19656z) {
            return;
        }
        boolean zF = lVar.f();
        boolean zG = this.f19636o.g();
        if (zF || zG) {
            if (!zF) {
                i10 = 0;
            }
            if (!zG) {
                i11 = 0;
            }
            h0(i10, i11, null, 0);
        }
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!R()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.f19586B |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(K k10) {
        this.f19595F0 = k10;
        androidx.core.view.O.n(this, k10);
    }

    public void setAdapter(Adapter adapter) {
        setLayoutFrozen(false);
        Adapter adapter2 = this.f19635n;
        u uVar = this.f19625c;
        if (adapter2 != null) {
            adapter2.unregisterAdapterDataObserver(uVar);
            this.f19635n.onDetachedFromRecyclerView(this);
        }
        i iVar = this.f19612O;
        if (iVar != null) {
            iVar.j();
        }
        l lVar = this.f19636o;
        s sVar = this.f19626d;
        if (lVar != null) {
            lVar.m0(sVar);
            this.f19636o.n0(sVar);
        }
        sVar.f19712a.clear();
        sVar.f();
        C1436a c1436a = this.f19628f;
        c1436a.k(c1436a.f19808b);
        c1436a.k(c1436a.f19809c);
        c1436a.f19812f = 0;
        Adapter<?> adapter3 = this.f19635n;
        this.f19635n = adapter;
        if (adapter != null) {
            adapter.registerAdapterDataObserver(uVar);
            adapter.onAttachedToRecyclerView(this);
        }
        l lVar2 = this.f19636o;
        if (lVar2 != null) {
            lVar2.U();
        }
        Adapter adapter4 = this.f19635n;
        sVar.f19712a.clear();
        sVar.f();
        sVar.e(adapter3, true);
        r rVarC = sVar.c();
        if (adapter3 != null) {
            rVarC.f19706b--;
        }
        if (rVarC.f19706b == 0) {
            int i10 = 0;
            while (true) {
                SparseArray<r.a> sparseArray = rVarC.f19705a;
                if (i10 >= sparseArray.size()) {
                    break;
                }
                r.a aVarValueAt = sparseArray.valueAt(i10);
                Iterator<B> it = aVarValueAt.f19708a.iterator();
                while (it.hasNext()) {
                    p241t7.b.a(it.next().itemView);
                }
                aVarValueAt.f19708a.clear();
                i10++;
            }
        }
        if (adapter4 != null) {
            rVarC.f19706b++;
        }
        sVar.d();
        this.f19655y0.f19741f = true;
        a0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(g gVar) {
        if (gVar == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(gVar != null);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z10) {
        if (z10 != this.f19631i) {
            this.f19610N = null;
            this.f19606L = null;
            this.f19608M = null;
            this.f19604K = null;
        }
        this.f19631i = z10;
        super.setClipToPadding(z10);
        if (this.f19650w) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(h hVar) {
        hVar.getClass();
        this.f19602J = hVar;
        this.f19610N = null;
        this.f19606L = null;
        this.f19608M = null;
        this.f19604K = null;
    }

    public void setHasFixedSize(boolean z10) {
        this.f19649v = z10;
    }

    public void setItemAnimator(i iVar) {
        i iVar2 = this.f19612O;
        if (iVar2 != null) {
            iVar2.j();
            this.f19612O.f19672a = null;
        }
        this.f19612O = iVar;
        if (iVar != null) {
            iVar.f19672a = this.f19591D0;
        }
    }

    public void setItemViewCacheSize(int i10) {
        s sVar = this.f19626d;
        sVar.f19716e = i10;
        sVar.m();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z10) {
        suppressLayout(z10);
    }

    public void setLayoutManager(l lVar) {
        RecyclerView recyclerView;
        androidx.recyclerview.widget.z zVar;
        if (lVar == this.f19636o) {
            return;
        }
        setScrollState(0);
        A a10 = this.v0;
        RecyclerView.this.removeCallbacks(a10);
        a10.f19660d.abortAnimation();
        l lVar2 = this.f19636o;
        if (lVar2 != null && (zVar = lVar2.f19685e) != null) {
            zVar.d();
        }
        l lVar3 = this.f19636o;
        s sVar = this.f19626d;
        if (lVar3 != null) {
            i iVar = this.f19612O;
            if (iVar != null) {
                iVar.j();
            }
            this.f19636o.m0(sVar);
            this.f19636o.n0(sVar);
            sVar.f19712a.clear();
            sVar.f();
            if (this.f19647u) {
                l lVar4 = this.f19636o;
                lVar4.f19687g = false;
                lVar4.W(this);
            }
            this.f19636o.z0(null);
            this.f19636o = null;
        } else {
            sVar.f19712a.clear();
            sVar.f();
        }
        C1442g c1442g = this.f19629g;
        c1442g.f19845b.g();
        ArrayList arrayList = c1442g.f19846c;
        int size = arrayList.size() - 1;
        while (true) {
            recyclerView = c1442g.f19844a.f19511a;
            if (size < 0) {
                break;
            }
            B bN = N((View) arrayList.get(size));
            if (bN != null) {
                bN.onLeftHiddenState(recyclerView);
            }
            arrayList.remove(size);
            size--;
        }
        int childCount = recyclerView.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = recyclerView.getChildAt(i10);
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f19636o = lVar;
        if (lVar != null) {
            if (lVar.f19682b != null) {
                StringBuilder sb2 = new StringBuilder("LayoutManager ");
                sb2.append(lVar);
                sb2.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(androidx.compose.animation.k.a(lVar.f19682b, sb2));
            }
            lVar.z0(this);
            if (this.f19647u) {
                l lVar5 = this.f19636o;
                lVar5.f19687g = true;
                lVar5.V(this);
            }
        }
        sVar.m();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        C1305u scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f16991d) {
            WeakHashMap<View, Z> weakHashMap = androidx.core.view.O.f16859a;
            androidx.core.view.O.d.z(scrollingChildHelper.f16990c);
        }
        scrollingChildHelper.f16991d = z10;
    }

    public void setOnFlingListener(o oVar) {
        this.f19638p0 = oVar;
    }

    @Deprecated
    public void setOnScrollListener(q qVar) {
        this.f19657z0 = qVar;
    }

    public void setPreserveFocusAfterLayout(boolean z10) {
        this.f19648u0 = z10;
    }

    public void setRecycledViewPool(r rVar) {
        s sVar = this.f19626d;
        RecyclerView recyclerView = RecyclerView.this;
        sVar.e(recyclerView.f19635n, false);
        r rVar2 = sVar.f19718g;
        if (rVar2 != null) {
            rVar2.f19706b--;
        }
        sVar.f19718g = rVar;
        if (rVar != null && recyclerView.getAdapter() != null) {
            sVar.f19718g.f19706b++;
        }
        sVar.d();
    }

    @Deprecated
    public void setRecyclerListener(t tVar) {
        this.f19637p = tVar;
    }

    public void setScrollState(int i10) {
        androidx.recyclerview.widget.z zVar;
        if (i10 == this.f19614P) {
            return;
        }
        if (f19575S0) {
            new Exception();
        }
        this.f19614P = i10;
        if (i10 != 2) {
            A a10 = this.v0;
            RecyclerView.this.removeCallbacks(a10);
            a10.f19660d.abortAnimation();
            l lVar = this.f19636o;
            if (lVar != null && (zVar = lVar.f19685e) != null) {
                zVar.d();
            }
        }
        l lVar2 = this.f19636o;
        if (lVar2 != null) {
            lVar2.l0(i10);
        }
        q qVar = this.f19657z0;
        if (qVar != null) {
            qVar.a(this, i10);
        }
        ArrayList arrayList = this.f19585A0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((q) this.f19585A0.get(size)).a(this, i10);
            }
        }
    }

    public void setScrollingTouchSlop(int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i10 != 1) {
            this.f19623W = viewConfiguration.getScaledTouchSlop();
        } else {
            this.f19623W = viewConfiguration.getScaledPagingTouchSlop();
        }
    }

    public void setViewCacheExtension(z zVar) {
        this.f19626d.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i10) {
        return getScrollingChildHelper().g(i10, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z10) {
        androidx.recyclerview.widget.z zVar;
        if (z10 != this.f19656z) {
            k("Do not suppressLayout in layout or scroll");
            if (!z10) {
                this.f19656z = false;
                if (this.f19654y && this.f19636o != null && this.f19635n != null) {
                    requestLayout();
                }
                this.f19654y = false;
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f19656z = true;
            this.f19584A = true;
            setScrollState(0);
            A a10 = this.v0;
            RecyclerView.this.removeCallbacks(a10);
            a10.f19660d.abortAnimation();
            l lVar = this.f19636o;
            if (lVar == null || (zVar = lVar.f19685e) == null) {
                return;
            }
            zVar.d();
        }
    }

    public final void t() {
        Q.a aVar;
        View viewF;
        x xVar = this.f19655y0;
        xVar.a(1);
        D(xVar);
        xVar.f19744i = false;
        n0();
        Q q10 = this.f19630h;
        q10.f19568a.clear();
        C0891t<B> c0891t = q10.f19569b;
        c0891t.a();
        V();
        Z();
        B bM = null;
        View focusedChild = (this.f19648u0 && hasFocus() && this.f19635n != null) ? getFocusedChild() : null;
        if (focusedChild != null && (viewF = F(focusedChild)) != null) {
            bM = M(viewF);
        }
        if (bM == null) {
            xVar.f19747m = -1L;
            xVar.f19746l = -1;
            xVar.f19748n = -1;
        } else {
            xVar.f19747m = this.f19635n.hasStableIds() ? bM.getItemId() : -1L;
            xVar.f19746l = this.f19594F ? -1 : bM.isRemoved() ? bM.mOldPosition : bM.getAbsoluteAdapterPosition();
            View focusedChild2 = bM.itemView;
            int id = focusedChild2.getId();
            while (!focusedChild2.isFocused() && (focusedChild2 instanceof ViewGroup) && focusedChild2.hasFocus()) {
                focusedChild2 = ((ViewGroup) focusedChild2).getFocusedChild();
                if (focusedChild2.getId() != -1) {
                    id = focusedChild2.getId();
                }
            }
            xVar.f19748n = id;
        }
        xVar.f19743h = xVar.j && this.f19589C0;
        this.f19589C0 = false;
        this.f19587B0 = false;
        xVar.f19742g = xVar.f19745k;
        xVar.f19740e = this.f19635n.getItemCount();
        H(this.f19597G0);
        boolean z10 = xVar.j;
        X<B, Q.a> x10 = q10.f19568a;
        if (z10) {
            int iE = this.f19629g.e();
            for (int i10 = 0; i10 < iE; i10++) {
                B bN = N(this.f19629g.d(i10));
                if (!bN.shouldIgnore() && (!bN.isInvalid() || this.f19635n.hasStableIds())) {
                    i iVar = this.f19612O;
                    i.e(bN);
                    bN.getUnmodifiedPayloads();
                    iVar.getClass();
                    i.b bVar = new i.b();
                    bVar.a(bN);
                    Q.a aVarA = x10.get(bN);
                    if (aVarA == null) {
                        aVarA = Q.a.a();
                        x10.put(bN, aVarA);
                    }
                    aVarA.f19572b = bVar;
                    aVarA.f19571a |= 4;
                    if (xVar.f19743h && bN.isUpdated() && !bN.isRemoved() && !bN.shouldIgnore() && !bN.isInvalid()) {
                        c0891t.e(bN, L(bN));
                    }
                }
            }
        }
        if (xVar.f19745k) {
            int iH = this.f19629g.h();
            for (int i11 = 0; i11 < iH; i11++) {
                B bN2 = N(this.f19629g.g(i11));
                if (f19574R0 && bN2.mPosition == -1 && !bN2.isRemoved()) {
                    throw new IllegalStateException(androidx.compose.animation.k.a(this, new StringBuilder("view holder cannot have position -1 unless it is removed")));
                }
                if (!bN2.shouldIgnore()) {
                    bN2.saveOldPosition();
                }
            }
            boolean z11 = xVar.f19741f;
            xVar.f19741f = false;
            this.f19636o.h0(this.f19626d, xVar);
            xVar.f19741f = z11;
            for (int i12 = 0; i12 < this.f19629g.e(); i12++) {
                B bN3 = N(this.f19629g.d(i12));
                if (!bN3.shouldIgnore() && ((aVar = x10.get(bN3)) == null || (aVar.f19571a & 4) == 0)) {
                    i.e(bN3);
                    boolean zHasAnyOfTheFlags = bN3.hasAnyOfTheFlags(8192);
                    i iVar2 = this.f19612O;
                    bN3.getUnmodifiedPayloads();
                    iVar2.getClass();
                    i.b bVar2 = new i.b();
                    bVar2.a(bN3);
                    if (zHasAnyOfTheFlags) {
                        b0(bN3, bVar2);
                    } else {
                        Q.a aVarA2 = x10.get(bN3);
                        if (aVarA2 == null) {
                            aVarA2 = Q.a.a();
                            x10.put(bN3, aVarA2);
                        }
                        aVarA2.f19571a |= 2;
                        aVarA2.f19572b = bVar2;
                    }
                }
            }
            m();
        } else {
            m();
        }
        W(true);
        o0(false);
        xVar.f19739d = 2;
    }

    public final void u() {
        n0();
        V();
        x xVar = this.f19655y0;
        xVar.a(6);
        this.f19628f.c();
        xVar.f19740e = this.f19635n.getItemCount();
        xVar.f19738c = 0;
        if (this.f19627e != null && this.f19635n.canRestoreState()) {
            Parcelable parcelable = this.f19627e.f19721d;
            if (parcelable != null) {
                this.f19636o.j0(parcelable);
            }
            this.f19627e = null;
        }
        xVar.f19742g = false;
        this.f19636o.h0(this.f19626d, xVar);
        xVar.f19741f = false;
        xVar.j = xVar.j && this.f19612O != null;
        xVar.f19739d = 4;
        W(true);
        o0(false);
    }

    public final boolean v(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, i11, i12, iArr, iArr2);
    }

    public final void w(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        getScrollingChildHelper().d(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    public final void x(int i10, int i11) {
        this.f19600I++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i10, scrollY - i11);
        q qVar = this.f19657z0;
        if (qVar != null) {
            qVar.b(i10, i11, this);
        }
        ArrayList arrayList = this.f19585A0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((q) this.f19585A0.get(size)).b(i10, i11, this);
            }
        }
        this.f19600I--;
    }

    public final void y() {
        if (this.f19610N != null) {
            return;
        }
        ((y) this.f19602J).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f19610N = edgeEffect;
        if (this.f19631i) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void z() {
        if (this.f19604K != null) {
            return;
        }
        ((y) this.f19602J).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f19604K = edgeEffect;
        if (this.f19631i) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public static abstract class Adapter<VH extends B> {
        private final e mObservable = new e();
        private boolean mHasStableIds = false;
        private StateRestorationPolicy mStateRestorationPolicy = StateRestorationPolicy.f19665b;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class StateRestorationPolicy {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final StateRestorationPolicy f19665b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final StateRestorationPolicy f19666c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final StateRestorationPolicy f19667d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final /* synthetic */ StateRestorationPolicy[] f19668e;

            static {
                StateRestorationPolicy stateRestorationPolicy = new StateRestorationPolicy("ALLOW", 0);
                f19665b = stateRestorationPolicy;
                StateRestorationPolicy stateRestorationPolicy2 = new StateRestorationPolicy("PREVENT_WHEN_EMPTY", 1);
                f19666c = stateRestorationPolicy2;
                StateRestorationPolicy stateRestorationPolicy3 = new StateRestorationPolicy("PREVENT", 2);
                f19667d = stateRestorationPolicy3;
                f19668e = new StateRestorationPolicy[]{stateRestorationPolicy, stateRestorationPolicy2, stateRestorationPolicy3};
            }

            public StateRestorationPolicy() {
                throw null;
            }

            public static StateRestorationPolicy valueOf(String str) {
                return (StateRestorationPolicy) Enum.valueOf(StateRestorationPolicy.class, str);
            }

            public static StateRestorationPolicy[] values() {
                return (StateRestorationPolicy[]) f19668e.clone();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void bindViewHolder(VH vh, int i10) {
            boolean z10 = vh.mBindingAdapter == null;
            if (z10) {
                vh.mPosition = i10;
                if (hasStableIds()) {
                    vh.mItemId = getItemId(i10);
                }
                vh.setFlags(1, 519);
                int i11 = p271w0.j.f47686a;
                Trace.beginSection("RV OnBindView");
            }
            vh.mBindingAdapter = this;
            if (RecyclerView.f19574R0) {
                if (vh.itemView.getParent() == null) {
                    View view = vh.itemView;
                    WeakHashMap<View, Z> weakHashMap = androidx.core.view.O.f16859a;
                    if (view.isAttachedToWindow() != vh.isTmpDetached()) {
                        throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + vh.isTmpDetached() + ", attached to window: " + vh.itemView.isAttachedToWindow() + ", holder: " + vh);
                    }
                }
                if (vh.itemView.getParent() == null) {
                    View view2 = vh.itemView;
                    WeakHashMap<View, Z> weakHashMap2 = androidx.core.view.O.f16859a;
                    if (view2.isAttachedToWindow()) {
                        throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + vh);
                    }
                }
            }
            onBindViewHolder(vh, i10, vh.getUnmodifiedPayloads());
            if (z10) {
                vh.clearPayload();
                ViewGroup.LayoutParams layoutParams = vh.itemView.getLayoutParams();
                if (layoutParams instanceof m) {
                    ((m) layoutParams).f19703c = true;
                }
                int i12 = p271w0.j.f47686a;
                Trace.endSection();
            }
        }

        public boolean canRestoreState() {
            int iOrdinal = this.mStateRestorationPolicy.ordinal();
            if (iOrdinal != 1) {
                return iOrdinal != 2;
            }
            return getItemCount() > 0;
        }

        public final VH createViewHolder(ViewGroup viewGroup, int i10) {
            try {
                int i11 = p271w0.j.f47686a;
                Trace.beginSection("RV CreateView");
                VH vh = (VH) onCreateViewHolder(viewGroup, i10);
                if (vh.itemView.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                vh.mItemViewType = i10;
                Trace.endSection();
                return vh;
            } catch (Throwable th) {
                int i12 = p271w0.j.f47686a;
                Trace.endSection();
                throw th;
            }
        }

        public int findRelativeAdapterPositionIn(Adapter<? extends B> adapter, B b10, int i10) {
            if (adapter == this) {
                return i10;
            }
            return -1;
        }

        public abstract int getItemCount();

        public long getItemId(int i10) {
            return -1L;
        }

        public int getItemViewType(int i10) {
            return 0;
        }

        public final StateRestorationPolicy getStateRestorationPolicy() {
            return this.mStateRestorationPolicy;
        }

        public final boolean hasObservers() {
            return this.mObservable.a();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final void notifyDataSetChanged() {
            this.mObservable.b();
        }

        public final void notifyItemChanged(int i10) {
            this.mObservable.d(i10, 1, null);
        }

        public final void notifyItemInserted(int i10) {
            this.mObservable.e(i10, 1);
        }

        public final void notifyItemMoved(int i10, int i11) {
            this.mObservable.c(i10, i11);
        }

        public final void notifyItemRangeChanged(int i10, int i11) {
            this.mObservable.d(i10, i11, null);
        }

        public final void notifyItemRangeInserted(int i10, int i11) {
            this.mObservable.e(i10, i11);
        }

        public final void notifyItemRangeRemoved(int i10, int i11) {
            this.mObservable.f(i10, i11);
        }

        public final void notifyItemRemoved(int i10) {
            this.mObservable.f(i10, 1);
        }

        public abstract void onBindViewHolder(VH vh, int i10);

        public void onBindViewHolder(VH vh, int i10, List<Object> list) {
            onBindViewHolder(vh, i10);
        }

        public abstract VH onCreateViewHolder(ViewGroup viewGroup, int i10);

        public boolean onFailedToRecycleView(VH vh) {
            return false;
        }

        public void registerAdapterDataObserver(f fVar) {
            this.mObservable.registerObserver(fVar);
        }

        public void setHasStableIds(boolean z10) {
            if (hasObservers()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.mHasStableIds = z10;
        }

        public void setStateRestorationPolicy(StateRestorationPolicy stateRestorationPolicy) {
            this.mStateRestorationPolicy = stateRestorationPolicy;
            this.mObservable.g();
        }

        public void unregisterAdapterDataObserver(f fVar) {
            this.mObservable.unregisterObserver(fVar);
        }

        public final void notifyItemChanged(int i10, Object obj) {
            this.mObservable.d(i10, 1, obj);
        }

        public final void notifyItemRangeChanged(int i10, int i11, Object obj) {
            this.mObservable.d(i10, i11, obj);
        }

        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        }

        public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        }

        public void onViewAttachedToWindow(VH vh) {
        }

        public void onViewDetachedFromWindow(VH vh) {
        }

        public void onViewRecycled(VH vh) {
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i10) throws NoSuchMethodException {
        int i11;
        char c10;
        Object[] objArr;
        Constructor constructor;
        super(context, attributeSet, i10);
        this.f19625c = new u();
        this.f19626d = new s();
        this.f19630h = new Q();
        this.j = new RunnableC1434a();
        this.f19632k = new Rect();
        this.f19633l = new Rect();
        this.f19634m = new RectF();
        this.f19639q = new ArrayList();
        this.f19641r = new ArrayList<>();
        this.f19643s = new ArrayList<>();
        this.f19652x = 0;
        this.f19594F = false;
        this.f19596G = false;
        this.f19598H = 0;
        this.f19600I = 0;
        this.f19602J = f19583a1;
        this.f19612O = new C1445j();
        this.f19614P = 0;
        this.f19616Q = -1;
        this.f19644s0 = Float.MIN_VALUE;
        this.f19646t0 = Float.MIN_VALUE;
        this.f19648u0 = true;
        this.v0 = new A();
        this.f19653x0 = f19580X0 ? new RunnableC1453s.b() : null;
        x xVar = new x();
        xVar.f19736a = -1;
        xVar.f19737b = 0;
        xVar.f19738c = 0;
        xVar.f19739d = 1;
        xVar.f19740e = 0;
        xVar.f19741f = false;
        xVar.f19742g = false;
        xVar.f19743h = false;
        xVar.f19744i = false;
        xVar.j = false;
        xVar.f19745k = false;
        this.f19655y0 = xVar;
        this.f19587B0 = false;
        this.f19589C0 = false;
        j jVar = new j();
        this.f19591D0 = jVar;
        this.f19593E0 = false;
        this.f19597G0 = new int[2];
        this.f19601I0 = new int[2];
        this.f19603J0 = new int[2];
        this.f19605K0 = new int[2];
        this.f19607L0 = new ArrayList();
        this.f19609M0 = new RunnableC1435b();
        this.f19613O0 = 0;
        this.f19615P0 = 0;
        this.f19617Q0 = new d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f19623W = viewConfiguration.getScaledTouchSlop();
        this.f19644s0 = androidx.core.view.Q.a(viewConfiguration);
        this.f19646t0 = androidx.core.view.Q.b(viewConfiguration);
        this.f19640q0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f19642r0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f19624b = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.f19612O.f19672a = jVar;
        this.f19628f = new C1436a(new J(this));
        this.f19629g = new C1442g(new I(this));
        WeakHashMap<View, Z> weakHashMap = androidx.core.view.O.f16859a;
        if (androidx.core.view.O.g.c(this) == 0) {
            androidx.core.view.O.g.m(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f19590D = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new K(this));
        int[] iArr = p213r2.a.f46312a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        androidx.core.view.O.m(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i10);
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f19631i = typedArrayObtainStyledAttributes.getBoolean(1, true);
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException(androidx.compose.animation.k.a(this, new StringBuilder("Trying to set fast scroller without both required drawables.")));
            }
            Resources resources = getContext().getResources();
            i11 = 4;
            c10 = 2;
            new androidx.recyclerview.widget.r(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.voltasit.obdeleven.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.voltasit.obdeleven.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.voltasit.obdeleven.R.dimen.fastscroll_margin));
        } else {
            i11 = 4;
            c10 = 2;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (string != null) {
            String strTrim = string.trim();
            if (!strTrim.isEmpty()) {
                if (strTrim.charAt(0) == '.') {
                    strTrim = context.getPackageName() + strTrim;
                } else if (!strTrim.contains(".")) {
                    strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
                }
                try {
                    Class<? extends U> clsAsSubclass = Class.forName(strTrim, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(l.class);
                    try {
                        constructor = clsAsSubclass.getConstructor(f19581Y0);
                        objArr = new Object[i11];
                        objArr[0] = context;
                        objArr[1] = attributeSet;
                        objArr[c10] = Integer.valueOf(i10);
                        objArr[3] = 0;
                    } catch (NoSuchMethodException e10) {
                        try {
                            objArr = null;
                            constructor = clsAsSubclass.getConstructor(null);
                        } catch (NoSuchMethodException e11) {
                            e11.initCause(e10);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + strTrim, e11);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((l) constructor.newInstance(objArr));
                } catch (ClassCastException e12) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + strTrim, e12);
                } catch (ClassNotFoundException e13) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + strTrim, e13);
                } catch (IllegalAccessException e14) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + strTrim, e14);
                } catch (InstantiationException e15) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strTrim, e15);
                } catch (InvocationTargetException e16) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strTrim, e16);
                }
            }
        }
        int[] iArr2 = f19576T0;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i10, 0);
        androidx.core.view.O.m(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i10);
        boolean z10 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z10);
        setTag(com.voltasit.obdeleven.R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    public static class m extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public B f19701a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Rect f19702b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f19703c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f19704d;

        public m(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f19702b = new Rect();
            this.f19703c = true;
            this.f19704d = false;
        }

        public m(int i10, int i11) {
            super(i10, i11);
            this.f19702b = new Rect();
            this.f19703c = true;
            this.f19704d = false;
        }

        public m(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f19702b = new Rect();
            this.f19703c = true;
            this.f19704d = false;
        }

        public m(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f19702b = new Rect();
            this.f19703c = true;
            this.f19704d = false;
        }

        public m(m mVar) {
            super((ViewGroup.LayoutParams) mVar);
            this.f19702b = new Rect();
            this.f19703c = true;
            this.f19704d = false;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        l lVar = this.f19636o;
        if (lVar != null) {
            return lVar.v(layoutParams);
        }
        throw new IllegalStateException(androidx.compose.animation.k.a(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    public static abstract class f {
        public void c(int i10, int i11, Object obj) {
            b(i10, i11);
        }

        public void a() {
        }

        public void g() {
        }

        public void b(int i10, int i11) {
        }

        public void d(int i10, int i11) {
        }

        public void e(int i10, int i11) {
        }

        public void f(int i10, int i11) {
        }
    }

    public static abstract class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public C1442g f19681a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public RecyclerView f19682b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final P f19683c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final P f19684d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public androidx.recyclerview.widget.z f19685e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f19686f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f19687g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f19688h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f19689i;
        public int j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f19690k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f19691l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f19692m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f19693n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f19694o;

        public class a implements P.b {
            public a() {
            }

            @Override // androidx.recyclerview.widget.P.b
            public final int a(View view) {
                m mVar = (m) view.getLayoutParams();
                l.this.getClass();
                return l.C(view) - ((ViewGroup.MarginLayoutParams) mVar).leftMargin;
            }

            @Override // androidx.recyclerview.widget.P.b
            public final int b() {
                return l.this.I();
            }

            @Override // androidx.recyclerview.widget.P.b
            public final int c() {
                l lVar = l.this;
                return lVar.f19693n - lVar.J();
            }

            @Override // androidx.recyclerview.widget.P.b
            public final View d(int i10) {
                return l.this.w(i10);
            }

            @Override // androidx.recyclerview.widget.P.b
            public final int e(View view) {
                m mVar = (m) view.getLayoutParams();
                l.this.getClass();
                return l.D(view) + ((ViewGroup.MarginLayoutParams) mVar).rightMargin;
            }
        }

        public class b implements P.b {
            public b() {
            }

            @Override // androidx.recyclerview.widget.P.b
            public final int a(View view) {
                m mVar = (m) view.getLayoutParams();
                l.this.getClass();
                return l.E(view) - ((ViewGroup.MarginLayoutParams) mVar).topMargin;
            }

            @Override // androidx.recyclerview.widget.P.b
            public final int b() {
                return l.this.K();
            }

            @Override // androidx.recyclerview.widget.P.b
            public final int c() {
                l lVar = l.this;
                return lVar.f19694o - lVar.H();
            }

            @Override // androidx.recyclerview.widget.P.b
            public final View d(int i10) {
                return l.this.w(i10);
            }

            @Override // androidx.recyclerview.widget.P.b
            public final int e(View view) {
                m mVar = (m) view.getLayoutParams();
                l.this.getClass();
                return l.A(view) + ((ViewGroup.MarginLayoutParams) mVar).bottomMargin;
            }
        }

        public static class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f19697a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f19698b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public boolean f19699c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public boolean f19700d;
        }

        public l() {
            a aVar = new a();
            b bVar = new b();
            this.f19683c = new P(aVar);
            this.f19684d = new P(bVar);
            this.f19686f = false;
            this.f19687g = false;
            this.f19688h = true;
            this.f19689i = true;
        }

        public static int A(View view) {
            return view.getBottom() + ((m) view.getLayoutParams()).f19702b.bottom;
        }

        public static int C(View view) {
            return view.getLeft() - ((m) view.getLayoutParams()).f19702b.left;
        }

        public static int D(View view) {
            return view.getRight() + ((m) view.getLayoutParams()).f19702b.right;
        }

        public static int E(View view) {
            return view.getTop() - ((m) view.getLayoutParams()).f19702b.top;
        }

        public static int L(View view) {
            return ((m) view.getLayoutParams()).f19701a.getLayoutPosition();
        }

        public static c M(Context context, AttributeSet attributeSet, int i10, int i11) {
            c cVar = new c();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p213r2.a.f46312a, i10, i11);
            cVar.f19697a = typedArrayObtainStyledAttributes.getInt(0, 1);
            cVar.f19698b = typedArrayObtainStyledAttributes.getInt(10, 1);
            cVar.f19699c = typedArrayObtainStyledAttributes.getBoolean(9, false);
            cVar.f19700d = typedArrayObtainStyledAttributes.getBoolean(11, false);
            typedArrayObtainStyledAttributes.recycle();
            return cVar;
        }

        public static boolean Q(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (i12 > 0 && i10 != i12) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i10;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i10;
            }
            return true;
        }

        public static void R(View view, int i10, int i11, int i12, int i13) {
            m mVar = (m) view.getLayoutParams();
            Rect rect = mVar.f19702b;
            view.layout(i10 + rect.left + ((ViewGroup.MarginLayoutParams) mVar).leftMargin, i11 + rect.top + ((ViewGroup.MarginLayoutParams) mVar).topMargin, (i12 - rect.right) - ((ViewGroup.MarginLayoutParams) mVar).rightMargin, (i13 - rect.bottom) - ((ViewGroup.MarginLayoutParams) mVar).bottomMargin);
        }

        public static int i(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            if (mode != Integer.MIN_VALUE) {
                return mode != 1073741824 ? Math.max(i11, i12) : size;
            }
            return Math.min(size, Math.max(i11, i12));
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001a  */
        /* JADX WARN: Code duplicated, block: B:14:0x0022  */
        /* JADX WARN: Code duplicated, block: B:5:0x0010  */
        public static int y(boolean z10, int i10, int i11, int i12, int i13) {
            int iMax = Math.max(0, i10 - i12);
            if (z10) {
                if (i13 >= 0) {
                    i11 = 1073741824;
                } else if (i13 != -1 || (i11 != Integer.MIN_VALUE && (i11 == 0 || i11 != 1073741824))) {
                    i11 = 0;
                    i13 = 0;
                } else {
                    i13 = iMax;
                }
            } else if (i13 >= 0) {
                i11 = 1073741824;
            } else if (i13 == -1) {
                i13 = iMax;
            } else if (i13 != -2) {
                i11 = 0;
                i13 = 0;
            } else if (i11 == Integer.MIN_VALUE || i11 == 1073741824) {
                i13 = iMax;
                i11 = Integer.MIN_VALUE;
            } else {
                i13 = iMax;
                i11 = 0;
            }
            return View.MeasureSpec.makeMeasureSpec(i13, i11);
        }

        public final boolean A0(View view, int i10, int i11, m mVar) {
            return (!view.isLayoutRequested() && this.f19688h && Q(view.getWidth(), i10, ((ViewGroup.MarginLayoutParams) mVar).width) && Q(view.getHeight(), i11, ((ViewGroup.MarginLayoutParams) mVar).height)) ? false : true;
        }

        public void B(Rect rect, View view) {
            RecyclerView.O(rect, view);
        }

        public boolean B0() {
            return false;
        }

        public final boolean C0(View view, int i10, int i11, m mVar) {
            return (this.f19688h && Q(view.getMeasuredWidth(), i10, ((ViewGroup.MarginLayoutParams) mVar).width) && Q(view.getMeasuredHeight(), i11, ((ViewGroup.MarginLayoutParams) mVar).height)) ? false : true;
        }

        public void D0(RecyclerView recyclerView, int i10) {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public final void E0(androidx.recyclerview.widget.z zVar) {
            androidx.recyclerview.widget.z zVar2 = this.f19685e;
            if (zVar2 != null && zVar != zVar2 && zVar2.f19726e) {
                zVar2.d();
            }
            this.f19685e = zVar;
            RecyclerView recyclerView = this.f19682b;
            A a10 = recyclerView.v0;
            RecyclerView.this.removeCallbacks(a10);
            a10.f19660d.abortAnimation();
            zVar.f19723b = recyclerView;
            zVar.f19724c = this;
            int i10 = zVar.f19722a;
            if (i10 == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.f19655y0.f19736a = i10;
            zVar.f19726e = true;
            zVar.f19725d = true;
            zVar.f19727f = recyclerView.f19636o.s(i10);
            zVar.f19723b.v0.b();
        }

        public final int F() {
            RecyclerView recyclerView = this.f19682b;
            Adapter adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        public boolean F0() {
            return false;
        }

        public final int G() {
            RecyclerView recyclerView = this.f19682b;
            WeakHashMap<View, Z> weakHashMap = androidx.core.view.O.f16859a;
            return recyclerView.getLayoutDirection();
        }

        public final int H() {
            RecyclerView recyclerView = this.f19682b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public final int I() {
            RecyclerView recyclerView = this.f19682b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public final int J() {
            RecyclerView recyclerView = this.f19682b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public final int K() {
            RecyclerView recyclerView = this.f19682b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int N(s sVar, x xVar) {
            return -1;
        }

        public final void O(Rect rect, View view) {
            Matrix matrix;
            Rect rect2 = ((m) view.getLayoutParams()).f19702b;
            rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            if (this.f19682b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.f19682b.f19634m;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public boolean P() {
            return false;
        }

        public void S(int i10) {
            RecyclerView recyclerView = this.f19682b;
            if (recyclerView != null) {
                int iE = recyclerView.f19629g.e();
                for (int i11 = 0; i11 < iE; i11++) {
                    recyclerView.f19629g.d(i11).offsetLeftAndRight(i10);
                }
            }
        }

        public void T(int i10) {
            RecyclerView recyclerView = this.f19682b;
            if (recyclerView != null) {
                int iE = recyclerView.f19629g.e();
                for (int i11 = 0; i11 < iE; i11++) {
                    recyclerView.f19629g.d(i11).offsetTopAndBottom(i10);
                }
            }
        }

        public View X(View view, int i10, s sVar, x xVar) {
            return null;
        }

        public void Y(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f19682b;
            s sVar = recyclerView.f19626d;
            if (accessibilityEvent == null) {
                return;
            }
            boolean z10 = true;
            if (!recyclerView.canScrollVertically(1) && !this.f19682b.canScrollVertically(-1) && !this.f19682b.canScrollHorizontally(-1) && !this.f19682b.canScrollHorizontally(1)) {
                z10 = false;
            }
            accessibilityEvent.setScrollable(z10);
            Adapter adapter = this.f19682b.f19635n;
            if (adapter != null) {
                accessibilityEvent.setItemCount(adapter.getItemCount());
            }
        }

        public void Z(s sVar, x xVar, B0.s sVar2) {
            if (this.f19682b.canScrollVertically(-1) || this.f19682b.canScrollHorizontally(-1)) {
                sVar2.a(8192);
                sVar2.n(true);
            }
            if (this.f19682b.canScrollVertically(1) || this.f19682b.canScrollHorizontally(1)) {
                sVar2.a(4096);
                sVar2.n(true);
            }
            sVar2.k(B0.s.e.a(N(sVar, xVar), z(sVar, xVar), 0));
        }

        public final void a0(View view, B0.s sVar) {
            B bN = RecyclerView.N(view);
            if (bN == null || bN.isRemoved()) {
                return;
            }
            C1442g c1442g = this.f19681a;
            if (c1442g.f19846c.contains(bN.itemView)) {
                return;
            }
            RecyclerView recyclerView = this.f19682b;
            b0(recyclerView.f19626d, recyclerView.f19655y0, view, sVar);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x005a  */
        public final void c(View view, int i10, boolean z10) {
            int iB;
            B bN = RecyclerView.N(view);
            if (z10 || bN.isRemoved()) {
                X<B, Q.a> x10 = this.f19682b.f19630h.f19568a;
                Q.a aVarA = x10.get(bN);
                if (aVarA == null) {
                    aVarA = Q.a.a();
                    x10.put(bN, aVarA);
                }
                aVarA.f19571a |= 1;
            } else {
                this.f19682b.f19630h.c(bN);
            }
            m mVar = (m) view.getLayoutParams();
            if (bN.wasReturnedFromScrap() || bN.isScrap()) {
                if (bN.isScrap()) {
                    bN.unScrap();
                } else {
                    bN.clearReturnedFromScrapFlag();
                }
                this.f19681a.b(view, i10, view.getLayoutParams(), false);
            } else {
                if (view.getParent() == this.f19682b) {
                    C1442g c1442g = this.f19681a;
                    int iIndexOfChild = c1442g.f19844a.f19511a.indexOfChild(view);
                    if (iIndexOfChild == -1) {
                        iB = -1;
                    } else {
                        C1442g.a aVar = c1442g.f19845b;
                        if (aVar.d(iIndexOfChild)) {
                            iB = -1;
                        } else {
                            iB = iIndexOfChild - aVar.b(iIndexOfChild);
                        }
                    }
                    if (i10 == -1) {
                        i10 = this.f19681a.e();
                    }
                    if (iB == -1) {
                        StringBuilder sb2 = new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                        sb2.append(this.f19682b.indexOfChild(view));
                        throw new IllegalStateException(androidx.compose.animation.k.a(this.f19682b, sb2));
                    }
                    if (iB != i10) {
                        l lVar = this.f19682b.f19636o;
                        View viewW = lVar.w(iB);
                        if (viewW == null) {
                            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iB + lVar.f19682b.toString());
                        }
                        lVar.w(iB);
                        lVar.f19681a.c(iB);
                        m mVar2 = (m) viewW.getLayoutParams();
                        B bN2 = RecyclerView.N(viewW);
                        if (bN2.isRemoved()) {
                            X<B, Q.a> x11 = lVar.f19682b.f19630h.f19568a;
                            Q.a aVarA2 = x11.get(bN2);
                            if (aVarA2 == null) {
                                aVarA2 = Q.a.a();
                                x11.put(bN2, aVarA2);
                            }
                            aVarA2.f19571a = 1 | aVarA2.f19571a;
                        } else {
                            lVar.f19682b.f19630h.c(bN2);
                        }
                        lVar.f19681a.b(viewW, i10, mVar2, bN2.isRemoved());
                    }
                } else {
                    this.f19681a.a(view, i10, false);
                    mVar.f19703c = true;
                    androidx.recyclerview.widget.z zVar = this.f19685e;
                    if (zVar != null && zVar.f19726e) {
                        zVar.f19723b.getClass();
                        B bN3 = RecyclerView.N(view);
                        if ((bN3 != null ? bN3.getLayoutPosition() : -1) == zVar.f19722a) {
                            zVar.f19727f = view;
                        }
                    }
                }
            }
            if (mVar.f19704d) {
                if (RecyclerView.f19575S0) {
                    Objects.toString(mVar.f19701a);
                }
                bN.itemView.invalidate();
                mVar.f19704d = false;
            }
        }

        public void d(String str) {
            RecyclerView recyclerView = this.f19682b;
            if (recyclerView != null) {
                recyclerView.k(str);
            }
        }

        public final void e(Rect rect, View view) {
            RecyclerView recyclerView = this.f19682b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.P(view));
            }
        }

        public boolean f() {
            return false;
        }

        public boolean g() {
            return false;
        }

        public boolean h(m mVar) {
            return mVar != null;
        }

        public void h0(s sVar, x xVar) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public Parcelable k0() {
            return null;
        }

        public int l(x xVar) {
            return 0;
        }

        public int m(x xVar) {
            return 0;
        }

        public final void m0(s sVar) {
            for (int iX = x() - 1; iX >= 0; iX--) {
                if (!RecyclerView.N(w(iX)).shouldIgnore()) {
                    View viewW = w(iX);
                    p0(iX);
                    sVar.h(viewW);
                }
            }
        }

        public int n(x xVar) {
            return 0;
        }

        public final void n0(s sVar) {
            ArrayList<B> arrayList;
            int size = sVar.f19712a.size();
            int i10 = size - 1;
            while (true) {
                arrayList = sVar.f19712a;
                if (i10 < 0) {
                    break;
                }
                View view = arrayList.get(i10).itemView;
                B bN = RecyclerView.N(view);
                if (!bN.shouldIgnore()) {
                    bN.setIsRecyclable(false);
                    if (bN.isTmpDetached()) {
                        this.f19682b.removeDetachedView(view, false);
                    }
                    i iVar = this.f19682b.f19612O;
                    if (iVar != null) {
                        iVar.i(bN);
                    }
                    bN.setIsRecyclable(true);
                    B bN2 = RecyclerView.N(view);
                    bN2.mScrapContainer = null;
                    bN2.mInChangeScrap = false;
                    bN2.clearReturnedFromScrapFlag();
                    sVar.i(bN2);
                }
                i10--;
            }
            arrayList.clear();
            ArrayList<B> arrayList2 = sVar.f19713b;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
            if (size > 0) {
                this.f19682b.invalidate();
            }
        }

        public int o(x xVar) {
            return 0;
        }

        public final void o0(View view, s sVar) {
            C1442g c1442g = this.f19681a;
            I i10 = c1442g.f19844a;
            int i11 = c1442g.f19847d;
            if (i11 == 1) {
                throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
            }
            if (i11 == 2) {
                throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
            }
            try {
                c1442g.f19847d = 1;
                c1442g.f19848e = view;
                int iIndexOfChild = i10.f19511a.indexOfChild(view);
                if (iIndexOfChild >= 0) {
                    if (c1442g.f19845b.f(iIndexOfChild)) {
                        c1442g.j(view);
                    }
                    i10.a(iIndexOfChild);
                }
                c1442g.f19847d = 0;
                c1442g.f19848e = null;
                sVar.h(view);
            } catch (Throwable th) {
                c1442g.f19847d = 0;
                c1442g.f19848e = null;
                throw th;
            }
        }

        public int p(x xVar) {
            return 0;
        }

        public final void p0(int i10) {
            if (w(i10) != null) {
                C1442g c1442g = this.f19681a;
                I i11 = c1442g.f19844a;
                int i12 = c1442g.f19847d;
                if (i12 == 1) {
                    throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
                }
                if (i12 == 2) {
                    throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
                }
                try {
                    int iF = c1442g.f(i10);
                    View childAt = i11.f19511a.getChildAt(iF);
                    if (childAt != null) {
                        c1442g.f19847d = 1;
                        c1442g.f19848e = childAt;
                        if (c1442g.f19845b.f(iF)) {
                            c1442g.j(childAt);
                        }
                        i11.a(iF);
                    }
                } finally {
                    c1442g.f19847d = 0;
                    c1442g.f19848e = null;
                }
            }
        }

        public int q(x xVar) {
            return 0;
        }

        /* JADX WARN: Code duplicated, block: B:28:0x00ae  */
        /* JADX WARN: Code duplicated, block: B:33:0x00b6  */
        /* JADX WARN: Code duplicated, block: B:34:0x00ba  */
        public boolean q0(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
            int I10 = I();
            int iK = K();
            int iJ = this.f19693n - J();
            int iH = this.f19694o - H();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int iWidth = rect.width() + left;
            int iHeight = rect.height() + top;
            int i10 = left - I10;
            int iMin = Math.min(0, i10);
            int i11 = top - iK;
            int iMin2 = Math.min(0, i11);
            int i12 = iWidth - iJ;
            int iMax = Math.max(0, i12);
            int iMax2 = Math.max(0, iHeight - iH);
            if (G() != 1) {
                if (iMin == 0) {
                    iMin = Math.min(i10, iMax);
                }
                iMax = iMin;
            } else if (iMax == 0) {
                iMax = Math.max(iMin, i12);
            }
            if (iMin2 == 0) {
                iMin2 = Math.min(i11, iMax2);
            }
            int[] iArr = {iMax, iMin2};
            int i13 = iArr[0];
            int i14 = iArr[1];
            if (z11) {
                View focusedChild = recyclerView.getFocusedChild();
                if (focusedChild != null) {
                    int I11 = I();
                    int iK2 = K();
                    int iJ2 = this.f19693n - J();
                    int iH2 = this.f19694o - H();
                    Rect rect2 = this.f19682b.f19632k;
                    B(rect2, focusedChild);
                    if (rect2.left - i13 < iJ2 && rect2.right - i13 > I11 && rect2.top - i14 < iH2 && rect2.bottom - i14 > iK2) {
                        if (i13 == 0) {
                        }
                        if (z10) {
                            recyclerView.scrollBy(i13, i14);
                        } else {
                            recyclerView.l0(i13, i14, false);
                        }
                        return true;
                    }
                }
            } else if (i13 == 0 || i14 != 0) {
                if (z10) {
                    recyclerView.scrollBy(i13, i14);
                } else {
                    recyclerView.l0(i13, i14, false);
                }
                return true;
            }
            return false;
        }

        public final void r(s sVar) {
            for (int iX = x() - 1; iX >= 0; iX--) {
                View viewW = w(iX);
                B bN = RecyclerView.N(viewW);
                if (bN.shouldIgnore()) {
                    if (RecyclerView.f19575S0) {
                        bN.toString();
                    }
                } else if (!bN.isInvalid() || bN.isRemoved() || this.f19682b.f19635n.hasStableIds()) {
                    w(iX);
                    this.f19681a.c(iX);
                    sVar.j(viewW);
                    this.f19682b.f19630h.c(bN);
                } else {
                    p0(iX);
                    sVar.i(bN);
                }
            }
        }

        public final void r0() {
            RecyclerView recyclerView = this.f19682b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public View s(int i10) {
            int iX = x();
            for (int i11 = 0; i11 < iX; i11++) {
                View viewW = w(i11);
                B bN = RecyclerView.N(viewW);
                if (bN != null && bN.getLayoutPosition() == i10 && !bN.shouldIgnore() && (this.f19682b.f19655y0.f19742g || !bN.isRemoved())) {
                    return viewW;
                }
            }
            return null;
        }

        public int s0(int i10, s sVar, x xVar) {
            return 0;
        }

        public abstract m t();

        public void t0(int i10) {
            if (RecyclerView.f19575S0) {
                Log.e("RecyclerView", "You MUST implement scrollToPosition. It will soon become abstract");
            }
        }

        public m u(Context context, AttributeSet attributeSet) {
            return new m(context, attributeSet);
        }

        public int u0(int i10, s sVar, x xVar) {
            return 0;
        }

        public m v(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof m) {
                return new m((m) layoutParams);
            }
            return layoutParams instanceof ViewGroup.MarginLayoutParams ? new m((ViewGroup.MarginLayoutParams) layoutParams) : new m(layoutParams);
        }

        public final void v0(RecyclerView recyclerView) {
            w0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public final View w(int i10) {
            C1442g c1442g = this.f19681a;
            if (c1442g != null) {
                return c1442g.d(i10);
            }
            return null;
        }

        public final void w0(int i10, int i11) {
            this.f19693n = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            this.f19691l = mode;
            if (mode == 0 && !RecyclerView.f19578V0) {
                this.f19693n = 0;
            }
            this.f19694o = View.MeasureSpec.getSize(i11);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.f19692m = mode2;
            if (mode2 != 0 || RecyclerView.f19578V0) {
                return;
            }
            this.f19694o = 0;
        }

        public final int x() {
            C1442g c1442g = this.f19681a;
            if (c1442g != null) {
                return c1442g.e();
            }
            return 0;
        }

        public void x0(Rect rect, int i10, int i11) {
            int iJ = J() + I() + rect.width();
            int iH = H() + K() + rect.height();
            RecyclerView recyclerView = this.f19682b;
            WeakHashMap<View, Z> weakHashMap = androidx.core.view.O.f16859a;
            this.f19682b.setMeasuredDimension(i(i10, iJ, recyclerView.getMinimumWidth()), i(i11, iH, this.f19682b.getMinimumHeight()));
        }

        public final void y0(int i10, int i11) {
            int iX = x();
            if (iX == 0) {
                this.f19682b.q(i10, i11);
                return;
            }
            int i12 = Integer.MIN_VALUE;
            int i13 = Integer.MAX_VALUE;
            int i14 = Integer.MIN_VALUE;
            int i15 = Integer.MAX_VALUE;
            for (int i16 = 0; i16 < iX; i16++) {
                View viewW = w(i16);
                Rect rect = this.f19682b.f19632k;
                B(rect, viewW);
                int i17 = rect.left;
                if (i17 < i15) {
                    i15 = i17;
                }
                int i18 = rect.right;
                if (i18 > i12) {
                    i12 = i18;
                }
                int i19 = rect.top;
                if (i19 < i13) {
                    i13 = i19;
                }
                int i20 = rect.bottom;
                if (i20 > i14) {
                    i14 = i20;
                }
            }
            this.f19682b.f19632k.set(i15, i13, i12, i14);
            x0(this.f19682b.f19632k, i10, i11);
        }

        public int z(s sVar, x xVar) {
            return -1;
        }

        public final void z0(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f19682b = null;
                this.f19681a = null;
                this.f19693n = 0;
                this.f19694o = 0;
            } else {
                this.f19682b = recyclerView;
                this.f19681a = recyclerView.f19629g;
                this.f19693n = recyclerView.getWidth();
                this.f19694o = recyclerView.getHeight();
            }
            this.f19691l = 1073741824;
            this.f19692m = 1073741824;
        }

        public void U() {
        }

        public void d0() {
        }

        public void V(RecyclerView recyclerView) {
        }

        public void W(RecyclerView recyclerView) {
        }

        public void i0(x xVar) {
        }

        public void j0(Parcelable parcelable) {
        }

        public void l0(int i10) {
        }

        public void c0(int i10, int i11) {
        }

        public void e0(int i10, int i11) {
        }

        public void f0(int i10, int i11) {
        }

        public void g0(int i10, int i11) {
        }

        public void k(int i10, RunnableC1453s.b bVar) {
        }

        public void b0(s sVar, x xVar, View view, B0.s sVar2) {
        }

        public void j(int i10, int i11, x xVar, RunnableC1453s.b bVar) {
        }
    }

    public static abstract class q {
        public void a(RecyclerView recyclerView, int i10) {
        }

        public void b(int i10, int i11, RecyclerView recyclerView) {
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i10, int i11) {
    }
}
