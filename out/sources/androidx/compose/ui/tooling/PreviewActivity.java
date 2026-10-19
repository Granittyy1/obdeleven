package androidx.compose.ui.tooling;

import I.b;
import Ia.p;
import Ia.q;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.ComponentActivity;
import androidx.activity.compose.d;
import androidx.compose.animation.k;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.L;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.FloatingActionButtonKt;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.runtime.C1081d0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.runtime.V;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.h;
import androidx.compose.ui.layout.E;
import androidx.compose.ui.node.ComposeUiNode;
import com.google.android.gms.internal.measurement.C1787c0;
import com.google.android.gms.internal.measurement.M1;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.m;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.jvm.internal.i;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.sequences.g;
import kotlin.text.n;
import p293xa.r;

/* JADX INFO: compiled from: PreviewActivity.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class PreviewActivity extends ComponentActivity {
    @Override // androidx.activity.ComponentActivity, androidx.core.app.k, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        String stringExtra;
        Class<?> cls;
        final Object[] array;
        super.onCreate(bundle);
        if ((getApplicationInfo().flags & 2) == 0) {
            finish();
            return;
        }
        Intent intent = getIntent();
        if (intent == null || (stringExtra = intent.getStringExtra("composable")) == null) {
            return;
        }
        final String strO0 = n.o0(stringExtra, '.');
        final String strL0 = n.l0('.', stringExtra, stringExtra);
        String stringExtra2 = getIntent().getStringExtra("parameterProviderClassName");
        if (stringExtra2 == null) {
            d.a(this, new ComposableLambdaImpl(true, -840626948, new p<InterfaceC1084f, Integer, r>() { // from class: androidx.compose.ui.tooling.PreviewActivity$setComposableContent$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f, Integer num) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
                    InterfaceC1084f interfaceC1084f2 = interfaceC1084f;
                    int iIntValue = num.intValue();
                    if (interfaceC1084f2.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                        a.b(strO0, strL0, interfaceC1084f2, new Object[0]);
                    } else {
                        interfaceC1084f2.w();
                    }
                    return r.f47939a;
                }
            }));
            return;
        }
        try {
            cls = Class.forName(stringExtra2);
        } catch (ClassNotFoundException e10) {
            Log.e("PreviewLogger", "Unable to find PreviewProvider '" + stringExtra2 + '\'', e10);
            cls = null;
        }
        int intExtra = getIntent().getIntExtra("parameterProviderIndex", -1);
        if (cls != null) {
            try {
                Constructor<?>[] constructors = cls.getConstructors();
                int length = constructors.length;
                Constructor<?> constructor = null;
                int i10 = 0;
                boolean z10 = false;
                while (true) {
                    if (i10 < length) {
                        Constructor<?> constructor2 = constructors[i10];
                        if (constructor2.getParameterTypes().length == 0) {
                            if (!z10) {
                                z10 = true;
                                constructor = constructor2;
                            }
                        }
                        i10++;
                    } else if (!z10) {
                    }
                    constructor = null;
                    break;
                }
                if (constructor == null) {
                    throw new IllegalArgumentException("PreviewParameterProvider constructor can not have parameters");
                }
                constructor.setAccessible(true);
                Object objNewInstance = constructor.newInstance(null);
                i.c(objNewInstance, "null cannot be cast to non-null type androidx.compose.ui.tooling.preview.PreviewParameterProvider<*>");
                p001a0.a aVar = (p001a0.a) objNewInstance;
                if (intExtra < 0) {
                    g gVarA = aVar.a();
                    int count = aVar.getCount();
                    Iterator it = gVarA.iterator();
                    array = new Object[count];
                    for (int i11 = 0; i11 < count; i11++) {
                        array[i11] = it.next();
                    }
                } else {
                    List listK = M1.k(SequencesKt___SequencesKt.B(aVar.a(), intExtra));
                    ArrayList arrayList = new ArrayList(m.y(listK, 10));
                    Iterator it2 = listK.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(C1787c0.v(it2.next()));
                    }
                    array = arrayList.toArray(new Object[0]);
                }
            } catch (KotlinReflectionNotSupportedError unused) {
                throw new IllegalStateException("Deploying Compose Previews with PreviewParameterProvider arguments requires adding a dependency to the kotlin-reflect library.\nConsider adding 'debugImplementation \"org.jetbrains.kotlin:kotlin-reflect:$kotlin_version\"' to the module's build.gradle.");
            }
        } else {
            array = new Object[0];
        }
        if (array.length > 1) {
            d.a(this, new ComposableLambdaImpl(true, -861939235, new p<InterfaceC1084f, Integer, r>() { // from class: androidx.compose.ui.tooling.PreviewActivity$setParameterizedContent$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
                    InterfaceC1084f interfaceC1084f2 = interfaceC1084f;
                    int iIntValue = num.intValue();
                    if (interfaceC1084f2.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                        Object objF = interfaceC1084f2.f();
                        if (objF == InterfaceC1084f.a.f12980a) {
                            objF = new C1081d0(0);
                            interfaceC1084f2.E(objF);
                        }
                        final V v10 = (V) objF;
                        final Object[] objArr = array;
                        ComposableLambdaImpl composableLambdaImplB = androidx.compose.runtime.internal.a.b(958604965, new p<InterfaceC1084f, Integer, r>() { // from class: androidx.compose.ui.tooling.PreviewActivity$setParameterizedContent$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final r invoke(InterfaceC1084f interfaceC1084f3, Integer num2) {
                                InterfaceC1084f interfaceC1084f4 = interfaceC1084f3;
                                int iIntValue2 = num2.intValue();
                                if (interfaceC1084f4.C(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    ComposableLambdaImpl composableLambdaImpl = ComposableSingletons$PreviewActivity_androidKt.f15715a;
                                    boolean zK = interfaceC1084f4.k(objArr);
                                    final V v11 = v10;
                                    final Object[] objArr2 = objArr;
                                    Object objF2 = interfaceC1084f4.f();
                                    if (zK || objF2 == InterfaceC1084f.a.f12980a) {
                                        objF2 = new Ia.a<r>() { // from class: androidx.compose.ui.tooling.PreviewActivity$setParameterizedContent$1$1$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            @Override // Ia.a
                                            public final r invoke() {
                                                V v12 = v11;
                                                v12.m((v12.o() + 1) % objArr2.length);
                                                return r.f47939a;
                                            }
                                        };
                                        interfaceC1084f4.E(objF2);
                                    }
                                    FloatingActionButtonKt.a(composableLambdaImpl, (Ia.a) objF2, null, null, null, null, 0L, 0L, null, interfaceC1084f4, 6, 508);
                                } else {
                                    interfaceC1084f4.w();
                                }
                                return r.f47939a;
                            }
                        }, interfaceC1084f2);
                        final String str = strO0;
                        final String str2 = strL0;
                        final Object[] objArr2 = array;
                        ScaffoldKt.a(null, null, null, null, null, composableLambdaImplB, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, androidx.compose.runtime.internal.a.b(57310875, new q<L, InterfaceC1084f, Integer, r>() { // from class: androidx.compose.ui.tooling.PreviewActivity$setParameterizedContent$1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // Ia.q
                            public final r invoke(L l10, InterfaceC1084f interfaceC1084f3, Integer num2) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
                                L l11 = l10;
                                InterfaceC1084f interfaceC1084f4 = interfaceC1084f3;
                                int iIntValue2 = num2.intValue();
                                if ((iIntValue2 & 6) == 0) {
                                    iIntValue2 |= interfaceC1084f4.K(l11) ? 4 : 2;
                                }
                                if (interfaceC1084f4.C(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                    h hVarE = PaddingKt.e(h.a.f13984b, l11);
                                    String str3 = str;
                                    String str4 = str2;
                                    Object[] objArr3 = objArr2;
                                    V v11 = v10;
                                    E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                    int iF = interfaceC1084f4.F();
                                    InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f4.z();
                                    h hVarC = ComposedModifierKt.c(interfaceC1084f4, hVarE);
                                    ComposeUiNode.f14331c0.getClass();
                                    Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
                                    if (interfaceC1084f4.u() == null) {
                                        b.k();
                                        throw null;
                                    }
                                    interfaceC1084f4.r();
                                    if (interfaceC1084f4.m()) {
                                        interfaceC1084f4.v(aVar2);
                                    } else {
                                        interfaceC1084f4.A();
                                    }
                                    R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f4, eD);
                                    R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f4, interfaceC1089h0Z);
                                    p<ComposeUiNode, Integer, r> pVar = ComposeUiNode.Companion.f14338g;
                                    if (interfaceC1084f4.m() || !i.a(interfaceC1084f4.f(), Integer.valueOf(iF))) {
                                        k.b(iF, interfaceC1084f4, iF, pVar);
                                    }
                                    R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f4, hVarC);
                                    a.b(str3, str4, interfaceC1084f4, objArr3[v11.o()]);
                                    interfaceC1084f4.J();
                                } else {
                                    interfaceC1084f4.w();
                                }
                                return r.f47939a;
                            }
                        }, interfaceC1084f2), interfaceC1084f2, 196608, 12582912, 131039);
                    } else {
                        interfaceC1084f2.w();
                    }
                    return r.f47939a;
                }
            }));
        } else {
            d.a(this, new ComposableLambdaImpl(true, -1901447514, new p<InterfaceC1084f, Integer, r>() { // from class: androidx.compose.ui.tooling.PreviewActivity$setParameterizedContent$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f, Integer num) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
                    InterfaceC1084f interfaceC1084f2 = interfaceC1084f;
                    int iIntValue = num.intValue();
                    if (interfaceC1084f2.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                        String str = strO0;
                        String str2 = strL0;
                        Object[] objArr = array;
                        a.b(str, str2, interfaceC1084f2, Arrays.copyOf(objArr, objArr.length));
                    } else {
                        interfaceC1084f2.w();
                    }
                    return r.f47939a;
                }
            }));
        }
    }
}
