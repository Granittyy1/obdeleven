package org.koin.core.instance;

import kotlin.jvm.internal.i;
import org.koin.core.definition.BeanDefinition;
import p293xa.r;

/* JADX INFO: compiled from: SingleInstanceFactory.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class SingleInstanceFactory<T> extends c<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public T f45763b;

    public SingleInstanceFactory(BeanDefinition<T> beanDefinition) {
        super(beanDefinition);
    }

    @Override // org.koin.core.instance.c
    public final T a(b context) {
        i.e(context, "context");
        T t8 = this.f45763b;
        if (t8 == null) {
            return (T) super.a(context);
        }
        if (t8 != null) {
            return t8;
        }
        throw new IllegalStateException("Single instance created couldn't return value");
    }

    @Override // org.koin.core.instance.c
    public final T b(final b bVar) {
        Ia.a<r> aVar = new Ia.a<r>(this) { // from class: org.koin.core.instance.SingleInstanceFactory$get$1
            final /* synthetic */ SingleInstanceFactory<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
            @Override // Ia.a
            public final r invoke() {
                SingleInstanceFactory<T> singleInstanceFactory = this.this$0;
                b bVar2 = bVar;
                if (singleInstanceFactory.f45763b == 0) {
                    singleInstanceFactory.f45763b = singleInstanceFactory.a(bVar2);
                }
                return r.f47939a;
            }
        };
        synchronized (this) {
            aVar.invoke();
        }
        T t8 = this.f45763b;
        if (t8 != null) {
            return t8;
        }
        throw new IllegalStateException("Single instance created couldn't return value");
    }
}
