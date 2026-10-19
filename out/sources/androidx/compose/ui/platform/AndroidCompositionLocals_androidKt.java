package androidx.compose.ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import androidx.compose.runtime.AbstractC1099m0;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1101n0;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.lifecycle.InterfaceC1376t;
import com.voltasit.obdeleven.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: AndroidCompositionLocals.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AndroidCompositionLocals_androidKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final androidx.compose.runtime.C f14792a = CompositionLocalKt.c(new Ia.a<Configuration>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalConfiguration$1
        @Override // Ia.a
        public final Configuration invoke() {
            AndroidCompositionLocals_androidKt.b("LocalConfiguration");
            throw null;
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final androidx.compose.runtime.O0 f14793b = new androidx.compose.runtime.O0(new Ia.a<Context>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalContext$1
        @Override // Ia.a
        public final Context invoke() {
            AndroidCompositionLocals_androidKt.b("LocalContext");
            throw null;
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final androidx.compose.runtime.O0 f14794c = new androidx.compose.runtime.O0(new Ia.a<U.b>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalImageVectorCache$1
        @Override // Ia.a
        public final U.b invoke() {
            AndroidCompositionLocals_androidKt.b("LocalImageVectorCache");
            throw null;
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final androidx.compose.runtime.O0 f14795d = new androidx.compose.runtime.O0(new Ia.a<U.d>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalResourceIdCache$1
        @Override // Ia.a
        public final U.d invoke() {
            AndroidCompositionLocals_androidKt.b("LocalResourceIdCache");
            throw null;
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final androidx.compose.runtime.O0 f14796e = new androidx.compose.runtime.O0(new Ia.a<p248u2.e>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalSavedStateRegistryOwner$1
        @Override // Ia.a
        public final p248u2.e invoke() {
            AndroidCompositionLocals_androidKt.b("LocalSavedStateRegistryOwner");
            throw null;
        }
    });

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final androidx.compose.runtime.O0 f14797f = new androidx.compose.runtime.O0(new Ia.a<View>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalView$1
        @Override // Ia.a
        public final View invoke() {
            AndroidCompositionLocals_androidKt.b("LocalView");
            throw null;
        }
    });

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final AndroidComposeView androidComposeView, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar, InterfaceC1084f interfaceC1084f, final int i10) {
        LinkedHashMap linkedHashMap;
        final boolean z10;
        C1086g c1086gP = interfaceC1084f.p(1396852028);
        int i11 = (i10 & 6) == 0 ? (c1086gP.k(androidComposeView) ? 4 : 2) | i10 : i10;
        if ((i10 & 48) == 0) {
            i11 |= c1086gP.k(pVar) ? 32 : 16;
        }
        if (c1086gP.C(i11 & 1, (i11 & 19) != 18)) {
            final Context context = androidComposeView.getContext();
            Object objF = c1086gP.f();
            InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
            if (objF == c0153a) {
                objF = androidx.compose.runtime.J0.f(new Configuration(context.getResources().getConfiguration()));
                c1086gP.E(objF);
            }
            final androidx.compose.runtime.X x10 = (androidx.compose.runtime.X) objF;
            Object objF2 = c1086gP.f();
            if (objF2 == c0153a) {
                objF2 = new Ia.l<Configuration, p293xa.r>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(Configuration configuration) {
                        androidx.compose.runtime.X<Configuration> x11 = x10;
                        Configuration configuration2 = new Configuration(configuration);
                        androidx.compose.runtime.C c10 = AndroidCompositionLocals_androidKt.f14792a;
                        x11.setValue(configuration2);
                        return p293xa.r.f47939a;
                    }
                };
                c1086gP.E(objF2);
            }
            androidComposeView.setConfigurationChangeObserver((Ia.l) objF2);
            Object objF3 = c1086gP.f();
            if (objF3 == c0153a) {
                objF3 = new J(context);
                c1086gP.E(objF3);
            }
            final J j = (J) objF3;
            AndroidComposeView.b viewTreeOwners = androidComposeView.getViewTreeOwners();
            if (viewTreeOwners == null) {
                throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
            }
            Object objF4 = c1086gP.f();
            p248u2.e eVar = viewTreeOwners.f14725b;
            if (objF4 == c0153a) {
                Object parent = androidComposeView.getParent();
                kotlin.jvm.internal.i.c(parent, "null cannot be cast to non-null type android.view.View");
                View view = (View) parent;
                Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
                String strValueOf = tag instanceof String ? (String) tag : null;
                if (strValueOf == null) {
                    strValueOf = String.valueOf(view.getId());
                }
                final String str = androidx.compose.runtime.saveable.f.class.getSimpleName() + ':' + strValueOf;
                final p248u2.c savedStateRegistry = eVar.getSavedStateRegistry();
                Bundle bundleA = savedStateRegistry.a(str);
                if (bundleA != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str2 : bundleA.keySet()) {
                        ArrayList parcelableArrayList = bundleA.getParcelableArrayList(str2);
                        kotlin.jvm.internal.i.c(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
                        linkedHashMap.put(str2, parcelableArrayList);
                        bundleA = bundleA;
                    }
                } else {
                    linkedHashMap = null;
                }
                androidx.compose.runtime.O0 o10 = SaveableStateRegistryKt.f13132a;
                final androidx.compose.runtime.saveable.h hVar = new androidx.compose.runtime.saveable.h(linkedHashMap, new Ia.l<Object, Boolean>() { // from class: androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$saveableStateRegistry$1
                    @Override // Ia.l
                    public final Boolean invoke(Object obj) {
                        return Boolean.valueOf(C1221g0.a(obj));
                    }
                });
                try {
                    savedStateRegistry.c(str, new u2.c.b() { // from class: androidx.compose.ui.platform.f0
                        @Override // u2.c.b
                        public final Bundle a() {
                            Map<String, List<Object>> mapB = hVar.b();
                            Bundle bundle = new Bundle();
                            for (Map.Entry<String, List<Object>> entry : mapB.entrySet()) {
                                String key = entry.getKey();
                                List<Object> value = entry.getValue();
                                bundle.putParcelableArrayList(key, value instanceof ArrayList ? (ArrayList) value : new ArrayList<>(value));
                            }
                            return bundle;
                        }
                    });
                    z10 = true;
                } catch (IllegalArgumentException unused) {
                    z10 = false;
                }
                C1217e0 c1217e0 = new C1217e0(hVar, new Ia.a<p293xa.r>() { // from class: androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final p293xa.r invoke() {
                        if (z10) {
                            p248u2.c cVar = savedStateRegistry;
                            String key = str;
                            cVar.getClass();
                            kotlin.jvm.internal.i.e(key, "key");
                            p273w2.b bVar = cVar.f47414a;
                            synchronized (bVar.f47739c) {
                            }
                        }
                        return p293xa.r.f47939a;
                    }
                });
                c1086gP.E(c1217e0);
                objF4 = c1217e0;
            }
            final C1217e0 c1217e1 = (C1217e0) objF4;
            p293xa.r rVar = p293xa.r.f47939a;
            boolean zK = c1086gP.k(c1217e1);
            Object objF5 = c1086gP.f();
            if (zK || objF5 == c0153a) {
                objF5 = new Ia.l<androidx.compose.runtime.B, androidx.compose.runtime.A>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$2$1
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final androidx.compose.runtime.A invoke(androidx.compose.runtime.B b10) {
                        return new androidx.compose.material3.T(1, c1217e1);
                    }
                };
                c1086gP.E(objF5);
            }
            androidx.compose.runtime.E.a(rVar, (Ia.l) objF5, c1086gP);
            Object objF6 = c1086gP.f();
            if (objF6 == c0153a) {
                objF6 = (Build.VERSION.SDK_INT < 31 || !((Vibrator) context.getSystemService(Vibrator.class)).areAllPrimitivesSupported(1, 7, 2)) ? new C1246t0() : new C1211b0(androidComposeView.getView());
                c1086gP.E(objF6);
            }
            M.a aVar = (M.a) objF6;
            Configuration configuration = (Configuration) x10.getValue();
            Object objF7 = c1086gP.f();
            if (objF7 == c0153a) {
                objF7 = new U.b();
                c1086gP.E(objF7);
            }
            U.b bVar = (U.b) objF7;
            Object objF8 = c1086gP.f();
            Object obj = objF8;
            if (objF8 == c0153a) {
                Configuration configuration2 = new Configuration();
                if (configuration != null) {
                    configuration2.setTo(configuration);
                }
                c1086gP.E(configuration2);
                obj = configuration2;
            }
            Configuration configuration3 = (Configuration) obj;
            Object objF9 = c1086gP.f();
            if (objF9 == c0153a) {
                objF9 = new D(configuration3, bVar);
                c1086gP.E(objF9);
            }
            final D d10 = (D) objF9;
            boolean zK2 = c1086gP.k(context);
            Object objF10 = c1086gP.f();
            if (zK2 || objF10 == c0153a) {
                objF10 = new Ia.l<androidx.compose.runtime.B, androidx.compose.runtime.A>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$obtainImageVectorCache$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final androidx.compose.runtime.A invoke(androidx.compose.runtime.B b10) {
                        context.getApplicationContext().registerComponentCallbacks(d10);
                        return new C(context, d10);
                    }
                };
                c1086gP.E(objF10);
            }
            androidx.compose.runtime.E.a(bVar, (Ia.l) objF10, c1086gP);
            Object objF11 = c1086gP.f();
            if (objF11 == c0153a) {
                objF11 = new U.d();
                c1086gP.E(objF11);
            }
            U.d dVar = (U.d) objF11;
            Object objF12 = c1086gP.f();
            if (objF12 == c0153a) {
                objF12 = new F(dVar);
                c1086gP.E(objF12);
            }
            final F f10 = (F) objF12;
            boolean zK3 = c1086gP.k(context);
            Object objF13 = c1086gP.f();
            if (zK3 || objF13 == c0153a) {
                objF13 = new Ia.l<androidx.compose.runtime.B, androidx.compose.runtime.A>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$obtainResourceIdCache$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final androidx.compose.runtime.A invoke(androidx.compose.runtime.B b10) {
                        context.getApplicationContext().registerComponentCallbacks(f10);
                        return new E(context, f10);
                    }
                };
                c1086gP.E(objF13);
            }
            androidx.compose.runtime.E.a(dVar, (Ia.l) objF13, c1086gP);
            androidx.compose.runtime.C c10 = CompositionLocalsKt.f14860v;
            CompositionLocalKt.b(new C1101n0[]{f14792a.b((Configuration) x10.getValue()), f14793b.b(context), Z0.b.f7676a.b(viewTreeOwners.f14724a), f14796e.b(eVar), SaveableStateRegistryKt.f13132a.b(c1217e1), f14797f.b(androidComposeView.getView()), f14794c.b(bVar), f14795d.b(dVar), c10.b(Boolean.valueOf(((Boolean) c1086gP.x(c10)).booleanValue() | androidComposeView.getScrollCaptureInProgress$ui_release())), CompositionLocalsKt.f14850l.b(aVar)}, androidx.compose.runtime.internal.a.b(1471621628, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                    int iIntValue = num.intValue();
                    if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                        CompositionLocalsKt.a(androidComposeView, j, pVar, interfaceC1084f3, 0);
                    } else {
                        interfaceC1084f3.w();
                    }
                    return p293xa.r.f47939a;
                }
            }, c1086gP), c1086gP, 56);
        } else {
            c1086gP.w();
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    AndroidCompositionLocals_androidKt.a(androidComposeView, pVar, interfaceC1084f2, L4.b.l(i10 | 1));
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    public static final AbstractC1099m0<InterfaceC1376t> getLocalLifecycleOwner() {
        return Z0.b.f7676a;
    }

    public static final AbstractC1099m0<p248u2.e> getLocalSavedStateRegistryOwner() {
        return f14796e;
    }
}
