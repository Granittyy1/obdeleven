package kotlinx.coroutines.flow;

import kotlinx.coroutines.C2693i;

/* JADX INFO: compiled from: SharedFlow.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class x extends kotlinx.coroutines.flow.internal.c<v<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f43432a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C2693i f43433b;

    @Override // kotlinx.coroutines.flow.internal.c
    public final boolean a(kotlinx.coroutines.flow.internal.a aVar) {
        v vVar = (v) aVar;
        if (this.f43432a >= 0) {
            return false;
        }
        long j = vVar.j;
        if (j < vVar.f43424k) {
            vVar.f43424k = j;
        }
        this.f43432a = j;
        return true;
    }

    @Override // kotlinx.coroutines.flow.internal.c
    public final kotlin.coroutines.c[] b(kotlinx.coroutines.flow.internal.a aVar) {
        long j = this.f43432a;
        this.f43432a = -1L;
        this.f43433b = null;
        return ((v) aVar).w(j);
    }
}
