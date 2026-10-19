package org.koin.core.instance;

import org.koin.core.definition.BeanDefinition;

/* JADX INFO: compiled from: FactoryInstanceFactory.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class a<T> extends c<T> {
    public a(BeanDefinition<T> beanDefinition) {
        super(beanDefinition);
    }

    @Override // org.koin.core.instance.c
    public final T b(b bVar) {
        return a(bVar);
    }
}
