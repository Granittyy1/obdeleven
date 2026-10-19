package org.koin.androidx.viewmodel.factory;

import androidx.lifecycle.Y;
import androidx.lifecycle.a0;
import kotlin.jvm.internal.c;
import kotlin.jvm.internal.i;
import org.koin.androidx.viewmodel.parameter.AndroidParametersHolder;
import org.koin.core.scope.a;

/* JADX INFO: compiled from: KoinViewModelFactory.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class KoinViewModelFactory implements a0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f45745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f45746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Pb.a f45747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ia.a<Ob.a> f45748d;

    public KoinViewModelFactory(c cVar, a scope, Pb.a aVar, Ia.a aVar2) {
        i.e(scope, "scope");
        this.f45745a = cVar;
        this.f45746b = scope;
        this.f45747c = aVar;
        this.f45748d = aVar2;
    }

    @Override // androidx.lifecycle.a0.c
    public final <T extends Y> T create(Class<T> cls, p014b1.a extras) {
        i.e(extras, "extras");
        final AndroidParametersHolder androidParametersHolder = new AndroidParametersHolder(this.f45748d, extras);
        Ia.a<Ob.a> aVar = new Ia.a<Ob.a>() { // from class: org.koin.androidx.viewmodel.factory.KoinViewModelFactory.create.1
            {
                super(0);
            }

            @Override // Ia.a
            public final Ob.a invoke() {
                return androidParametersHolder;
            }
        };
        c cVar = this.f45745a;
        return (T) this.f45746b.a(aVar, this.f45747c, cVar);
    }
}
