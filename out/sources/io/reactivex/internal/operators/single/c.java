package io.reactivex.internal.operators.single;

import io.reactivex.internal.disposables.EmptyDisposable;
import p123ja.p;
import p123ja.q;

/* JADX INFO: compiled from: SingleJust.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c<T> extends p<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f40881b = Boolean.FALSE;

    @Override // p123ja.p
    public final void e(q<? super T> qVar) {
        qVar.b(EmptyDisposable.f40664b);
        qVar.onSuccess(this.f40881b);
    }
}
