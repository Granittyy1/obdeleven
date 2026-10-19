package kotlin.coroutines.jvm.internal;

import Aa.a;
import kotlin.coroutines.c;
import kotlin.coroutines.d;
import kotlin.coroutines.e;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: ContinuationImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ContinuationImpl extends BaseContinuationImpl {
    private final e _context;
    private transient c<Object> intercepted;

    public ContinuationImpl(c<Object> cVar, e eVar) {
        super(cVar);
        this._context = eVar;
    }

    @Override // kotlin.coroutines.c
    public e getContext() {
        e eVar = this._context;
        i.b(eVar);
        return eVar;
    }

    public final c<Object> intercepted() {
        c<Object> cVarS0 = this.intercepted;
        if (cVarS0 == null) {
            d dVar = (d) getContext().get(d.a.f43035b);
            cVarS0 = dVar != null ? dVar.s0(this) : this;
            this.intercepted = cVarS0;
        }
        return cVarS0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public void releaseIntercepted() {
        c<?> cVar = this.intercepted;
        if (cVar != null && cVar != this) {
            e.a aVar = getContext().get(d.a.f43035b);
            i.b(aVar);
            ((d) aVar).j(cVar);
        }
        this.intercepted = a.f1038b;
    }

    public ContinuationImpl(c<Object> cVar) {
        this(cVar, cVar != null ? cVar.getContext() : null);
    }
}
