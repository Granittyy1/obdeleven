package kotlin.jvm.internal;

import java.io.Serializable;

/* JADX INFO: compiled from: Lambda.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class Lambda<R> implements g<R>, Serializable {
    private final int arity;

    public Lambda(int i10) {
        this.arity = i10;
    }

    @Override // kotlin.jvm.internal.g
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        l.f43062a.getClass();
        String strA = m.a(this);
        i.d(strA, "renderLambdaToString(...)");
        return strA;
    }
}
