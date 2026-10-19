package rb;

import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: compiled from: TaskQueue.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends p184ob.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f46589e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef f46590f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String str, d dVar, Ref$ObjectRef ref$ObjectRef) {
        super(str, true);
        this.f46589e = dVar;
        this.f46590f = ref$ObjectRef;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p184ob.a
    public final long a() {
        d dVar = this.f46589e;
        dVar.f46549b.a(dVar, (t) this.f46590f.element);
        return -1L;
    }
}
