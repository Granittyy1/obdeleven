package androidx.compose.material3.internal;

import android.content.Context;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.E;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.InterfaceC1376t;
import androidx.lifecycle.Lifecycle;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: AccessibilityServiceStateProvider.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AccessibilityServiceStateProvider_androidKt {
    public static final void a(final InterfaceC1376t interfaceC1376t, final Ia.l<? super Lifecycle.Event, p293xa.r> lVar, final Ia.a<p293xa.r> aVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        C1086g c1086gP = interfaceC1084f.p(-1868327245);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c1086gP.k(interfaceC1376t) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c1086gP.k(lVar) ? 32 : 16;
        }
        int i14 = i11 & 4;
        if (i14 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= c1086gP.k(aVar) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && c1086gP.s()) {
            c1086gP.w();
        } else {
            if (i13 != 0) {
                lVar = new Ia.l<Lifecycle.Event, p293xa.r>() { // from class: androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt$ObserveState$1
                    @Override // Ia.l
                    public final /* bridge */ /* synthetic */ p293xa.r invoke(Lifecycle.Event event) {
                        return p293xa.r.f47939a;
                    }
                };
            }
            if (i14 != 0) {
                aVar = new Ia.a<p293xa.r>() { // from class: androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt$ObserveState$2
                    @Override // Ia.a
                    public final /* bridge */ /* synthetic */ p293xa.r invoke() {
                        return p293xa.r.f47939a;
                    }
                };
            }
            boolean zK = ((i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) | c1086gP.k(interfaceC1376t) | ((i12 & 896) == 256);
            Object objF = c1086gP.f();
            if (zK || objF == InterfaceC1084f.a.f12980a) {
                objF = new Ia.l<androidx.compose.runtime.B, androidx.compose.runtime.A>() { // from class: androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt$ObserveState$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.material3.internal.a, androidx.lifecycle.s] */
                    @Override // Ia.l
                    public final androidx.compose.runtime.A invoke(androidx.compose.runtime.B b10) {
                        final Ia.l<Lifecycle.Event, p293xa.r> lVar2 = lVar;
                        ?? r10 = new androidx.lifecycle.r() { // from class: androidx.compose.material3.internal.a
                            @Override // androidx.lifecycle.r
                            public final void h(InterfaceC1376t interfaceC1376t2, Lifecycle.Event event) {
                                lVar2.invoke(event);
                            }
                        };
                        interfaceC1376t.getLifecycle().a(r10);
                        return new C1056b(aVar, interfaceC1376t, r10);
                    }
                };
                c1086gP.E(objF);
            }
            E.a(interfaceC1376t, (Ia.l) objF, c1086gP);
        }
        final Ia.l<? super Lifecycle.Event, p293xa.r> lVar2 = lVar;
        final Ia.a<p293xa.r> aVar2 = aVar;
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt$ObserveState$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    AccessibilityServiceStateProvider_androidKt.a(interfaceC1376t, lVar2, aVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    public static final v b(InterfaceC1084f interfaceC1084f) {
        Object systemService = ((Context) interfaceC1084f.x(AndroidCompositionLocals_androidKt.f14793b)).getSystemService("accessibility");
        kotlin.jvm.internal.i.c(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        final AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        boolean zC = interfaceC1084f.c(true) | interfaceC1084f.c(true);
        Object objF = interfaceC1084f.f();
        Object obj = InterfaceC1084f.a.f12980a;
        if (zC || objF == obj) {
            objF = new v(true, true);
            interfaceC1084f.E(objF);
        }
        final v vVar = (v) objF;
        InterfaceC1376t interfaceC1376t = (InterfaceC1376t) interfaceC1084f.x(Z0.b.f7676a);
        boolean zK = interfaceC1084f.K(vVar) | interfaceC1084f.k(accessibilityManager);
        Object objF2 = interfaceC1084f.f();
        if (zK || objF2 == obj) {
            objF2 = new Ia.l<Lifecycle.Event, p293xa.r>() { // from class: androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt$rememberAccessibilityServiceState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // Ia.l
                public final p293xa.r invoke(Lifecycle.Event event) {
                    v.b bVar;
                    if (event == Lifecycle.Event.ON_RESUME) {
                        v vVar2 = vVar;
                        AccessibilityManager accessibilityManager2 = accessibilityManager;
                        vVar2.getClass();
                        vVar2.f12579b.setValue(Boolean.valueOf(accessibilityManager2.isEnabled()));
                        accessibilityManager2.addAccessibilityStateChangeListener(vVar2);
                        v.c cVar = vVar2.f12580c;
                        if (cVar != null) {
                            cVar.f12584a.setValue(Boolean.valueOf(accessibilityManager2.isTouchExplorationEnabled()));
                            accessibilityManager2.addTouchExplorationStateChangeListener(cVar);
                        }
                        if (Build.VERSION.SDK_INT >= 33 && (bVar = vVar2.f12581d) != null) {
                            bVar.f12582a.setValue(Boolean.valueOf(v.e(accessibilityManager2)));
                            v.a.a(accessibilityManager2, bVar);
                        }
                    }
                    return p293xa.r.f47939a;
                }
            };
            interfaceC1084f.E(objF2);
        }
        Ia.l lVar = (Ia.l) objF2;
        boolean zK2 = interfaceC1084f.K(vVar) | interfaceC1084f.k(accessibilityManager);
        Object objF3 = interfaceC1084f.f();
        if (zK2 || objF3 == obj) {
            objF3 = new Ia.a<p293xa.r>() { // from class: androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt$rememberAccessibilityServiceState$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final p293xa.r invoke() {
                    v.b bVar;
                    v vVar2 = vVar;
                    AccessibilityManager accessibilityManager2 = accessibilityManager;
                    vVar2.getClass();
                    accessibilityManager2.removeAccessibilityStateChangeListener(vVar2);
                    v.c cVar = vVar2.f12580c;
                    if (cVar != null) {
                        accessibilityManager2.removeTouchExplorationStateChangeListener(cVar);
                    }
                    if (Build.VERSION.SDK_INT >= 33 && (bVar = vVar2.f12581d) != null) {
                        v.a.b(accessibilityManager2, bVar);
                    }
                    return p293xa.r.f47939a;
                }
            };
            interfaceC1084f.E(objF3);
        }
        a(interfaceC1376t, lVar, (Ia.a) objF3, interfaceC1084f, 0, 0);
        return vVar;
    }
}
