package androidx.compose.ui.viewinterop;

import Ia.l;
import Ia.p;
import P3.d;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.compose.runtime.AbstractC1094k;
import androidx.compose.runtime.InterfaceC1082e;
import androidx.compose.ui.draw.f;
import androidx.compose.ui.graphics.C1139o;
import androidx.compose.ui.graphics.E;
import androidx.compose.ui.graphics.T;
import androidx.compose.ui.h;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollNode;
import androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt;
import androidx.compose.ui.layout.D;
import androidx.compose.ui.layout.F;
import androidx.compose.ui.layout.H;
import androidx.compose.ui.layout.InterfaceC1166l;
import androidx.compose.ui.layout.InterfaceC1167m;
import androidx.compose.ui.layout.InterfaceC1170p;
import androidx.compose.ui.layout.Y;
import androidx.compose.ui.node.C1195p;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.OwnerSnapshotObserver;
import androidx.compose.ui.node.U;
import androidx.compose.ui.node.V;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.C1234n;
import androidx.compose.ui.platform.RunnableC1240q;
import androidx.compose.ui.platform.l1;
import androidx.compose.ui.semantics.w;
import androidx.core.view.C1308x;
import androidx.core.view.InterfaceC1307w;
import androidx.core.view.InterfaceC1309y;
import androidx.core.view.O;
import androidx.core.view.c0;
import androidx.core.view.n0;
import androidx.lifecycle.InterfaceC1376t;
import com.voltasit.obdeleven.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.y;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.n;
import kotlinx.coroutines.A;
import kotlinx.coroutines.C2680e;
import p248u2.e;
import p293xa.r;

