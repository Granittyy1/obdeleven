package org.koin.androidx.viewmodel.parameter;

import Oa.c;
import Ob.a;
import androidx.lifecycle.K;
import androidx.lifecycle.N;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.q;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: AndroidParametersHolder.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class AndroidParametersHolder extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p014b1.a f45749d;

    /* JADX WARN: Illegal instructions before constructor call */
    public AndroidParametersHolder(Ia.a<? extends a> aVar, p014b1.a extras) {
        a aVarInvoke;
        List<Object> list;
        i.e(extras, "extras");
        super(2, (aVar == null || (aVarInvoke = aVar.invoke()) == null || (list = aVarInvoke.f4876a) == null) ? new ArrayList() : q.p0(list));
        this.f45749d = extras;
    }

    @Override // Ob.a
    public final <T> T a(final int i10, c<?> cVar) {
        final kotlin.jvm.internal.c cVar2 = (kotlin.jvm.internal.c) cVar;
        return cVar2.equals(l.a(K.class)) ? (T) N.a(this.f45749d) : (T) new Ia.a<T>() { // from class: org.koin.androidx.viewmodel.parameter.AndroidParametersHolder$elementAt$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // Ia.a
            public final T invoke() {
                return (T) super/*Ob.a*/.a(i10, cVar2);
            }
        }.invoke();
    }

    @Override // Ob.a
    public final <T> T c(c<?> cVar) {
        final kotlin.jvm.internal.c cVar2 = (kotlin.jvm.internal.c) cVar;
        return cVar2.equals(l.a(K.class)) ? (T) N.a(this.f45749d) : (T) new Ia.a<T>() { // from class: org.koin.androidx.viewmodel.parameter.AndroidParametersHolder$getOrNull$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // Ia.a
            public final T invoke() {
                return (T) super/*Ob.a*/.c(cVar2);
            }
        }.invoke();
    }
}
