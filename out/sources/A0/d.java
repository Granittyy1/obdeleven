package A0;

import java.io.Serializable;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: Pools.kt */
/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Serializable f382b;

    public d(int i10, String str) {
        this.f381a = i10;
        this.f382b = str;
    }

    public Object a() {
        int i10 = this.f381a;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        Object[] objArr = (Object[]) this.f382b;
        Object obj = objArr[i11];
        i.c(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i11] = null;
        this.f381a--;
        return obj;
    }

    public boolean b(Object instance) {
        Object[] objArr;
        boolean z10;
        i.e(instance, "instance");
        int i10 = this.f381a;
        int i11 = 0;
        while (true) {
            objArr = (Object[]) this.f382b;
            if (i11 >= i10) {
                z10 = false;
                break;
            }
            if (objArr[i11] == instance) {
                z10 = true;
                break;
            }
            i11++;
        }
        if (z10) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i12 = this.f381a;
        if (i12 >= objArr.length) {
            return false;
        }
        objArr[i12] = instance;
        this.f381a = i12 + 1;
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Serializable, java.lang.Object[]] */
    public d(int i10) {
        if (i10 > 0) {
            this.f382b = new Object[i10];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }
}
