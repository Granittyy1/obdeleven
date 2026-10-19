package androidx.datastore.preferences.core;

import Ia.p;
import androidx.datastore.core.j;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.InterfaceC2686c;

/* JADX INFO: compiled from: PreferenceDataStoreFactory.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a implements androidx.datastore.core.e<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f17086a;

    public a(j jVar) {
        this.f17086a = jVar;
    }

    @Override // androidx.datastore.core.e
    public final Object a(p pVar, ContinuationImpl continuationImpl) {
        return this.f17086a.a(new PreferenceDataStore$updateData$2(pVar, null), continuationImpl);
    }

    @Override // androidx.datastore.core.e
    public final InterfaceC2686c<c> getData() {
        return this.f17086a.f17050d;
    }
}
