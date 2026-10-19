package org.koin.java;

import Ib.a;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.c;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.l;
import p293xa.g;

/* JADX INFO: compiled from: KoinJavaComponent.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class KoinJavaComponent {
    public static Object a(Class cls) {
        c cVarA = l.a(cls);
        a aVar = Kb.a.f4375b;
        if (aVar != null) {
            return aVar.f3935a.f5143b.a(null, null, cVarA);
        }
        throw new IllegalStateException("KoinApplication has not been started");
    }

    public static final <T> g<T> b(final Class<?> cls, final Pb.a aVar, final Ia.a<? extends Ob.a> aVar2) {
        return kotlin.a.b(LazyThreadSafetyMode.f42971b, new Ia.a<T>() { // from class: org.koin.java.KoinJavaComponent$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // Ia.a
            public final T invoke() {
                Class<?> clazz = cls;
                Pb.a aVar3 = aVar;
                Ia.a<Ob.a> aVar4 = aVar2;
                i.e(clazz, "clazz");
                c cVarA = l.a(clazz);
                a aVar5 = Kb.a.f4375b;
                if (aVar5 != null) {
                    return (T) aVar5.f3935a.f5143b.a(aVar4, aVar3, cVarA);
                }
                throw new IllegalStateException("KoinApplication has not been started");
            }
        });
    }
}