/* JADX INFO: compiled from: AndroidViewHolder.android.kt */
/* JADX INFO: loaded from: classes.dex */
public class AndroidViewHolder extends ViewGroup implements InterfaceC1307w, InterfaceC1082e, V, InterfaceC1309y {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final l<AndroidViewHolder, r> f15720A = new l<AndroidViewHolder, r>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$Companion$OnCommitAffectingUpdate$1
        @Override // Ia.l
        public final r invoke(AndroidViewHolder androidViewHolder) {
            AndroidViewHolder androidViewHolder2 = androidViewHolder;
            androidViewHolder2.getHandler().post(new X8.a(2, androidViewHolder2.f15736r));
            return r.f47939a;
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NestedScrollDispatcher f15721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f15722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final U f15723d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Ia.a<r> f15724e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f15725f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Ia.a<r> f15726g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Ia.a<r> f15727h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public h f15728i;
    public l<? super h, r> j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public p013b0.c f15729k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public l<? super p013b0.c, r> f15730l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public InterfaceC1376t f15731m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public e f15732n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int[] f15733o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f15734p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public n0 f15735q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Ia.a<r> f15736r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Ia.a<r> f15737s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public l<? super Boolean, r> f15738t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int[] f15739u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f15740v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f15741w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C1308x f15742x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f15743y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final LayoutNode f15744z;

    /* JADX INFO: compiled from: AndroidViewHolder.android.kt */
    public static final class a extends c0.b {
        public a() {
            super(1);
        }

        @Override // androidx.core.view.c0.b
        public final n0 c(n0 n0Var, List<c0> list) {
            return AndroidViewHolder.this.e(n0Var);
        }

        @Override // androidx.core.view.c0.b
        public final c0.a d(c0.a aVar) {
            C1195p c1195p = AndroidViewHolder.this.f15744z.f14389G.f14365b;
            if (!c1195p.f14602S.f13997o) {
                return aVar;
            }
            long jL = Cb.a.l(c1195p.g0(0L));
            int i10 = (int) (jL >> 32);
            if (i10 < 0) {
                i10 = 0;
            }
            int i11 = (int) (jL & 4294967295L);
            if (i11 < 0) {
                i11 = 0;
            }
            long jA = n.h(c1195p).a();
            int i12 = (int) (jA >> 32);
            int i13 = (int) (jA & 4294967295L);
            long j = c1195p.f14222d;
            long jL2 = Cb.a.l(c1195p.g0((((long) Float.floatToRawIntBits((int) (j >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L)));
            int i14 = i12 - ((int) (jL2 >> 32));
            if (i14 < 0) {
                i14 = 0;
            }
            int i15 = i13 - ((int) (4294967295L & jL2));
            int i16 = i15 >= 0 ? i15 : 0;
            return (i10 == 0 && i11 == 0 && i14 == 0 && i16 == 0) ? aVar : new c0.a(AndroidViewHolder.d(aVar.f16890a, i10, i11, i14, i16), AndroidViewHolder.d(aVar.f16891b, i10, i11, i14, i16));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidViewHolder.android.kt */
    @Aa.c(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1", f = "AndroidViewHolder.android.kt", l = {639, 641}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
        final /* synthetic */ boolean $consumed;
        final /* synthetic */ long $viewVelocity;
        int label;
        final /* synthetic */ AndroidViewHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z10, AndroidViewHolder androidViewHolder, long j, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$consumed = z10;
            this.this$0 = androidViewHolder;
            this.$viewVelocity = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass1(this.$consumed, this.this$0, this.$viewVelocity, cVar);
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.b.b(obj);
                if (this.$consumed) {
                    NestedScrollDispatcher nestedScrollDispatcher = this.this$0.f15721b;
                    long j = this.$viewVelocity;
                    this.label = 2;
                    if (nestedScrollDispatcher.a(j, 0L, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    NestedScrollDispatcher nestedScrollDispatcher2 = this.this$0.f15721b;
                    long j10 = this.$viewVelocity;
                    this.label = 1;
                    if (nestedScrollDispatcher2.a(0L, j10, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else {
                if (i10 != 1 && i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return r.f47939a;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedPreFling$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AndroidViewHolder.android.kt */
    @Aa.c(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedPreFling$1", f = "AndroidViewHolder.android.kt", l = {650}, m = "invokeSuspend")
    public static final class C12751 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
        final /* synthetic */ long $toBeConsumed;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12751(long j, kotlin.coroutines.c<? super C12751> cVar) {
            super(2, cVar);
            this.$toBeConsumed = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return AndroidViewHolder.this.new C12751(this.$toBeConsumed, cVar);
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((C12751) create(a10, cVar)).invokeSuspend(r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.b.b(obj);
                NestedScrollDispatcher nestedScrollDispatcher = AndroidViewHolder.this.f15721b;
                long j = this.$toBeConsumed;
                this.label = 1;
                if (nestedScrollDispatcher.b(j, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return r.f47939a;
        }
    }

    public AndroidViewHolder(Context context, AbstractC1094k abstractC1094k, int i10, NestedScrollDispatcher nestedScrollDispatcher, View view, U u10) {
        super(context);
        this.f15721b = nestedScrollDispatcher;
        this.f15722c = view;
        this.f15723d = u10;
        if (abstractC1094k != null) {
            LinkedHashMap linkedHashMap = l1.f15061a;
            setTag(R.id.androidx_compose_ui_view_composition_context, abstractC1094k);
        }
        setSaveFromParentEnabled(false);
        addView(view);
        O.p(this, new a());
        O.d.u(this, this);
        this.f15724e = new Ia.a<r>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$update$1
            @Override // Ia.a
            public final /* bridge */ /* synthetic */ r invoke() {
                return r.f47939a;
            }
        };
        this.f15726g = new Ia.a<r>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$reset$1
            @Override // Ia.a
            public final /* bridge */ /* synthetic */ r invoke() {
                return r.f47939a;
            }
        };
        this.f15727h = new Ia.a<r>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$release$1
            @Override // Ia.a
            public final /* bridge */ /* synthetic */ r invoke() {
                return r.f47939a;
            }
        };
        h.a aVar = h.a.f13984b;
        this.f15728i = aVar;
        this.f15729k = p006a5.a.a();
        this.f15733o = new int[2];
        this.f15734p = 0L;
        this.f15736r = new AndroidViewHolder$runUpdate$1(this);
        this.f15737s = new Ia.a<r>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$runInvalidate$1
            {
                super(0);
            }

            @Override // Ia.a
            public final r invoke() {
                this.this$0.getLayoutNode().M();
                return r.f47939a;
            }
        };
        this.f15739u = new int[2];
        this.f15740v = Integer.MIN_VALUE;
        this.f15741w = Integer.MIN_VALUE;
        this.f15742x = new C1308x();
        final LayoutNode layoutNode = new LayoutNode(false, 3, 0);
        layoutNode.f14406h = true;
        layoutNode.f14413p = this;
        final h hVarA = androidx.compose.ui.layout.O.a(f.a(T.b(PointerInteropFilter_androidKt.a(androidx.compose.ui.semantics.p.b(androidx.compose.ui.input.nestedscroll.b.a(aVar, androidx.compose.ui.viewinterop.a.f15779a, nestedScrollDispatcher), true, new l<w, r>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$1
            @Override // Ia.l
            public final /* bridge */ /* synthetic */ r invoke(w wVar) {
                return r.f47939a;
            }
        }), this), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, false, 131071), new l<J.e, r>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(J.e eVar) {
                AndroidViewHolder androidViewHolder = this.$this_run;
                LayoutNode layoutNode2 = layoutNode;
                AndroidViewHolder androidViewHolder2 = this;
                E eA = eVar.W0().a();
                if (androidViewHolder.getView().getVisibility() != 8) {
                    androidViewHolder.f15743y = true;
                    AndroidComposeView androidComposeView = layoutNode2.f14412o;
                    if (androidComposeView == null) {
                        androidComposeView = null;
                    }
                    if (androidComposeView != null) {
                        Canvas canvasA = C1139o.a(eA);
                        androidComposeView.getAndroidViewsHandler$ui_release().getClass();
                        androidViewHolder2.draw(canvasA);
                    }
                    androidViewHolder.f15743y = false;
                }
                return r.f47939a;
            }
        }), new l<InterfaceC1170p, r>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(InterfaceC1170p interfaceC1170p) {
                WindowInsets windowInsetsG;
                a.a(this.$this_run, layoutNode);
                this.$this_run.f15723d.f();
                AndroidViewHolder androidViewHolder = this.$this_run;
                int[] iArr = androidViewHolder.f15733o;
                int i11 = iArr[0];
                int i12 = iArr[1];
                androidViewHolder.getView().getLocationOnScreen(this.$this_run.f15733o);
                AndroidViewHolder androidViewHolder2 = this.$this_run;
                long j = androidViewHolder2.f15734p;
                androidViewHolder2.f15734p = interfaceC1170p.a();
                AndroidViewHolder androidViewHolder3 = this.$this_run;
                n0 n0Var = androidViewHolder3.f15735q;
                if (n0Var != null) {
                    int[] iArr2 = androidViewHolder3.f15733o;
                    if ((i11 != iArr2[0] || i12 != iArr2[1] || !p013b0.l.b(j, androidViewHolder3.f15734p)) && (windowInsetsG = this.$this_run.e(n0Var).g()) != null) {
                        this.$this_run.getView().dispatchApplyWindowInsets(windowInsetsG);
                    }
                }
                return r.f47939a;
            }
        });
        layoutNode.e(this.f15728i.i(hVarA));
        this.j = new l<h, r>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(h hVar) {
                layoutNode.e(hVar.i(hVarA));
                return r.f47939a;
            }
        };
        layoutNode.i0(this.f15729k);
        this.f15730l = new l<p013b0.c, r>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$2
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(p013b0.c cVar) {
                layoutNode.i0(cVar);
                return r.f47939a;
            }
        };
        layoutNode.f14396N = new l<U, r>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(U u11) {
                U u12 = u11;
                AndroidComposeView androidComposeView = u12 instanceof AndroidComposeView ? (AndroidComposeView) u12 : null;
                if (androidComposeView != null) {
                    AndroidViewHolder androidViewHolder = this.$this_run;
                    LayoutNode layoutNode2 = layoutNode;
                    androidComposeView.getAndroidViewsHandler$ui_release().getHolderToLayoutNode().put(androidViewHolder, layoutNode2);
                    androidComposeView.getAndroidViewsHandler$ui_release().addView(androidViewHolder);
                    androidComposeView.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().put(layoutNode2, androidViewHolder);
                    androidViewHolder.setImportantForAccessibility(1);
                    O.n(androidViewHolder, new C1234n(androidComposeView, layoutNode2, androidComposeView));
                }
                ViewParent parent = this.$this_run.getView().getParent();
                AndroidViewHolder androidViewHolder2 = this.$this_run;
                if (parent != androidViewHolder2) {
                    androidViewHolder2.addView(androidViewHolder2.getView());
                }
                return r.f47939a;
            }
        };
        layoutNode.f14397O = new l<U, r>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$4
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(U u11) {
                U u12 = u11;
                AndroidComposeView androidComposeView = u12 instanceof AndroidComposeView ? (AndroidComposeView) u12 : null;
                if (androidComposeView != null) {
                    androidComposeView.P(this.$this_run);
                }
                this.$this_run.removeAllViewsInLayout();
                return r.f47939a;
            }
        };
        layoutNode.d(new androidx.compose.ui.layout.E() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$5
            @Override // androidx.compose.ui.layout.E
            public final F g(H h8, List<? extends D> list, long j) {
                final AndroidViewHolder androidViewHolder = this.f15747a;
                if (androidViewHolder.getChildCount() == 0) {
                    return h8.y1(p013b0.a.j(j), p013b0.a.i(j), y.p(), new l<Y.a, r>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$5$measure$1
                        @Override // Ia.l
                        public final /* bridge */ /* synthetic */ r invoke(Y.a aVar2) {
                            return r.f47939a;
                        }
                    });
                }
                if (p013b0.a.j(j) != 0) {
                    androidViewHolder.getChildAt(0).setMinimumWidth(p013b0.a.j(j));
                }
                if (p013b0.a.i(j) != 0) {
                    androidViewHolder.getChildAt(0).setMinimumHeight(p013b0.a.i(j));
                }
                int iJ = p013b0.a.j(j);
                int iH = p013b0.a.h(j);
                ViewGroup.LayoutParams layoutParams = androidViewHolder.getLayoutParams();
                i.b(layoutParams);
                int iC = AndroidViewHolder.c(androidViewHolder, iJ, iH, layoutParams.width);
                int i11 = p013b0.a.i(j);
                int iG = p013b0.a.g(j);
                ViewGroup.LayoutParams layoutParams2 = androidViewHolder.getLayoutParams();
                i.b(layoutParams2);
                androidViewHolder.measure(iC, AndroidViewHolder.c(androidViewHolder, i11, iG, layoutParams2.height));
                int measuredWidth = androidViewHolder.getMeasuredWidth();
                int measuredHeight = androidViewHolder.getMeasuredHeight();
                final LayoutNode layoutNode2 = layoutNode;
                return h8.y1(measuredWidth, measuredHeight, y.p(), new l<Y.a, r>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$5$measure$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final r invoke(Y.a aVar2) {
                        a.a(androidViewHolder, layoutNode2);
                        return r.f47939a;
                    }
                });
            }

            @Override // androidx.compose.ui.layout.E
            public final int h(InterfaceC1167m interfaceC1167m, List<? extends InterfaceC1166l> list, int i11) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                AndroidViewHolder androidViewHolder = this.f15747a;
                ViewGroup.LayoutParams layoutParams = androidViewHolder.getLayoutParams();
                i.b(layoutParams);
                androidViewHolder.measure(iMakeMeasureSpec, AndroidViewHolder.c(androidViewHolder, 0, i11, layoutParams.height));
                return androidViewHolder.getMeasuredWidth();
            }

            @Override // androidx.compose.ui.layout.E
            public final int i(InterfaceC1167m interfaceC1167m, List<? extends InterfaceC1166l> list, int i11) {
                AndroidViewHolder androidViewHolder = this.f15747a;
                ViewGroup.LayoutParams layoutParams = androidViewHolder.getLayoutParams();
                i.b(layoutParams);
                androidViewHolder.measure(AndroidViewHolder.c(androidViewHolder, 0, i11, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
                return androidViewHolder.getMeasuredHeight();
            }

            @Override // androidx.compose.ui.layout.E
            public final int j(InterfaceC1167m interfaceC1167m, List<? extends InterfaceC1166l> list, int i11) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                AndroidViewHolder androidViewHolder = this.f15747a;
                ViewGroup.LayoutParams layoutParams = androidViewHolder.getLayoutParams();
                i.b(layoutParams);
                androidViewHolder.measure(iMakeMeasureSpec, AndroidViewHolder.c(androidViewHolder, 0, i11, layoutParams.height));
                return androidViewHolder.getMeasuredWidth();
            }

            @Override // androidx.compose.ui.layout.E
            public final int m(InterfaceC1167m interfaceC1167m, List<? extends InterfaceC1166l> list, int i11) {
                AndroidViewHolder androidViewHolder = this.f15747a;
                ViewGroup.LayoutParams layoutParams = androidViewHolder.getLayoutParams();
                i.b(layoutParams);
                androidViewHolder.measure(AndroidViewHolder.c(androidViewHolder, 0, i11, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
                return androidViewHolder.getMeasuredHeight();
            }
        });
        this.f15744z = layoutNode;
    }

    public static final int c(AndroidViewHolder androidViewHolder, int i10, int i11, int i12) {
        androidViewHolder.getClass();
        if (i12 >= 0 || i10 == i11) {
            return View.MeasureSpec.makeMeasureSpec(Na.l.D(i12, i10, i11), 1073741824);
        }
        if (i12 != -2 || i11 == Integer.MAX_VALUE) {
            return (i12 != -1 || i11 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
        }
        return View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE);
    }

    public static p222s0.b d(p222s0.b bVar, int i10, int i11, int i12, int i13) {
        int i14 = bVar.f46851a - i10;
        if (i14 < 0) {
            i14 = 0;
        }
        int i15 = bVar.f46852b - i11;
        if (i15 < 0) {
            i15 = 0;
        }
        int i16 = bVar.f46853c - i12;
        if (i16 < 0) {
            i16 = 0;
        }
        int i17 = bVar.f46854d - i13;
        return p222s0.b.b(i14, i15, i16, i17 >= 0 ? i17 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OwnerSnapshotObserver getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            R.a.b("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return this.f15723d.getSnapshotObserver();
    }

    @Override // androidx.compose.runtime.InterfaceC1082e
    public final void a() {
        this.f15727h.invoke();
    }

    @Override // androidx.compose.ui.node.V
    public final boolean a0() {
        return isAttachedToWindow();
    }

    public final n0 e(n0 n0Var) {
        n0.k kVar = n0Var.f16948a;
        p222s0.b bVarG = kVar.g(-1);
        p222s0.b bVar = p222s0.b.f46850e;
        if (bVarG.equals(bVar) && kVar.h(-9).equals(bVar) && kVar.f() == null) {
            return n0Var;
        }
        C1195p c1195p = this.f15744z.f14389G.f14365b;
        if (!c1195p.f14602S.f13997o) {
            return n0Var;
        }
        long jL = Cb.a.l(c1195p.g0(0L));
        int i10 = (int) (jL >> 32);
        if (i10 < 0) {
            i10 = 0;
        }
        int i11 = (int) (jL & 4294967295L);
        if (i11 < 0) {
            i11 = 0;
        }
        long jA = n.h(c1195p).a();
        int i12 = (int) (jA >> 32);
        int i13 = (int) (jA & 4294967295L);
        long j = c1195p.f14222d;
        long jL2 = Cb.a.l(c1195p.g0((((long) Float.floatToRawIntBits((int) (j >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L)));
        int i14 = i12 - ((int) (jL2 >> 32));
        if (i14 < 0) {
            i14 = 0;
        }
        int i15 = i13 - ((int) (4294967295L & jL2));
        int i16 = i15 >= 0 ? i15 : 0;
        return (i10 == 0 && i11 == 0 && i14 == 0 && i16 == 0) ? n0Var : n0Var.f16948a.n(i10, i11, i14, i16);
    }

    @Override // androidx.core.view.InterfaceC1309y
    public final n0 g(View view, n0 n0Var) {
        this.f15735q = new n0(n0Var);
        return e(n0Var);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.f15739u;
        getLocationInWindow(iArr);
        int i10 = iArr[0];
        region.op(i10, iArr[1], getWidth() + i10, getHeight() + iArr[1], Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final p013b0.c getDensity() {
        return this.f15729k;
    }

    public final View getInteropView() {
        return this.f15722c;
    }

    public final LayoutNode getLayoutNode() {
        return this.f15744z;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.f15722c.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final InterfaceC1376t getLifecycleOwner() {
        return this.f15731m;
    }

    public final h getModifier() {
        return this.f15728i;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C1308x c1308x = this.f15742x;
        return c1308x.f16998b | c1308x.f16997a;
    }

    public final l<p013b0.c, r> getOnDensityChanged$ui_release() {
        return this.f15730l;
    }

    public final l<h, r> getOnModifierChanged$ui_release() {
        return this.j;
    }

    public final l<Boolean, r> getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.f15738t;
    }

    public final Ia.a<r> getRelease() {
        return this.f15727h;
    }

    public final Ia.a<r> getReset() {
        return this.f15726g;
    }

    public final e getSavedStateRegistryOwner() {
        return this.f15732n;
    }

    public final Ia.a<r> getUpdate() {
        return this.f15724e;
    }

    public final View getView() {
        return this.f15722c;
    }

    @Override // androidx.compose.runtime.InterfaceC1082e
    public final void h() {
        this.f15726g.invoke();
        removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        if (!this.f15743y) {
            this.f15744z.M();
            return null;
        }
        this.f15722c.postOnAnimation(new RunnableC1240q(1, this.f15737s));
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f15722c.isNestedScrollingEnabled();
    }

    @Override // androidx.core.view.InterfaceC1306v
    public final void j(int i10, View view) {
        C1308x c1308x = this.f15742x;
        if (i10 == 1) {
            c1308x.f16998b = 0;
        } else {
            c1308x.f16997a = 0;
        }
    }

    @Override // androidx.core.view.InterfaceC1307w
    public final void k(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (this.f15722c.isNestedScrollingEnabled()) {
            float f10 = -1;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(i10 * f10)) << 32) | (((long) Float.floatToRawIntBits(i11 * f10)) & 4294967295L);
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(i13 * f10)) & 4294967295L) | (((long) Float.floatToRawIntBits(i12 * f10)) << 32);
            int i15 = i14 == 0 ? 1 : 2;
            NestedScrollNode nestedScrollNode = this.f15721b.f14001a;
            NestedScrollNode nestedScrollNode2 = null;
            if (nestedScrollNode != null && nestedScrollNode.f13997o) {
                nestedScrollNode2 = (NestedScrollNode) Cb.a.f(nestedScrollNode);
            }
            long jC1 = nestedScrollNode2 != null ? nestedScrollNode2.c1(i15, jFloatToRawIntBits, jFloatToRawIntBits2) : 0L;
            iArr[0] = androidx.compose.material.T.b(Float.intBitsToFloat((int) (jC1 >> 32)));
            iArr[1] = androidx.compose.material.T.b(Float.intBitsToFloat((int) (jC1 & 4294967295L)));
        }
    }

    @Override // androidx.core.view.InterfaceC1306v
    public final void l(View view, int i10, int i11, int i12, int i13, int i14) {
        if (this.f15722c.isNestedScrollingEnabled()) {
            float f10 = -1;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(i10 * f10)) << 32) | (((long) Float.floatToRawIntBits(i11 * f10)) & 4294967295L);
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(i12 * f10)) << 32) | (((long) Float.floatToRawIntBits(i13 * f10)) & 4294967295L);
            int i15 = i14 == 0 ? 1 : 2;
            NestedScrollNode nestedScrollNode = this.f15721b.f14001a;
            NestedScrollNode nestedScrollNode2 = null;
            if (nestedScrollNode != null && nestedScrollNode.f13997o) {
                nestedScrollNode2 = (NestedScrollNode) Cb.a.f(nestedScrollNode);
            }
            if (nestedScrollNode2 != null) {
                nestedScrollNode2.c1(i15, jFloatToRawIntBits, jFloatToRawIntBits2);
            }
        }
    }

    @Override // androidx.core.view.InterfaceC1306v
    public final boolean m(View view, View view2, int i10, int i11) {
        return ((i10 & 2) == 0 && (i10 & 1) == 0) ? false : true;
    }

    @Override // androidx.core.view.InterfaceC1306v
    public final void n(View view, View view2, int i10, int i11) {
        C1308x c1308x = this.f15742x;
        if (i11 == 1) {
            c1308x.f16998b = i10;
        } else {
            c1308x.f16997a = i10;
        }
    }

    @Override // androidx.core.view.InterfaceC1306v
    public final void o(View view, int i10, int i11, int[] iArr, int i12) {
        if (this.f15722c.isNestedScrollingEnabled()) {
            float f10 = i10;
            float f11 = -1;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f10 * f11)) << 32) | (((long) Float.floatToRawIntBits(i11 * f11)) & 4294967295L);
            int i13 = i12 == 0 ? 1 : 2;
            NestedScrollNode nestedScrollNode = this.f15721b.f14001a;
            NestedScrollNode nestedScrollNode2 = null;
            if (nestedScrollNode != null && nestedScrollNode.f13997o) {
                nestedScrollNode2 = (NestedScrollNode) Cb.a.f(nestedScrollNode);
            }
            long jC0 = nestedScrollNode2 != null ? nestedScrollNode2.C0(i13, jFloatToRawIntBits) : 0L;
            iArr[0] = androidx.compose.material.T.b(Float.intBitsToFloat((int) (jC0 >> 32)));
            iArr[1] = androidx.compose.material.T.b(Float.intBitsToFloat((int) (jC0 & 4294967295L)));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((AndroidViewHolder$runUpdate$1) this.f15736r).invoke();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        if (!this.f15743y) {
            this.f15744z.M();
        } else {
            this.f15722c.postOnAnimation(new RunnableC1240q(1, this.f15737s));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().f14552a.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f15722c.layout(0, 0, i12 - i10, i13 - i11);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        View view = this.f15722c;
        if (view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
            return;
        }
        if (view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        view.measure(i10, i11);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        this.f15740v = i10;
        this.f15741w = i11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (!this.f15722c.isNestedScrollingEnabled()) {
            return false;
        }
        C2680e.c(this.f15721b.c(), null, null, new AnonymousClass1(z10, this, I2.e.a(f10 * (-1.0f), f11 * (-1.0f)), null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        if (!this.f15722c.isNestedScrollingEnabled()) {
            return false;
        }
        C2680e.c(this.f15721b.c(), null, null, new C12751(I2.e.a(f10 * (-1.0f), f11 * (-1.0f)), null), 3);
        return false;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
    }

    @Override // androidx.compose.runtime.InterfaceC1082e
    public final void p() {
        View view = this.f15722c;
        if (view.getParent() != this) {
            addView(view);
        } else {
            this.f15726g.invoke();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        l<? super Boolean, r> lVar = this.f15738t;
        if (lVar != null) {
            lVar.invoke(Boolean.valueOf(z10));
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public final void setDensity(p013b0.c cVar) {
        if (cVar != this.f15729k) {
            this.f15729k = cVar;
            l<? super p013b0.c, r> lVar = this.f15730l;
            if (lVar != null) {
                lVar.invoke(cVar);
            }
        }
    }

    public final void setLifecycleOwner(InterfaceC1376t interfaceC1376t) {
        if (interfaceC1376t != this.f15731m) {
            this.f15731m = interfaceC1376t;
            d.u(this, interfaceC1376t);
        }
    }

    public final void setModifier(h hVar) {
        if (hVar != this.f15728i) {
            this.f15728i = hVar;
            l<? super h, r> lVar = this.j;
            if (lVar != null) {
                lVar.invoke(hVar);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(l<? super p013b0.c, r> lVar) {
        this.f15730l = lVar;
    }

    public final void setOnModifierChanged$ui_release(l<? super h, r> lVar) {
        this.j = lVar;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(l<? super Boolean, r> lVar) {
        this.f15738t = lVar;
    }

    public final void setRelease(Ia.a<r> aVar) {
        this.f15727h = aVar;
    }

    public final void setReset(Ia.a<r> aVar) {
        this.f15726g = aVar;
    }

    public final void setSavedStateRegistryOwner(e eVar) {
        if (eVar != this.f15732n) {
            this.f15732n = eVar;
            I2.e.p(this, eVar);
        }
    }

    public final void setUpdate(Ia.a<r> aVar) {
        this.f15724e = aVar;
        this.f15725f = true;
        ((AndroidViewHolder$runUpdate$1) this.f15736r).invoke();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }
}
