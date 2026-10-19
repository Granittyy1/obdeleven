package org.koin.android.ext.koin;

import Ia.l;
import Ia.p;
import Ib.b;
import android.app.Application;
import android.content.Context;
import androidx.compose.foundation.C0936h;
import com.google.android.gms.internal.measurement.C1787c0;
import com.google.android.gms.internal.measurement.M1;
import java.util.Collection;
import kotlin.collections.EmptyList;
import kotlin.collections.q;
import kotlin.jvm.internal.c;
import kotlin.jvm.internal.i;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.logger.Level;
import p293xa.r;

/* JADX INFO: compiled from: KoinExt.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class a {
    public static final void a(b bVar, final Context androidContext) {
        i.e(bVar, "<this>");
        i.e(androidContext, "androidContext");
        Ib.a aVar = bVar.f3938a;
        E3.b bVar2 = aVar.f3937c;
        Level level = Level.f45769c;
        if (bVar2.D(level)) {
            E3.b bVar3 = aVar.f3937c;
            bVar3.getClass();
            bVar3.E(level, "[init] declare Android Context");
        }
        if (androidContext instanceof Application) {
            aVar.b(M1.k(C1787c0.p(new l<Nb.a, r>() { // from class: org.koin.android.ext.koin.KoinExtKt$androidContext$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // Ia.l
                public final r invoke(Nb.a aVar2) {
                    Nb.a module = aVar2;
                    i.e(module, "$this$module");
                    final Context context = androidContext;
                    p<org.koin.core.scope.a, Ob.a, Application> pVar = new p<org.koin.core.scope.a, Ob.a, Application>() { // from class: org.koin.android.ext.koin.KoinExtKt$androidContext$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final Application invoke(org.koin.core.scope.a aVar3, Ob.a aVar4) {
                            org.koin.core.scope.a single = aVar3;
                            Ob.a it = aVar4;
                            i.e(single, "$this$single");
                            i.e(it, "it");
                            return (Application) context;
                        }
                    };
                    Kind kind = Kind.f45760b;
                    EmptyList emptyList = EmptyList.f42983b;
                    c cVarA = kotlin.jvm.internal.l.a(Application.class);
                    Pb.b bVar4 = Qb.b.f5141c;
                    BeanDefinition beanDefinition = new BeanDefinition(bVar4, cVarA, pVar, kind, emptyList);
                    SingleInstanceFactory<?> singleInstanceFactoryE = C0936h.e(beanDefinition, module);
                    if (module.f4702a) {
                        module.f4704c.add(singleInstanceFactoryE);
                    }
                    c cVarA2 = kotlin.jvm.internal.l.a(Context.class);
                    beanDefinition.f45758e = q.d0((Collection) beanDefinition.f45758e, cVarA2);
                    String mapping = Lb.a.i(cVarA2, null, bVar4);
                    i.e(mapping, "mapping");
                    module.f4705d.put(mapping, singleInstanceFactoryE);
                    return r.f47939a;
                }
            })), true, false);
        } else {
            aVar.b(M1.k(C1787c0.p(new l<Nb.a, r>() { // from class: org.koin.android.ext.koin.KoinExtKt$androidContext$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // Ia.l
                public final r invoke(Nb.a aVar2) {
                    Nb.a module = aVar2;
                    i.e(module, "$this$module");
                    final Context context = androidContext;
                    p<org.koin.core.scope.a, Ob.a, Context> pVar = new p<org.koin.core.scope.a, Ob.a, Context>() { // from class: org.koin.android.ext.koin.KoinExtKt$androidContext$2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final Context invoke(org.koin.core.scope.a aVar3, Ob.a aVar4) {
                            org.koin.core.scope.a single = aVar3;
                            Ob.a it = aVar4;
                            i.e(single, "$this$single");
                            i.e(it, "it");
                            return context;
                        }
                    };
                    Kind kind = Kind.f45760b;
                    EmptyList emptyList = EmptyList.f42983b;
                    SingleInstanceFactory<?> singleInstanceFactoryE = C0936h.e(new BeanDefinition(Qb.b.f5141c, kotlin.jvm.internal.l.a(Context.class), pVar, kind, emptyList), module);
                    if (module.f4702a) {
                        module.f4704c.add(singleInstanceFactoryE);
                    }
                    return r.f47939a;
                }
            })), true, false);
        }
    }
}
